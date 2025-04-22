# Sử dụng base image PHP 8.2 với Apache
FROM php:8.2-apache

# Thiết lập thư mục làm việc mặc định cho Apache
WORKDIR /var/www/html

# Kích hoạt mod rewrite của Apache (nếu cần)
RUN a2enmod rewrite

# Cấu hình Apache để phục vụ ứng dụng PHP
COPY 000-default.conf /etc/apache2/sites-available/000-default.conf