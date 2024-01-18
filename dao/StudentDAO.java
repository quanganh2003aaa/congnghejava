/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import common.ConnectDatabase;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import model.StudentInClass;

/**
 *
 * @author My Computer
 */
public class StudentDAO {
    public List<StudentInClass> getListSTU(){
        List<StudentInClass> SPlist = new ArrayList<StudentInClass>();
        
        Connection connection = ConnectDatabase.getMyConnection();
        String sql = "SELECT username,phone,email,address,status FROM tbl_account WHERE role = 1";
        
        try{
            PreparedStatement ps = connection.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            int test[];
            while(rs.next()){
                StudentInClass sp = new StudentInClass();
                
//                sp.setId(rs.getInt("id"));
                sp.setUsername(rs.getString("username"));
                sp.setPhone(rs.getString("phone"));
                sp.setEmail(rs.getString("email"));
                sp.setAddress(rs.getString("address"));
                sp.setStatus(rs.getLong("status"));
                
                SPlist.add(sp);
            }
            
//            ngắt kết nối database
            ps.close();
            connection.close();
        }catch (SQLException e) {
            e.printStackTrace();
        }
//        trả về danh sách sản phẩm
        return SPlist;
    }
}
