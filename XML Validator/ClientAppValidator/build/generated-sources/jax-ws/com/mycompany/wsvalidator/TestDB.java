
package com.mycompany.wsvalidator;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TestDB complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TestDB">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="xmlURL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="xsdURL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TestDB", propOrder = {
    "xmlURL",
    "xsdURL"
})
public class TestDB {

    protected String xmlURL;
    protected String xsdURL;

    /**
     * Gets the value of the xmlURL property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getXmlURL() {
        return xmlURL;
    }

    /**
     * Sets the value of the xmlURL property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setXmlURL(String value) {
        this.xmlURL = value;
    }

    /**
     * Gets the value of the xsdURL property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getXsdURL() {
        return xsdURL;
    }

    /**
     * Sets the value of the xsdURL property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setXsdURL(String value) {
        this.xsdURL = value;
    }

}
