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
import javax.xml.bind.annotation.adapters.NormalizedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "typeAliasOrCacheModelOrResultMapOrParameterMapOrSqlOrStatementOrInsertOrUpdateOrDeleteOrSelectOrProcedure"
})
@XmlRootElement(name = "sqlMap")
public class SqlMap {

    @XmlAttribute(name = "xmlns:fo")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String xmlnsFo;
    @XmlAttribute(name = "namespace")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String namespace;
    @XmlElements({
        @XmlElement(name = "typeAlias", required = true, type = TypeAlias.class),
        @XmlElement(name = "cacheModel", required = true, type = CacheModel.class),
        @XmlElement(name = "resultMap", required = true, type = ResultMap.class),
        @XmlElement(name = "parameterMap", required = true, type = ParameterMap.class),
        @XmlElement(name = "sql", required = true, type = Sql.class),
        @XmlElement(name = "statement", required = true, type = Statement.class),
        @XmlElement(name = "insert", required = true, type = Insert.class),
        @XmlElement(name = "update", required = true, type = Update.class),
        @XmlElement(name = "delete", required = true, type = Delete.class),
        @XmlElement(name = "select", required = true, type = Select.class),
        @XmlElement(name = "procedure", required = true, type = Procedure.class)
    })
    protected List<Object> typeAliasOrCacheModelOrResultMapOrParameterMapOrSqlOrStatementOrInsertOrUpdateOrDeleteOrSelectOrProcedure;

    /**
     * ���o xmlnsFo �S�ʪ���.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getXmlnsFo() {
        return xmlnsFo;
    }

    /**
     * �]�w xmlnsFo �S�ʪ���.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setXmlnsFo(String value) {
        this.xmlnsFo = value;
    }

    /**
     * ���o namespace �S�ʪ���.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNamespace() {
        return namespace;
    }

    /**
     * �]�w namespace �S�ʪ���.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNamespace(String value) {
        this.namespace = value;
    }

    /**
     * Gets the value of the typeAliasOrCacheModelOrResultMapOrParameterMapOrSqlOrStatementOrInsertOrUpdateOrDeleteOrSelectOrProcedure property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the typeAliasOrCacheModelOrResultMapOrParameterMapOrSqlOrStatementOrInsertOrUpdateOrDeleteOrSelectOrProcedure property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTypeAliasOrCacheModelOrResultMapOrParameterMapOrSqlOrStatementOrInsertOrUpdateOrDeleteOrSelectOrProcedure().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TypeAlias }
     * {@link CacheModel }
     * {@link ResultMap }
     * {@link ParameterMap }
     * {@link Sql }
     * {@link Statement }
     * {@link Insert }
     * {@link Update }
     * {@link Delete }
     * {@link Select }
     * {@link Procedure }
     * 
     * 
     */
    public List<Object> getTypeAliasOrCacheModelOrResultMapOrParameterMapOrSqlOrStatementOrInsertOrUpdateOrDeleteOrSelectOrProcedure() {
        if (typeAliasOrCacheModelOrResultMapOrParameterMapOrSqlOrStatementOrInsertOrUpdateOrDeleteOrSelectOrProcedure == null) {
            typeAliasOrCacheModelOrResultMapOrParameterMapOrSqlOrStatementOrInsertOrUpdateOrDeleteOrSelectOrProcedure = new ArrayList<Object>();
        }
        return this.typeAliasOrCacheModelOrResultMapOrParameterMapOrSqlOrStatementOrInsertOrUpdateOrDeleteOrSelectOrProcedure;
    }

}
