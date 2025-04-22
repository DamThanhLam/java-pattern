# Sử dụng base image Node.js 18
FROM node:18

# Thiết lập thư mục làm việc
WORKDIR /app

# Copy package.json và cài đặt dependencies
COPY package*.json ./
RUN npm install

# Copy mã nguồn
COPY . .

# Expose cổng 3000
EXPOSE 3000

# Lệnh khởi chạy ứng dụng
CMD ["npm", "start"]