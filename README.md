# 19APC4095-Web-Service-Tutorial


This project is a **SOAP Web Service** developed in Java using **JAX-WS**. It provides two operations:

- **reverseText(String text)**: Returns the reversed version of the given string.
- **countCharacters(String text)**: Returns the number of characters in the given string.

The service is deployed on an **Apache Tomcat** server locally.

## Prerequisites
- Java JDK (8 or later)
- Apache Tomcat Server
- IntelliJ IDEA (Community Edition)
## Usage

#### Example Request & Response

1. **reverseText("hello")**
   - **Input:** `hello`
   - **Output:** `olleh`

2. **countCharacters("hello world")**
   - **Input:** `hello world`
   - **Output:** `11`
