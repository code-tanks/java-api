FROM eclipse-temurin:20-jdk-jammy

RUN apt update && apt install -y git maven

RUN useradd -ms /bin/bash developer
USER developer
WORKDIR /home/developer
