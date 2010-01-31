//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-548 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2010.01.30 at 11:18:20 PM JST 
//


package org.atdl4j.atdl.layout;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Border_t.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="Border_t">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="None"/>
 *     &lt;enumeration value="Line"/>
 *     &lt;enumeration value="RaisedEtched"/>
 *     &lt;enumeration value="LoweredEtched"/>
 *     &lt;enumeration value="RaisedBevel"/>
 *     &lt;enumeration value="LoweredBevel"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "Border_t")
@XmlEnum
public enum BorderT {

    @XmlEnumValue("None")
    NONE("None"),
    @XmlEnumValue("Line")
    LINE("Line"),
    @XmlEnumValue("RaisedEtched")
    RAISED_ETCHED("RaisedEtched"),
    @XmlEnumValue("LoweredEtched")
    LOWERED_ETCHED("LoweredEtched"),
    @XmlEnumValue("RaisedBevel")
    RAISED_BEVEL("RaisedBevel"),
    @XmlEnumValue("LoweredBevel")
    LOWERED_BEVEL("LoweredBevel");
    private final String value;

    BorderT(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static BorderT fromValue(String v) {
        for (BorderT c: BorderT.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
