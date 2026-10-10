FROM tomcat:10.1-jdk21-temurin
COPY target/18_tp_final-1.0-SNAPSHOT.war /usr/local/tomcat/webapps/a18_tp_final.war
EXPOSE 8080
CMD ["catalina.sh", "run"]

