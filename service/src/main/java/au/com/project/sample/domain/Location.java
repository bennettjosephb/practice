/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package au.com.project.sample.domain;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

/**
 * 
 * @author SONY
 */
@Entity
@Table(name = "PROJECT_LOCATION")
@SequenceGenerator(name = "LOCATION_SEQUENCE", sequenceName = "LOCATION_SEQUENCE")
public class Location implements Serializable {
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.TABLE, generator = "LOCATION_SEQUENCE")
	@Column(name = "LOC_ID")
	private Long id;

	@Column(name = "LOC_NAME")
	private String locationName;

	@Column(name = "LOC_CODE", nullable = false, unique = true)
	private String locationCode;

	@Column(name = "LOC_TYPE", nullable = false)
	@Enumerated(EnumType.STRING)
	private LocationType locationType;

	@Column(name = "LOC_COUNTRY")
	private Location country;

	@Column(name = "LOC_STATE")
	private Location state;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	@Override
	public int hashCode() {
		int hash = 0;
		hash += (id != null ? id.hashCode() : 0);
		return hash;
	}

	@Override
	public boolean equals(Object object) {
		// TODO: Warning - this method won't work in the case the id fields are
		// not set
		if (!(object instanceof Location)) {
			return false;
		}
		Location other = (Location) object;
		if ((this.id == null && other.id != null)
				|| (this.id != null && !this.id.equals(other.id))) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "com.mycompany.domain.CurrentLocation[ id=" + id + " ]";
	}

	/**
	 * @return the locationName
	 */
	public String getLocationName() {
		return locationName;
	}

	/**
	 * @param locationName
	 *            the locationName to set
	 */
	public void setLocationName(String locationName) {
		this.locationName = locationName;
	}

	public String getLocationCode() {
		return locationCode;
	}

	public void setLocationCode(String locationCode) {
		this.locationCode = locationCode;
	}

	public LocationType getLocationType() {
		return locationType;
	}

	public void setLocationType(LocationType locationType) {
		this.locationType = locationType;
	}

	public Location getCountry() {
		return country;
	}

	public void setCountry(Location country) {
		this.country = country;
	}

	public Location getState() {
		return state;
	}

	public void setState(Location state) {
		this.state = state;
	}

}
