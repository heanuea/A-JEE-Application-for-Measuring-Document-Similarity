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
db4o represents an object-oriented database model. One of its main goals is to provide an easy and native interface to persistence for object oriented programming languages. Development with db4o database does not require a separate data model creation, the application’s class model defines the structure of the data. db4o attempts to avoid the object/relational impedance mismatch by eliminating the relational layer from a software project. db4o is written in Java and .NET and provides the respective APIs. It can run on any operating system that supports Java or .NET. It is offered under licenses including GPL, the db4o Opensource Compatibility License (dOCL), and a commercial license for use in proprietary software.

Developers using relational databases can view db40 as a complementary tool. The db4o-RDBMS data exchange can be implemented using db4o Replication System (dRS). dRS can also be used for migration between object (db4o) and relational (RDBMS) technologies.

As an embedded database db4o can be run in application process. It is distributed as a library (jar/dll).

**JSP**
Java Server Pages (JSP) is a server-side programming technology that enables the creation of dynamic, platform-independent method for building Web-based applications. JSP have access to the entire family of Java APIs, including the JDBC API to access enterprise databases. This tutorial will teach you how to use Java Server Pages to develop your web applications in simple and easy steps.

**TomCat**

**Servlet**

**Jaccard**

# UML


# References 
 - https://www.javatips.net/api/com.db4o.db4o
 - https://www.tutorialspoint.com/jsp/
 
 