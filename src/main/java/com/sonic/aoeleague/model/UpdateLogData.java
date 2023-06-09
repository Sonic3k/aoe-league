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
import javax.xml.bind.annotation.XmlRootElement;
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
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="updateLogs" type="{}updateLog" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="updatedTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "updateLogs"
})
@XmlRootElement(name = "updateLogData")
public class UpdateLogData
    implements Cloneable, CopyTo, Equals, HashCode
{

    protected List<UpdateLog> updateLogs;
    @XmlAttribute(name = "updatedTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar updatedTime;

    /**
     * Gets the value of the updateLogs property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the updateLogs property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUpdateLogs().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link UpdateLog }
     * 
     * 
     */
    public List<UpdateLog> getUpdateLogs() {
        if (updateLogs == null) {
            updateLogs = new ArrayList<UpdateLog>();
        }
        return this.updateLogs;
    }

    /**
     * Gets the value of the updatedTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getUpdatedTime() {
        return updatedTime;
    }

    /**
     * Sets the value of the updatedTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setUpdatedTime(XMLGregorianCalendar value) {
        this.updatedTime = value;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof UpdateLogData)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final UpdateLogData that = ((UpdateLogData) object);
        {
            List<UpdateLog> lhsUpdateLogs;
            lhsUpdateLogs = (((this.updateLogs!= null)&&(!this.updateLogs.isEmpty()))?this.getUpdateLogs():null);
            List<UpdateLog> rhsUpdateLogs;
            rhsUpdateLogs = (((that.updateLogs!= null)&&(!that.updateLogs.isEmpty()))?that.getUpdateLogs():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "updateLogs", lhsUpdateLogs), LocatorUtils.property(thatLocator, "updateLogs", rhsUpdateLogs), lhsUpdateLogs, rhsUpdateLogs)) {
                return false;
            }
        }
        {
            XMLGregorianCalendar lhsUpdatedTime;
            lhsUpdatedTime = this.getUpdatedTime();
            XMLGregorianCalendar rhsUpdatedTime;
            rhsUpdatedTime = that.getUpdatedTime();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "updatedTime", lhsUpdatedTime), LocatorUtils.property(thatLocator, "updatedTime", rhsUpdatedTime), lhsUpdatedTime, rhsUpdatedTime)) {
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
            List<UpdateLog> theUpdateLogs;
            theUpdateLogs = (((this.updateLogs!= null)&&(!this.updateLogs.isEmpty()))?this.getUpdateLogs():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "updateLogs", theUpdateLogs), currentHashCode, theUpdateLogs);
        }
        {
            XMLGregorianCalendar theUpdatedTime;
            theUpdatedTime = this.getUpdatedTime();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "updatedTime", theUpdatedTime), currentHashCode, theUpdatedTime);
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
        if (draftCopy instanceof UpdateLogData) {
            final UpdateLogData copy = ((UpdateLogData) draftCopy);
            if ((this.updateLogs!= null)&&(!this.updateLogs.isEmpty())) {
                List<UpdateLog> sourceUpdateLogs;
                sourceUpdateLogs = (((this.updateLogs!= null)&&(!this.updateLogs.isEmpty()))?this.getUpdateLogs():null);
                @SuppressWarnings("unchecked")
                List<UpdateLog> copyUpdateLogs = ((List<UpdateLog> ) strategy.copy(LocatorUtils.property(locator, "updateLogs", sourceUpdateLogs), sourceUpdateLogs));
                copy.updateLogs = null;
                if (copyUpdateLogs!= null) {
                    List<UpdateLog> uniqueUpdateLogsl = copy.getUpdateLogs();
                    uniqueUpdateLogsl.addAll(copyUpdateLogs);
                }
            } else {
                copy.updateLogs = null;
            }
            if (this.updatedTime!= null) {
                XMLGregorianCalendar sourceUpdatedTime;
                sourceUpdatedTime = this.getUpdatedTime();
                XMLGregorianCalendar copyUpdatedTime = ((XMLGregorianCalendar) strategy.copy(LocatorUtils.property(locator, "updatedTime", sourceUpdatedTime), sourceUpdatedTime));
                copy.setUpdatedTime(copyUpdatedTime);
            } else {
                copy.updatedTime = null;
            }
        }
        return draftCopy;
    }

    public Object createNewInstance() {
        return new UpdateLogData();
    }

}
