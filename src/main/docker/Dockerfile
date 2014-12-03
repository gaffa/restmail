FROM java:8
MAINTAINER igaffai@gmail.com

EXPOSE 1025
EXPOSE 8080

ADD ${project.build.finalName}.jar /srv/

ENTRYPOINT ["java", "-jar", "/srv/${project.build.finalName}.jar"]