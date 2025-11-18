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
 * The extended model interface for the Randomization service. Represents a row in the &quot;EDC_Randomization&quot; database table, with each column mapped to a property of this class.
 *
 * @author Brian Wing Shun Chan
 * @see RandomizationModel
 * @generated
 */
@ImplementationClassName("com.dhsoft.edc.backend.model.impl.RandomizationImpl")
@ProviderType
public interface Randomization extends PersistedModel, RandomizationModel {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this interface directly. Add methods to <code>com.dhsoft.edc.backend.model.impl.RandomizationImpl</code> and rerun ServiceBuilder to automatically copy the method declarations to this interface.
	 */
	public static final Accessor<Randomization, String> UUID_ACCESSOR =
		new Accessor<Randomization, String>() {

			@Override
			public String get(Randomization randomization) {
				return randomization.getUuid();
			}

			@Override
			public Class<String> getAttributeClass() {
				return String.class;
			}

			@Override
			public Class<Randomization> getTypeClass() {
				return Randomization.class;
			}

		};

	public static final Accessor<Randomization, Long>
		RANDOMIZATION_ID_ACCESSOR = new Accessor<Randomization, Long>() {

			@Override
			public Long get(Randomization randomization) {
				return randomization.getRandomizationId();
			}

			@Override
			public Class<Long> getAttributeClass() {
				return Long.class;
			}

			@Override
			public Class<Randomization> getTypeClass() {
				return Randomization.class;
			}

		};

}