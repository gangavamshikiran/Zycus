package com.repository;

import com.model.User;

import java.sql.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class UserDAOjdbc implements DAO<User>{
    private Connection con;
//    Map<Integer,User> userMap= new HashMap<>();
    private PreparedStatement createUserPS;
    private PreparedStatement updateUserPS;
    private PreparedStatement getUserPS;
    private PreparedStatement deleteUserPS;
    private PreparedStatement getAllUsersPS;
    private PreparedStatement countUsersPS;


    public UserDAOjdbc(){
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bookstoredb","root","password");

            String createUserQuery = "insert into user (userId, emailId, password,fullName) VALUES (?,?,?,?)";
            String updateUserQuery = "update user set emailId=?, password=?, fullName=? where userId =?";
            String getUserQuery = "select * from user where userId=?";
            String getAllUserQuery="select * from user";
            String deleteUserQuery = "delete from user where userId=?";
            String countUserQuery = "select count(*) as empCount from user";

            createUserPS= con.prepareStatement(createUserQuery);
            updateUserPS=con.prepareStatement(updateUserQuery);
            getUserPS=con.prepareStatement(getUserQuery);
            getAllUsersPS=con.prepareStatement(getAllUserQuery);
            deleteUserPS=con.prepareStatement(deleteUserQuery);
            countUsersPS=con.prepareStatement(countUserQuery);


        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }




    }
    public User create(User u){
//        userMap.put(u.getUserId(),u);
        try {
            createUserPS.setInt(1,u.getUserId());
            createUserPS.setString(2,u.getEmailId());
            createUserPS.setString(3,u.getPassword());
            createUserPS.setString(4,u.getFullName());

            if(createUserPS.executeUpdate()>0){
                System.out.println("User created Successfully");
                return u;
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }

        return null;
    }
    public User update(User u){

        try {
            updateUserPS.setString(1,u.getEmailId());
            updateUserPS.setString(2,u.getPassword());
            updateUserPS.setString(3,u.getFullName());
            updateUserPS.setInt(4,u.getUserId());

            if(updateUserPS.executeUpdate()>0){
                System.out.println("User updated successfully");
                return u;
            }

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }


        return null;
    }

    //utility function
    private User getUserObject(ResultSet result){
        try {
            return new User(result.getInt("userId"),result.getString("emailId"),result.getString("password"),result.getString("fullName"));
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return null;
    }

    public User get(Object userId){
        try {
        	if(userId.getClass()==Integer.class){
        		getUserPS.setInt(1,(int)userId);
                ResultSet result = getUserPS.executeQuery();
                result.next();
                return getUserObject(result);
        	}
            
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return null;
    }

    public User delete(Object userId){

        try {
        	if(userId.getClass()==Integer.class){
	            deleteUserPS.setInt(1,(int)userId);
	            User user = get(userId);
	            if(deleteUserPS.executeUpdate()>0){
	                System.out.println("User Deleted Successfully");
	                return user;
	            }
            
        	}

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return null;
    }
    public List<User> listAll(){
        List<User> userList = new ArrayList<>();
        try {
            ResultSet result = getAllUsersPS.executeQuery();
            while (result.next()){
                userList.add(getUserObject(result));
            }
            return userList;

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }

        return userList;

    }
    public long count(){
        try {
            ResultSet result = countUsersPS.executeQuery();
            if(result.next()){
                return result.getInt("empCount");
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return 0;

    }

    public void close(){
        try {
            con.close();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }
    



}
