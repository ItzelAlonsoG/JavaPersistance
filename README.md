# JavaPersistance
# Content
- Introduction
- Repository
- Install dependencies
- Use XAMPP
- Run code
- Information

# Introduction

**Data persistence** is a means by which an application can retrieve information from a non-volatile storage system and make it persist. Data persistence is vital in business applications due to the necessary access to relational databases. Applications developed for this environment must manage persistence on their own or use third-party solutions to handle updates and recoveries of databases with persistence. JPA (Java ™ Persistence API) provides a mechanism to manage object relational mapping and persistence and works from the EJB 3.0 specifications.

**API** is an acronym that comes from the English language and refers to the expression Application Programming Interface (whose translation is Application Programming Interface). The concept refers to the processes, functions and methods provided by a certain programming library as an abstraction layer to be used by another computer program.

**CRUD (Create, Read, Update, Delete)** is an acronym for the ways in which you can operate on stored information. It is a mnemonic for the four functions of persistent storage. CRUD usually refers to operations carried out in a database or data warehouse, but it can also apply to higher-level functions of an application such as soft deletes where the information is not really deleted, but is marked as deleted at through a status.

**Java Database Connectivity (JDBC)** is the JavaSoft specification for a standard application programming interface (API) that enables Java programs to access database management systems. The JDBC API consists of a set of interfaces and classes written in the Java programming language. With these standard classes and interfaces, programmers can write applications that connect to databases, submit queries written in structured query language (SQL), and process the results. Since JDBC is a standard specification, a Java program that uses the JDBC API can connect to any database management system (DBMS), as long as there is a driver for that particular DBMS.

# Repository
This repository includes two projects

In gatos app project: consumes a web api that bring kitty photos.

In mensajes-app: We can aplicate all the definitios explained in the Introductions.
- Read mesagges
- Create mesagges
- Update messagges
- Delete messages

# Install dependencies  

- [Download and install MySQL](https://dev.mysql.com/downloads/workbench/)
- [Add mysql-connector-java-8.0.25.jar](https://github.com/ItzelAlonsoG/JavaPersistance/blob/main/mensajes_app/lib/mysql-connector-java-8.0.25.jar)
- [Install JDK 16](https://www.oracle.com/java/technologies/javase-jdk16-downloads.html)
- [Download Intellij IDE](https://www.jetbrains.com/es-es/idea/download/#section=windows)

 # Use XAMPP

1. **START MODULES XAMPP**
 > To start Apache (or another module), you have to click on the corresponding "Start" button. If the module startup is successful, the control panel will show the name of the module with a green background, its process identifier, the open ports (http and https), the "Start" button will turn into a "Stop" button and the notification area will show the result of the operations carried out. 
  <div><img src ="https://www.nettix.com.pe/wp-content/uploads/2020/05/xiniciar-mod.png.pagespeed.ic.Nk1P60apl_.webpD" width ="800px"> </div>
  
 2. **PHP MYADMIN WEB PANEL**
 > If the Apache and MySQL server have started, to verify that everything works correctly, you must write the address http: // localhost / phpmyadmin / in the browser. XAMPP will   open the new phpMyAdmin database administration panel
 
 <div><img src ="https://www.nettix.com.pe/wp-content/uploads/2020/05/744x453xphp-myadmin.png.pagespeed.ic.t-yqrBmGh6.webp" width ="800px">  </div> 
 
 > once we have entered the username and password, we will be able to access the databases
 
 <div><img src ="https://www.nettix.com.pe/wp-content/uploads/2020/05/744x489xindex-php-my-admin.png.pagespeed.ic.n2NDyX2zAU.webp" width ="800px">  </div> 
 
 
 > Use the [mensajes_app.sql](https://github.com/ItzelAlonsoG/JavaPersistance/blob/main/mensajes_app.sql) to create the data base in XAMPP to work and use de methods created in the JavaAdvance project.



# Run code

1. Download this repository using
> $ git clone

2. Open Intellij IDE, open the project named **mensajes_app**

   <div><img src ="https://vaadin.com/docs/latest/static/44aa85798d7510627ce48c5b38738da1/03979/welcome-screen.png" width ="800px">  </div>    

3. Select the file named **inicio.java**.

   <div><img src ="https://github.com/ItzelAlonsoG/JavaPersistance/blob/main/mensajes_app/JavaPersistence1.PNG" width ="800px">  </div>    

4. Right click on the mouse and **Run** wait a couple of seconds.

   <div><img src ="https://github.com/ItzelAlonsoG/JavaPersistance/blob/main/mensajes_app/JavaPersistence2.PNG" width ="800px">  </div>   
   
5. You will see the menu where you can interact with the XAMPP database created

      <div><img src ="https://github.com/ItzelAlonsoG/JavaPersistance/blob/main/mensajes_app/JavaPersistence3.PNG" width ="800px">  </div>  
      

# Information

You can check [Platzi Java Persistence course](https://platzi.com/clases/java-persistencia/)

[Data persistence](https://www.ibm.com/docs/es/was-liberty/base?topic=overview-java-persistence-api-jpa)

[API](https://definicion.de/api/)

[CRUD](https://developer.mozilla.org/es/docs/Glossary/CRUD)

[JDBC](https://www.ibm.com/docs/es/informix-servers/12.10?topic=started-what-is-jdbc)
