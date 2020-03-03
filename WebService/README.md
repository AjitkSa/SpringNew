WebService: Assortment of technologies including Arquillian
========================
Author: Ajit Kumar  
Level: Intermediate  
Technologies: CDI, JSF, JPA, EJB, JAX-RS, BV , Swagger, 
Summary: The `WebService` quickstart demonstrates a Java EE 6 web-enabled database application using JSF, CDI, EJB, JPA and Bean Validation.  
Target Product: JBoss EAP  
Source: <https://github.com/jboss-developer/jboss-eap-quickstarts/>  

To Deploy the war
--------------------
mvn clean install jboss-as:deploy


To Undeploy the war
--------------------
mvn jboss-as:undeploy

Application URL
----------------
http://localhost:8081/WebService/index.jsf

Swagger Json URL
----------------
http://localhost:8081/WebService/rest/openapi.json

Swagger UI URL
---------------
http://localhost:8081/WebService/swagger-ui/dist/index.html



Datasources
--------------
<datasources>
                <datasource jndi-name="java:jboss/datasources/ExampleDS" pool-name="ExampleDS" enabled="true" use-java-context="true" statistics-enabled="${wildfly.datasources.statistics-enabled:${wildfly.statistics-enabled:false}}">
                    <connection-url>jdbc:h2:mem:test;DB_CLOSE_DELAY=-1;DB_CLOSE_ON_EXIT=FALSE</connection-url>
                    <driver>h2</driver>
                    <security>
                        <user-name>sa</user-name>
                        <password>sa</password>
                    </security>
                </datasource>
                <drivers>
                    <driver name="h2" module="com.h2database.h2">
                        <xa-datasource-class>org.h2.jdbcx.JdbcDataSource</xa-datasource-class>
                    </driver>
                </drivers>
            </datasources>