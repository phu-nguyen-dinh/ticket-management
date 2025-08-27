# 🎟️ Ticketing Management System

Hệ thống quản lý bán vé xem phim/sự kiện gồm:
- **Backend**: Spring Boot (REST API, JPA/Hibernate, MySQL)
- **Frontend**: React + Vite + TailwindCSS
- **Database**: MySQL (schema snake_case)

---

## 🚀 Tính năng chính

- Quản lý **Booking** (đặt vé)
- Quản lý **Customer** (khách hàng)
- Quản lý **User** (nhân viên)
- Quản lý **Event** (phim/sự kiện)
- Quản lý **Showtime** (suất chiếu)
- Quản lý **Room** & **Seat**
- Quản lý **Ticket**
- Quản lý **Payment**
- Chi tiết vé qua **BookingDetail**

---

## 🛠️ Công nghệ sử dụng

### Backend
- Java 17+
- Spring Boot 3.x
- Spring Data JPA
- Spring Security (config đơn giản, CSRF disabled)
- MySQL
- Lombok

### Frontend
- React 18 + Vite
- Axios (gọi API)
- React Router DOM
- TailwindCSS

---

## 📂 Cấu trúc dự án
```bash
ticketing-system/
│── backend/ # Spring Boot project
│ ├── src/main/java/com/ticketmanagement/ticketing/
│ │ ├── controllers/
│ │ ├── services/
│ │ ├── services/impl/
│ │ ├── entities/
│ │ ├── dto/
│ │ ├── mapper/
│ │ └── enums/
│ └── resources/
│ ├── application.properties
│ └── schema.sql
│
│── frontend/ # React + Vite project
│ ├── src/
│ │ ├── api/
│ │ ├── pages/
│ │ ├── components/
│ │ ├── App.jsx
│ │ └── main.jsx
│ └── index.html
```
---

## ⚙️ Cài đặt Backend

### 1. Cấu hình MySQL
Tạo database:
```sql
CREATE DATABASE ticketing;
```
Import schema:
```bash
source ticketing.sql;
```
Thêm sample data:
```sql
source sample_data.sql;
```
### 2. Cấu hình application.properties
```bash
spring.datasource.url=jdbc:mysql://localhost:3306/ticketing
spring.datasource.username=root
spring.datasource.password=your_password

spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true

# JSON snake_case
spring.jackson.property-naming-strategy=SNAKE_CASE

# Disable security password default
spring.security.user.name=admin
spring.security.user.password=123456
```
### 3. Chạy backend
```bash
cd backend
mvn spring-boot:run
```
Server chạy tại: http://localhost:8080
### ⚙️ Cài đặt Frontend
```bash
cd frontend
npm install
npm run dev
```
Frontend chạy tại: http://localhost:5173
---
### 🔗 API Endpoint chính
#### Booking
- GET /api/bookings → Lấy tất cả booking
- POST /api/bookings → Tạo booking mới
- PUT /api/bookings/{id} → Cập nhật booking
- DELETE /api/bookings/{id} → Xóa booking

#### Customer
- GET /api/customers
- POST /api/customers
- PUT /api/customers/{id}
- DELETE /api/customers/{id}
Event, Showtime, Ticket, Payment, Seat, Room, Location 👉 Tương tự Booking/Customer (CRUD đầy đủ)

---
### 🧪 Test với Postman

Ví dụ tạo Booking:
```bash
POST http://localhost:8080/api/bookings
{
  "user_id": 1,
  "cust_id": 1,
  "booking_time": "2025-09-01T19:00:00",
  "total_amount": 200,
  "status": "pending"
}
```
---
### 🎨 Frontend Demo

http://localhost:5173/bookings → trang quản lý booking

Sẽ có các trang khác: /customers, /events, /tickets, …
