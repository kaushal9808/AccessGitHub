FROM java:8
VOLUME /tmp
ADD /target/GitHubAccess-0.0.1-SNAPSHOT.jar teletronics.jar
EXPOSE 8080
RUN bash -c 'touch /teletronics.jar'
ENTRYPOINT ["java","-jar","/teletronics.jar"]
