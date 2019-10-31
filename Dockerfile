FROM java:latest

WORKDIR /home/java

COPY yc-app/target/yc-app-development.jar app.jar

USER java

EXPOSE 8080

ENV JAVA_OPTS="-XX:+UnlockExperimentalVMOptions -XX:+UseCGroupMemoryLimitForHeap"

ENTRYPOINT exec java ${JAVA_OPTS} -jar app.jar
