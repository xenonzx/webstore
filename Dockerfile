FROM openjdk:11

ENV KEYSTORE_LOCATION=webstore.p12 KEYSTORE_PASSWORD=webstore KEY_PASSWORD=webstore SERVER_PORT=443

ARG JAR_FILE=build/libs/webstore-0.0.1-SNAPSHOT.jar
COPY ${JAR_FILE} app.jar
ENTRYPOINT ["java","-jar","/app.jar"]