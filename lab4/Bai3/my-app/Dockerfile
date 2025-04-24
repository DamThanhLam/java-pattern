# Sử dụng node:18-alpine làm base image
FROM node:18-alpine

# Thiết lập thư mục làm việc trong container
WORKDIR /app

# Copy file package.json và cài đặt dependencies
COPY package.json ./
RUN npm install

# Copy toàn bộ mã nguồn vào container
COPY . .

# Build ứng dụng
RUN npm run build

# Expose cổng 3000
EXPOSE 3000

# Chạy ứng dụng React
CMD ["npm", "start"]
