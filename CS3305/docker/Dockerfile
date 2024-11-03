FROM ubuntu:latest
ENV DEBIAN_FRONTEND=noninteractive

# Update the package list and install necessary packages
RUN apt-get update && apt-get install -y \
  curl \
  gnupg \
  build-essential

# Install Node.js and npm
RUN curl -sL https://deb.nodesource.com/setup_16.x | bash - && \
  apt-get install -y nodejs

# Install Yarn
RUN npm install -g yarn

# Create a working directory
WORKDIR /usr/src/app

# Copy the current directory contents into the container at /usr/src/app
COPY . .

# Expose port 3000 (or any other port your application uses)
EXPOSE 3000

# Command to run the application
CMD ["npm", "start"]