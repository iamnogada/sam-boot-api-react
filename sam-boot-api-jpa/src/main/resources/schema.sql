 create table TestUser(
 	id int(10),
 	name varchar(10),
 	address varchar(255)
 );
 
 CREATE TABLE Accounts (
  email VARCHAR(255) NOT NULL,
  displayName VARCHAR(45) NULL,
  password VARCHAR(45) NULL,
  PRIMARY KEY (email)
 )
ENGINE = InnoDB;

CREATE TABLE Todos (
  todo INT  AUTO_INCREMENT PRIMARY KEY,
  description VARCHAR(1000) NULL,
  status VARCHAR(10) NULL,
  account_todos VARCHAR(255) NOT NULL,
  Foreign Key(account_todos) References Accounts(email))
ENGINE = InnoDB;

 CREATE TABLE Customers (
  id INT  AUTO_INCREMENT PRIMARY KEY,
  email VARCHAR(255) NOT NULL,
  displayName VARCHAR(45) NULL,
  password VARCHAR(45) NULL
 )
ENGINE = InnoDB;