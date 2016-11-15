//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.11.15 at 02:26:56 PM CST 
//


package com.techoffice.example.spring.config.beans.model;

import java.util.ArrayList;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlElementRefs;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for entryType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="entryType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.springframework.org/schema/beans}key" minOccurs="0"/&gt;
 *         &lt;group ref="{http://www.springframework.org/schema/beans}collectionElements"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="key" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="key-ref" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="value" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="value-ref" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="value-type" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "entryType", propOrder = {
    "key",
    "description",
    "beanOrRefOrIdref"
})
public class EntryType {

    protected Key key;
    protected Description description;
    @XmlElementRefs({
        @XmlElementRef(name = "idref", namespace = "http://www.springframework.org/schema/beans", type = Idref.class, required = false),
        @XmlElementRef(name = "bean", namespace = "http://www.springframework.org/schema/beans", type = Bean.class, required = false),
        @XmlElementRef(name = "null", namespace = "http://www.springframework.org/schema/beans", type = Null.class, required = false),
        @XmlElementRef(name = "map", namespace = "http://www.springframework.org/schema/beans", type = Map.class, required = false),
        @XmlElementRef(name = "value", namespace = "http://www.springframework.org/schema/beans", type = Value.class, required = false),
        @XmlElementRef(name = "set", namespace = "http://www.springframework.org/schema/beans", type = Set.class, required = false),
        @XmlElementRef(name = "props", namespace = "http://www.springframework.org/schema/beans", type = Props.class, required = false),
        @XmlElementRef(name = "list", namespace = "http://www.springframework.org/schema/beans", type = com.techoffice.example.spring.config.beans.model.List.class, required = false),
        @XmlElementRef(name = "ref", namespace = "http://www.springframework.org/schema/beans", type = Ref.class, required = false),
        @XmlElementRef(name = "array", namespace = "http://www.springframework.org/schema/beans", type = Array.class, required = false)
    })
    @XmlAnyElement(lax = true)
    protected java.util.List<Object> beanOrRefOrIdref;
    @XmlAttribute(name = "key")
    protected String key3;
    @XmlAttribute(name = "key-ref")
    protected String keyRef;
    @XmlAttribute(name = "value")
    protected String value;
    @XmlAttribute(name = "value-ref")
    protected String valueRef;
    @XmlAttribute(name = "value-type")
    protected String valueType;

    /**
     * Gets the value of the key property.
     * 
     * @return
     *     possible object is
     *     {@link Key }
     *     
     */
    public Key getKey() {
        return key;
    }

    /**
     * Sets the value of the key property.
     * 
     * @param value
     *     allowed object is
     *     {@link Key }
     *     
     */
    public void setKey(Key value) {
        this.key = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link Description }
     *     
     */
    public Description getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link Description }
     *     
     */
    public void setDescription(Description value) {
        this.description = value;
    }

    /**
     * Gets the value of the beanOrRefOrIdref property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the beanOrRefOrIdref property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBeanOrRefOrIdref().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Idref }
     * {@link Bean }
     * {@link Null }
     * {@link Map }
     * {@link Value }
     * {@link Set }
     * {@link Props }
     * {@link Object }
     * {@link Ref }
     * {@link com.techoffice.example.spring.config.beans.model.List }
     * {@link Array }
     * 
     * 
     */
    public java.util.List<Object> getBeanOrRefOrIdref() {
        if (beanOrRefOrIdref == null) {
            beanOrRefOrIdref = new ArrayList<Object>();
        }
        return this.beanOrRefOrIdref;
    }

    /**
     * Gets the value of the key3 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKey3() {
        return key3;
    }

    /**
     * Sets the value of the key3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKey3(String value) {
        this.key3 = value;
    }

    /**
     * Gets the value of the keyRef property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKeyRef() {
        return keyRef;
    }

    /**
     * Sets the value of the keyRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKeyRef(String value) {
        this.keyRef = value;
    }

    /**
     * Gets the value of the value property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValue(String value) {
        this.value = value;
    }

    /**
     * Gets the value of the valueRef property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValueRef() {
        return valueRef;
    }

    /**
     * Sets the value of the valueRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValueRef(String value) {
        this.valueRef = value;
    }

    /**
     * Gets the value of the valueType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValueType() {
        return valueType;
    }

    /**
     * Sets the value of the valueType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValueType(String value) {
        this.valueType = value;
    }

}
