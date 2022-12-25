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
@Table(name = "jobwala_registration")
public class User {
    @Id
    @GeneratedValue
    @Column(name = "userId")
    private Long userId;

    @Column(name = "firstName") // f_name
    private String firstName;

    @Column(name = "middleName") // m_name
    private String middleName;

    @Column(name = "lastName") // l_name
    private String lastName;

    @Column(name = "email") // u_email
    private String email;

    @Column(name = "phone") // u_contact
    private long phone;

    @Column(name = "password") // u_password
    private String password;
}
