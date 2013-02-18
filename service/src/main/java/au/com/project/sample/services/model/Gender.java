
package au.com.project.sample.services.model;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Gender.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="Gender">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="MALE"/>
 *     &lt;enumeration value="FEMALE"/>
 *     &lt;enumeration value="OTHER"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "Gender", namespace = "http://www.sample.project.com.au/services/model/Gender/v1")
@XmlEnum
public enum Gender {

    MALE,
    FEMALE,
    OTHER;

    public String value() {
        return name();
    }

    public static Gender fromValue(String v) {
        return valueOf(v);
    }

}
