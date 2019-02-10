
CREATE TABLE IF NOT EXISTS developers(
id INT AUTO_INCREMENT PRIMARY KEY,
first_name VARCHAR(50) NOT NULL,
last_name VARCHAR(50) NOT NULL,
specialty VARCHAR(100) NOT NULL,
experience INT NOT NULL
);
CREATE user 'root'@'%' identified by 'root';
grant all privileges on testhib.* to olexiy;
flush privileges;

create database testhib;