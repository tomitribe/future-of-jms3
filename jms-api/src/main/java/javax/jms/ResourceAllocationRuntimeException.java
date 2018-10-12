/*
 * Copyright (c) 1997, 2017 Oracle and/or its affiliates. All rights reserved.
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

/**
 * This unchecked exception is thrown when a provider is unable to allocate the resources required by a method.
 *
 * <p>
 * For example, this exception should be thrown when a call to {@code ConnectionFactory.createContext} fails due to a
 * lack of JMS provider resources.
 *
 * @version JMS 2.0
 * @since JMS 2.0
 **/
public class ResourceAllocationRuntimeException extends JMSRuntimeException {

    /**
     * Explicitly set serialVersionUID to be the same as the implicit serialVersionUID of the JMS 2.0 version
     */
    private static final long serialVersionUID = -1306897975610715374L;

    /**
     * Constructs a {@code ResourceAllocationRuntimeException} with the specified reason and error code.
     *
     * @param reason a description of the exception
     * @param errorCode a string specifying the vendor-specific error code
     *
     **/
    public ResourceAllocationRuntimeException(String reason, String errorCode) {
        super(reason, errorCode);
    }

    /**
     * Constructs a {@code ResourceAllocationRuntimeException} with the specified reason. The error code defaults to null.
     *
     * @param reason a description of the exception
     **/
    public ResourceAllocationRuntimeException(String reason) {
        super(reason);
    }

    /**
     * Constructs a {@code ResourceAllocationRuntimeException} with the specified detail message, error code and cause
     *
     * @param detailMessage a description of the exception
     * @param errorCode a provider-specific error code
     * @param cause the underlying cause of this exception
     */
    public ResourceAllocationRuntimeException(String detailMessage, String errorCode, Throwable cause) {
        super(detailMessage, errorCode, cause);
    }

}
