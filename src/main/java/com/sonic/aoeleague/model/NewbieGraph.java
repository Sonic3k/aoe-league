//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.01.22 at 09:44:41 AM ICT 
//


package com.sonic.aoeleague.model;

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
 * <p>Java class for newbieGraph complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="newbieGraph">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="newbieGraphElements" type="{}newbieGraphElement" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="playerId" type="{http://www.w3.org/2001/XMLSchema}int" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "newbieGraph", propOrder = {
    "newbieGraphElements"
})
public class NewbieGraph
    implements Cloneable, CopyTo, Equals, HashCode
{

    protected List<NewbieGraphElement> newbieGraphElements;
    @XmlAttribute(name = "playerId")
    protected Integer playerId;

    /**
     * Gets the value of the newbieGraphElements property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the newbieGraphElements property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNewbieGraphElements().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NewbieGraphElement }
     * 
     * 
     */
    public List<NewbieGraphElement> getNewbieGraphElements() {
        if (newbieGraphElements == null) {
            newbieGraphElements = new ArrayList<NewbieGraphElement>();
        }
        return this.newbieGraphElements;
    }

    /**
     * Gets the value of the playerId property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPlayerId() {
        return playerId;
    }

    /**
     * Sets the value of the playerId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPlayerId(Integer value) {
        this.playerId = value;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof NewbieGraph)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final NewbieGraph that = ((NewbieGraph) object);
        {
            List<NewbieGraphElement> lhsNewbieGraphElements;
            lhsNewbieGraphElements = (((this.newbieGraphElements!= null)&&(!this.newbieGraphElements.isEmpty()))?this.getNewbieGraphElements():null);
            List<NewbieGraphElement> rhsNewbieGraphElements;
            rhsNewbieGraphElements = (((that.newbieGraphElements!= null)&&(!that.newbieGraphElements.isEmpty()))?that.getNewbieGraphElements():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "newbieGraphElements", lhsNewbieGraphElements), LocatorUtils.property(thatLocator, "newbieGraphElements", rhsNewbieGraphElements), lhsNewbieGraphElements, rhsNewbieGraphElements)) {
                return false;
            }
        }
        {
            Integer lhsPlayerId;
            lhsPlayerId = this.getPlayerId();
            Integer rhsPlayerId;
            rhsPlayerId = that.getPlayerId();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "playerId", lhsPlayerId), LocatorUtils.property(thatLocator, "playerId", rhsPlayerId), lhsPlayerId, rhsPlayerId)) {
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
            List<NewbieGraphElement> theNewbieGraphElements;
            theNewbieGraphElements = (((this.newbieGraphElements!= null)&&(!this.newbieGraphElements.isEmpty()))?this.getNewbieGraphElements():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "newbieGraphElements", theNewbieGraphElements), currentHashCode, theNewbieGraphElements);
        }
        {
            Integer thePlayerId;
            thePlayerId = this.getPlayerId();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "playerId", thePlayerId), currentHashCode, thePlayerId);
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
        if (draftCopy instanceof NewbieGraph) {
            final NewbieGraph copy = ((NewbieGraph) draftCopy);
            if ((this.newbieGraphElements!= null)&&(!this.newbieGraphElements.isEmpty())) {
                List<NewbieGraphElement> sourceNewbieGraphElements;
                sourceNewbieGraphElements = (((this.newbieGraphElements!= null)&&(!this.newbieGraphElements.isEmpty()))?this.getNewbieGraphElements():null);
                @SuppressWarnings("unchecked")
                List<NewbieGraphElement> copyNewbieGraphElements = ((List<NewbieGraphElement> ) strategy.copy(LocatorUtils.property(locator, "newbieGraphElements", sourceNewbieGraphElements), sourceNewbieGraphElements));
                copy.newbieGraphElements = null;
                if (copyNewbieGraphElements!= null) {
                    List<NewbieGraphElement> uniqueNewbieGraphElementsl = copy.getNewbieGraphElements();
                    uniqueNewbieGraphElementsl.addAll(copyNewbieGraphElements);
                }
            } else {
                copy.newbieGraphElements = null;
            }
            if (this.playerId!= null) {
                Integer sourcePlayerId;
                sourcePlayerId = this.getPlayerId();
                Integer copyPlayerId = ((Integer) strategy.copy(LocatorUtils.property(locator, "playerId", sourcePlayerId), sourcePlayerId));
                copy.setPlayerId(copyPlayerId);
            } else {
                copy.playerId = null;
            }
        }
        return draftCopy;
    }

    public Object createNewInstance() {
        return new NewbieGraph();
    }

}
