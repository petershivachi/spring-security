package com.shivachi.demo.ssd.model;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.*;
import java.io.Serializable;

@ToString
@Data
@EqualsAndHashCode(of = {"id"})
@DynamicUpdate
@Entity
@Table(name = "STUDENTS", uniqueConstraints = {
        @UniqueConstraint(name = "STUDENT_ID", columnNames = {"ID"})
})
public class Student implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID", nullable = false, updatable = false)
    private Long id;

    @Basic
    @Column(name = "USER_NAME", unique = true)
    private  String username;

    @Basic
    @Column(name = "FIRST_NAME")
    private String firstname;

    @Basic
    @Column(name = "FIRST_NAME")
    private String lastname;
}
