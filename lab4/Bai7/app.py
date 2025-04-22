import os

# Đọc biến môi trường APP_ENV
app_env = os.getenv("APP_ENV", "default")

# In giá trị ra màn hình
print(f"APP_ENV is set to: {app_env}")