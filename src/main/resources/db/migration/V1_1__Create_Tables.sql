CREATE TABLE IF not EXISTS Users (
    id INT PRIMARY KEY,
    name VARCHAR(255) NOT NULL,
    birthday DATE,
    email VARCHAR(255) NOT NULL,
    phone_number VARCHAR(20)
);

CREATE TABLE IF not EXISTS Cats (
    id INT PRIMARY KEY,
    name VARCHAR(255) NOT NULL,
    owner INT,
    age INT,
    color VARCHAR(50),
    FOREIGN KEY (owner) REFERENCES Users(id)
);

CREATE TABLE IF not EXISTS Dogs (
    id INT PRIMARY KEY,
    name VARCHAR(255) NOT NULL,
    owner INT,
    age INT,
    color VARCHAR(50),
    FOREIGN KEY (owner) REFERENCES Users(id)
);

