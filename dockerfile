FROM maven:3.9.3-openjdk-17

# Appium (latest)
RUN npm install -g appium

# Create app directory
WORKDIR /usr/src/app

# Copy project files
COPY . .

# Default command
CMD ["mvn", "clean", "install"]
