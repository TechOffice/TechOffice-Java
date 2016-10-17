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
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.NormalizedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "flushIntervalOrFlushOnExecuteOrProperty"
})
@XmlRootElement(name = "cacheModel")
public class CacheModel {

    @XmlAttribute(name = "id", required = true)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String id;
    @XmlAttribute(name = "type", required = true)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String type;
    @XmlAttribute(name = "readOnly")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String readOnly;
    @XmlAttribute(name = "serialize")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String serialize;
    @XmlElements({
        @XmlElement(name = "flushInterval", required = true, type = FlushInterval.class),
        @XmlElement(name = "flushOnExecute", required = true, type = FlushOnExecute.class),
        @XmlElement(name = "property", required = true, type = Property.class)
    })
    protected List<Object> flushIntervalOrFlushOnExecuteOrProperty;

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
     * ���o type �S�ʪ���.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getType() {
        return type;
    }

    /**
     * �]�w type �S�ʪ���.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setType(String value) {
        this.type = value;
    }

    /**
     * ���o readOnly �S�ʪ���.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReadOnly() {
        return readOnly;
    }

    /**
     * �]�w readOnly �S�ʪ���.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReadOnly(String value) {
        this.readOnly = value;
    }

    /**
     * ���o serialize �S�ʪ���.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSerialize() {
        return serialize;
    }

    /**
     * �]�w serialize �S�ʪ���.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSerialize(String value) {
        this.serialize = value;
    }

    /**
     * Gets the value of the flushIntervalOrFlushOnExecuteOrProperty property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the flushIntervalOrFlushOnExecuteOrProperty property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFlushIntervalOrFlushOnExecuteOrProperty().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FlushInterval }
     * {@link FlushOnExecute }
     * {@link Property }
     * 
     * 
     */
    public List<Object> getFlushIntervalOrFlushOnExecuteOrProperty() {
        if (flushIntervalOrFlushOnExecuteOrProperty == null) {
            flushIntervalOrFlushOnExecuteOrProperty = new ArrayList<Object>();
        }
        return this.flushIntervalOrFlushOnExecuteOrProperty;
    }

}
