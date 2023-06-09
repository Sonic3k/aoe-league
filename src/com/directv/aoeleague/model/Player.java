//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.12.22 at 10:27:17 AM ICT 
//


package com.directv.aoeleague.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
import org.jvnet.jaxb2_commons.lang.CopyStrategy;
import org.jvnet.jaxb2_commons.lang.CopyTo;
import org.jvnet.jaxb2_commons.lang.Equals;
import org.jvnet.jaxb2_commons.lang.EqualsStrategy;
import org.jvnet.jaxb2_commons.lang.HashCode;
import org.jvnet.jaxb2_commons.lang.HashCodeStrategy;
import org.jvnet.jaxb2_commons.lang.JAXBCopyStrategy;
import org.jvnet.jaxb2_commons.lang.JAXBEqualsStrategy;
import org.jvnet.jaxb2_commons.lang.JAXBHashCodeStrategy;
import org.jvnet.jaxb2_commons.locator.ObjectLocator;
import org.jvnet.jaxb2_commons.locator.util.LocatorUtils;


/**
 * <p>Java class for player complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="player">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="point" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="top" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="name" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "player", propOrder = {
    "point",
    "top"
})
public class Player
    implements Cloneable, CopyTo, Equals, HashCode
{

    protected Double point;
    protected Integer top;
    @XmlAttribute(name = "name")
    protected String name;

    /**
     * Gets the value of the point property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getPoint() {
        return point;
    }

    /**
     * Sets the value of the point property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setPoint(Double value) {
        this.point = value;
    }

    /**
     * Gets the value of the top property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getTop() {
        return top;
    }

    /**
     * Sets the value of the top property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setTop(Integer value) {
        this.top = value;
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

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof Player)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final Player that = ((Player) object);
        {
            Double lhsPoint;
            lhsPoint = this.getPoint();
            Double rhsPoint;
            rhsPoint = that.getPoint();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "point", lhsPoint), LocatorUtils.property(thatLocator, "point", rhsPoint), lhsPoint, rhsPoint)) {
                return false;
            }
        }
        {
            Integer lhsTop;
            lhsTop = this.getTop();
            Integer rhsTop;
            rhsTop = that.getTop();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "top", lhsTop), LocatorUtils.property(thatLocator, "top", rhsTop), lhsTop, rhsTop)) {
                return false;
            }
        }
        {
            String lhsName;
            lhsName = this.getName();
            String rhsName;
            rhsName = that.getName();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "name", lhsName), LocatorUtils.property(thatLocator, "name", rhsName), lhsName, rhsName)) {
                return false;
            }
        }
        return true;
    }

    public boolean equals(Object object) {
        final EqualsStrategy strategy = JAXBEqualsStrategy.INSTANCE;
        return equals(null, null, object, strategy);
    }

    public int hashCode(ObjectLocator locator, HashCodeStrategy strategy) {
        int currentHashCode = 1;
        {
            Double thePoint;
            thePoint = this.getPoint();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "point", thePoint), currentHashCode, thePoint);
        }
        {
            Integer theTop;
            theTop = this.getTop();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "top", theTop), currentHashCode, theTop);
        }
        {
            String theName;
            theName = this.getName();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "name", theName), currentHashCode, theName);
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

    public Object clone() {
        return copyTo(createNewInstance());
    }

    public Object copyTo(Object target) {
        final CopyStrategy strategy = JAXBCopyStrategy.INSTANCE;
        return copyTo(null, target, strategy);
    }

    public Object copyTo(ObjectLocator locator, Object target, CopyStrategy strategy) {
        final Object draftCopy = ((target == null)?createNewInstance():target);
        if (draftCopy instanceof Player) {
            final Player copy = ((Player) draftCopy);
            if (this.point!= null) {
                Double sourcePoint;
                sourcePoint = this.getPoint();
                Double copyPoint = ((Double) strategy.copy(LocatorUtils.property(locator, "point", sourcePoint), sourcePoint));
                copy.setPoint(copyPoint);
            } else {
                copy.point = null;
            }
            if (this.top!= null) {
                Integer sourceTop;
                sourceTop = this.getTop();
                Integer copyTop = ((Integer) strategy.copy(LocatorUtils.property(locator, "top", sourceTop), sourceTop));
                copy.setTop(copyTop);
            } else {
                copy.top = null;
            }
            if (this.name!= null) {
                String sourceName;
                sourceName = this.getName();
                String copyName = ((String) strategy.copy(LocatorUtils.property(locator, "name", sourceName), sourceName));
                copy.setName(copyName);
            } else {
                copy.name = null;
            }
        }
        return draftCopy;
    }

    public Object createNewInstance() {
        return new Player();
    }

}
