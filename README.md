# MSSQL Android Studio Simple Tutorial JDBC
 MSSQL Android Studio Simple Tutorial JDBC

Connecting Android Studio, Java Project to MSSQL Using JDBC... JDBC is the main package for connecting Android projects to SQL... For MSSQL, We use JTDS package to have Windows Authentication for MSSQL. 

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
