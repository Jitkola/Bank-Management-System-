# 🏦 Bank Management System

A **Java-based desktop banking application** that brings core banking features to life in a clean, interactive, and secure way.  
Built with **Java Swing** for the interface and **MySQL** for data storage, it provides a smooth experience for account creation, transactions, and account management — just like a real bank.

---

## 📌 Description

The **Bank Management System** lets users open new accounts, log in securely, and manage their finances with ease.  
It includes a guided multi-step signup process, automatic **card number** & **PIN** generation, and a login system that keeps your data safe.  
Once logged in, customers can deposit money, withdraw funds, use fast cash, check their balance, change their PIN, and even view a **mini statement** showing recent transactions.  
Every action is recorded in the database, ensuring up-to-date account details and transaction history.

---

## ✨ Features

- Guided **Account Signup** in multiple steps  
- Automatic **Card Number & PIN** creation  
- **Secure Login** with database verification  
- Deposit, Withdraw, and Fast Cash options  
- **Balance Enquiry**  
- **Mini Statement** (with masked card number)  
- **PIN Change** functionality  
- Input validation via `ValidationUtils`  
- MySQL integration with JDBC

---

## 🚀 How to Start

- Download or clone this repository and ensure all source files are present in the `src/bank/management/system/` directory.  
- Open the complete project folder in your Java IDE (e.g., IntelliJ IDEA, Eclipse, NetBeans).  
- Make sure your project’s folder structure and dependencies (including database connection settings in files like `Con.java`) are correctly set up.  
- Compile the entire project to resolve dependencies between classes.  
- Run the `Login.java` file — this is the first page of the application and the entry point to the system.  
- From the login page, you can navigate through the app features.

---

## 🗄️ Database Setup

Run the following commands in your MySQL command line or MySQL Workbench to create the database and required tables:

```sql
CREATE DATABASE bankSystem;
USE bankSystem;

CREATE TABLE signup (
  form_no VARCHAR(30),
  name VARCHAR(30),
  father_name VARCHAR(30),
  DOB VARCHAR(30),
  gender VARCHAR(30),
  email VARCHAR(60),
  marital_status VARCHAR(30),
  address VARCHAR(60),
  city VARCHAR(30),
  pincode VARCHAR(30),
  state VARCHAR(50)
);
SELECT * FROM signup;

CREATE TABLE signuptwo (
  form_no VARCHAR(30),
  religion VARCHAR(30),
  category VARCHAR(30),
  income VARCHAR(30),
  education VARCHAR(30),
  occupation VARCHAR(60),
  pan VARCHAR(30),
  aadhar VARCHAR(60),
  seniorcitizen VARCHAR(30),
  existing_account VARCHAR(30)
);
SELECT * FROM signuptwo;

CREATE TABLE signupthree (
  form_no VARCHAR(30),
  account_Type VARCHAR(40),
  card_number VARCHAR(30),
  pin VARCHAR(30),
  facility VARCHAR(200)
);
SELECT * FROM signupthree;

CREATE TABLE login (
  form_no VARCHAR(30),
  card_number VARCHAR(50),
  pin VARCHAR(30)
);
SELECT * FROM login;

CREATE TABLE bank (
  pin VARCHAR(10),
  date VARCHAR(50),
  type VARCHAR(20),
  amount VARCHAR(20)
);
SELECT * FROM bank;
