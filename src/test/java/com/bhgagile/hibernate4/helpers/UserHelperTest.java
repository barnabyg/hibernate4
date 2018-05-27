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
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.bhgagile.hibernate5.helpers.UserHelper;
import com.bhgagile.hibernate5.model.User;

/**
 * @author Barnaby Golden
 *
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/resources/spring-config.xml")
public final class UserHelperTest {

    /**
     * UserHelper.
     */
    @Autowired
    private UserHelper userHelper;

    /**
     * Create an instance of a User in the database.
     * Validates that the user was created and fields
     * were correctly populated.
     */
    @Test
    public void createUser() {

        final User user = new User();

        user.setFirstName("John");
        user.setSurname("Smith");

        final Long userId = userHelper.createUser(user);

        final User user2 = userHelper.retrieveUser(userId);

        assertEquals("First names do not match", "John", user2.getFirstName());
        assertEquals("Surnames do not match", "Smith", user2.getSurname());

        userHelper.delete(user2);
    }
}
