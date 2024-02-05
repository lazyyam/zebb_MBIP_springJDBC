CREATE DATABASE IF NOT EXISTS zebb_yam;
USE zebb_yam;
-----------------------------------------------------------------------
CREATE TABLE recycleData (
    id INT PRIMARY KEY AUTO_INCREMENT,
    userName VARCHAR(30),
    weight DOUBLE,
    month VARCHAR(30),
    image_name VARCHAR(255),
    image_data LONGBLOB,
    recycling_carbon_factor DOUBLE
);

CREATE TABLE electricaldata (
    id INT PRIMARY KEY AUTO_INCREMENT,
<<<<<<< HEAD
    userName VARCHAR(255),
    electricityusage DECIMAL(5, 2) NOT NULL,
    days INT NOT NULL,
    month VARCHAR(255),
    proportion_factor DECIMAL(5, 2) NOT NULL,
    amount DECIMAL(10, 2) NOT NULL,
    current_charge DECIMAL(10, 2) NOT NULL,
    image_name VARCHAR(255),
    image_data LONGBLOB,
    electrical_carbon_factor DOUBLE
);

CREATE TABLE waterdata (
    id INT PRIMARY KEY AUTO_INCREMENT,
    userName VARCHAR(255),
    waterusage DECIMAL(5, 2) NOT NULL,
    days INT NOT NULL,
    month VARCHAR(255),
    proportion_factor DECIMAL(5, 2) NOT NULL,
    amount DECIMAL(10, 2) NOT NULL,
    image_name VARCHAR(255),
    image_data LONGBLOB,
    water_carbon_factor DOUBLE
);
=======
    userName VARCHAR(30) NOT NULL,
    location VARCHAR(50),
    water_consumption DOUBLE,
    electricity_consumption DOUBLE,
    recycling_amount DOUBLE,
    carbon_reduction_rate DOUBLE
    
);

CREATE TABLE timeline(
    month VARCHAR(50),
    title VARCHAR(20),
    description VARCHAR(50)
);
>>>>>>> ks
USE zebb_yam;
Drop table timeline;
CREATE TABLE timeline(
  id INT AUTO_INCREMENT PRIMARY KEY,
    month VARCHAR(50),
    title VARCHAR(100),
    description VARCHAR(255)
);
insert into timeline (month,title,description) Values
 ("2024-02-02","Go Green 2.0","Let's go green together"),
 ("2024-02-02","Gotong-Royong Taman Bunga", "Lets Clean together")