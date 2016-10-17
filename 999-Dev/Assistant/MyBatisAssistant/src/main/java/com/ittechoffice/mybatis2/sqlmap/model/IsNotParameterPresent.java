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
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.NormalizedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "value"
})
@XmlRootElement(name = "isNotParameterPresent")
public class IsNotParameterPresent {

    @XmlAttribute(name = "prepend")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String prepend;
    @XmlAttribute(name = "open")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String open;
    @XmlAttribute(name = "close")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String close;
    @XmlAttribute(name = "removeFirstPrepend")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String removeFirstPrepend;
    @XmlValue
    protected String value;

    /**
     * ���o prepend �S�ʪ���.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrepend() {
        return prepend;
    }

    /**
     * �]�w prepend �S�ʪ���.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrepend(String value) {
        this.prepend = value;
    }

    /**
     * ���o open �S�ʪ���.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOpen() {
        return open;
    }

    /**
     * �]�w open �S�ʪ���.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOpen(String value) {
        this.open = value;
    }

    /**
     * ���o close �S�ʪ���.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClose() {
        return close;
    }

    /**
     * �]�w close �S�ʪ���.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClose(String value) {
        this.close = value;
    }

    /**
     * ���o removeFirstPrepend �S�ʪ���.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRemoveFirstPrepend() {
        return removeFirstPrepend;
    }

    /**
     * �]�w removeFirstPrepend �S�ʪ���.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRemoveFirstPrepend(String value) {
        this.removeFirstPrepend = value;
    }

    /**
     * ���o value �S�ʪ���.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getvalue() {
        return value;
    }

    /**
     * �]�w value �S�ʪ���.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setvalue(String value) {
        this.value = value;
    }

}
