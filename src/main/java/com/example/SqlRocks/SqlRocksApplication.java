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

Hibernate is an ORM(object relational mapping) tool.
Hibernate is a dependency helps to connect with database.
It also executes queries in the database.
It provides a framework to map Object oriented model to relational database;

JPA(Java Persistence API)
It have functions which helps to connect with Database and perform basic CRUD Operations.
However, complex operation are need to written.
Java Persistence API is a collection of classes and methods to persistently store the vast amounts of data into a database

Here we have class for Controller and Service layer . But Interface for Repository layer.
The repository interface will extend JpaRepository interface.(It have all the basic CRUD queries written inside)


 */