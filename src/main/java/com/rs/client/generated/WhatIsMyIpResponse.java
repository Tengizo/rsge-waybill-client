
package com.rs.client.generated;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType>
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="what_is_my_ipResult" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "whatIsMyIpResult"
})
@XmlRootElement(name = "what_is_my_ipResponse")
public class WhatIsMyIpResponse {

    @XmlElement(name = "what_is_my_ipResult")
    protected String whatIsMyIpResult;

    /**
     * Gets the value of the whatIsMyIpResult property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWhatIsMyIpResult() {
        return whatIsMyIpResult;
    }

    /**
     * Sets the value of the whatIsMyIpResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWhatIsMyIpResult(String value) {
        this.whatIsMyIpResult = value;
    }

}
