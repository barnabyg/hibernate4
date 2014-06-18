 /*************************************************************************
 *  2013 BHGAGILE
 *  All Rights Reserved.
 *
 * NOTICE:  All information contained herein is, and remains
 * the property of BHGAGILE.
 */
package com.bhgagile.hibernate4.dao;

import java.io.Serializable;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author Barnaby Golden
 * @param <T> class
 * @param <P> id
 */
public class GenericHibernateDao<T, P extends Serializable>
                                    implements GenericDao<T, P> {

    /**
     * Session factory.
     */
    @Autowired
    private SessionFactory sessionFactory;
    /**
     * Class type.
     */
    private final transient Class<T> type;

    /**
     * Constructor - takes the class type.
     * @param type class type
     */
    public GenericHibernateDao(final Class<T> type) {

        this.type = type;
    }

    /**
     * {@inheritDoc}
     */
    public final P create(final T entity) {

        return null;
    }

    /**
     * {@inheritDoc}
     */
    public final T retrieve(final P id) {

        return null;
    }

    /**
     * {@inheritDoc}
     */
    public final void update(final T entity) {

    }

    /**
     * {@inheritDoc}
     */
    public final void delete(final T entity) {

    }

}
