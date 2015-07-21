//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.2-147 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.01.14 at 10:35:32 AM CET 
//


package org.geoimage.viewer.core.io.sumoxml;

import java.math.BigDecimal;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


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
 *         &lt;element name="target_number" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="lon" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="lat" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="xpixel" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="ypixel" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="detecttime" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="inc_angle" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="reliability" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="false_alarm_cause" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="nr_pixels" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="length" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="width" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="size_class" type="{http://www.w3.org/2001/XMLSchema}NCName"/>
 *         &lt;element name="heading_range" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="heading_north" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="lwh_reliability" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="significance" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="rcs" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="bgnd_mean" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="bgnd_stdev" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="bgnd_sigma0" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="noise" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="maxValue" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="minDetectableRcs" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
    "targetNumber",
    "lon",
    "lat",
    "xpixel",
    "ypixel",
    "detecttime",
    "incAngle",
    "reliability",
    "falseAlarmCause",
    "nrPixels",
    "length",
    "width",
    "sizeClass",
    "headingRange",
    "headingNorth",
    "lwhReliability",
    "significance",
    "rcs",
    "bgndMean",
    "bgndStdev",
    "bgndSigma0",
    "noise",
    "maxValue",
    "minDetectableRcs"
})
@XmlRootElement(name = "boat")
public class Boat {

    @XmlElement(name = "target_number")
    protected int targetNumber;
    protected double lon;
    protected double lat;
    protected double xpixel;
    protected double ypixel;
    @XmlElement(required = true)
    protected String detecttime;
    @XmlElement(name = "inc_angle", required = true)
    protected BigDecimal incAngle;
    protected int reliability;
    @XmlElement(name = "false_alarm_cause", required = true)
    protected String falseAlarmCause;
    @XmlElement(name = "nr_pixels", required = true, type = Integer.class, nillable = true)
    protected Integer nrPixels;
    protected double length;
    protected double width;
    @XmlElement(name = "size_class", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NCName")
    protected String sizeClass;
    @XmlElement(name = "heading_range", required = true, type = Double.class, nillable = true)
    protected Double headingRange;
    @XmlElement(name = "heading_north")
    protected double headingNorth;
    @XmlElement(name = "lwh_reliability", required = true, type = Boolean.class, nillable = true)
    protected Boolean lwhReliability;
    @XmlElement(required = true)
    protected String significance;
    @XmlElement(required = true)
    protected String rcs;
    @XmlElement(name = "bgnd_mean", required = true)
    protected String bgndMean;
    @XmlElement(name = "bgnd_stdev", required = true)
    protected String bgndStdev;
    @XmlElement(name = "bgnd_sigma0", required = true)
    protected String bgndSigma0;
    @XmlElement(required = true, type = Integer.class, nillable = true)
    protected Integer noise;
    @XmlElement(required = true)
    protected String maxValue;
    @XmlElement(required = true)
    protected String minDetectableRcs;

    /**
     * Gets the value of the targetNumber property.
     * 
     */
    public int getTargetNumber() {
        return targetNumber;
    }

    /**
     * Sets the value of the targetNumber property.
     * 
     */
    public void setTargetNumber(int value) {
        this.targetNumber = value;
    }

    /**
     * Gets the value of the lon property.
     * 
     */
    public double getLon() {
        return lon;
    }

    /**
     * Sets the value of the lon property.
     * 
     */
    public void setLon(double value) {
        this.lon = value;
    }

    /**
     * Gets the value of the lat property.
     * 
     */
    public double getLat() {
        return lat;
    }

    /**
     * Sets the value of the lat property.
     * 
     */
    public void setLat(double value) {
        this.lat = value;
    }

    /**
     * Gets the value of the xpixel property.
     * 
     */
    public double getXpixel() {
        return xpixel;
    }

    /**
     * Sets the value of the xpixel property.
     * 
     */
    public void setXpixel(double value) {
        this.xpixel = value;
    }

    /**
     * Gets the value of the ypixel property.
     * 
     */
    public double getYpixel() {
        return ypixel;
    }

    /**
     * Sets the value of the ypixel property.
     * 
     */
    public void setYpixel(double value) {
        this.ypixel = value;
    }

    /**
     * Gets the value of the detecttime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDetecttime() {
        return detecttime;
    }

    /**
     * Sets the value of the detecttime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDetecttime(String value) {
        this.detecttime = value;
    }

    /**
     * Gets the value of the incAngle property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getIncAngle() {
        return incAngle;
    }

    /**
     * Sets the value of the incAngle property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setIncAngle(BigDecimal value) {
        this.incAngle = value;
    }

    /**
     * Gets the value of the reliability property.
     * 
     */
    public int getReliability() {
        return reliability;
    }

    /**
     * Sets the value of the reliability property.
     * 
     */
    public void setReliability(int value) {
        this.reliability = value;
    }

    /**
     * Gets the value of the falseAlarmCause property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFalseAlarmCause() {
        return falseAlarmCause;
    }

    /**
     * Sets the value of the falseAlarmCause property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFalseAlarmCause(String value) {
        this.falseAlarmCause = value;
    }

    /**
     * Gets the value of the nrPixels property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNrPixels() {
        return nrPixels;
    }

    /**
     * Sets the value of the nrPixels property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNrPixels(Integer value) {
        this.nrPixels = value;
    }

    /**
     * Gets the value of the length property.
     * 
     */
    public double getLength() {
        return length;
    }

    /**
     * Sets the value of the length property.
     * 
     */
    public void setLength(double value) {
        this.length = value;
    }

    /**
     * Gets the value of the width property.
     * 
     */
    public double getWidth() {
        return width;
    }

    /**
     * Sets the value of the width property.
     * 
     */
    public void setWidth(double value) {
        this.width = value;
    }

    /**
     * Gets the value of the sizeClass property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSizeClass() {
        return sizeClass;
    }

    /**
     * Sets the value of the sizeClass property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSizeClass(String value) {
        this.sizeClass = value;
    }

    /**
     * Gets the value of the headingRange property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getHeadingRange() {
        return headingRange;
    }

    /**
     * Sets the value of the headingRange property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setHeadingRange(Double value) {
        this.headingRange = value;
    }

    /**
     * Gets the value of the headingNorth property.
     * 
     */
    public double getHeadingNorth() {
        return headingNorth;
    }

    /**
     * Sets the value of the headingNorth property.
     * 
     */
    public void setHeadingNorth(double value) {
        this.headingNorth = value;
    }

    /**
     * Gets the value of the lwhReliability property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isLwhReliability() {
        return lwhReliability;
    }

    /**
     * Sets the value of the lwhReliability property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setLwhReliability(Boolean value) {
        this.lwhReliability = value;
    }

    /**
     * Gets the value of the significance property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSignificance() {
        return significance;
    }

    /**
     * Sets the value of the significance property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSignificance(String value) {
        this.significance = value;
    }

    /**
     * Gets the value of the rcs property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRcs() {
        return rcs;
    }

    /**
     * Sets the value of the rcs property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRcs(String value) {
        this.rcs = value;
    }

    /**
     * Gets the value of the bgndMean property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBgndMean() {
        return bgndMean;
    }

    /**
     * Sets the value of the bgndMean property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBgndMean(String value) {
        this.bgndMean = value;
    }

    /**
     * Gets the value of the bgndStdev property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBgndStdev() {
        return bgndStdev;
    }

    /**
     * Sets the value of the bgndStdev property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBgndStdev(String value) {
        this.bgndStdev = value;
    }

    /**
     * Gets the value of the bgndSigma0 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBgndSigma0() {
        return bgndSigma0;
    }

    /**
     * Sets the value of the bgndSigma0 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBgndSigma0(String value) {
        this.bgndSigma0 = value;
    }

    /**
     * Gets the value of the noise property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNoise() {
        return noise;
    }

    /**
     * Sets the value of the noise property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNoise(Integer value) {
        this.noise = value;
    }

    /**
     * Gets the value of the maxValue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMaxValue() {
        return maxValue;
    }

    /**
     * Sets the value of the maxValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMaxValue(String value) {
        this.maxValue = value;
    }

    /**
     * Gets the value of the minDetectableRcs property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMinDetectableRcs() {
        return minDetectableRcs;
    }

    /**
     * Sets the value of the minDetectableRcs property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMinDetectableRcs(String value) {
        this.minDetectableRcs = value;
    }

}
