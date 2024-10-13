# PetHealth

## 1. Preparation
Before start working on  this project, you should have PostGre SQL installed and run on your local. To do so, you need:
 ### 1. Install PostGre SQL
Go to website https://www.postgresql.org/download/ and download a proper version of PG sql. While installation, 
 you will be asked to give a **superuser password** and a **port**. Note them down somewhere. You will need them while setting up database connection.  
### 2. Start PostGre SQL server
Open a command line/terminal, go to pgsqlInstallPath/bin folder, run  
```
pg_ctl.exe restart -D .../pgsqlPath/Data
```
To view through GUI, you can start pgAdmin4.exe under path *.../pgsqlPath/pgadmin4/runtime*, from which you will be asked for the password.
