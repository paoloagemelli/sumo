//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.06.24 at 04:43:09 PM CEST 
//


package safe.annotation;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
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
 *       &lt;sequence minOccurs="0">
 *         &lt;element ref="{}antennaPatternList"/>
 *         &lt;element ref="{}swath"/>
 *         &lt;element ref="{}azimuthTime"/>
 *         &lt;element ref="{}slantRangeTime"/>
 *         &lt;element ref="{}elevationAngle"/>
 *         &lt;element ref="{}elevationPattern"/>
 *         &lt;element ref="{}incidenceAngle"/>
 *         &lt;element ref="{}terrainHeight"/>
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
    "antennaPatternList",
    "swath",
    "azimuthTime",
    "slantRangeTime",
    "elevationAngle",
    "elevationPattern",
    "incidenceAngle",
    "terrainHeight"
})
@XmlRootElement(name = "antennaPattern")
public class AntennaPattern {

    protected AntennaPatternList antennaPatternList;
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NCName")
    protected String swath;
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NMTOKEN")
    protected String azimuthTime;
    protected SlantRangeTime slantRangeTime;
    protected ElevationAngle elevationAngle;
    protected ElevationPattern elevationPattern;
    protected IncidenceAngle incidenceAngle;
    protected TerrainHeight terrainHeight;

    /**
     * Gets the value of the antennaPatternList property.
     * 
     * @return
     *     possible object is
     *     {@link AntennaPatternList }
     *     
     */
    public AntennaPatternList getAntennaPatternList() {
        return antennaPatternList;
    }

    /**
     * Sets the value of the antennaPatternList property.
     * 
     * @param value
     *     allowed object is
     *     {@link AntennaPatternList }
     *     
     */
    public void setAntennaPatternList(AntennaPatternList value) {
        this.antennaPatternList = value;
    }

    /**
     * Gets the value of the swath property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSwath() {
        return swath;
    }

    /**
     * Sets the value of the swath property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSwath(String value) {
        this.swath = value;
    }

    /**
     * Gets the value of the azimuthTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAzimuthTime() {
        return azimuthTime;
    }

    /**
     * Sets the value of the azimuthTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAzimuthTime(String value) {
        this.azimuthTime = value;
    }

    /**
     * Gets the value of the slantRangeTime property.
     * 
     * @return
     *     possible object is
     *     {@link SlantRangeTime }
     *     
     */
    public SlantRangeTime getSlantRangeTime() {
        return slantRangeTime;
    }

    /**
     * Sets the value of the slantRangeTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link SlantRangeTime }
     *     
     */
    public void setSlantRangeTime(SlantRangeTime value) {
        this.slantRangeTime = value;
    }

    /**
     * Gets the value of the elevationAngle property.
     * 
     * @return
     *     possible object is
     *     {@link ElevationAngle }
     *     
     */
    public ElevationAngle getElevationAngle() {
        return elevationAngle;
    }

    /**
     * Sets the value of the elevationAngle property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElevationAngle }
     *     
     */
    public void setElevationAngle(ElevationAngle value) {
        this.elevationAngle = value;
    }

    /**
     * Gets the value of the elevationPattern property.
     * 
     * @return
     *     possible object is
     *     {@link ElevationPattern }
     *     
     */
    public ElevationPattern getElevationPattern() {
        return elevationPattern;
    }

    /**
     * Sets the value of the elevationPattern property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElevationPattern }
     *     
     */
    public void setElevationPattern(ElevationPattern value) {
        this.elevationPattern = value;
    }

    /**
     * Gets the value of the incidenceAngle property.
     * 
     * @return
     *     possible object is
     *     {@link IncidenceAngle }
     *     
     */
    public IncidenceAngle getIncidenceAngle() {
        return incidenceAngle;
    }

    /**
     * Sets the value of the incidenceAngle property.
     * 
     * @param value
     *     allowed object is
     *     {@link IncidenceAngle }
     *     
     */
    public void setIncidenceAngle(IncidenceAngle value) {
        this.incidenceAngle = value;
    }

    /**
     * Gets the value of the terrainHeight property.
     * 
     * @return
     *     possible object is
     *     {@link TerrainHeight }
     *     
     */
    public TerrainHeight getTerrainHeight() {
        return terrainHeight;
    }

    /**
     * Sets the value of the terrainHeight property.
     * 
     * @param value
     *     allowed object is
     *     {@link TerrainHeight }
     *     
     */
    public void setTerrainHeight(TerrainHeight value) {
        this.terrainHeight = value;
    }

}