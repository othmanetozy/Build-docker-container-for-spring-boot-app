package com.devops.test.demo.student;


import jakarta.persistence.*;

@Entity
@Table
public class Student {

    @Id
    @SequenceGenerator(
            name = "student_sequence",
            sequenceName = "student_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "student_sequence"
    )
    private Long id;
    private String FirstName;
    private String LastName;
    private String email;
    private int age;

    public Student() {

    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", FirstName='" + FirstName + '\'' +
                ", LastName='" + LastName + '\'' +
                ", email='" + email + '\'' +
                ", age=" + age +
                '}';
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return FirstName;
    }

    public void setFirstName(String firstName) {
        FirstName = firstName;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String lastName) {
        LastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Student(Long id, String firstName, String lastName, String email, int age) {
        this.id = id;
        FirstName = firstName;
        LastName = lastName;
        this.email = email;
        this.age = age;
    }
}
