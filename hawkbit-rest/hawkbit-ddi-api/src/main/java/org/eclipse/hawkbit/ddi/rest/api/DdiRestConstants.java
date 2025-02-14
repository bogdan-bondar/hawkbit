/**
 * Copyright (c) 2015 Bosch Software Innovations GmbH and others.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.eclipse.hawkbit.ddi.rest.api;

/**
 * Constants for the direct device integration rest resources.
 */
public final class DdiRestConstants {

    /**
     * The base URL mapping of the direct device integration rest resources.
     */
    public static final String BASE_V1_REQUEST_MAPPING = "/{tenant}/controller/v1";

    /**
     * Deployment action resources.
     */
    public static final String DEPLOYMENT_BASE_ACTION = "deploymentBase";

    /**
     * Installed action resources.
     */
    public static final String INSTALLED_BASE_ACTION = "installedBase";

    /**
     * Cancel action resources.
     */
    public static final String CANCEL_ACTION = "cancelAction";

    /**
     * Feedback channel.
     */
    public static final String FEEDBACK = "feedback";

    /**
     * File suffix for MDH hash download (see Linux md5sum).
     */
    public static final String ARTIFACT_MD5_DWNL_SUFFIX = ".MD5SUM";

    /**
     * Config data action resources.
     */
    public static final String CONFIG_DATA_ACTION = "configData";

    /**
     * Default value specifying that no action history to be sent as part of
     * response to deploymentBase
     * {@link DdiRootControllerRestApi#getControllerBasedeploymentAction}.
     */
    public static final String NO_ACTION_HISTORY = "0";

    /**
     * Media type for CBOR content. Unfortunately, there is no other constant we
     * can reuse - even the Jackson data converter simply hardcodes this.
     */
    public static final String MEDIA_TYPE_CBOR = "application/cbor";

    /**
     * Media type for CBOR content with strings encoded as UTF-8. Technically
     * redundant since CBOR always uses UTF-8, but Spring will append it
     * regardless.
     * @deprecated Since the Spring Framework (v5.2.4.RELEASE) dropped the charset attribute
     * from content type headers, please use {@link DdiRestConstants#MEDIA_TYPE_CBOR} instead.
     */
    @Deprecated
    public static final String MEDIA_TYPE_CBOR_UTF8 = "application/cbor;charset=UTF-8";

    private DdiRestConstants() {
        // constant class, private constructor.
    }
}
