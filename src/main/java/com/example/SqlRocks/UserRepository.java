package com.example.SqlRocks;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


/*
Here we have class for Controller and Service layer . But Interface for Repository layer.
The repository interface will extend JpaRepository interface.(It have all the basic CRUD querries writen inside)

JpaRepository<a,b>
Here,
    a= connecting entity name
    b= datatype of the primary key

 */

@Repository
public interface UserRepository extends JpaRepository<User,Integer> {

}
