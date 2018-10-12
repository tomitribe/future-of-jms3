/*
 * Copyright (c) 2012, 2017 Oracle and/or its affiliates. All rights reserved.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v. 2.0, which is available at
 * http://www.eclipse.org/legal/epl-2.0.
 *
 * This Source Code may also be made available under the following Secondary
 * Licenses when the conditions for such availability set forth in the
 * Eclipse Public License v. 2.0 are satisfied: GNU General Public License,
 * version 2 with the GNU Classpath Exception, which is available at
 * https://www.gnu.org/software/classpath/license.html.
 *
 * SPDX-License-Identifier: EPL-2.0 OR GPL-2.0 WITH Classpath-exception-2.0
 */

package javax.jms;

import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.ElementType.METHOD;
import static java.lang.annotation.ElementType.PARAMETER;
import static java.lang.annotation.ElementType.TYPE;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;

/**
 * This annotation may be used to specify the userName and password to be used when injecting a
 * {@code javax.jms.JMSContext} object.
 *
 * @see javax.jms.ConnectionFactory#createContext(java.lang.String, java.lang.String)
 *
 * @version JMS 2.0
 * @since JMS 2.0
 */
@Retention(RUNTIME)
@Target({ METHOD, FIELD, PARAMETER, TYPE })
public @interface JMSPasswordCredential {

    /**
     * Specifies the userName to be used when injecting a {@code javax.jms.JMSContext} object
     *
     * @return The userName to be used when injecting a {@code javax.jms.JMSContext} object
     */
    String userName();

    /**
     * Specifies the password to be used when injecting a {@code javax.jms.JMSContext} object
     *
     * @return the password to be used when injecting a {@code javax.jms.JMSContext} object
     */
    String password();

}
