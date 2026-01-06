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
 * The extended model interface for the AssignProjectScope service. Represents a row in the &quot;EDC_AssignProjectScope&quot; database table, with each column mapped to a property of this class.
 *
 * @author Brian Wing Shun Chan
 * @see AssignProjectScopeModel
 * @generated
 */
@ImplementationClassName(
	"com.dhsoft.edc.backend.model.impl.AssignProjectScopeImpl"
)
@ProviderType
public interface AssignProjectScope
	extends AssignProjectScopeModel, PersistedModel {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this interface directly. Add methods to <code>com.dhsoft.edc.backend.model.impl.AssignProjectScopeImpl</code> and rerun ServiceBuilder to automatically copy the method declarations to this interface.
	 */
	public static final Accessor<AssignProjectScope, Long>
		PROJECT_SCOPE_ID_ACCESSOR = new Accessor<AssignProjectScope, Long>() {

			@Override
			public Long get(AssignProjectScope assignProjectScope) {
				return assignProjectScope.getProjectScopeId();
			}

			@Override
			public Class<Long> getAttributeClass() {
				return Long.class;
			}

			@Override
			public Class<AssignProjectScope> getTypeClass() {
				return AssignProjectScope.class;
			}

		};

}