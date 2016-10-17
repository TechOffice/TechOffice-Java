//
// ���ɮ׬O�� JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 �Ҳ��� 
// �аѾ\ <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// �@�����s�sĶ�ӷ����n, �惡�ɮשҰ�������קﳣ�N�|��. 
// ���ͮɶ�: 2016.10.04 �� 11:26:51 AM CST 
//


package com.ittechoffice.mybatis2.sqlmap.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.NormalizedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
@XmlRootElement(name = "parameter")
public class Parameter {

    @XmlAttribute(name = "property", required = true)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String property;
    @XmlAttribute(name = "javaType")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String javaType;
    @XmlAttribute(name = "jdbcType")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String jdbcType;
    @XmlAttribute(name = "typeName")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String typeName;
    @XmlAttribute(name = "nullValue")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String nullValue;
    @XmlAttribute(name = "mode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String mode;
    @XmlAttribute(name = "typeHandler")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String typeHandler;
    @XmlAttribute(name = "resultMap")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String resultMap;
    @XmlAttribute(name = "numericScale")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String numericScale;

    /**
     * ���o property �S�ʪ���.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProperty() {
        return property;
    }

    /**
     * �]�w property �S�ʪ���.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProperty(String value) {
        this.property = value;
    }

    /**
     * ���o javaType �S�ʪ���.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getJavaType() {
        return javaType;
    }

    /**
     * �]�w javaType �S�ʪ���.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setJavaType(String value) {
        this.javaType = value;
    }

    /**
     * ���o jdbcType �S�ʪ���.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getJdbcType() {
        return jdbcType;
    }

    /**
     * �]�w jdbcType �S�ʪ���.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setJdbcType(String value) {
        this.jdbcType = value;
    }

    /**
     * ���o typeName �S�ʪ���.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTypeName() {
        return typeName;
    }

    /**
     * �]�w typeName �S�ʪ���.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTypeName(String value) {
        this.typeName = value;
    }

    /**
     * ���o nullValue �S�ʪ���.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNullValue() {
        return nullValue;
    }

    /**
     * �]�w nullValue �S�ʪ���.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNullValue(String value) {
        this.nullValue = value;
    }

    /**
     * ���o mode �S�ʪ���.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMode() {
        return mode;
    }

    /**
     * �]�w mode �S�ʪ���.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMode(String value) {
        this.mode = value;
    }

    /**
     * ���o typeHandler �S�ʪ���.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTypeHandler() {
        return typeHandler;
    }

    /**
     * �]�w typeHandler �S�ʪ���.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTypeHandler(String value) {
        this.typeHandler = value;
    }

    /**
     * ���o resultMap �S�ʪ���.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResultMap() {
        return resultMap;
    }

    /**
     * �]�w resultMap �S�ʪ���.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResultMap(String value) {
        this.resultMap = value;
    }

    /**
     * ���o numericScale �S�ʪ���.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumericScale() {
        return numericScale;
    }

    /**
     * �]�w numericScale �S�ʪ���.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumericScale(String value) {
        this.numericScale = value;
    }

}
