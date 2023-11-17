FROM openjdk:17.0-jdk
MAINTAINER tsegasilase
VOLUME /tmp
ADD "Appointment-0.0.1-SNAPSHOT.jar" Appointment-0.0.1-SNAPSHOT.jar
EXPOSE 9000
ENV JAVA_OPTS=""
CMD ["java","-jar","Appointment-0.0.1-SNAPSHOT.jar"]




