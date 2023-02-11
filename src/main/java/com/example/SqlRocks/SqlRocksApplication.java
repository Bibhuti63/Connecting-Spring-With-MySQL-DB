package com.example.SqlRocks;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SqlRocksApplication {

	public static void main(String[] args) {
		SpringApplication.run(SqlRocksApplication.class, args);
	}

}

/*
Hibernate and JPA are Dependencies.

Hibernate is a dependency helps to connect with database.
It also executes querries in the database.

JPA(Java Persistance API)
It have functions which helps to connect with Database and perform basic CRUD Operations.
However complex operation are need to written.

Here we have class for Controller and Service layer . But Interface for Repository layer.
The repository interface will extend JpaRepository interface.(It have all the basic CRUD querries writen inside)


 */