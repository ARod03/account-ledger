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

📄 Example Transaction Format
Code
2024-04-29|14:32|Coffee purchase|Starbucks|-5.75
2024-04-29|09:10|Paycheck|Employer Inc|1500.00
🧪 Future Enhancements (Optional)
Export reports to CSV

Add categories

Add running balance

GUI version using JavaFX

Unit tests with JUnit

🤝 Contributing
Pull requests are welcome!
If you’d like to contribute, feel free to fork the repo and submit improvements.

📜 License
This project currently has no license.
If you want it to be open-source, consider adding an MIT License.

If you'd like, I can also:

Generate a LICENSE file

Create a CONTRIBUTING.md

Add badges (build status, Java version, etc.)

Write a more advanced README with screenshots or diagrams

Just tell me what direction you want to take this project next.

Create a README.md file
Absolutely, Adrian — here is a complete, polished README.md you can drop directly into your account-ledger repository. It’s structured, professional, and tailored to the exact project you’re building.

If you want it in a different tone (more formal, more fun, more technical), I can reshape it.

📘 Account Ledger
A simple, workbook‑aligned Java application that tracks deposits, payments, and generates financial reports. Designed using only the concepts from Java Workbooks 1a–3a, including classes, ArrayLists, loops, conditionals, Scanner input, and basic file I/O.

🚀 Features
Add deposits and payments

View all transactions

Filter by:

Deposits only

Payments only

Generate reports:

Month‑to‑date

Previous month

Year‑to‑date

Previous year

Search by vendor

Save and load transactions from a text file

Two‑class architecture:

Transaction

LedgerApp (main program)

🧱 Project Structure
account-ledger/
│
├── src/
│   └── main/
│       └── java/
│           ├── Transaction.java
│           └── LedgerApp.java
│
├── transactions.txt
├── pom.xml
└── README.md

🛠️ Technologies Used
Java (Workbook‑level concepts only)

Scanner for user input

ArrayList for storing transactions

LocalDate / LocalTime for timestamps

FileReader / BufferedReader / FileWriter for persistence

StringBuilder for formatted output

📦 Installation & Running
Clone the repository:

bash
git clone https://github.com/ARod03/account-ledger.git
Navigate into the project:

bash
cd account-ledger
Build and run with Maven:

bash
mvn clean package
mvn exec:java
Or run directly from IntelliJ using the green “Run” button.

🧮 How It Works
Adding a Transaction
The user chooses Deposit or Payment, then enters:

Date (YYYY‑MM‑DD)

Time (HH:MM)

Description

Vendor

Amount

Amounts are stored as positive for deposits and negative for payments.

Viewing the Ledger
The ledger displays all transactions in reverse chronological order.

Reports
Reports filter transactions using date comparisons:

Month‑to‑date: current month only

Previous month: last month’s transactions

Year‑to‑date: current year

Previous year: last year

Vendor search: matches vendor name (case‑insensitive)

📄 Transaction File Format
Each line in transactions.txt uses pipe‑separated values:

Code
2024-04-29|14:32|Coffee purchase|Starbucks|-5.75
2024-04-29|09:10|Paycheck|Employer Inc|1500.00