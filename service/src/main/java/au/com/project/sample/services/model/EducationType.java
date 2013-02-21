
package au.com.project.sample.services.model;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EducationType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="EducationType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="FULL_TIME"/>
 *     &lt;enumeration value="PART_TIME"/>
 *     &lt;enumeration value="DISTANCE_EDUCATION"/>
 *     &lt;enumeration value="OTHER"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "EducationType", namespace = "http://www.sample.project.com.au/services/model/EducationType/v1")
@XmlEnum
public enum EducationType {

    FULL_TIME,
    PART_TIME,
    DISTANCE_EDUCATION,
    OTHER;

    public String value() {
        return name();
    }

    public static EducationType fromValue(String v) {
        return valueOf(v);
    }

}
