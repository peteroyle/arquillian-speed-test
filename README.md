# arquillian-speed-test
Test project showing difference in speed for execution of Arquillian tests between JBoss AS 7 and EAP 6

# Usage

Note that this project requires you to have JBoss EAP in an internal repository under the Maven coordinates: org.jboss.eap:jboss-eap:6.3.0:zip, 
with that repository added to this project's pom.xml (see commented out repositories section).

Before executing the tests, download both EAP 6 and AS 7 app servers into your local maven repo by running both of these commands:

    mvn install -Parquillian-jbossas-managed-7,single-test
    mvn install -Parquillian-jbosseap-managed-6,single-test

Now you can proceed to time the tests against both app servers on a level playing field (ie: no time spent downloading).

## Run Single Test in JBoss AS 7

    mvn clean install -Parquillian-jbossas-managed-7,single-test

This takes around 30s on my laptop.

## Run All 20 Tests in JBoss AS 7

    mvn clean install -Parquillian-jbossas-managed-7

This takes around 36s on my laptop (20% increase for 20 extra tests).

## Run Single Test in JBoss EAP 6.3

    mvn clean install -Parquillian-jbosseap-managed-6,single-test

This takes around 40s on my laptop

## Run All 20 Tests in JBoss EAP 6.3

    mvn clean install -Parquillian-jbosseap-managed-6

This takes around 66s on my laptop (65% increase for 20 extra tests)

