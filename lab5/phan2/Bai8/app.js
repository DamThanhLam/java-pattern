const express = require('express');
const mysql = require('mysql2');
const app = express();
const port = 3000;

// Cấu hình kết nối MySQL
const connection = mysql.createConnection({
  host: process.env.MYSQL_HOST || 'mysql',
  user: process.env.MYSQL_USER || 'user',
  password: process.env.MYSQL_PASSWORD || 'password',
  database: process.env.MYSQL_DB || 'mydb'
});

// Kiểm tra kết nối MySQL
connection.connect(err => {
  if (err) throw err;
  console.log('Connected to MySQL!');
});

// API trả về danh sách users
app.get('/users', (req, res) => {
  connection.query('SELECT * FROM users', (err, results) => {
    if (err) return res.status(500).send(err);
    res.json(results);
  });
});

app.listen(port, () => {
  console.log(`Node app listening on port ${port}`);
});