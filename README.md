# licensing service

mvn clean package
mvn spring-boot:build-image 


## run image
docker run -it -p8080:8080 docker.io/simple-microservice/licensing-service:latest

## REST example

GET localhost:8080/v1/organization/simpleOrg/license/0235431845
![Image](./img/get.png)

POST localhost:8080/v1/organization/simpleOrg/license
![Image](./img/post.png)

PUT localhost:8080/v1/organization/simpleOrg/license
![Image](./img/put.png)

DELETE localhost:8080/v1/organization/simpleOrg/license/0235431845
![Image](./img/delete.png)
