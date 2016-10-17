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
@XmlRootElement(name = "procedure")
public class Procedure {

    @XmlAttribute(name = "id", required = true)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String id;
    @XmlAttribute(name = "parameterMap")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String parameterMap;
    @XmlAttribute(name = "parameterClass")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String parameterClass;
    @XmlAttribute(name = "resultMap")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String resultMap;
    @XmlAttribute(name = "resultClass")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String resultClass;
    @XmlAttribute(name = "cacheModel")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String cacheModel;
    @XmlAttribute(name = "fetchSize")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String fetchSize;
    @XmlAttribute(name = "xmlResultName")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String xmlResultName;
    @XmlAttribute(name = "remapResults")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String remapResults;
    @XmlAttribute(name = "timeout")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String timeout;
    @XmlValue
    protected String value;

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
     * ���o parameterMap �S�ʪ���.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getParameterMap() {
        return parameterMap;
    }

    /**
     * �]�w parameterMap �S�ʪ���.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setParameterMap(String value) {
        this.parameterMap = value;
    }

    /**
     * ���o parameterClass �S�ʪ���.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getParameterClass() {
        return parameterClass;
    }

    /**
     * �]�w parameterClass �S�ʪ���.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setParameterClass(String value) {
        this.parameterClass = value;
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
     * ���o resultClass �S�ʪ���.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResultClass() {
        return resultClass;
    }

    /**
     * �]�w resultClass �S�ʪ���.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResultClass(String value) {
        this.resultClass = value;
    }

    /**
     * ���o cacheModel �S�ʪ���.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCacheModel() {
        return cacheModel;
    }

    /**
     * �]�w cacheModel �S�ʪ���.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCacheModel(String value) {
        this.cacheModel = value;
    }

    /**
     * ���o fetchSize �S�ʪ���.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFetchSize() {
        return fetchSize;
    }

    /**
     * �]�w fetchSize �S�ʪ���.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFetchSize(String value) {
        this.fetchSize = value;
    }

    /**
     * ���o xmlResultName �S�ʪ���.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getXmlResultName() {
        return xmlResultName;
    }

    /**
     * �]�w xmlResultName �S�ʪ���.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setXmlResultName(String value) {
        this.xmlResultName = value;
    }

    /**
     * ���o remapResults �S�ʪ���.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRemapResults() {
        return remapResults;
    }

    /**
     * �]�w remapResults �S�ʪ���.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRemapResults(String value) {
        this.remapResults = value;
    }

    /**
     * ���o timeout �S�ʪ���.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTimeout() {
        return timeout;
    }

    /**
     * �]�w timeout �S�ʪ���.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTimeout(String value) {
        this.timeout = value;
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
