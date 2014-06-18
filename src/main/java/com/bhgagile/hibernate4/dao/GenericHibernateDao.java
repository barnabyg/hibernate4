 /*************************************************************************
 *  2013 BHGAGILE
 *  All Rights Reserved.
 *
 * NOTICE:  All information contained herein is, and remains
 * the property of BHGAGILE.
 */
package com.bhgagile.hibernate4.dao;

import java.io.Serializable;

import javax.transaction.Transactional;

import org.hibernate.Session;
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
     * Return the session.
     * @return session
     */
    protected final Session getSession() {
        return this.sessionFactory.getCurrentSession();
    }

    /**
     * {@inheritDoc}
     */
    @Transactional
    @SuppressWarnings("unchecked")
    public final P create(final T entity) {

        return (P) getSession().save(entity);
    }

    /**
     * {@inheritDoc}
     */
    @Transactional
    @SuppressWarnings("unchecked")
    public final T retrieve(final P id) {

        return (T) getSession().get(type, id);
    }

    /**
     * {@inheritDoc}
     */
    @Transactional
    public final void update(final T entity) {

        getSession().update(entity);
    }

    /**
     * {@inheritDoc}
     */
    @Transactional
    public final void delete(final T entity) {

        getSession().delete(entity);
    }

}
