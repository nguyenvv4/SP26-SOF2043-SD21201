/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poly.cafe.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 *
 * @author nguyenvv
 */
@NoArgsConstructor
@AllArgsConstructor
@Builder
//@Data
public class Student {
    
   private Integer id;
   
   private String className;
   
   private String email;
   
   private String fullName;
   
   private String gender;
   
   private String major;
   
   private String phone;
   
   private String studentCode;

    public Integer getId() {
        return id;
    }

    public String getClassName() {
        return className;
    }

    public String getEmail() {
        return email;
    }

    public String getFullName() {
        return fullName;
    }

    public String getGender() {
        return gender;
    }

    public String getMajor() {
        return major;
    }

    public String getPhone() {
        return phone;
    }

    public String getStudentCode() {
        return studentCode;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setStudentCode(String studentCode) {
        this.studentCode = studentCode;
    }

    @Override
    public String toString() {
        return "Student{" + "id=" + id + ", className=" + className + ", email=" + email + ", fullName=" + fullName + ", gender=" + gender + ", major=" + major + ", phone=" + phone + ", studentCode=" + studentCode + '}';
    }
         
   
   
    
}
