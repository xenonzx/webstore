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

todos
make sku number a self validating domain object

docker
unit test
security
