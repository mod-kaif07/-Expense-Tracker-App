# 🏆 Expense Tracker App
## Spending Tracker | Hackathon Project — Team Data Wizards

### 📘 Project Description
Spending Tracker is a desktop application designed to help users manage their daily expenses effectively. Built using **Java (Swing) and MySQL**, this app allows users to categorize, track, and visualize their spending habits. The project focuses on simplifying personal finance management with a **user-friendly interface** and **real-time expense calculations**.

## 🚀 Features
- **Category Management**: Add, view, and delete expense categories.
- **Expense Tracking**: Add expenses with date, amount, and category.
- **Date-wise Expense View**: Filter and view expenses within a specific date range.
- **Category-wise View**: Analyze expenses by category.
- **Total Amount Calculation**: View total expenses for the last 30 days.
- **GUI Interface**: Built with Java Swing for a seamless user experience.

## 🛠️ Tech Stack
- **Language**: Java
- **GUI**: Java Swing
- **Database**: MySQL
- **IDE**: NetBeans / VS Code

## 📂 File Structure
- **build.xml**: Main build script using Apache Ant.
- **dbconnect.java**: Handles database connection.
- **SpendingTracker.java**: Main application window for adding and managing expenses.
- **Category.java**: Manages expense categories.
- **Viewspending.java**: Displays spending history by date and category.

## 🔗 How the Files Link and Communicate
1. **Database Connection (`dbconnect.java`)**
   - Establishes a connection to MySQL (`spendingdb` database).
   - Provides a `Statement` object (`st`) for executing queries.
   
2. **Main Application (`SpendingTracker.java`)**
   - Displays GUI for adding expenses.
   - Uses `dbconnect.st` to insert spending data into the `spending` table.
   - Fetches categories from `category_info` for expense classification.

3. **Category Management (`Category.java`)**
   - Allows users to add or remove expense categories.
   - Uses `dbconnect.st` to insert/delete categories in `category_info`.
   - Updates the spending tracker dropdown dynamically.

4. **Spending History (`Viewspending.java`)**
   - Retrieves and displays spending records based on date range or category.
   - Queries `spending` table and displays results in a table.
   - Calculates total spending for a given period.

## 🚀 Setup Instructions
1. **Clone the repository:**
   ```sh
   git clone https://github.com/yourusername/Spending-Tracker.git
   ```
2. **Open the project in your Java IDE.**
3. **Configure MySQL database:**
   ```sql
   CREATE DATABASE spending_tracker;
   USE spending_tracker;
   CREATE TABLE category_info (category VARCHAR(255));
   CREATE TABLE spending (sid INT AUTO_INCREMENT PRIMARY KEY, sdate DATE, category VARCHAR(255), amount INT);
   ```
4. **Update the database connection in `dbconnect.java`.**
5. **Build and Run:**
   ```sh
   ant
   java -jar SpendingTracker.jar
   ```
   Alternatively, run `SpendingTracker.java` from an IDE.

## 🏅 Future Improvements
- **Expense Charts & Graphs** 📊
- **Monthly Budget Limits** 💰
- **User Authentication** 🔐
- **Export Data as CSV** 📂

> **NOTE:** "This app is designed exclusively for use on laptops."

## 📞 Contact
📧 **Mohammad Kaif**: mohammadkaif6660@gmail.com  
📧 **Md Shahnawaj**: mbimdshahnawaj0786@gmail.com  

💡 *“Track your spending, control your future!”*

