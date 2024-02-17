# Seek
I have created this repo for Super Choice QA challenge

Used tools and framework:
1. Selenium - Selenium is an open-source suite of tools and libraries that is used for browser automation.
2. Serenity - Serenity BDD is a library that makes it easier to write high quality automated acceptance tests, with powerful reporting and living documentation features. It has strong support for both web testing with Selenium.
3. Maven - a project management tool that is based on POM (project object model). It is used for project build, dependency, and documentation.
4. JUnit - a unit testing framework for Java programming language

Main features:
1. Serenity BDD framework to test Web UI. BDD is a software development methodology that emphasizes collaboration and communication among developers, testers, and business stakeholders. BDD testing is a testing framework that uses natural language to describe the behavior of an application, focusing on its functional requirements and business goals.
2. Feature files store high-level description of scenarios and steps in gherkin(given,when,then) language. Feature file is as entry point to Cucumber tests.
3. Used Scenario Outline to run same scenario multiple times with different value. This supports Data Driven testing. To test with more data just add values in Examples section of each scenario in the feature file.
4. Selenium is used to interact with different elements present on the Web page.
5. All classes and methods are implemented in Java with Maven repository to include all dependencies needed.
6. Used Serenity's inbuilt reporting


Demo:
1. Software Requirement to run this project:

   a. JRE

   b. Maven
2. Download this project and in command line execute: traverse to project path and mvn clean verify


3. HTML reports are generated at \target\site\serenity\index.html
   
