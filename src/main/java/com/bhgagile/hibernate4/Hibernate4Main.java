 /*************************************************************************
 *  2013 BHGAGILE
 *  All Rights Reserved.
 *
 * NOTICE:  All information contained herein is, and remains
 * the property of BHGAGILE.
 */
package com.bhgagile.hibernate4;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.bhgagile.hibernate4.helpers.UserHelper;
import com.bhgagile.hibernate4.helpers.UserHelperImpl;


/**
 * @author Barnaby Golden
 *
 */
public final class Hibernate4Main {

    /**
     * Private class.
     */
    private Hibernate4Main() {

    }

    /**
     * @param args command line parameters
     */
    public static void main(final String[] args) {

        AbstractApplicationContext context =
                    new ClassPathXmlApplicationContext("spring-config.xml");

        context.registerShutdownHook();

        // implementation
        final UserHelper helper = new UserHelperImpl();

        context.close();
    }

}
