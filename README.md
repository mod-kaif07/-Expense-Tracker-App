# -Expense-Tracker-App
Spending Tracker , Hackathon Project — Team Data Wizards

📘 Project Description

Spending Tracker is a desktop application designed to help users manage their daily expenses effectively. Built using Java (Swing) and MySQL, this app allows users to categorize, track, and visualize their spending habits. The project focuses on simplifying personal finance management with a user-friendly interface and real-time expense calculations.

🚀 Features

Category Management: Add, view, and delete expense categories.

Expense Tracking: Add expenses with date, amount, and category.

Date-wise Expense View: Filter and view expenses within a specific date range.

Category-wise View: Analyze expenses by category.

Total Amount Calculation: View total expenses for the last 30 days.

GUI Interface: Built with Java Swing for a seamless user experience.

🛠️ Tech Stack

Language: Java

GUI: Java Swing

Database: MySQL

IDE: NetBeans / VS Code

📂 File Structure

Category.java: Manages expense categories (add/delete).

SpendingTracker.java: Main app interface for adding and displaying expenses.

Viewspending.java: Allows users to view expenses by date and category.

🚀 Setup Instructions

Clone the repository:

    git clone https://github.com/yourusername/Spending-Tracker.git

Open the project in your Java IDE.

Configure MySQL database:

CREATE DATABASE spending_tracker;
USE spending_tracker;
CREATE TABLE category_info (category VARCHAR(255));
CREATE TABLE spending (sid INT AUTO_INCREMENT PRIMARY KEY, sdate DATE, category VARCHAR(255), amount INT);

Update the database connection in the dbconnect class.

Run the application.

🏅 Future Improvements

Expense Charts & Graphs

Monthly Budget Limits

User Authentication

Export Data as CSV

NOTE:-"I also uploaded some GUI interfaces of my app. This app is designed exclusively for use on laptops."


📞 Contact

Mohammad Kaif: mohammadkaif6660@gmail.com
reg no- 226320050(ECE)

Md Shahnawaj: mbimdshahnawaj0786@gmail.com
reg no- 226320049(ECE)

💡 “Track your spending, control your future!”

Would you like me to adjust anything or make the setup more detailed? Let me know — we can polish this to perfection! ✨
