
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
 *         <element name="del_waybillResult" type="{http://www.w3.org/2001/XMLSchema}int"/>
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
    "delWaybillResult"
})
@XmlRootElement(name = "del_waybillResponse")
public class DelWaybillResponse {

    @XmlElement(name = "del_waybillResult")
    protected int delWaybillResult;

    /**
     * Gets the value of the delWaybillResult property.
     * 
     */
    public int getDelWaybillResult() {
        return delWaybillResult;
    }

    /**
     * Sets the value of the delWaybillResult property.
     * 
     */
    public void setDelWaybillResult(int value) {
        this.delWaybillResult = value;
    }

}
