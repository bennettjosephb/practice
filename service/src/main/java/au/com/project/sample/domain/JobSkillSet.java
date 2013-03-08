package au.com.project.sample.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Entity implementation class for Entity: JobSkillSet
 * 
 */
@Entity
@Table(name = "PROJECT_JOB_SKILL_SET")
public class JobSkillSet implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "JOB_SKIL_SET_ID")
	private Long id;

	@Column(name = "JOB_SKIL_SET_SKILL")
	private String skill;

	@Column(name = "JOB_SKIL_SET_TYPE")
	private SkillType skillType;

	public JobSkillSet() {
		super();
	}

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getSkill() {
		return this.skill;
	}

	public void setSkillSet(String skill) {
		this.skill = skill;
	}

	public SkillType getSkillType() {
		return this.skillType;
	}

	public void setSkillType(SkillType skillType) {
		this.skillType = skillType;
	}

}