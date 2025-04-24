# Sử dụng image Python 3.9 làm base
FROM python:3.9

# Thiết lập thư mục làm việc
WORKDIR /app

# Copy toàn bộ mã nguồn vào container
COPY . .

# Cài đặt thư viện từ requirements.txt
RUN pip install -r requirements.txt

# Mở cổng 5000
EXPOSE 5000

# Chạy ứng dụng Flask
CMD ["python", "app.py"]
