//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.11.15 at 02:26:56 PM CST 
//


package com.techoffice.example.spring.config.beans.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.springframework.org/schema/beans}listOrSetType"&gt;
 *       &lt;attribute name="merge" type="{http://www.springframework.org/schema/beans}defaultable-boolean" default="default" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
@XmlRootElement(name = "list")
public class List
    extends ListOrSetType
{

    @XmlAttribute(name = "merge")
    protected DefaultableBoolean merge;

    /**
     * Gets the value of the merge property.
     * 
     * @return
     *     possible object is
     *     {@link DefaultableBoolean }
     *     
     */
    public DefaultableBoolean getMerge() {
        if (merge == null) {
            return DefaultableBoolean.DEFAULT;
        } else {
            return merge;
        }
    }

    /**
     * Sets the value of the merge property.
     * 
     * @param value
     *     allowed object is
     *     {@link DefaultableBoolean }
     *     
     */
    public void setMerge(DefaultableBoolean value) {
        this.merge = value;
    }

}
