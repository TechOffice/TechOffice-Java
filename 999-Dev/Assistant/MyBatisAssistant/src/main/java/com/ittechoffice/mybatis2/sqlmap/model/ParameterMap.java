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
    "parameter"
})
@XmlRootElement(name = "parameterMap")
public class ParameterMap {

    @XmlAttribute(name = "id", required = true)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String id;
    @XmlAttribute(name = "class", required = true)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String clazz;
    @XmlElement(required = true)
    protected List<Parameter> parameter;

    /**
     * ���o id �S�ʪ���.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * �]�w id �S�ʪ���.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

    /**
     * ���o clazz �S�ʪ���.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClazz() {
        return clazz;
    }

    /**
     * �]�w clazz �S�ʪ���.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClazz(String value) {
        this.clazz = value;
    }

    /**
     * Gets the value of the parameter property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the parameter property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getParameter().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Parameter }
     * 
     * 
     */
    public List<Parameter> getParameter() {
        if (parameter == null) {
            parameter = new ArrayList<Parameter>();
        }
        return this.parameter;
    }

}
