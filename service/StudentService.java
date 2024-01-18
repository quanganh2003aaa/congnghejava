/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service;

import dao.StudentDAO;
import java.util.List;
import model.StudentInClass;

/**
 *
 * @author My Computer
 */
public class StudentService {
    private  StudentDAO studentDAO;
    
    public StudentService(){
        studentDAO = new StudentDAO();
    }
    
    public List<StudentInClass> getListSTU(){
        return studentDAO.getListSTU();
    }
}
