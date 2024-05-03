FROM openjdk:17
EXPOSE 8080
ADD target/cicdwithgithubactions.jar cicdwithgithubactions.jar
ENTRYPOINT ["java", "-jar", "cicdwithgithubactions.jar"]