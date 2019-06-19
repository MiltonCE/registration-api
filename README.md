# Patient Registration API

Patient Registration API
The Patient Registration (patient-registration) API is a component of Consent2Share (C2S) that manages the patient account creation process and persists patient demographics in Patient Health Record (PHR) API domain. If it is configured, it also registers the patient demographics to Health Information Exchange (HIE) via Information Exchange Hub (IExHub).

## Build
Prerequisites
Oracle Java JDK 8 with Java Cryptography Extension (JCE) Unlimited Strength Jurisdiction Policy
Docker Engine (for building a Docker image from the project)
## Commands
This is a Maven project and requires Apache Maven 3.3.3 or greater to build it. It is recommended to use the Maven Wrapper scripts provided with this project. Maven Wrapper requires an internet connection to download Maven and project dependencies for the very first build.

To build the project, navigate to the folder that contains pom.xml file using the terminal/command line.

To build a JAR:
For Windows, run mvnw.cmd clean install
For *nix systems, run mvnw clean install
To build a Docker Image (this will create an image with bhits/patient-registration:latest tag):
For Windows, run mvnw.cmd clean package docker:build
For *nix systems, run mvnw clean package docker:build
Run
Commands
This is a Spring Boot project and serves the API via an embedded Tomcat instance, therefore there is no need for a separate application server to run this service.

Run as a JAR file: java -jar patient-registration-x.x.x-SNAPSHOT.jar <additional program arguments>
Run as a Docker Container: docker run -d bhits/patient-registration:latest <additional program arguments>
NOTE: In order for this API to fully function as a microservice in C2S Application, it is also required to setup the dependency microservices and support level infrastructure. Please refer to the C2S Deployment Guide for instructions to setup the C2S infrastructure.



NOTE: The cacerts references given in the both sides of volume mapping above are files, not directories.

Contact
If you have any questions, comments, or concerns please see Consent2Share project site.
