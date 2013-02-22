/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package au.com.project.sample.domain;

import java.io.Serializable;
import java.util.Calendar;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author SONY
 */
@Entity
@Table(name="PROJECT_EMPLOYMENT_SUMMARY")
@SequenceGenerator(name="EMPLOYMENT_SUMMARY_SEQUENCE",
                   sequenceName="EMPLOYMENT_SUMMARY_SEQUENCE")
public class EmploymentSummary implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy=GenerationType.TABLE, generator="EMPLOYMENT_SUMMARY_SEQUENCE")
    @Column(name="EMP_SUM_ID")
    private Long id;

    @Column(name="EMP_SUM_FROM_DATE")
    @Temporal(TemporalType.DATE)
    private Calendar fromDate;

    @Column(name="EMP_SUM_TO_DATE")
    @Temporal(TemporalType.DATE)
    private Calendar toDate;

    @Column(name="EMP_SUM_ENTITY_NAME")
    private String entityName;

    @Column(name="EMP_SUM_DESIGNATION")
    private String designation;

    @Column(name="EMP_SUM_JOINING_DESIGNATION")
    private String joiningDesignation;

    @Column(name="EMP_SUM_LEAVING_DESIGNATION")
    private String leavingDesignation;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "SAL_ID")
    private Salary salary;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "JOI_SAL_ID")
    private Salary joiningSalary;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "LEA_SAL_ID")
    private Salary leavingSalary;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (getId() != null ? getId().hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof EmploymentSummary)) {
            return false;
        }
        EmploymentSummary other = (EmploymentSummary) object;
        if ((this.getId() == null && other.getId() != null) || (this.getId() != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.mycompany.domain.EXPSUM[ id=" + getId() + " ]";
    }

    /**
     * @return the fromDate
     */
    public Calendar getFromDate() {
        return fromDate;
    }

    /**
     * @param fromDate the fromDate to set
     */
    public void setFromDate(Calendar fromDate) {
        this.fromDate = fromDate;
    }

    /**
     * @return the toDate
     */
    public Calendar getToDate() {
        return toDate;
    }

    /**
     * @param toDate the toDate to set
     */
    public void setToDate(Calendar toDate) {
        this.toDate = toDate;
    }

    /**
     * @return the entityName
     */
    public String getEntityName() {
        return entityName;
    }

    /**
     * @param entityName the entityName to set
     */
    public void setEntityName(String entityName) {
        this.entityName = entityName;
    }

    /**
     * @return the designation
     */
    public String getDesignation() {
        return designation;
    }

    /**
     * @param designation the designation to set
     */
    public void setDesignation(String designation) {
        this.designation = designation;
    }

    /**
     * @return the joiningDesignation
     */
    public String getJoiningDesignation() {
        return joiningDesignation;
    }

    /**
     * @param joiningDesignation the joiningDesignation to set
     */
    public void setJoiningDesignation(String joiningDesignation) {
        this.joiningDesignation = joiningDesignation;
    }

    /**
     * @return the leavingDesignation
     */
    public String getLeavingDesignation() {
        return leavingDesignation;
    }

    /**
     * @param leavingDesignation the leavingDesignation to set
     */
    public void setLeavingDesignation(String leavingDesignation) {
        this.leavingDesignation = leavingDesignation;
    }

    /**
     * @return the salary
     */
    public Salary getSalary() {
        return salary;
    }

    /**
     * @param salary the salary to set
     */
    public void setSalary(Salary salary) {
        this.salary = salary;
    }
    /**
     * @return the salary
     */
    public Salary getJoiningSalary() {
        return joiningSalary;
    }

    /**
     * @param salary the salary to set
     */
    public void setJoiningSalary(Salary joiningSalary) {
        this.joiningSalary = joiningSalary;
    }
    /**
     * @return the salary
     */
    public Salary getLeavingSalary() {
        return leavingSalary;
    }

    /**
     * @param salary the salary to set
     */
    public void setLeavingSalary(Salary leavingSalary) {
        this.leavingSalary = leavingSalary;
    }

}
