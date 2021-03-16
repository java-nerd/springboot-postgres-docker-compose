# SpringBoot + PostgreSQL Docker Compose  bare minimum app

## System Requirement

1. Maven
2. Java 8
3. Docker for Windows or Mac

### Package the Jar

1. `cd <project dir>`

2. ` mvn clean install `

### Build and Run Image

1. Make sure docker is running i.e. `docker ps`
2. run docker-compose `docker-compose up`
3. Go to browser and type `localhost:8080`

we should see landing page of our app

![img.png](img.png)

## Congrats! you have springboot app with postgresql running in separate containers.