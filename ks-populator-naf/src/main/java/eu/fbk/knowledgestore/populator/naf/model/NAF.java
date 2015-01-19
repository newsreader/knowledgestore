//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.12.10 at 04:45:50 PM CET 
//


package eu.fbk.knowledgestore.populator.naf.model;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.NormalizedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "nafHeaderOrRawOrTextOrTermsOrDepsOrChunksOrEntitiesOrCoreferencesOrConstituencyOrTimeExpressionsOrFactualitylayerOrTunitsOrLocationsOrDates","srl"
})
@XmlRootElement(name = "NAF")
public class NAF {

	@XmlAttribute(name = "doc")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String doc;
    @XmlAttribute(name = "version")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String version;
    @XmlAttribute(namespace = "http://www.w3.org/XML/1998/namespace", required=true, name = "lang")
    
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String xmlLang;
    @XmlElements({
        @XmlElement(name = "nafHeader", type = NafHeader.class),
        @XmlElement(name = "raw", type = Raw.class),
        @XmlElement(name = "text", type = Text.class),
        @XmlElement(name = "terms", type = Terms.class),
        @XmlElement(name = "deps", type = Deps.class),
        @XmlElement(name = "chunks", type = Chunks.class),
        @XmlElement(name = "entities", type = Entities.class),
        @XmlElement(name = "coreferences", type = Coreferences.class),
        @XmlElement(name = "constituency", type = Constituency.class),
        @XmlElement(name = "timeExpressions", type = TimeExpressions.class),
        @XmlElement(name = "factualitylayer", type = Factualitylayer.class),
        @XmlElement(name = "tunits", type = Tunits.class),
        @XmlElement(name = "locations", type = Locations.class),
        @XmlElement(name = "dates", type = Dates.class)
    })
    protected List<Object> nafHeaderOrRawOrTextOrTermsOrDepsOrChunksOrEntitiesOrCoreferencesOrConstituencyOrTimeExpressionsOrFactualitylayerOrTunitsOrLocationsOrDates;
    @XmlElement(name = "srl", type = Srl.class)
    protected Srl srl;
    /**
     * Gets the value of the doc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDoc() {
        return doc;
    }

    /**
     * Sets the value of the doc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDoc(String value) {
        this.doc = value;
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
     * Gets the value of the xmlLang property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getXmlLang() {
        return xmlLang;
    }

    /**
     * Sets the value of the xmlLang property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setXmlLang(String value) {
        this.xmlLang = value;
    }

    /**
     * Gets the value of the nafHeaderOrRawOrTextOrTermsOrDepsOrChunksOrEntitiesOrCoreferencesOrConstituencyOrSrlOrTimeExpressionsOrFactualitylayerOrTunitsOrLocationsOrDates property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the nafHeaderOrRawOrTextOrTermsOrDepsOrChunksOrEntitiesOrCoreferencesOrConstituencyOrSrlOrTimeExpressionsOrFactualitylayerOrTunitsOrLocationsOrDates property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNafHeaderOrRawOrTextOrTermsOrDepsOrChunksOrEntitiesOrCoreferencesOrConstituencyOrSrlOrTimeExpressionsOrFactualitylayerOrTunitsOrLocationsOrDates().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NafHeader }
     * {@link Raw }
     * {@link Text }
     * {@link Terms }
     * {@link Deps }
     * {@link Chunks }
     * {@link Entities }
     * {@link Coreferences }
     * {@link Constituency }
     * {@link Srl }
     * {@link TimeExpressions }
     * {@link Factualitylayer }
     * {@link Tunits }
     * {@link Locations }
     * {@link Dates }
     * 
     * 
     */
    public List<Object> getNafHeaderOrRawOrTextOrTermsOrDepsOrChunksOrEntitiesOrCoreferencesOrConstituencyOrTimeExpressionsOrFactualitylayerOrTunitsOrLocationsOrDates() {
        if (nafHeaderOrRawOrTextOrTermsOrDepsOrChunksOrEntitiesOrCoreferencesOrConstituencyOrTimeExpressionsOrFactualitylayerOrTunitsOrLocationsOrDates == null) {
            nafHeaderOrRawOrTextOrTermsOrDepsOrChunksOrEntitiesOrCoreferencesOrConstituencyOrTimeExpressionsOrFactualitylayerOrTunitsOrLocationsOrDates = new ArrayList<Object>();
        }
        return this.nafHeaderOrRawOrTextOrTermsOrDepsOrChunksOrEntitiesOrCoreferencesOrConstituencyOrTimeExpressionsOrFactualitylayerOrTunitsOrLocationsOrDates;
    }

	public Srl getSrl() {
		return srl;
	}

	public void setSrl(Srl srl) {
		this.srl = srl;
	}

}
