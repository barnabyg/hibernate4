 /*************************************************************************
 *  2013 BHGAGILE
 *  All Rights Reserved.
 *
 * NOTICE:  All information contained herein is, and remains
 * the property of BHGAGILE.
 */
package com.bhgagile.hibernate4.model;

/**
 * @author Barnaby Golden
 *
 */
public final class User {

    /**
     * First name.
     */
    private String firstName;
    /**
     * Surname.
     */
    private String surname;

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
