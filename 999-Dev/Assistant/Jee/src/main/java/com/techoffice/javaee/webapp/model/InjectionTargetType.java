//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.11.18 at 10:19:16 AM CST 
//


package com.techoffice.javaee.webapp.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * 
 * 	An injection target specifies a class and a name within
 * 	that class into which a resource should be injected.
 * 
 * 	The injection target class specifies the fully qualified
 * 	class name that is the target of the injection.  The
 * 	Java EE specifications describe which classes can be an
 * 	injection target.
 * 
 * 	The injection target name specifies the target within
 * 	the specified class.  The target is first looked for as a
 * 	JavaBeans property name.  If not found, the target is
 * 	looked for as a field name.
 * 
 * 	The specified resource will be injected into the target
 * 	during initialization of the class by either calling the
 * 	set method for the target property or by setting a value
 * 	into the named field.
 * 
 *       
 * 
 * <p>Java class for injection-targetType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="injection-targetType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="injection-target-class" type="{http://java.sun.com/xml/ns/javaee}fully-qualified-classType"/&gt;
 *         &lt;element name="injection-target-name" type="{http://java.sun.com/xml/ns/javaee}java-identifierType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "injection-targetType", propOrder = {
    "injectionTargetClass",
    "injectionTargetName"
})
public class InjectionTargetType {

    @XmlElement(name = "injection-target-class", required = true)
    protected FullyQualifiedClassType injectionTargetClass;
    @XmlElement(name = "injection-target-name", required = true)
    protected JavaIdentifierType injectionTargetName;

    /**
     * Gets the value of the injectionTargetClass property.
     * 
     * @return
     *     possible object is
     *     {@link FullyQualifiedClassType }
     *     
     */
    public FullyQualifiedClassType getInjectionTargetClass() {
        return injectionTargetClass;
    }

    /**
     * Sets the value of the injectionTargetClass property.
     * 
     * @param value
     *     allowed object is
     *     {@link FullyQualifiedClassType }
     *     
     */
    public void setInjectionTargetClass(FullyQualifiedClassType value) {
        this.injectionTargetClass = value;
    }

    /**
     * Gets the value of the injectionTargetName property.
     * 
     * @return
     *     possible object is
     *     {@link JavaIdentifierType }
     *     
     */
    public JavaIdentifierType getInjectionTargetName() {
        return injectionTargetName;
    }

    /**
     * Sets the value of the injectionTargetName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JavaIdentifierType }
     *     
     */
    public void setInjectionTargetName(JavaIdentifierType value) {
        this.injectionTargetName = value;
    }

}
