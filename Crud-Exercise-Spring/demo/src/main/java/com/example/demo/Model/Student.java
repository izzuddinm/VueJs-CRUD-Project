package com.example.demo.Model;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_student")
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String deskripsi_diri;
    private String email;
    private String hard_skill;
    private String interest;
    private String jenis_kelamin;
    private String nama;
    private String soft_skill;
    private Integer umur;

    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }
    public String getDeskripsi_diri() {
        return deskripsi_diri;
    }
    public void setDeskripsi_diri(String deskripsi_diri) {
        this.deskripsi_diri = deskripsi_diri;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getHard_skill() {
        return hard_skill;
    }
    public void setHard_skill(String hard_skill) {
        this.hard_skill = hard_skill;
    }
    public String getInterest() {
        return interest;
    }
    public void setInterest(String interest) {
        this.interest = interest;
    }
    public String getJenis_kelamin() {
        return jenis_kelamin;
    }
    public void setJenis_kelamin(String jenis_kelamin) {
        this.jenis_kelamin = jenis_kelamin;
    }
    public String getNama() {
        return nama;
    }
    public void setNama(String nama) {
        this.nama = nama;
    }
    public String getSoft_skill() {
        return soft_skill;
    }
    public void setSoft_skill(String soft_skill) {
        this.soft_skill = soft_skill;
    }
    public Integer getUmur() {
        return umur;
    }
    public void setUmur(Integer umur) {
        this.umur = umur;
    }
    public static Student insertStudent(Student shipping) {
        return null;
    }
    public static List<Student> getAllStudent() {
        return null;
    }
    public Student updateStudent(int id2, Student student) {
        return null;
    }
    public static Student deleteStudent(int id2) {
        return null;
    }
}
