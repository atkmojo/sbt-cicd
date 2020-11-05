FROM adoptopenjdk/openjdk11:x86_64-ubuntu-jdk-11.0.3_7

MAINTAINER Name atik@faris.com

RUN mkdir -p /user/share/cicd/static/songs

RUN mkdir -p /user/share/cicd/bin

ADD /target/cicd*SNAPSHOT.jar /user/share/faris/bin/cicd.jar

WORKDIR /user/share/cicd

ENTRYPOINT ["/opt/java/openjdk/bin/java", "-jar", "bin/cicd.jar"]