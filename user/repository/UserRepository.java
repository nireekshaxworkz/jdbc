package com.xworkz.user.repository;

import com.xworkz.user.entity.UserEntity;

public interface UserRepository {
    boolean save(UserEntity entity);
}
