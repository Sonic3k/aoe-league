//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.01.22 at 09:44:41 AM ICT 
//


package com.sonic.aoeleague.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
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
 * <p>Java class for updatePlayer complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="updatePlayer">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="old" type="{}updatePlayerInfo" minOccurs="0"/>
 *         &lt;element name="new" type="{}updatePlayerInfo" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}int" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "updatePlayer", propOrder = {
    "old",
    "_new"
})
public class UpdatePlayer
    implements Cloneable, CopyTo, Equals, HashCode
{

    protected UpdatePlayerInfo old;
    @XmlElement(name = "new")
    protected UpdatePlayerInfo _new;
    @XmlAttribute(name = "id")
    protected Integer id;

    /**
     * Gets the value of the old property.
     * 
     * @return
     *     possible object is
     *     {@link UpdatePlayerInfo }
     *     
     */
    public UpdatePlayerInfo getOld() {
        return old;
    }

    /**
     * Sets the value of the old property.
     * 
     * @param value
     *     allowed object is
     *     {@link UpdatePlayerInfo }
     *     
     */
    public void setOld(UpdatePlayerInfo value) {
        this.old = value;
    }

    /**
     * Gets the value of the new property.
     * 
     * @return
     *     possible object is
     *     {@link UpdatePlayerInfo }
     *     
     */
    public UpdatePlayerInfo getNew() {
        return _new;
    }

    /**
     * Sets the value of the new property.
     * 
     * @param value
     *     allowed object is
     *     {@link UpdatePlayerInfo }
     *     
     */
    public void setNew(UpdatePlayerInfo value) {
        this._new = value;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setId(Integer value) {
        this.id = value;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof UpdatePlayer)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final UpdatePlayer that = ((UpdatePlayer) object);
        {
            UpdatePlayerInfo lhsOld;
            lhsOld = this.getOld();
            UpdatePlayerInfo rhsOld;
            rhsOld = that.getOld();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "old", lhsOld), LocatorUtils.property(thatLocator, "old", rhsOld), lhsOld, rhsOld)) {
                return false;
            }
        }
        {
            UpdatePlayerInfo lhsNew;
            lhsNew = this.getNew();
            UpdatePlayerInfo rhsNew;
            rhsNew = that.getNew();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "_new", lhsNew), LocatorUtils.property(thatLocator, "_new", rhsNew), lhsNew, rhsNew)) {
                return false;
            }
        }
        {
            Integer lhsId;
            lhsId = this.getId();
            Integer rhsId;
            rhsId = that.getId();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "id", lhsId), LocatorUtils.property(thatLocator, "id", rhsId), lhsId, rhsId)) {
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
            UpdatePlayerInfo theOld;
            theOld = this.getOld();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "old", theOld), currentHashCode, theOld);
        }
        {
            UpdatePlayerInfo theNew;
            theNew = this.getNew();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "_new", theNew), currentHashCode, theNew);
        }
        {
            Integer theId;
            theId = this.getId();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "id", theId), currentHashCode, theId);
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
        if (draftCopy instanceof UpdatePlayer) {
            final UpdatePlayer copy = ((UpdatePlayer) draftCopy);
            if (this.old!= null) {
                UpdatePlayerInfo sourceOld;
                sourceOld = this.getOld();
                UpdatePlayerInfo copyOld = ((UpdatePlayerInfo) strategy.copy(LocatorUtils.property(locator, "old", sourceOld), sourceOld));
                copy.setOld(copyOld);
            } else {
                copy.old = null;
            }
            if (this._new!= null) {
                UpdatePlayerInfo sourceNew;
                sourceNew = this.getNew();
                UpdatePlayerInfo copyNew = ((UpdatePlayerInfo) strategy.copy(LocatorUtils.property(locator, "_new", sourceNew), sourceNew));
                copy.setNew(copyNew);
            } else {
                copy._new = null;
            }
            if (this.id!= null) {
                Integer sourceId;
                sourceId = this.getId();
                Integer copyId = ((Integer) strategy.copy(LocatorUtils.property(locator, "id", sourceId), sourceId));
                copy.setId(copyId);
            } else {
                copy.id = null;
            }
        }
        return draftCopy;
    }

    public Object createNewInstance() {
        return new UpdatePlayer();
    }

}
