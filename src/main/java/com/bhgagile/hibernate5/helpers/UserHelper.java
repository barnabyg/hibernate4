 /*************************************************************************
 *  2013 BHGAGILE
 *  All Rights Reserved.
 *
 * NOTICE:  All information contained herein is, and remains
 * the property of BHGAGILE.
 */
package com.bhgagile.hibernate5.helpers;

import com.bhgagile.hibernate5.model.User;

/**
 * @author Barnaby Golden
 *
 */
public interface UserHelper {

    /**
     * Create an instance of a user.
     * @param user user to create
     * @return user id
     */
    Long createUser(User user);
    /**
     * Retrieve a user.
     * @param userId the user id to find
     * @return returns user
     */
    User retrieveUser(Long userId);

    /**
     * Delete a user.
     * @param user to delete
     */
    void delete(User user);
}
