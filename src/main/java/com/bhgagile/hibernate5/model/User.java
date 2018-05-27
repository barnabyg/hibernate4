 /*************************************************************************
 *  2013 BHGAGILE
 *  All Rights Reserved.
 *
 * NOTICE:  All information contained herein is, and remains
 * the property of BHGAGILE.
 */
package com.bhgagile.hibernate5.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * @author Barnaby Golden
 *
 */
@Entity
public final class User {

    /**
     * Unique id.
     */
    @Id
    @GeneratedValue
    private long id;

    /**
     * First name.
     */
    private String firstName;

    /**
     * Surname.
     */
    private String surname;

    /**
     * @param id the id to set
     */
    public void setId(final long id) {
        this.id = id;
    }

    /**
     * Set first name.
     * @param firstName first name
     */
    public void setFirstName(final String firstName) {

        this.firstName = firstName;
    }

    /**
     * Set surname.
     * @param surname surname
     */
    public void setSurname(final String surname) {

        this.surname = surname;
    }

    /**
     * @return the id
     */
    public long getId() {
        return id;
    }

    /**
     * @return first name
     */
    public String getFirstName() {

        return firstName;
    }

    /**
     * @return surname
     */
    public String getSurname() {

        return surname;
    }

}
