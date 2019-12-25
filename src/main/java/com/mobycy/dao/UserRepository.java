package com.mobycy.dao;

import com.mobycy.beans.User;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface UserRepository extends CrudRepository {

     void updateUserLocation(String UserId);
     void updateUserPunchInPunchOutStatus(String UserId);
     List<User> getActiveUsers();
}
