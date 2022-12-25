package com.project.jobjcs.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@ToString
@Table(name = "career")
public class Career {
    @Id
    @GeneratedValue
    @Column(name = "career_id")
    private Long careerId;

    @Column(name = "user_id")
    private Long userId;

    @Column(name = "career_current_industry")  //industry from industry table = industryID
    private String currentIndustry;

    @Column(name = "career_department")
    private String careerDepartment; // department from department table = departmentID

    @Column(name = "career_role_category")
    private String careerRoleCategory; //role from role table = roleID

    @Column(name = "career_job_role")
    private String careerJobRole;

    @Column(name = "desire_job_type")
    private String careerJobType;

    @Column(name = "career_employment_type")
    private String careerEmpType;

    @Column(name = "career_preferred_shift")
    private String careerPreferredShift;

    @Column(name = "career_location")
    private String careerLocation;

    @Column(name = "expected_salary")
    private String ExpectedSalary;
}
