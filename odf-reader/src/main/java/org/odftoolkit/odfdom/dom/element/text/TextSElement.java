/**
 * **********************************************************************
 *
 * DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS FILE HEADER
 *
 * Copyright 2008, 2010 Oracle and/or its affiliates. All rights reserved.
 *
 * Use is subject to license terms.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at http://www.apache.org/licenses/LICENSE-2.0. You can also
 * obtain a copy of the License at http://odftoolkit.org/docs/license.txt
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 ***********************************************************************
 */

/*
 * This file is automatically generated.
 * Don't edit manually.
 */
package org.odftoolkit.odfdom.dom.element.text;

import java.util.logging.Logger;
import org.odftoolkit.odfdom.dom.DefaultElementVisitor;
import org.odftoolkit.odfdom.dom.OdfDocumentNamespace;
import org.odftoolkit.odfdom.dom.attribute.text.TextCAttribute;
import org.odftoolkit.odfdom.pkg.ElementVisitor;
import org.odftoolkit.odfdom.pkg.OdfElement;
import org.odftoolkit.odfdom.pkg.OdfFileDom;
import org.odftoolkit.odfdom.pkg.OdfName;
import org.w3c.dom.Node;

/**
 * DOM implementation of OpenDocument element {
 *
 * @odf.element text:s}.
 *
 */
public class TextSElement extends OdfElement {

	public static final OdfName ELEMENT_NAME = OdfName.newName(OdfDocumentNamespace.TEXT, "s");
    private static final Logger LOG = Logger.getLogger(TextSElement.class.getName());


	/**
	 * Create the instance of
	 * <code>TextSElement</code>
	 *
	 * @param ownerDoc The type is <code>OdfFileDom</code>
	 */
	public TextSElement(OdfFileDom ownerDoc) {
		super(ownerDoc, ELEMENT_NAME);
	}

	/**
	 * Get the element name
	 *
	 * @return return   <code>OdfName</code> the name of element {
	 * @odf.element text:s}.
	 */
	public OdfName getOdfName() {
		return ELEMENT_NAME;
	}

	/**
	 * Receives the value of the ODFDOM attribute representation
	 * <code>TextCAttribute</code> , See {
	 *
	 * @odf.attribute text:c}
	 *
	 * @return - the <code>Integer</code> , the value or <code>null</code>, if
	 * the attribute is not set and no default value defined.
	 */
	public Integer getTextCAttribute() {
		TextCAttribute attr = (TextCAttribute) getOdfAttribute(OdfDocumentNamespace.TEXT, "c");
		if (attr != null) {
			return Integer.valueOf(attr.intValue());
		}
		return null;
	}

	/**
	 * Sets the value of ODFDOM attribute representation
	 * <code>TextCAttribute</code> , See {
	 *
	 * @odf.attribute text:c}
	 *
	 * @param textCValue The type is <code>Integer</code>
	 */
	public void setTextCAttribute(Integer textCValue) {
		TextCAttribute attr = new TextCAttribute((OdfFileDom) this.ownerDocument);
		setOdfAttribute(attr);
		attr.setIntValue(textCValue.intValue());
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


	@Override
	/**
	 * Splitting the element at the given position into two halves
	 *
	 * @param posStart The split position. The start of the second half.
	 * @return the new created second space element or null if the element had a
	 * count of 1 or the given position was larger than the space
	 */
	public OdfElement split(int posStart) {
		TextSElement newElement = this;
		if (posStart > 0) {
			newElement = (TextSElement) this.cloneNode(true);
			int repeated = getTextCAttribute();
			if (repeated > 1) {
				if (posStart > 1) {
					this.setTextCAttribute(posStart);
				} else {
					this.removeAttributeNS(OdfDocumentNamespace.TEXT.getUri(), "c");
				}
				if (repeated - posStart > 1) {
					newElement.setTextCAttribute(repeated - posStart);
				} else {
					newElement.removeAttributeNS(OdfDocumentNamespace.TEXT.getUri(), "c");
				}
			}
			Node nextNodeSibling = this.getNextSibling();
			OdfElement parent = (OdfElement) this.getParentNode();
			if (nextNodeSibling == null) {
				parent.appendChild(newElement);
			} else {
				parent.insertBefore(newElement, nextNodeSibling);
			}
		}else{
			LOG.fine("The result from a split at the beginning is equal its input! "
                    + "Likely nested <text:spans> having template and hard style...");
		}
		return newElement;
	}
//		return this;
//
//		TextSElement previousSpace = null;
//		if (spaces != 1 && spaces != posStart) {
//			if(posStart > 1){
//				setTextCAttribute(spaces - posStart);
//			}else{
//				this.removeAttributeNS(OdfDocumentNamespace.TEXT.getUri(), "c");
//			}
//			previousSpace = new TextSElement((OdfFileDom) getOwnerDocument());
//			if ((spaces - posStart) > 1) {
//				previousSpace.setTextCAttribute(spaces - posStart);
//			}
//			getParentNode().insertBefore(previousSpace, this);
//		}
//		return this;
//	}

	@Override
	public int getRepetition() {
		Integer spaces = getTextCAttribute();
		if (spaces == null) {
			spaces = 1;
		}
		return spaces;
	}

	@Override
	/**
	 * If this element is the first - perhaps only - element of a logical group
	 * of XML elements. For instance: table, paragraph
	 */
	public boolean isComponentRoot() {
		return true;
	}
}
