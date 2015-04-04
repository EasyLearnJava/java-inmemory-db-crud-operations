# java-inmemory-db-crud-operations

This eclipse maven project explains how to create an inmemory temporary databse and perform Create, Read, Update and Delete operations 
***

* CreateInMemoryServer.java --> run this class to create an in memory database, which runs at the below specified URL 
```
jdbc:h2:tcp://localhost:9092/mem:ATHENA
```
<b>ATHENA --></b> in memory database name
***

* Use the below parameters to connect to the in memory DB, created in the above scenario
```
DB_DRIVER = "org.h2.Driver";
DB_URL = "jdbc:h2:tcp://localhost:9092/mem:ATHENA;DB_CLOSE_DELAY=-1";
DB_USER = "";
DB_PASSWORD = "";
```
<b>DB_CLOSE_DELAY=-1 --></b> To persist the data till that JVM instance exists, Once the JVM instance is closed the data will be lost
***

* <b>PingServer.java --></b> run this class to test if the server is running 
 
***

1. <b>CreateTable.java --></b> run this class to create an <b>EMPLOYEE</b> table in the database
2. <b>InsertRecords.java --></b> run this class to insert records. The sample data given inserts 2 records
3. <b>ReadRecords.java --></b> run this class to read all the inserted records
4. <b>UpdateRecords.java --></b> run this class to update specific records which match a criteria
5. <b>DeleteRecords.java --></b> run this class to delete specific records which match a criteria
6. <b>DropTable.java --></b> run this class to drop the table, which deletes the <b>EMPLOYEE</b> table from the in memory db
 
***

Two more classes are present under the package <i>com.easylearnjava.util</i>
* <b>CheckForATableInDB.java --></b> run this class to check if the table <b>EMPLOYEE</b> is present in the DB
* <b>CheckForAllTablesInDB.java --></b> run this class to check all the tables present in the DB
 
***
For more information visit     
<http://www.h2database.com/html/main.html>

