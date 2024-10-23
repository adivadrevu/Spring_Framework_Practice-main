# Spring_Framework_Practice
Practicing Spring  Framework from scratch

# Spring Framework

## Key Concepts

- **Inversion of Control (IoC)**: A software design principle that gives control of an application flow to an external source (SPRING) rather than the application code.

- **Target Class**: A class that uses other class services/methods or business logic is called the Target class.

- **Dependency Object**: Services used inside the Target class are called Dependency Objects.

- **Dependency Injection**: Injecting Dependent Objects into the Target class.

- **Setter Injection**: Injecting an object into the Target class using the setter method is called Setter Injection.

- **Constructor Injection**: Injecting an object into the Target class using a constructor is called Constructor Injection.

### All the above logic is shown in code format. Please check the code in **SpringCore1**.
---------------------------------------------------------------------------------------------------------------------------------------------------------
### Key Concepts(contd. for SpringCore2 - ApplicationCOntext and BeanFactory)

### SpringCore2_ApplicationContext 
- Recreated the SpringCore1 application using an XML-based configuration approach.
- Separated classes into different packages and added dependencies in the `pom.xml`.
- Changed the JDK version to 14 using the `<properties>` tag.
- Used the **ApplicationContext** container and created an `applicationconfig.xml` file to define Beans and perform Dependency Injection.
- Defined Beans for all classes in the "main" and "services" packages.
- Performed **Setter Injection** using `<property>` and **Constructor Injection** using `<constructor-arg>`.

### SpringCore2_BeanFactory Notes
- Implemented the same SpringCore1 application using **BeanFactory** for Inversion of Control (IoC).
- Added dependencies and JDK version 14 in `pom.xml`.
- Defined Beans in an `applicationconfig.xml` file and used **BeanFactory** to manage them.
- Demonstrated **Dependency Injection** using both **Setter Injection** with `<property>` and **Constructor Injection** with `<constructor-arg>`.
- Explained the difference between **BeanFactory** and **ApplicationContext**, focusing on lazy initialization and IoC management.

### All the above logic is shown in code format. Please check the code in **"SpringCore2AC" & "SpringCore2BF"**.
---------------------------------------------------------------------------------------------------------------------------------------------------------




