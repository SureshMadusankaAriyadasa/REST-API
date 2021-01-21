# REST-API
RST-API with spring boot
API is the acronym for Application Programming Interface, which is a software intermediary that allows two applications to talk to each other. 
Each time you use an app like Facebook, send an instant message, or check the weather on your phone, you’re using an API.
In this RST web services APIs for CRUD operations on a MySQL database. The CRUD operations include Create, Retrieve, Update and Delete. 
By completing this tutorial, you will be able to 
build a Spring Boot-based web application that exposes RESTful CRUD APIs to clients. The following technologies will be used: 

***Java Development Kit (JDK 1.8 or newer) 
a).MySQL Driver
b).Spring Data JPA
c).Spring Web

step 1:
install Eclipse

step 2:
open Eclipse ----> click "Help" tab ----> click "Eclipse Marketplace"  ----> Search "Spring STS" --->
install Spring tools

step 3:
Download the Zip file. and  UnZip this file.

step 4:
Create MySQL Database to xampp or wamp.
DataBase name="sql_coffee_shop"

Open the this database
Link: http://localhost/phpmyadmin/db_structure.php?server=1&db=sql_coffee_shop

Click ----> "import" tab ----> Click "Choose File" ---->Select "sql_coffee_shop.sql" in the project folder.  --->  Click "Go" Button.

step 5:
Test

We can show the list of coffee items, http://localhost:2121/products/view
We can search the products by using id http://localhost:2121/products/search/{id}
ex. (http://localhost:2121/products/search/a001)
We can show the list of orders http://localhost:2121/orders/all_orders
We can update the order by using postman select by PUT http://localhost:2121/orders/update/{id}
We can update the order by using postman select by PUT http://localhost:2121/orders/delete/{id}


