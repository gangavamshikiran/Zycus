package com.repository;

import com.model.User;

import java.util.*;


public class UserDAO {
    Map<Integer,User> userMap= new HashMap<>();

    public User create(User u){
        userMap.put(u.getUserId(),u);
        return u;
    }
    public User update(User u){
        userMap.put(u.getUserId(),u);
        return u;
    }
    public User get(int userId){
        return userMap.get(userId);

    }
    public User delete(int userId){
        userMap.remove(userId);
        return userMap.get(userId);
    }
    public List<User> getAll(){
        return new ArrayList<>(userMap.values());

    }
    public int count(){
        return userMap.size();
    }

}
