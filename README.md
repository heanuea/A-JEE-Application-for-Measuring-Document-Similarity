# DocumentSimilarity

## **_Project Overview_** 
#### *Object Oriented Design principles & Patterns Module - Lecturer: [John Healy](https://github.com/bradanfeasa) - 4th Year Software Development*
A Java web application that enables two or more text documents to be compared for similarity.

Your implementation should include the following features:

1. A document or URL should be specified or selected from a web browser and then
dispatched to a servlet instance running under Apache Tomcat.

2. Each submitted document should be parsed into its set of constituent shingles and
then compared against the existing document(s) in an object-oriented database (db4O)
and then stored in the database.

3. The similarity of the submitted document to the set of documents stored in the
database should be returned and presented to the session user.

**_An Overview of the project_**

**Db4o**
db4o represents an object-oriented database model. One of its main goals is to provide an easy and native interface to persistence for object oriented programming languages. Development with db4o database does not require a separate data model creation, the application�s class model defines the structure of the data. db4o attempts to avoid the object/relational impedance mismatch by eliminating the relational layer from a software project. db4o is written in Java and .NET and provides the respective APIs. It can run on any operating system that supports Java or .NET. It is offered under licenses including GPL, the db4o Opensource Compatibility License (dOCL), and a commercial license for use in proprietary software.

Developers using relational databases can view db40 as a complementary tool. The db4o-RDBMS data exchange can be implemented using db4o Replication System (dRS). dRS can also be used for migration between object (db4o) and relational (RDBMS) technologies.

As an embedded database db4o can be run in application process. It is distributed as a library (jar/dll).

**JSP**
Java Server Pages (JSP) is a server-side programming technology that enables the creation of dynamic, platform-independent method for building Web-based applications. JSP have access to the entire family of Java APIs, including the JDBC API to access enterprise databases. This tutorial will teach you how to use Java Server Pages to develop your web applications in simple and easy steps.

**TomCat**
Apache Tomcat, often referred to as Tomcat Server, is an open-source Java Servlet Container developed by the Apache Software Foundation (ASF). Tomcat implements several Java EE specifications including Java Servlet, JavaServer Pages (JSP), Java EL, and WebSocket, and provides a "pure Java" HTTP web server environment in which Java code can run.

Tomcat is developed and maintained by an open community of developers under the auspices of the Apache Software Foundation, released under the Apache License 2.0 license, and is open-source software.


**Servlet**
Servlet can be described in many ways, depending on the context.

Servlet is a technology i.e. used to create web application.
Servlet is an API that provides many interfaces and classes including documentations.
Servlet is an interface that must be implemented for creating any servlet.
Servlet is a class that extend the capabilities of the servers and respond to the incoming request. It can respond to any type of requests.
Servlet is a web component that is deployed on the server to create dynamic web page.

**Jaccard**
The Jaccard index, also known as Intersection over Union and the Jaccard similarity coefficient (originally coined coefficient de communauté by Paul Jaccard), is a statistic used for comparing the similarity and diversity of sample sets.

# UML


# References 
 - https://www.javatips.net/api/com.db4o.db4o
 - https://www.tutorialspoint.com/jsp/
 - https://tomcat.apache.org/download-90.cgi
 