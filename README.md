# Basics of Java

Java was owned by Sun Microsystem then this was tookover by Oraacle

---
**Need to learn Java**
1. Most technologies (~90%) are java based technologies
    - E-Com Technologies (Amazon, Flipkart)
    - Payment Gateways
    - Mobile Application development
---   

**Features of java**
- Java is Object-Oriented Technology. 
- Java is both compiled and interpreted.
- Java is platform independent language.
- After compilation of java we get *.class* file
- Java is Architecturally neutral language
- Java follows Data Encapsulation

What is platform dependent?
If we compile the program in windows and we get .exe file as output. And if this .exe file is executed in linux then it will not work.

---
**Installation and SetUp of Java Development Kit (JDK)**

JDK-17 is more stable than JDK-21 so we will install JDK-17. Follow thie steps given below:
1. Visit: https://www.oracle.com/java/technologies/downloads/#jdk17-windows
2. Click on x64 installer (Downloading will start).
3. Open downloaded file read instructions carefully and click next and install Java.
4. To verify installation: 
    - open command prompt and write:
        ```
        > cd C:\Program Files\Java\jdk-17\bin
        > javac.exe
        ```
        You should see many instruction, it means it is sucessfully installed
5. To make javac (java compiler) as environmental variable:
    - Go to environmental variables -> system varibale section -> create new
    - Path name: PATH , path value: C:\Program Files\Java (as per your bin folder location)
    - click ok and check again (same as step 4 but change the directory to C or D drive)
---
### First Program
- Class name always starts with Capital letter
- Java is Case sensitive language
- File name and class name should be same
    HelloWorld.java (this is source file)
    ```java
    class HelloWorld{
        public static void main(Sring args[]){
            System.out.println("Hello World!");
        }
    }
    ```
To RUN this program
1. Save the file with name *HelloWorld.java*
2. open command prompt:
    - To compile the file
        ```
        javac HelloWorld.java
        ```
        This command will create *HelloWorld.class*, this *.class* file is bytecode file.

    - To run file (To interpret).
        ```
        java HelloWorld
        ```
    