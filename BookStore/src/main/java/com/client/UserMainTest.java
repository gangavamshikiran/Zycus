package com.client;

import com.entities.User;
import com.repository.UserDAO;
import com.repository.UserDAOHibernate;
import com.repository.UserDAOjdbc;
import com.service.UserService;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class UserMainTest {
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
        UserDAOjdbc userDAO = new UserDAOjdbc();

        UserDAOHibernate userService = new UserDAOHibernate();
        
        
        System.out.println(userDAO.listAll());
        System.out.println(userDAO.count());
        userDAO.close();
        
        int choice = 0;

        do{
            System.out.println("Enter choice\n1. Get All Users\n2. Get User by id\n3. Save User\n4. Update User\n5. Delete User\n6. Exit");
            choice = Integer.parseInt(sc.nextLine());
            switch (choice) {
                case 1:
//                    System.out.println(userService.listAll());
                    break;

                case 2:
                    System.out.println("Enter ID");
                    long id = Integer.parseInt(sc.nextLine());
                    System.out.println(userService.get(id));
                    break;

                case 3:
                    System.out.println("Enter User details as: id,email,password,fullname");
                    String[] lineArr=sc.nextLine().split(",");
                    userService.create(new User(Integer.parseInt(lineArr[0]),lineArr[1],lineArr[2],lineArr[3]));
                    break;

                case 4:
                    System.out.println("Enter Employee details as: id,name,city,salary");
                    String[] lineArr2=sc.nextLine().split(",");
                    userService.update(new User(Integer.parseInt(lineArr2[0]),lineArr2[1],lineArr2[2],lineArr2[3]));
                    break;

                case 5:
                    System.out.println("Enter ID");
                    long id1 = Integer.parseInt(sc.nextLine());
                    System.out.println(userService.delete(id1));
                    break;

                case 6:

                    break;
            }

        }while(choice<6);


    }
        
        
        
        
        



    

}
