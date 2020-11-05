FROM  java:8
LABEL author=simm
      email="simm@mingyuanyun.com"
VOLUME /tmp
ARG JAR_FILE
COPY ${JAR_FILE} app.jar
EXPOSE 8080
ENTRYPOINT ["java","-jar","/app.jar"]