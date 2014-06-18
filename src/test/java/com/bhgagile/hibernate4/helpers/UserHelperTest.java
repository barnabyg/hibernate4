 /*************************************************************************
 *  2013 BHGAGILE
 *  All Rights Reserved.
 *
 * NOTICE:  All information contained herein is, and remains
 * the property of BHGAGILE.
 */
package com.bhgagile.hibernate4.helpers;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.springframework.test.context.ContextConfiguration;

import com.bhgagile.hibernate4.model.User;

/**
 * @author Barnaby Golden
 *
 */
@ContextConfiguration("file:src/main/resources/spring-config.xml")
public final class UserHelperTest {

    /**
     * Create an instance of a User in the database.
     * Validates that the user was created and fields
     * were correctly populated.
     */
    @Test
    public void createUser() {

        final UserHelper userHelper = new UserHelper();

        final User user = new User();

        user.setFirstName("John");
        user.setSurname("Smith");

        final Long userId = userHelper.createUser(user);

        final User user2 = userHelper.retrieveUser(userId);

        assertEquals("First names do not match", "John", user2.getFirstName());
        assertEquals("Surnames do not match", "Smith", user2.getSurname());

        userHelper.delete(userId);
    }
}
