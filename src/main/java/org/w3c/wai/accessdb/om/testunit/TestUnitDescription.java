//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.2-147 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2012.05.24 at 12:15:17 PM MESZ 
//


package org.w3c.wai.accessdb.om.testunit;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.UniqueConstraint;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.datatype.XMLGregorianCalendar;

import org.w3c.wai.accessdb.om.Technique;
import org.w3c.wai.accessdb.om.base.BaseEntity;
import org.w3c.wai.accessdb.utils.DateAdapter;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
	"testUnitId",
	"title",
    "description",
    "status",
    "creator",
    "version",
    "date",
    "rights",
    "technique",
    "subject",
    "testProcedure",
    "comment"
})
@XmlRootElement(name = "TestUnitDescription")
@Entity
@UniqueConstraint(columnNames = { "testUnitId" }) 
public class TestUnitDescription extends BaseEntity implements Cloneable{
    @XmlElement(required = true)
    private String title;
    @XmlElement(required = true)
    @Lob
    private String description;
    @XmlElement(required = true)
    @Enumerated(EnumType.STRING) 
    private StatusType status = StatusType.UNCONFIRMED;
    @XmlElement(required = true)
    private String creator;
    @XmlElement(required = true)
    private String version;
    @XmlElement(required = true)
    @XmlJavaTypeAdapter(DateAdapter.class)
    @XmlSchemaType(name = "date")
    private Date date;
    @XmlElement(required = true)
    @XmlSchemaType(name = "anyURI")
    private String rights;
    @XmlElement(required = true)
    @Embedded
	private Subject subject;
    @XmlElement( required = true)
    @Embedded
    private TestProcedure testProcedure;
    @XmlAttribute(name = "testUnitId", required = true)
    @Column(unique=true)
    private String testUnitId;
    @XmlAttribute(name = "language", required = true) 
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "language")
    private String language;
    @XmlElement(required = true)
    @XmlSchemaType(name = "anyURI")
	@ManyToOne
	private Technique technique;
    @Lob
    private String comment;
    
	/**
     * Gets the value of the title property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTitle() {
        return title;
    }

    /**
     * Sets the value of the title property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTitle(String value) {
        this.title = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link StatusType }
     *     
     */
    public StatusType getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link StatusType }
     *     
     */
    public void setStatus(StatusType value) {
        this.status = value;
    }

    /**
     * Gets the value of the creator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreator() {
        return creator;
    }

    /**
     * Sets the value of the creator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreator(String value) {
        this.creator = value;
    }

    /**
     * Gets the value of the version property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVersion() {
        return version;
    }

    /**
     * Sets the value of the version property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVersion(String value) {
        this.version = value;
    }

    /**
     * Gets the value of the date property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public Date getDate() {
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
    public void setDate(Date value) {
        this.date = value;
    }

    /**
     * Gets the value of the rights property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRights() {
        return rights;
    }

    /**
     * Sets the value of the rights property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRights(String value) {
        this.rights = value;
    }

    /**
     * Gets the value of the technique property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Technique getTechnique() {
        return technique;
    }

    /**
     * Sets the value of the technique property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTechnique(Technique value) {
        this.technique = value;
    }

    /**
     * Gets the value of the subject property.
     * 
     * @return
     *     possible object is
     *     {@link TestUnitDescription.Subject }
     *     
     */
    public Subject getSubject() {
    	if(this.subject==null)
    		this.subject = new Subject();
        return this.subject;
    }

    /**
     * Sets the value of the subject property.
     * 
     * @param value
     *     allowed object is
     *     {@link TestUnitDescription.Subject }
     *     
     */
    public void setSubject(Subject value) {
        this.subject = value;
    }

    

    public TestProcedure getTestProcedure() {
    	if(testProcedure==null)
    		testProcedure = new TestProcedure();
		return testProcedure;
	}

	public void setTestProcedure(TestProcedure testProcedure) {
		this.testProcedure = testProcedure;
	}

	/**
     * Gets the value of the testUnitId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTestUnitId() {
        return testUnitId;
    }

    /**
     * Sets the value of the testUnitId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTestUnitId(String value) {
        this.testUnitId = value;
    }

    /**
     * Gets the value of the language property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLanguage() {
        return language;
    }

    /**
     * Sets the value of the language property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLanguage(String value) {
        this.language = value;
    }

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}
}

  
  
