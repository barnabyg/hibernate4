 /*************************************************************************
 *  2013 BHGAGILE
 *  All Rights Reserved.
 *
 * NOTICE:  All information contained herein is, and remains
 * the property of BHGAGILE.
 */
package com.bhgagile.hibernate4.helpers;

import com.bhgagile.hibernate4.model.User;

/**
 * @author Barnaby Golden
 *
 */
public final class UserHelper {

    /**
     * Create an instance of a user.
     * @param user user to create
     * @return user id
     */
    public Long createUser(final User user) {

        return new Long(0);
    }

    /**
     * Retrieve a user.
     * @param userId the user id to find
     * @return returns user
     */
    public User retrieveUser(final Long userId) {
        return new User();
    }

    /**
     * Delete a user.
     * @param userId id of user to delete
     */
    public void delete(final Long userId) {

    }

}
