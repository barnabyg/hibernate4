 /*************************************************************************
 *  2013 BHGAGILE
 *  All Rights Reserved.
 *
 * NOTICE:  All information contained herein is, and remains
 * the property of BHGAGILE.
 */
package com.bhgagile.hibernate4.dao;

import com.bhgagile.hibernate4.model.User;

/**
 * @author Barnaby Golden
 *
 */
public final class UserHibernateDao
    extends GenericHibernateDao<User, Long> implements UserDao {

    /**
     * Default constructor.
     * @param type class for the DAO
     */
    public UserHibernateDao(final Class<User> type) {
        super(type);
    }
}
