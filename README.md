📘 Account Ledger
A simple Java-based accounting ledger application that allows users to record deposits, payments, and generate basic financial reports. Built using core Java concepts (loops, conditionals, ArrayLists, classes, file I/O) and structured for clarity and maintainability.

🚀 Features
Add deposits and payments

View all transactions

Filter by:

Deposits only

Payments only

Generate reports:

Month-to-date

Previous month

Year-to-date

Previous year

Search by vendor

Load and save transactions to a text file

Simple two-class architecture:

Transaction

Main (or LedgerApp, depending on your version)

🧱 Project Structure
Code
account-ledger/
│
├── src/
│   └── main/
│       └── java/
│           ├── Transaction.java
│           └── Main.java
│
├── pom.xml
└── .gitignore
🛠️ Technologies Used
Java 17+ (or your configured JDK)

Maven for project management

LocalDate / LocalTime for date handling

ArrayList for in-memory transaction storage

File I/O for persistence

📦 Installation
Clone the repository:

bash
git clone https://github.com/ARod03/account-ledger.git
Navigate into the project:

bash
cd account-ledger
Build with Maven:

bash
mvn clean package
Run the application:

bash
mvn exec:java

🧮 How It Works
Adding Transactions
Users can add either a deposit (positive amount) or payment (negative amount).
Each transaction stores:

Date

Time

Description

Vendor

Amount

Viewing the Ledger
The ledger displays transactions in reverse chronological order (newest first).

Reports
Reports filter transactions based on date ranges using LocalDate comparisons.

📄 Example Transaction Format:

2024-04-29|14:32|Coffee purchase|Starbucks|-5.75

2024-04-29|09:10|Paycheck|Employer Inc|1500.00