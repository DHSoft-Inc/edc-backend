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
 * The extended model interface for the QueryLink service. Represents a row in the &quot;EDC_QueryLink&quot; database table, with each column mapped to a property of this class.
 *
 * @author Brian Wing Shun Chan
 * @see QueryLinkModel
 * @generated
 */
@ImplementationClassName("com.dhsoft.edc.backend.model.impl.QueryLinkImpl")
@ProviderType
public interface QueryLink extends PersistedModel, QueryLinkModel {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this interface directly. Add methods to <code>com.dhsoft.edc.backend.model.impl.QueryLinkImpl</code> and rerun ServiceBuilder to automatically copy the method declarations to this interface.
	 */
	public static final Accessor<QueryLink, String> UUID_ACCESSOR =
		new Accessor<QueryLink, String>() {

			@Override
			public String get(QueryLink queryLink) {
				return queryLink.getUuid();
			}

			@Override
			public Class<String> getAttributeClass() {
				return String.class;
			}

			@Override
			public Class<QueryLink> getTypeClass() {
				return QueryLink.class;
			}

		};

	public static final Accessor<QueryLink, Long> QUERY_ID_ACCESSOR =
		new Accessor<QueryLink, Long>() {

			@Override
			public Long get(QueryLink queryLink) {
				return queryLink.getQueryId();
			}

			@Override
			public Class<Long> getAttributeClass() {
				return Long.class;
			}

			@Override
			public Class<QueryLink> getTypeClass() {
				return QueryLink.class;
			}

		};

}