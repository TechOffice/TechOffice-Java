//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.11.11 at 02:32:38 PM CST 
//


package com.techoffice.example.mvn.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * A repository contains the information needed for establishing connections with
 *         remote repository.
 * 
 * <p>Java class for Repository complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Repository"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;all&gt;
 *         &lt;element name="releases" type="{http://maven.apache.org/POM/4.0.0}RepositoryPolicy" minOccurs="0"/&gt;
 *         &lt;element name="snapshots" type="{http://maven.apache.org/POM/4.0.0}RepositoryPolicy" minOccurs="0"/&gt;
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="url" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="layout" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/all&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Repository", propOrder = {

})
public class Repository {

    protected RepositoryPolicy releases;
    protected RepositoryPolicy snapshots;
    protected String id;
    protected String name;
    protected String url;
    @XmlElement(defaultValue = "default")
    protected String layout;

    /**
     * Gets the value of the releases property.
     * 
     * @return
     *     possible object is
     *     {@link RepositoryPolicy }
     *     
     */
    public RepositoryPolicy getReleases() {
        return releases;
    }

    /**
     * Sets the value of the releases property.
     * 
     * @param value
     *     allowed object is
     *     {@link RepositoryPolicy }
     *     
     */
    public void setReleases(RepositoryPolicy value) {
        this.releases = value;
    }

    /**
     * Gets the value of the snapshots property.
     * 
     * @return
     *     possible object is
     *     {@link RepositoryPolicy }
     *     
     */
    public RepositoryPolicy getSnapshots() {
        return snapshots;
    }

    /**
     * Sets the value of the snapshots property.
     * 
     * @param value
     *     allowed object is
     *     {@link RepositoryPolicy }
     *     
     */
    public void setSnapshots(RepositoryPolicy value) {
        this.snapshots = value;
    }

    /**
     * Gets the value of the id property.
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
     * Sets the value of the id property.
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
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the url property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUrl() {
        return url;
    }

    /**
     * Sets the value of the url property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUrl(String value) {
        this.url = value;
    }

    /**
     * Gets the value of the layout property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLayout() {
        return layout;
    }

    /**
     * Sets the value of the layout property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLayout(String value) {
        this.layout = value;
    }

}
