//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.06.24 at 04:43:09 PM CEST 
//


package safe.annotation;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{}productQualityIndex"/>
 *         &lt;element ref="{}qualityDataList"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "productQualityIndex",
    "qualityDataList"
})
@XmlRootElement(name = "qualityInformation")
public class QualityInformation {

    protected double productQualityIndex;
    @XmlElement(required = true)
    protected QualityDataList qualityDataList;

    /**
     * Gets the value of the productQualityIndex property.
     * 
     */
    public double getProductQualityIndex() {
        return productQualityIndex;
    }

    /**
     * Sets the value of the productQualityIndex property.
     * 
     */
    public void setProductQualityIndex(double value) {
        this.productQualityIndex = value;
    }

    /**
     * Gets the value of the qualityDataList property.
     * 
     * @return
     *     possible object is
     *     {@link QualityDataList }
     *     
     */
    public QualityDataList getQualityDataList() {
        return qualityDataList;
    }

    /**
     * Sets the value of the qualityDataList property.
     * 
     * @param value
     *     allowed object is
     *     {@link QualityDataList }
     *     
     */
    public void setQualityDataList(QualityDataList value) {
        this.qualityDataList = value;
    }

}