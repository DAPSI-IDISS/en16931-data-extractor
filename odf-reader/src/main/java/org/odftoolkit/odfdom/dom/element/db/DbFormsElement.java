/************************************************************************
 *
 * DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS FILE HEADER
 *
 * Copyright 2008, 2010 Oracle and/or its affiliates. All rights reserved.
 *
 * Use is subject to license terms.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy
 * of the License at http://www.apache.org/licenses/LICENSE-2.0. You can also
 * obtain a copy of the License at http://odftoolkit.org/docs/license.txt
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 ************************************************************************/

/*
 * This file is automatically generated.
 * Don't edit manually.
 */
package org.odftoolkit.odfdom.dom.element.db;

import org.odftoolkit.odfdom.pkg.OdfElement;
import org.odftoolkit.odfdom.pkg.ElementVisitor;
import org.odftoolkit.odfdom.pkg.OdfFileDom;
import org.odftoolkit.odfdom.pkg.OdfName;
import org.odftoolkit.odfdom.dom.OdfDocumentNamespace;
import org.odftoolkit.odfdom.dom.DefaultElementVisitor;

/**
 * DOM implementation of OpenDocument element  {@odf.element db:forms}.
 *
 */
public class DbFormsElement extends OdfElement {

	public static final OdfName ELEMENT_NAME = OdfName.newName(OdfDocumentNamespace.DB, "forms");

	/**
	 * Create the instance of <code>DbFormsElement</code>
	 *
	 * @param  ownerDoc     The type is <code>OdfFileDom</code>
	 */
	public DbFormsElement(OdfFileDom ownerDoc) {
		super(ownerDoc, ELEMENT_NAME);
	}

	/**
	 * Get the element name
	 *
	 * @return  return   <code>OdfName</code> the name of element {@odf.element db:forms}.
	 */
	public OdfName getOdfName() {
		return ELEMENT_NAME;
	}

	/**
	 * Create child element {@odf.element db:component}.
	 *
	 * @param dbNameValue  the <code>String</code> value of <code>DbNameAttribute</code>, see {@odf.attribute  db:name} at specification
	 * Child element is new in Odf 1.2
	 *
	 * @return the element {@odf.element db:component}
	 */
	 public DbComponentElement newDbComponentElement(String dbNameValue) {
		DbComponentElement dbComponent = ((OdfFileDom) this.ownerDocument).newOdfElement(DbComponentElement.class);
		dbComponent.setDbNameAttribute(dbNameValue);
		this.appendChild(dbComponent);
		return dbComponent;
	}

	/**
	 * Create child element {@odf.element db:component-collection}.
	 *
	 * @param dbNameValue  the <code>String</code> value of <code>DbNameAttribute</code>, see {@odf.attribute  db:name} at specification
	 * Child element is new in Odf 1.2
	 *
	 * @return the element {@odf.element db:component-collection}
	 */
	 public DbComponentCollectionElement newDbComponentCollectionElement(String dbNameValue) {
		DbComponentCollectionElement dbComponentCollection = ((OdfFileDom) this.ownerDocument).newOdfElement(DbComponentCollectionElement.class);
		dbComponentCollection.setDbNameAttribute(dbNameValue);
		this.appendChild(dbComponentCollection);
		return dbComponentCollection;
	}

	@Override
	public void accept(ElementVisitor visitor) {
		if (visitor instanceof DefaultElementVisitor) {
			DefaultElementVisitor defaultVisitor = (DefaultElementVisitor) visitor;
			defaultVisitor.visit(this);
		} else {
			visitor.visit(this);
		}
	}
}
