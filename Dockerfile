FROM ubuntu:latest
LABEL authors="jordy"

ENTRYPOINT ["top", "-b"]