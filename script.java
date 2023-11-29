// https://www.linkedin.com/learning/learning-spring-with-spring-boot-13886371/c
// CommandLineRunner
// allow you to execute something when the application started
// CrudRepository
findById(id)
deleteById(id)
existsById(id)

save(Object)
delete(Object)


deleteAll(Iterable)
saveAll(Iterable)
findAll()

count()
// Spring boot actuator
// gives you status of the api, health, metrics, env,loggers, ...
// http://192.168.1.4:8080/actuator/health
// http://192.168.1.4:8080/actuator/metrics
// http://192.168.1.4:8080/actuator/env
// http://192.168.1.4:8080/profile
// http://192.168.1.4:8080/actuator/loggers

// spring rest-data
// HATEOAS
// leverage hypermedia driven api
http://192.168.1.4:8080/info/tours/search/findByTitle?title=Big%20Sur%20Retreat


// spring mvc
// use if :
//          you are not using spring rest-data
//          you need to apply some business layer or algorithm
//          you want to hide the model
// http://192.168.1.4:8080/tours/3/ratings?sort=pk.customerId,asc