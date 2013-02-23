package au.com.project.sample.process.impl.dto;

public class ITSkillDTO {
	private Long id;
	private String name;
	private String version;
	private Integer lastUsed;
	private Integer experienceYear;
	private Integer experienceMonth;
	private Long applicantId;

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

	public String getVersion() {
		return version;
	}

	public void setVersion(String version) {
		this.version = version;
	}

	public Integer getLastUsed() {
		return lastUsed;
	}

	public void setLastUsed(Integer lastUsed) {
		this.lastUsed = lastUsed;
	}

	public Integer getExperienceYear() {
		return experienceYear;
	}

	public void setExperienceYear(Integer experienceYear) {
		this.experienceYear = experienceYear;
	}

	public Integer getExperienceMonth() {
		return experienceMonth;
	}

	public void setExperienceMonth(Integer experienceMonth) {
		this.experienceMonth = experienceMonth;
	}

	public Long getApplicantId() {
		return applicantId;
	}

	public void setApplicantId(Long applicantId) {
		this.applicantId = applicantId;
	}

}
