FROM maven:3.6.0-jdk-8-alpine
LABEL name="Maven 3.6.0 + jdk-8 + alpine"

# Install needed packages
RUN apk update && \
    apk add --no-cache \
        git
        
WORKDIR /app
COPY run.sh .
RUN chmod +x /app/run.sh
EXPOSE 8270

# Run script on start
ENTRYPOINT ["/app/run.sh"]

