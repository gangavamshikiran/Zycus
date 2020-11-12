package com.repository;
import com.model.*;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

public class BookDAOjdbc implements DAO<Book>{

	private Connection con;
	PreparedStatement createBookPS;
	PreparedStatement updateBookPS;
	PreparedStatement getBookPS;
	PreparedStatement getAllBooksPS;
	PreparedStatement deleteBooksPS;
	PreparedStatement countBooksPS;
	
	
	public BookDAOjdbc(){
		try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bookstoredb","root","password");

//            String createBookQuery = "insert into book (bookId, title, author,description,category,reviews) VALUES (?,?,?,?,?)";
//            String updateBookQuery = "update user set emailId=?, password=?, fullName=? where userId =?";
//            String getBookQuery = "select * from user where userId=?";
//            String getAllBookQuery="select * from user";
//            String deleteBookQuery = "delete from user where userId=?";
//            String countBookQuery = "select count(*) as empCount from user";
//
//            createBookPS= con.prepareStatement(createBookQuery);
//            updateBookPS=con.prepareStatement(updateBookQuery);
//            getBookPS=con.prepareStatement(getBookQuery);
//            getAllBooksPS=con.prepareStatement(getAllBookQuery);
//            deleteBooksPS=con.prepareStatement(deleteBookQuery);
//            countBooksPS=con.prepareStatement(countBookQuery);
            
            


        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
	}
	@Override
	public Book create(Book b) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Book update(Book t) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Book get(Object o) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Book delete(Object o) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Book> listAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public long count() {
		// TODO Auto-generated method stub
		return 0;
	}

}
