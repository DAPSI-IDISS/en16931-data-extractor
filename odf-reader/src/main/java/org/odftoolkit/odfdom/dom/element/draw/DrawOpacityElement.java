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
package org.odftoolkit.odfdom.dom.element.draw;

import org.odftoolkit.odfdom.pkg.OdfElement;
import org.odftoolkit.odfdom.pkg.ElementVisitor;
import org.odftoolkit.odfdom.pkg.OdfFileDom;
import org.odftoolkit.odfdom.pkg.OdfName;
import org.odftoolkit.odfdom.dom.OdfDocumentNamespace;
import org.odftoolkit.odfdom.dom.DefaultElementVisitor;
import org.odftoolkit.odfdom.dom.attribute.draw.DrawAngleAttribute;
import org.odftoolkit.odfdom.dom.attribute.draw.DrawBorderAttribute;
import org.odftoolkit.odfdom.dom.attribute.draw.DrawCxAttribute;
import org.odftoolkit.odfdom.dom.attribute.draw.DrawCyAttribute;
import org.odftoolkit.odfdom.dom.attribute.draw.DrawDisplayNameAttribute;
import org.odftoolkit.odfdom.dom.attribute.draw.DrawEndAttribute;
import org.odftoolkit.odfdom.dom.attribute.draw.DrawNameAttribute;
import org.odftoolkit.odfdom.dom.attribute.draw.DrawStartAttribute;
import org.odftoolkit.odfdom.dom.attribute.draw.DrawStyleAttribute;

/**
 * DOM implementation of OpenDocument element  {@odf.element draw:opacity}.
 *
 */
public class DrawOpacityElement extends OdfElement {

	public static final OdfName ELEMENT_NAME = OdfName.newName(OdfDocumentNamespace.DRAW, "opacity");

	/**
	 * Create the instance of <code>DrawOpacityElement</code>
	 *
	 * @param  ownerDoc     The type is <code>OdfFileDom</code>
	 */
	public DrawOpacityElement(OdfFileDom ownerDoc) {
		super(ownerDoc, ELEMENT_NAME);
	}

	/**
	 * Get the element name
	 *
	 * @return  return   <code>OdfName</code> the name of element {@odf.element draw:opacity}.
	 */
	public OdfName getOdfName() {
		return ELEMENT_NAME;
	}

	/**
	 * Receives the value of the ODFDOM attribute representation <code>DrawAngleAttribute</code> , See {@odf.attribute draw:angle}
	 *
	 * @return - the <code>String</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public String getDrawAngleAttribute() {
		DrawAngleAttribute attr = (DrawAngleAttribute) getOdfAttribute(OdfDocumentNamespace.DRAW, "angle");
		if (attr != null) {
			return String.valueOf(attr.getValue());
		}
		return null;
	}

	/**
	 * Sets the value of ODFDOM attribute representation <code>DrawAngleAttribute</code> , See {@odf.attribute draw:angle}
	 *
	 * @param drawAngleValue   The type is <code>String</code>
	 */
	public void setDrawAngleAttribute(String drawAngleValue) {
		DrawAngleAttribute attr = new DrawAngleAttribute((OdfFileDom) this.ownerDocument);
		setOdfAttribute(attr);
		attr.setValue(drawAngleValue);
	}

	/**
	 * Receives the value of the ODFDOM attribute representation <code>DrawBorderAttribute</code> , See {@odf.attribute draw:border}
	 *
	 * @return - the <code>String</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public String getDrawBorderAttribute() {
		DrawBorderAttribute attr = (DrawBorderAttribute) getOdfAttribute(OdfDocumentNamespace.DRAW, "border");
		if (attr != null) {
			return String.valueOf(attr.getValue());
		}
		return null;
	}

	/**
	 * Sets the value of ODFDOM attribute representation <code>DrawBorderAttribute</code> , See {@odf.attribute draw:border}
	 *
	 * @param drawBorderValue   The type is <code>String</code>
	 */
	public void setDrawBorderAttribute(String drawBorderValue) {
		DrawBorderAttribute attr = new DrawBorderAttribute((OdfFileDom) this.ownerDocument);
		setOdfAttribute(attr);
		attr.setValue(drawBorderValue);
	}

	/**
	 * Receives the value of the ODFDOM attribute representation <code>DrawCxAttribute</code> , See {@odf.attribute draw:cx}
	 *
	 * @return - the <code>String</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public String getDrawCxAttribute() {
		DrawCxAttribute attr = (DrawCxAttribute) getOdfAttribute(OdfDocumentNamespace.DRAW, "cx");
		if (attr != null) {
			return String.valueOf(attr.getValue());
		}
		return null;
	}

	/**
	 * Sets the value of ODFDOM attribute representation <code>DrawCxAttribute</code> , See {@odf.attribute draw:cx}
	 *
	 * @param drawCxValue   The type is <code>String</code>
	 */
	public void setDrawCxAttribute(String drawCxValue) {
		DrawCxAttribute attr = new DrawCxAttribute((OdfFileDom) this.ownerDocument);
		setOdfAttribute(attr);
		attr.setValue(drawCxValue);
	}

	/**
	 * Receives the value of the ODFDOM attribute representation <code>DrawCyAttribute</code> , See {@odf.attribute draw:cy}
	 *
	 * @return - the <code>String</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public String getDrawCyAttribute() {
		DrawCyAttribute attr = (DrawCyAttribute) getOdfAttribute(OdfDocumentNamespace.DRAW, "cy");
		if (attr != null) {
			return String.valueOf(attr.getValue());
		}
		return null;
	}

	/**
	 * Sets the value of ODFDOM attribute representation <code>DrawCyAttribute</code> , See {@odf.attribute draw:cy}
	 *
	 * @param drawCyValue   The type is <code>String</code>
	 */
	public void setDrawCyAttribute(String drawCyValue) {
		DrawCyAttribute attr = new DrawCyAttribute((OdfFileDom) this.ownerDocument);
		setOdfAttribute(attr);
		attr.setValue(drawCyValue);
	}

	/**
	 * Receives the value of the ODFDOM attribute representation <code>DrawDisplayNameAttribute</code> , See {@odf.attribute draw:display-name}
	 *
	 * @return - the <code>String</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public String getDrawDisplayNameAttribute() {
		DrawDisplayNameAttribute attr = (DrawDisplayNameAttribute) getOdfAttribute(OdfDocumentNamespace.DRAW, "display-name");
		if (attr != null) {
			return String.valueOf(attr.getValue());
		}
		return null;
	}

	/**
	 * Sets the value of ODFDOM attribute representation <code>DrawDisplayNameAttribute</code> , See {@odf.attribute draw:display-name}
	 *
	 * @param drawDisplayNameValue   The type is <code>String</code>
	 */
	public void setDrawDisplayNameAttribute(String drawDisplayNameValue) {
		DrawDisplayNameAttribute attr = new DrawDisplayNameAttribute((OdfFileDom) this.ownerDocument);
		setOdfAttribute(attr);
		attr.setValue(drawDisplayNameValue);
	}

	/**
	 * Receives the value of the ODFDOM attribute representation <code>DrawEndAttribute</code> , See {@odf.attribute draw:end}
	 *
	 * @return - the <code>String</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public String getDrawEndAttribute() {
		DrawEndAttribute attr = (DrawEndAttribute) getOdfAttribute(OdfDocumentNamespace.DRAW, "end");
		if (attr != null) {
			return String.valueOf(attr.getValue());
		}
		return null;
	}

	/**
	 * Sets the value of ODFDOM attribute representation <code>DrawEndAttribute</code> , See {@odf.attribute draw:end}
	 *
	 * @param drawEndValue   The type is <code>String</code>
	 */
	public void setDrawEndAttribute(String drawEndValue) {
		DrawEndAttribute attr = new DrawEndAttribute((OdfFileDom) this.ownerDocument);
		setOdfAttribute(attr);
		attr.setValue(drawEndValue);
	}

	/**
	 * Receives the value of the ODFDOM attribute representation <code>DrawNameAttribute</code> , See {@odf.attribute draw:name}
	 *
	 * @return - the <code>String</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public String getDrawNameAttribute() {
		DrawNameAttribute attr = (DrawNameAttribute) getOdfAttribute(OdfDocumentNamespace.DRAW, "name");
		if (attr != null) {
			return String.valueOf(attr.getValue());
		}
		return null;
	}

	/**
	 * Sets the value of ODFDOM attribute representation <code>DrawNameAttribute</code> , See {@odf.attribute draw:name}
	 *
	 * @param drawNameValue   The type is <code>String</code>
	 */
	public void setDrawNameAttribute(String drawNameValue) {
		DrawNameAttribute attr = new DrawNameAttribute((OdfFileDom) this.ownerDocument);
		setOdfAttribute(attr);
		attr.setValue(drawNameValue);
	}

	/**
	 * Receives the value of the ODFDOM attribute representation <code>DrawStartAttribute</code> , See {@odf.attribute draw:start}
	 *
	 * @return - the <code>String</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public String getDrawStartAttribute() {
		DrawStartAttribute attr = (DrawStartAttribute) getOdfAttribute(OdfDocumentNamespace.DRAW, "start");
		if (attr != null) {
			return String.valueOf(attr.getValue());
		}
		return null;
	}

	/**
	 * Sets the value of ODFDOM attribute representation <code>DrawStartAttribute</code> , See {@odf.attribute draw:start}
	 *
	 * @param drawStartValue   The type is <code>String</code>
	 */
	public void setDrawStartAttribute(String drawStartValue) {
		DrawStartAttribute attr = new DrawStartAttribute((OdfFileDom) this.ownerDocument);
		setOdfAttribute(attr);
		attr.setValue(drawStartValue);
	}

	/**
	 * Receives the value of the ODFDOM attribute representation <code>DrawStyleAttribute</code> , See {@odf.attribute draw:style}
	 *
	 * Attribute is mandatory.
	 *
	 * @return - the <code>String</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public String getDrawStyleAttribute() {
		DrawStyleAttribute attr = (DrawStyleAttribute) getOdfAttribute(OdfDocumentNamespace.DRAW, "style");
		if (attr != null) {
			return String.valueOf(attr.getValue());
		}
		return null;
	}

	/**
	 * Sets the value of ODFDOM attribute representation <code>DrawStyleAttribute</code> , See {@odf.attribute draw:style}
	 *
	 * @param drawStyleValue   The type is <code>String</code>
	 */
	public void setDrawStyleAttribute(String drawStyleValue) {
		DrawStyleAttribute attr = new DrawStyleAttribute((OdfFileDom) this.ownerDocument);
		setOdfAttribute(attr);
		attr.setValue(drawStyleValue);
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
