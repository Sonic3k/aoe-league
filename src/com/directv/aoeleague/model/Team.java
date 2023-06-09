//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.12.22 at 10:27:17 AM ICT 
//


package com.directv.aoeleague.model;

import java.util.ArrayList;
import java.util.List;
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
 * <p>Java class for team complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="team">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="players" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="teampoint" type="{http://www.w3.org/2001/XMLSchema}double" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "team", propOrder = {
    "players"
})
public class Team
    implements Cloneable, CopyTo, Equals, HashCode
{

    protected List<String> players;
    @XmlAttribute(name = "teampoint")
    protected Double teampoint;

    /**
     * Gets the value of the players property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the players property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPlayers().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getPlayers() {
        if (players == null) {
            players = new ArrayList<String>();
        }
        return this.players;
    }

    /**
     * Gets the value of the teampoint property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getTeampoint() {
        return teampoint;
    }

    /**
     * Sets the value of the teampoint property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setTeampoint(Double value) {
        this.teampoint = value;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof Team)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final Team that = ((Team) object);
        {
            List<String> lhsPlayers;
            lhsPlayers = (((this.players!= null)&&(!this.players.isEmpty()))?this.getPlayers():null);
            List<String> rhsPlayers;
            rhsPlayers = (((that.players!= null)&&(!that.players.isEmpty()))?that.getPlayers():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "players", lhsPlayers), LocatorUtils.property(thatLocator, "players", rhsPlayers), lhsPlayers, rhsPlayers)) {
                return false;
            }
        }
        {
            Double lhsTeampoint;
            lhsTeampoint = this.getTeampoint();
            Double rhsTeampoint;
            rhsTeampoint = that.getTeampoint();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "teampoint", lhsTeampoint), LocatorUtils.property(thatLocator, "teampoint", rhsTeampoint), lhsTeampoint, rhsTeampoint)) {
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
            List<String> thePlayers;
            thePlayers = (((this.players!= null)&&(!this.players.isEmpty()))?this.getPlayers():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "players", thePlayers), currentHashCode, thePlayers);
        }
        {
            Double theTeampoint;
            theTeampoint = this.getTeampoint();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "teampoint", theTeampoint), currentHashCode, theTeampoint);
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
        if (draftCopy instanceof Team) {
            final Team copy = ((Team) draftCopy);
            if ((this.players!= null)&&(!this.players.isEmpty())) {
                List<String> sourcePlayers;
                sourcePlayers = (((this.players!= null)&&(!this.players.isEmpty()))?this.getPlayers():null);
                @SuppressWarnings("unchecked")
                List<String> copyPlayers = ((List<String> ) strategy.copy(LocatorUtils.property(locator, "players", sourcePlayers), sourcePlayers));
                copy.players = null;
                if (copyPlayers!= null) {
                    List<String> uniquePlayersl = copy.getPlayers();
                    uniquePlayersl.addAll(copyPlayers);
                }
            } else {
                copy.players = null;
            }
            if (this.teampoint!= null) {
                Double sourceTeampoint;
                sourceTeampoint = this.getTeampoint();
                Double copyTeampoint = ((Double) strategy.copy(LocatorUtils.property(locator, "teampoint", sourceTeampoint), sourceTeampoint));
                copy.setTeampoint(copyTeampoint);
            } else {
                copy.teampoint = null;
            }
        }
        return draftCopy;
    }

    public Object createNewInstance() {
        return new Team();
    }

}
