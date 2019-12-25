package com.mobycy.dao;

import com.mobycy.beans.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Integer> {

     void updateUserLocation(String UserId);
    void updateUserPunchInPunchOutStatus(String UserId);
}
