
### MSSQL Android Studio Simple Tutorial JDBC

Connecting Android Studio, Java Project to MSSQL Using JDBC... JDBC is the main package for connecting Android projects to SQL... For MSSQL, We use JTDS package to have Windows Authentication for MSSQL. 

### What is JDBC?
JDBC, or Java Database Connectivity, is an API (Application Programming Interface) in Java that allows Java applications to connect and interact with databases. JDBC provides a standardized way for Java applications to communicate with various types of databases, like MySQL, PostgreSQL, Oracle, SQL Server, and others, regardless of the specific database being used.

JDBC is foundational in Java for database operations and is widely used in Java-based enterprise applications and server-side programming.

### Key Components of JDBC
JDBC Driver: A library specific to the database you are using. JDBC drivers implement the JDBC API to handle the particular database’s communication protocol, allowing Java code to work with multiple databases by simply changing the driver.

Connection Interface: Represents a connection to a specific database. This is the starting point for any JDBC operations, like executing SQL queries.

Statement Interface: Used to execute SQL queries against the database. There are three types of statements:

Statement for simple SQL queries.
PreparedStatement for precompiled SQL queries with parameters.
CallableStatement for executing stored procedures in the database.
ResultSet Interface: Represents the result set of a query. It allows navigation through the data returned by a query and retrieval of data by column name or index.

SQLException: An exception class for handling SQL errors that may occur during database operations.

### Workflow

Basic Workflow with JDBC:

Load the JDBC Driver (nowadays, it's often automatically loaded).

Establish a Connection to the database using DriverManager.

Create a Statement to execute SQL queries.

Execute Queries and retrieve results.

Process the Results (using a ResultSet).

Close the Resources (Connection, Statement, ResultSet) to avoid memory leaks

### Tutorial

Connection String Template (Local MSSQL Servers on your PC): 
String url = "jdbc:jtds:sqlserver://ip:port/Database"
10.0.2.2 IP Adress is the Local Ip Adress for Emulators... While it is normally 127.0.0.1 May not work. 

Optional args for Connection Strings like SSL Authentication:
";encrypt=true;ssl=request;lastupdatecount=true;ssl=require;integratedsecurity=true" 

Connecting with username and password:
con = DriverManager.getConnection(url,"user","password");

1433 is the default port for TCP Connection. 
Make Sure you enabled TCP/IP At your MSSQL Configuration Management for your SQL Instance, and Set 1433 as default TCP/IP port for your SQL Instance... 

In MSSQL Management Studio, you can connect to Instance with:"localhost,1433" and your password (if available), to check if your Database is listening at your localhost...

You can use MSSQL Management Studio to see the connection attempt logs for your SQL Database you are trying to connect your Project to. 

Let 1433 TCP Port to access I/O in your Firewall if you cant connect your project to MSSQL Database... 

Sample SQL Querry Table For this project tutorial:

CREATE TABLE names (
    int id,
    name varchar(20)
);

INSERT INTO names values
(0,'ARDA'),
(1,'TREVOR'),
(2,'MICHAEL'),
(3,'FRANKLIN')
