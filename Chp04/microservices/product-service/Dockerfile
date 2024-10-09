# the first stage of our build will extract the layers
FROM openjdk:21 AS builder
WORKDIR /application
ARG JAR_FILE=./build/libs/*.jar
COPY ${JAR_FILE} product-service.jar
RUN java -Djarmode=layertools -jar product-service.jar extract

# the second stage of our build will copy the extracted layers
FROM openjdk:21
WORKDIR /application
COPY --from=builder application/dependencies/ ./
COPY --from=builder application/spring-boot-loader/ ./
COPY --from=builder application/snapshot-dependencies/ ./
COPY --from=builder application/application/ ./

EXPOSE 8080

ENTRYPOINT ["java", "org.springframework.boot.loader.launch.JarLauncher"]