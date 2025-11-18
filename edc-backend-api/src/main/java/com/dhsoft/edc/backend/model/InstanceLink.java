/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.dhsoft.edc.backend.model;

import com.liferay.portal.kernel.annotation.ImplementationClassName;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.util.Accessor;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The extended model interface for the InstanceLink service. Represents a row in the &quot;EDC_InstanceLink&quot; database table, with each column mapped to a property of this class.
 *
 * @author Brian Wing Shun Chan
 * @see InstanceLinkModel
 * @generated
 */
@ImplementationClassName("com.dhsoft.edc.backend.model.impl.InstanceLinkImpl")
@ProviderType
public interface InstanceLink extends InstanceLinkModel, PersistedModel {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this interface directly. Add methods to <code>com.dhsoft.edc.backend.model.impl.InstanceLinkImpl</code> and rerun ServiceBuilder to automatically copy the method declarations to this interface.
	 */
	public static final Accessor<InstanceLink, String> UUID_ACCESSOR =
		new Accessor<InstanceLink, String>() {

			@Override
			public String get(InstanceLink instanceLink) {
				return instanceLink.getUuid();
			}

			@Override
			public Class<String> getAttributeClass() {
				return String.class;
			}

			@Override
			public Class<InstanceLink> getTypeClass() {
				return InstanceLink.class;
			}

		};

	public static final Accessor<InstanceLink, Long> LINK_ID_ACCESSOR =
		new Accessor<InstanceLink, Long>() {

			@Override
			public Long get(InstanceLink instanceLink) {
				return instanceLink.getLinkId();
			}

			@Override
			public Class<Long> getAttributeClass() {
				return Long.class;
			}

			@Override
			public Class<InstanceLink> getTypeClass() {
				return InstanceLink.class;
			}

		};

}