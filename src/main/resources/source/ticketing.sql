create database ticketing;

USE ticketing;

-- Bảng customer
CREATE TABLE customer (
    cust_id INT AUTO_INCREMENT PRIMARY KEY,
    first_name VARCHAR(50) NOT NULL,
    last_name VARCHAR(50) NOT NULL,
    phone_number VARCHAR(20),
    email VARCHAR(100),
    address VARCHAR(255)
);

-- Bảng user
CREATE TABLE user (
    user_id INT AUTO_INCREMENT PRIMARY KEY,
    username VARCHAR(50) NOT NULL UNIQUE,
    password VARCHAR(255) NOT NULL
);

-- Bảng booking
CREATE TABLE booking (
    booking_id INT AUTO_INCREMENT PRIMARY KEY,
    user_id INT,
    cust_id INT,
    booking_time DATETIME NOT NULL,
    total_amount DECIMAL(10,2) NOT NULL,
    status ENUM('pending','paid','cancelled') DEFAULT 'pending',
    FOREIGN KEY (user_id) REFERENCES user(user_id),
    FOREIGN KEY (cust_id) REFERENCES customer(cust_id)
);

-- Bảng payment
CREATE TABLE payment (
    payment_id INT AUTO_INCREMENT PRIMARY KEY,
    booking_id INT,
    payment_method VARCHAR(50),
    amount DECIMAL(10,2),
    payment_time DATETIME,
    status ENUM('pending','paid','cancelled'),
    FOREIGN KEY (booking_id) REFERENCES booking(booking_id)
);

-- Bảng event
CREATE TABLE event (
    event_id INT AUTO_INCREMENT PRIMARY KEY,
    title VARCHAR(100) NOT NULL,
    description TEXT,
    type VARCHAR(50),
    start_time DATETIME,
    end_time DATETIME
);

-- Bảng location
CREATE TABLE location (
    location_id INT AUTO_INCREMENT PRIMARY KEY,
    location_name VARCHAR(100) NOT NULL,
    address VARCHAR(255),
    capacity INT
);

-- Bảng room
CREATE TABLE room (
    room_id INT AUTO_INCREMENT PRIMARY KEY,
    location_id INT,
    room_name VARCHAR(50) NOT NULL,
    FOREIGN KEY (location_id) REFERENCES location(location_id)
);

-- Bảng seat
CREATE TABLE seat (
    seat_id INT AUTO_INCREMENT PRIMARY KEY,
    room_id INT,
    row_name VARCHAR(10),
    number INT,
    seat_type ENUM('VIP','Normal') DEFAULT 'Normal',
    FOREIGN KEY (room_id) REFERENCES room(room_id)
);

-- Bảng showtime
CREATE TABLE showtime (
    showtime_id INT AUTO_INCREMENT PRIMARY KEY,
    event_id INT,
    room_id INT,
    start_time DATETIME NOT NULL,
    end_time DATETIME NOT NULL,
    FOREIGN KEY (event_id) REFERENCES event(event_id),
    FOREIGN KEY (room_id) REFERENCES room(room_id)
);

-- Bảng ticket
CREATE TABLE ticket (
    ticket_id INT AUTO_INCREMENT PRIMARY KEY,
    showtime_id INT,
    seat_id INT,
    price DECIMAL(10,2),
    status ENUM('available','booked','sold') DEFAULT 'available',
    FOREIGN KEY (showtime_id) REFERENCES showtime(showtime_id),
    FOREIGN KEY (seat_id) REFERENCES seat(seat_id)
);

-- Bảng booking_detail
CREATE TABLE booking_detail (
    booking_detail_id INT AUTO_INCREMENT PRIMARY KEY,
    booking_id INT,
    ticket_id INT,
    price DECIMAL(10,2),
    FOREIGN KEY (booking_id) REFERENCES booking(booking_id),
    FOREIGN KEY (ticket_id) REFERENCES ticket(ticket_id)
);

select * from booking;
select * from seat;