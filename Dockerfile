# Use Node.js base image
FROM node

# Set working directory
WORKDIR /app

# Copy package.json and install dependencies
COPY package*.json ./
RUN npm install

# Copy the rest of your React project
COPY . .

# Expose the dev server port
EXPOSE 3000

# Run the dev server (with hot reload)
CMD ["npm", "start"]