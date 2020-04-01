FROM java:8

ADD build/libs/loanframe-1.jar backend.jar
EXPOSE 8090

ENTRYPOINT ["java","-jar","backend.jar"]
