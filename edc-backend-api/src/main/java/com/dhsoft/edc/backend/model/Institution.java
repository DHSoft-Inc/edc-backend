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
 * The extended model interface for the Institution service. Represents a row in the &quot;EDC_Institution&quot; database table, with each column mapped to a property of this class.
 *
 * @author Brian Wing Shun Chan
 * @see InstitutionModel
 * @generated
 */
@ImplementationClassName("com.dhsoft.edc.backend.model.impl.InstitutionImpl")
@ProviderType
public interface Institution extends InstitutionModel, PersistedModel {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this interface directly. Add methods to <code>com.dhsoft.edc.backend.model.impl.InstitutionImpl</code> and rerun ServiceBuilder to automatically copy the method declarations to this interface.
	 */
	public static final Accessor<Institution, String> UUID_ACCESSOR =
		new Accessor<Institution, String>() {

			@Override
			public String get(Institution institution) {
				return institution.getUuid();
			}

			@Override
			public Class<String> getAttributeClass() {
				return String.class;
			}

			@Override
			public Class<Institution> getTypeClass() {
				return Institution.class;
			}

		};

	public static final Accessor<Institution, Long> INSTITUTION_ID_ACCESSOR =
		new Accessor<Institution, Long>() {

			@Override
			public Long get(Institution institution) {
				return institution.getInstitutionId();
			}

			@Override
			public Class<Long> getAttributeClass() {
				return Long.class;
			}

			@Override
			public Class<Institution> getTypeClass() {
				return Institution.class;
			}

		};

}