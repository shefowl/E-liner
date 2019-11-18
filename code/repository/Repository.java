package com.example.myApp.repository;

import com.example.myApp.ShopClasses.Participants.User;
//import org.springframework.data.repository.ParticipantCrudRepository;

@org.springframework.stereotype.Repository
public interface Repository {
    User creatUser(User account);
    User readUser(String userName);
    User updateUser(User account);
    void deleteUser(String userName);
}
