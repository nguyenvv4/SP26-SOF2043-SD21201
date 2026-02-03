/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poly.cafe.dao.impl;

import java.util.List;
import poly.cafe.dao.StudentDAO;
import poly.cafe.entity.Student;
import poly.cafe.util.XJdbc;
import poly.cafe.util.XQuery;

/**
 *
 * @author nguyenvv
 */
public class StudentDAOImpl implements StudentDAO {

    String sqlSelect = "SELECT * FROM students";
    String sqlCreate = "insert into students (ClassName, email, fullName , gender, major, phone, studentCode)\n"
            + "values (?, ?, ?, ?, ?, ?, ?)";
    String sqlDelete = "Delete from students where id = ?";

    @Override

    public Student create(Student entity) {
        Object[] values = {
            entity.getClassName(),
            entity.getEmail(),
            entity.getFullName(),
            entity.getGender(),
            entity.getMajor(),
            entity.getPhone(),
            entity.getStudentCode()
        };
        XJdbc.executeUpdate(sqlCreate, values);
        return entity;
    }

    @Override
    public void update(Student entity) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void deleteById(Integer id) {
        Object[] values = {
            id
        };
        XJdbc.executeUpdate(sqlDelete, values);
    }

    @Override
    public List<Student> findAll() {
        return XQuery.getBeanList(Student.class, sqlSelect);
    }

    @Override
    public Student findById(Integer id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
