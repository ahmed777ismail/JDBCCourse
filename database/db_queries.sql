create Database jdbc_course_db;
use jdbc_course_db;
create TABLE employee(
id INT(15) PRIMARY KEY AUTO_INCREMENT,
name VARCHAR(30),
gender BOOLEAN,
birth_date DATE,
SALARY REAL
);