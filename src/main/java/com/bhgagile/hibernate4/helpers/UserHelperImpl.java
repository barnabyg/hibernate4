 /*************************************************************************
 *  2013 BHGAGILE
 *  All Rights Reserved.
 *
 * NOTICE:  All information contained herein is, and remains
 * the property of BHGAGILE.
 */
package com.bhgagile.hibernate4.helpers;

import org.springframework.beans.factory.annotation.Autowired;

import com.bhgagile.hibernate4.dao.UserDao;
import com.bhgagile.hibernate4.model.User;

/**
 * @author Barnaby Golden
 *
 */
public final class UserHelperImpl implements UserHelper {

    /**
     * User DAO.
     */
    @Autowired
    private UserDao userDao;

    /**
     * Create an instance of a user.
     * @param user user to create
     * @return user id
     */
    public Long createUser(final User user) {

        return userDao.create(user);
    }

    /**
     * Retrieve a user.
     * @param userId the user id to find
     * @return returns user
     */
    public User retrieveUser(final Long userId) {
        return userDao.retrieve(userId);
    }

    /**
     * Delete a user.
     * @param user to delete
     */
    public void delete(final User user) {
        userDao.delete(user);
    }

}
