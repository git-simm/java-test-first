FROM  fiadliel/java8-jre
LABEL author=simm
LABEL email="simm@163.com"
VOLUME /tmp
ARG JAR_FILE
COPY ${JAR_FILE} app.jar
EXPOSE 8080
ENTRYPOINT ["java","-jar","/app.jar"]
