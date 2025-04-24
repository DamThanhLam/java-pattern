# Sử dụng Node.js 18 làm base image
FROM node:18

# Thiết lập thư mục làm việc trong container
WORKDIR /app

# Copy toàn bộ mã nguồn vào container
COPY . .

# Expose cổng 3000 để container có thể nhận request
EXPOSE 3000

# Chạy ứng dụng Node.js khi container khởi động
CMD ["node", "server.js"]
