//
// ���ɮ׬O�� JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 �Ҳ��� 
// �аѾ\ <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// �@�����s�sĶ�ӷ����n, �惡�ɮשҰ�������קﳣ�N�|��. 
// ���ͮɶ�: 2016.10.04 �� 11:26:51 AM CST 
//


package com.ittechoffice.mybatis2.sqlmap.model;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.NormalizedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "subMap"
})
@XmlRootElement(name = "discriminator")
public class Discriminator {

    @XmlAttribute(name = "javaType", required = true)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String javaType;
    @XmlAttribute(name = "column")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String column;
    @XmlAttribute(name = "columnIndex")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String columnIndex;
    @XmlAttribute(name = "jdbcType")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String jdbcType;
    @XmlAttribute(name = "nullValue")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String nullValue;
    @XmlAttribute(name = "typeHandler")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String typeHandler;
    @XmlElement(required = true)
    protected List<SubMap> subMap;

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
     * ���o column �S�ʪ���.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getColumn() {
        return column;
    }

    /**
     * �]�w column �S�ʪ���.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setColumn(String value) {
        this.column = value;
    }

    /**
     * ���o columnIndex �S�ʪ���.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getColumnIndex() {
        return columnIndex;
    }

    /**
     * �]�w columnIndex �S�ʪ���.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setColumnIndex(String value) {
        this.columnIndex = value;
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
     * Gets the value of the subMap property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the subMap property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSubMap().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SubMap }
     * 
     * 
     */
    public List<SubMap> getSubMap() {
        if (subMap == null) {
            subMap = new ArrayList<SubMap>();
        }
        return this.subMap;
    }

}
