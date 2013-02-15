package au.com.project.sample.process.impl.dto;

import au.com.project.sample.domain.Country;

public class StateDTO {

	private Long id;

	private String name;

	private String code;
	
	private CountryDTO countryDTO;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public CountryDTO getCountryDTO() {
		return countryDTO;
	}

	public void setCountryDTO(CountryDTO countryDTO) {
		this.countryDTO = countryDTO;
	}

}
