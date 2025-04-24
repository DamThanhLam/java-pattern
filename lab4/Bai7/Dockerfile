# Sử dụng base image Python 3.9
FROM python:3.9

# Thiết lập biến môi trường
ENV APP_ENV=development

# Thiết lập thư mục làm việc
WORKDIR /app

# Copy mã nguồn vào container
COPY app.py .

# Chạy ứng dụng
CMD ["python", "app.py"]