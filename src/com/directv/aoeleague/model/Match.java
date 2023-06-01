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
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
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
 * <p>Java class for match complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="match">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="team1" type="{}team" minOccurs="0"/>
 *         &lt;element name="team2" type="{}team" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="result" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="date" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "match", propOrder = {
    "team1",
    "team2"
})
public class Match
    implements Cloneable, CopyTo, Equals, HashCode
{

    protected Team team1;
    protected Team team2;
    @XmlAttribute(name = "result")
    protected String result;
    @XmlAttribute(name = "date")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar date;

    /**
     * Gets the value of the team1 property.
     * 
     * @return
     *     possible object is
     *     {@link Team }
     *     
     */
    public Team getTeam1() {
        return team1;
    }

    /**
     * Sets the value of the team1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Team }
     *     
     */
    public void setTeam1(Team value) {
        this.team1 = value;
    }

    /**
     * Gets the value of the team2 property.
     * 
     * @return
     *     possible object is
     *     {@link Team }
     *     
     */
    public Team getTeam2() {
        return team2;
    }

    /**
     * Sets the value of the team2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Team }
     *     
     */
    public void setTeam2(Team value) {
        this.team2 = value;
    }

    /**
     * Gets the value of the result property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResult() {
        return result;
    }

    /**
     * Sets the value of the result property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResult(String value) {
        this.result = value;
    }

    /**
     * Gets the value of the date property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDate() {
        return date;
    }

    /**
     * Sets the value of the date property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDate(XMLGregorianCalendar value) {
        this.date = value;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof Match)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final Match that = ((Match) object);
        {
            Team lhsTeam1;
            lhsTeam1 = this.getTeam1();
            Team rhsTeam1;
            rhsTeam1 = that.getTeam1();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "team1", lhsTeam1), LocatorUtils.property(thatLocator, "team1", rhsTeam1), lhsTeam1, rhsTeam1)) {
                return false;
            }
        }
        {
            Team lhsTeam2;
            lhsTeam2 = this.getTeam2();
            Team rhsTeam2;
            rhsTeam2 = that.getTeam2();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "team2", lhsTeam2), LocatorUtils.property(thatLocator, "team2", rhsTeam2), lhsTeam2, rhsTeam2)) {
                return false;
            }
        }
        {
            String lhsResult;
            lhsResult = this.getResult();
            String rhsResult;
            rhsResult = that.getResult();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "result", lhsResult), LocatorUtils.property(thatLocator, "result", rhsResult), lhsResult, rhsResult)) {
                return false;
            }
        }
        {
            XMLGregorianCalendar lhsDate;
            lhsDate = this.getDate();
            XMLGregorianCalendar rhsDate;
            rhsDate = that.getDate();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "date", lhsDate), LocatorUtils.property(thatLocator, "date", rhsDate), lhsDate, rhsDate)) {
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
            Team theTeam1;
            theTeam1 = this.getTeam1();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "team1", theTeam1), currentHashCode, theTeam1);
        }
        {
            Team theTeam2;
            theTeam2 = this.getTeam2();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "team2", theTeam2), currentHashCode, theTeam2);
        }
        {
            String theResult;
            theResult = this.getResult();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "result", theResult), currentHashCode, theResult);
        }
        {
            XMLGregorianCalendar theDate;
            theDate = this.getDate();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "date", theDate), currentHashCode, theDate);
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
        if (draftCopy instanceof Match) {
            final Match copy = ((Match) draftCopy);
            if (this.team1 != null) {
                Team sourceTeam1;
                sourceTeam1 = this.getTeam1();
                Team copyTeam1 = ((Team) strategy.copy(LocatorUtils.property(locator, "team1", sourceTeam1), sourceTeam1));
                copy.setTeam1(copyTeam1);
            } else {
                copy.team1 = null;
            }
            if (this.team2 != null) {
                Team sourceTeam2;
                sourceTeam2 = this.getTeam2();
                Team copyTeam2 = ((Team) strategy.copy(LocatorUtils.property(locator, "team2", sourceTeam2), sourceTeam2));
                copy.setTeam2(copyTeam2);
            } else {
                copy.team2 = null;
            }
            if (this.result!= null) {
                String sourceResult;
                sourceResult = this.getResult();
                String copyResult = ((String) strategy.copy(LocatorUtils.property(locator, "result", sourceResult), sourceResult));
                copy.setResult(copyResult);
            } else {
                copy.result = null;
            }
            if (this.date!= null) {
                XMLGregorianCalendar sourceDate;
                sourceDate = this.getDate();
                XMLGregorianCalendar copyDate = ((XMLGregorianCalendar) strategy.copy(LocatorUtils.property(locator, "date", sourceDate), sourceDate));
                copy.setDate(copyDate);
            } else {
                copy.date = null;
            }
        }
        return draftCopy;
    }

    public Object createNewInstance() {
        return new Match();
    }

}
