//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.04.17 at 05:50:37 PM CEST 
//

package org.openhab.ui.cometvisu.internal.config.beans;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for strftime complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="strftime">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="layout" type="{}layout" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="lang">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;enumeration value="en"/>
 *             &lt;enumeration value="de"/>
 *             &lt;enumeration value="fr"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="format" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute ref="{}class"/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "strftime", propOrder = { "layout" })
public class Strftime {

    protected Layout layout;
    @XmlAttribute(name = "lang")
    protected String lang;
    @XmlAttribute(name = "format")
    protected String format;
    @XmlAttribute(name = "class")
    protected String clazz;

    /**
     * Gets the value of the layout property.
     * 
     * @return
     *         possible object is
     *         {@link Layout }
     * 
     */
    public Layout getLayout() {
        return layout;
    }

    /**
     * Sets the value of the layout property.
     * 
     * @param value
     *            allowed object is
     *            {@link Layout }
     * 
     */
    public void setLayout(Layout value) {
        this.layout = value;
    }

    /**
     * Gets the value of the lang property.
     * 
     * @return
     *         possible object is
     *         {@link String }
     * 
     */
    public String getLang() {
        return lang;
    }

    /**
     * Sets the value of the lang property.
     * 
     * @param value
     *            allowed object is
     *            {@link String }
     * 
     */
    public void setLang(String value) {
        this.lang = value;
    }

    /**
     * Gets the value of the format property.
     * 
     * @return
     *         possible object is
     *         {@link String }
     * 
     */
    public String getFormat() {
        return format;
    }

    /**
     * Sets the value of the format property.
     * 
     * @param value
     *            allowed object is
     *            {@link String }
     * 
     */
    public void setFormat(String value) {
        this.format = value;
    }

    /**
     * Gets the value of the clazz property.
     * 
     * @return
     *         possible object is
     *         {@link String }
     * 
     */
    public String getClazz() {
        return clazz;
    }

    /**
     * Sets the value of the clazz property.
     * 
     * @param value
     *            allowed object is
     *            {@link String }
     * 
     */
    public void setClazz(String value) {
        this.clazz = value;
    }

}
