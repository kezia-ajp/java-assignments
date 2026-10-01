CREATE TABLE Student (
    Student_ID INT PRIMARY KEY,
    Roll_No INT,
    Name VARCHAR(50) NOT NULL,
    Age INT,
    Date_of_Birth DATE,
    Email VARCHAR(100) NOT NULL,
    Phone_Number VARCHAR(15) NOT NULL,
    Address VARCHAR(150)
);

INSERT INTO Student
(Student_ID, Roll_No, Name, Age, Date_of_Birth, Email, Phone_Number, Address)
VALUES
(1, 101, 'Kezia', 19, '2007-05-15', 'kezia@gmail.com', '9876543210', 'Bangalore');

INSERT INTO Student
(Student_ID, Roll_No, Name, Age, Date_of_Birth, Email, Phone_Number, Address)
VALUES
(2, 102, 'Archana', 19, '2007-08-20', 'archana@gmail.com', '9876543211', 'Chennai');

INSERT INTO Student
(Student_ID, Roll_No, Name, Age, Date_of_Birth, Email, Phone_Number, Address)
VALUES
(3, 103, 'Ravi', 20, '2006-03-10', 'bhavan@gmail.com', '9876543212', 'Hyderabad');

SELECT * FROM Student;
