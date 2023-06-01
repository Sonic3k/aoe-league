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
 * <p>Java class for aoeResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="aoeResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="status" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="errorText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="matchList" type="{}match" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="text" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "aoeResponse", propOrder = {
    "status",
    "errorText",
    "matchList",
    "text"
})
public class AoeResponse
    implements Cloneable, CopyTo, Equals, HashCode
{

    protected String status;
    protected String errorText;
    protected List<Match> matchList;
    protected String text;

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatus(String value) {
        this.status = value;
    }

    /**
     * Gets the value of the errorText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getErrorText() {
        return errorText;
    }

    /**
     * Sets the value of the errorText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setErrorText(String value) {
        this.errorText = value;
    }

    /**
     * Gets the value of the matchList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the matchList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMatchList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Match }
     * 
     * 
     */
    public List<Match> getMatchList() {
        if (matchList == null) {
            matchList = new ArrayList<Match>();
        }
        return this.matchList;
    }

    /**
     * Gets the value of the text property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getText() {
        return text;
    }

    /**
     * Sets the value of the text property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setText(String value) {
        this.text = value;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof AoeResponse)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final AoeResponse that = ((AoeResponse) object);
        {
            String lhsStatus;
            lhsStatus = this.getStatus();
            String rhsStatus;
            rhsStatus = that.getStatus();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "status", lhsStatus), LocatorUtils.property(thatLocator, "status", rhsStatus), lhsStatus, rhsStatus)) {
                return false;
            }
        }
        {
            String lhsErrorText;
            lhsErrorText = this.getErrorText();
            String rhsErrorText;
            rhsErrorText = that.getErrorText();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "errorText", lhsErrorText), LocatorUtils.property(thatLocator, "errorText", rhsErrorText), lhsErrorText, rhsErrorText)) {
                return false;
            }
        }
        {
            List<Match> lhsMatchList;
            lhsMatchList = (((this.matchList!= null)&&(!this.matchList.isEmpty()))?this.getMatchList():null);
            List<Match> rhsMatchList;
            rhsMatchList = (((that.matchList!= null)&&(!that.matchList.isEmpty()))?that.getMatchList():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "matchList", lhsMatchList), LocatorUtils.property(thatLocator, "matchList", rhsMatchList), lhsMatchList, rhsMatchList)) {
                return false;
            }
        }
        {
            String lhsText;
            lhsText = this.getText();
            String rhsText;
            rhsText = that.getText();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "text", lhsText), LocatorUtils.property(thatLocator, "text", rhsText), lhsText, rhsText)) {
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
            String theStatus;
            theStatus = this.getStatus();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "status", theStatus), currentHashCode, theStatus);
        }
        {
            String theErrorText;
            theErrorText = this.getErrorText();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "errorText", theErrorText), currentHashCode, theErrorText);
        }
        {
            List<Match> theMatchList;
            theMatchList = (((this.matchList!= null)&&(!this.matchList.isEmpty()))?this.getMatchList():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "matchList", theMatchList), currentHashCode, theMatchList);
        }
        {
            String theText;
            theText = this.getText();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "text", theText), currentHashCode, theText);
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
        if (draftCopy instanceof AoeResponse) {
            final AoeResponse copy = ((AoeResponse) draftCopy);
            if (this.status!= null) {
                String sourceStatus;
                sourceStatus = this.getStatus();
                String copyStatus = ((String) strategy.copy(LocatorUtils.property(locator, "status", sourceStatus), sourceStatus));
                copy.setStatus(copyStatus);
            } else {
                copy.status = null;
            }
            if (this.errorText!= null) {
                String sourceErrorText;
                sourceErrorText = this.getErrorText();
                String copyErrorText = ((String) strategy.copy(LocatorUtils.property(locator, "errorText", sourceErrorText), sourceErrorText));
                copy.setErrorText(copyErrorText);
            } else {
                copy.errorText = null;
            }
            if ((this.matchList!= null)&&(!this.matchList.isEmpty())) {
                List<Match> sourceMatchList;
                sourceMatchList = (((this.matchList!= null)&&(!this.matchList.isEmpty()))?this.getMatchList():null);
                @SuppressWarnings("unchecked")
                List<Match> copyMatchList = ((List<Match> ) strategy.copy(LocatorUtils.property(locator, "matchList", sourceMatchList), sourceMatchList));
                copy.matchList = null;
                if (copyMatchList!= null) {
                    List<Match> uniqueMatchListl = copy.getMatchList();
                    uniqueMatchListl.addAll(copyMatchList);
                }
            } else {
                copy.matchList = null;
            }
            if (this.text!= null) {
                String sourceText;
                sourceText = this.getText();
                String copyText = ((String) strategy.copy(LocatorUtils.property(locator, "text", sourceText), sourceText));
                copy.setText(copyText);
            } else {
                copy.text = null;
            }
        }
        return draftCopy;
    }

    public Object createNewInstance() {
        return new AoeResponse();
    }

}
