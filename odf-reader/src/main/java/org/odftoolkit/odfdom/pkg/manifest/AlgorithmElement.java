
/************************************************************************
 *
 * DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS FILE HEADER
 * 
 * Use is subject to license terms.
 * 
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 ************************************************************************/

/*
 * This file is automatically generated.
 * Don't edit manually.
 */
package org.odftoolkit.odfdom.pkg.manifest;

import org.odftoolkit.odfdom.pkg.OdfElement;
import org.odftoolkit.odfdom.pkg.OdfFileDom;
import org.odftoolkit.odfdom.pkg.OdfName;
import org.odftoolkit.odfdom.pkg.OdfPackageNamespace;


/**
 * Manifest implementation of OpenDocument element  {@odf.element manifest:algorithm}.
 *
 */
public class AlgorithmElement extends OdfElement {

	public static final OdfName ELEMENT_NAME = OdfName.newName(OdfPackageNamespace.MANIFEST, "algorithm");

	/**
	 * Create the instance of <code>AlgorithmElement</code>
	 *
	 * @param  ownerDoc     The type is <code>OdfFileDom</code>
	 */
	public AlgorithmElement(OdfFileDom ownerDoc) {
		super(ownerDoc, ELEMENT_NAME);
	}

	/**
	 * Get the element name
	 *
	 * @return  return   <code>OdfName</code> the name of element {@odf.element manifest:algorithm}.
	 */
    @Override
	public OdfName getOdfName() {
		return ELEMENT_NAME;
	}

	/**
	 * Receives the value of the ODFDOM attribute representation <code>AlgorithmNameAttribute</code> , See {@odf.attribute manifest:algorithm-name}
	 *
	 * Attribute is mandatory.
	 *
	 * @return - the <code>String</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public String getAlgorithmNameAttribute() {
		AlgorithmNameAttribute attr = (AlgorithmNameAttribute) getOdfAttribute(OdfPackageNamespace.MANIFEST, "algorithm-name");
		if (attr != null) {
			return String.valueOf(attr.getValue());
		}
		return null;
	}

	/**
	 * Sets the value of ODFDOM attribute representation <code>AlgorithmNameAttribute</code> , See {@odf.attribute manifest:algorithm-name}
	 *
	 * @param algorithmNameValue   The type is <code>String</code>
	 */
	public void setAlgorithmNameAttribute(String algorithmNameValue) {
		AlgorithmNameAttribute attr = new AlgorithmNameAttribute((OdfFileDom) this.ownerDocument);
		setOdfAttribute(attr);
		attr.setValue(algorithmNameValue);
	}

	/**
	 * Receives the value of the ODFDOM attribute representation <code>InitialisationVectorAttribute</code> , See {@odf.attribute manifest:initialisation-vector}
	 *
	 * Attribute is mandatory.
	 *
	 * @return - the <code>String</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public String getInitialisationVectorAttribute() {
		InitialisationVectorAttribute attr = (InitialisationVectorAttribute) getOdfAttribute(OdfPackageNamespace.MANIFEST, "initialisation-vector");
		if (attr != null) {
			return String.valueOf(attr.getValue());
		}
		return null;
	}

	/**
	 * Sets the value of ODFDOM attribute representation <code>InitialisationVectorAttribute</code> , See {@odf.attribute manifest:initialisation-vector}
	 *
	 * @param initialisationVectorValue   The type is <code>String</code>
	 */
	public void setInitialisationVectorAttribute(String initialisationVectorValue) {
		InitialisationVectorAttribute attr = new InitialisationVectorAttribute((OdfFileDom) this.ownerDocument);
		setOdfAttribute(attr);
		attr.setValue(initialisationVectorValue);
	}

}
