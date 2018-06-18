FROM openjdk
ADD build/distributions/gradle-restful-quickstart-boot.zip /code/
WORKDIR /code
RUN unzip gradle-restful-quickstart-boot.zip -d .