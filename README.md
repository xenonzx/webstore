aim
to achieve the  DDD concepts
Domain can be found in a separate module
domain entities are designed to be rich. containing all properties and behaviours -that suit the current context-
the idea of having a separate model object in each layer even between modules is a bit exhausting

service layer is just a coordination between usecases 
a usecase cannot depend on another user case (to avoid logic change) if coordication between multiple use cases is needed the do it in domain service layer

domain module contains the domain entites
the only way to coordinate with domain entities is through usecases
usecases are resonisible for reading from and writing to ports (repositories) after executing business case

security
granting access  to certain resources according to role.

todos
make sku number a self validating domain object
replace NoOpPasswordEncoder with proper encoder
remove http.csrf().disable();
add self signing ssl certificate.

docker
unit test
security

running the docker Image
1. build the app ` ./gradlew build      `
2. package it ino default location using `java -jar build/libs/webstore-0.0.1-SNAPSHOT.jar`
3. run the docker image and map the port to port 8080 ` docker  run -p8080:8080 webstore `



env vars
export KEYSTORE_LOCATION=webstore.p12
export KEYSTORE_PASSWORD=webstore
export KEY_PASSWORD=webstore
export SERVER_PORT=443