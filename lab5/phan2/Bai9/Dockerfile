# Sử dụng base image Python 3.9
FROM python:3.9-slim

# Thiết lập thư mục làm việc
WORKDIR /app

# Copy và cài đặt dependencies
COPY requirements.txt .
RUN pip install --no-cache-dir -r requirements.txt

# Copy mã nguồn
COPY . .

# Chạy ứng dụng
CMD ["python", "app.py"]