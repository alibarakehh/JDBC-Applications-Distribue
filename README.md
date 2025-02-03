## Application Distribue : Ali El Rida Barakeh JDBC Setup Guide

### Requirements:
- Install the JDBC driver for MSSQL from the official Microsoft website.
- Have a Java project set up in Visual Studio Code.

### Steps:

#### Step 1: Create Java Project
1. Open Visual Studio Code.
2. Create a new Java project.

#### Step 2: Add Project Name
- Enter the project name and proceed.

#### Step 3: Add JDBC Driver to Referenced Libraries
1. Locate "Referenced libraries" in Visual Studio Code.
2. Add the MSSQL JDBC driver JAR files.

#### Step 4: Connect to MSSQL Server with Java Code
1. Write Java code to connect to your MSSQL Server.
   ```java
   // Example connection code
   String connectionUrl = "jdbc:sqlserver://Ali-PC/MSSQLSERVER02;databaseName=HR;integratedSecurity=true;trustServerCertificate=true;";
   // Establish connection and execute queries
   ```

#### Troubleshooting Tips:
- If facing connection errors:
  1. Ensure the server browser service is enabled (usually turned off by default).
  2. Enable TCP/IP for your MSSQL server instance (e.g., MSSQLSERVER02).
  3. Verify that the authentication file (auth file) is added to the system PATH.

#### Conclusion:
After resolving these steps and any encountered errors, your JDBC connection should be established. Test your queries within Visual Studio Code to confirm connectivity.
