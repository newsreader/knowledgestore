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
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "fileDesc",
    "_public",
    "linguisticProcessors"
})
@XmlRootElement(name = "nafHeader")
public class NafHeader {

    protected FileDesc fileDesc;
    @XmlElement(name = "public")
    protected Public _public;
    protected List<LinguisticProcessors> linguisticProcessors;

    /**
     * Gets the value of the fileDesc property.
     * 
     * @return
     *     possible object is
     *     {@link FileDesc }
     *     
     */
    public FileDesc getFileDesc() {
        return fileDesc;
    }

    /**
     * Sets the value of the fileDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link FileDesc }
     *     
     */
    public void setFileDesc(FileDesc value) {
        this.fileDesc = value;
    }

    /**
     * Gets the value of the public property.
     * 
     * @return
     *     possible object is
     *     {@link Public }
     *     
     */
    public Public getPublic() {
        return _public;
    }

    /**
     * Sets the value of the public property.
     * 
     * @param value
     *     allowed object is
     *     {@link Public }
     *     
     */
    public void setPublic(Public value) {
        this._public = value;
    }

    /**
     * Gets the value of the linguisticProcessors property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the linguisticProcessors property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLinguisticProcessors().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LinguisticProcessors }
     * 
     * 
     */
    public List<LinguisticProcessors> getLinguisticProcessors() {
        if (linguisticProcessors == null) {
            linguisticProcessors = new ArrayList<LinguisticProcessors>();
        }
        return this.linguisticProcessors;
    }

}