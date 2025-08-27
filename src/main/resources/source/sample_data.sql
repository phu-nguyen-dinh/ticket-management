USE ticketing;

-- Location
INSERT INTO location (location_name, address, capacity) VALUES
('CGV Vincom Đồng Khởi', '72 Lê Thánh Tôn, Q1, TP.HCM', 300),
('CGV Landmark 81', '720 Điện Biên Phủ, Bình Thạnh, TP.HCM', 500);

-- Room
INSERT INTO room (location_id, room_name) VALUES
(1, 'Phòng Chiếu 1'),
(1, 'Phòng Chiếu 2'),
(2, 'Phòng IMAX');

-- Seat
INSERT INTO seat (room_id, row_name, number, seat_type) VALUES
(1, 'A', 1, 'VIP'),
(1, 'A', 2, 'VIP'),
(1, 'B', 1, 'Normal'),
(1, 'B', 2, 'Normal'),
(2, 'A', 1, 'VIP'),
(3, 'A', 1, 'VIP');

-- Event
INSERT INTO event (title, description, type, start_time, end_time) VALUES
('Avengers: Endgame', 'Phim bom tấn Marvel', 'MOVIE', '2025-09-01 19:00:00', '2025-09-01 21:30:00'),
('The Dark Knight', 'Phim DC kinh điển', 'MOVIE', '2025-09-02 20:00:00', '2025-09-02 22:30:00');

-- Showtime
INSERT INTO showtime (event_id, room_id, start_time, end_time) VALUES
(1, 1, '2025-09-01 19:00:00', '2025-09-01 21:30:00'),
(2, 3, '2025-09-02 20:00:00', '2025-09-02 22:30:00');

-- Ticket
INSERT INTO ticket (showtime_id, seat_id, price, status) VALUES
(1, 1, 120.00, 'available'),
(1, 2, 120.00, 'booked'),
(1, 3, 100.00, 'sold'),
(2, 5, 150.00, 'available'),
(2, 6, 180.00, 'available');

-- Customer
INSERT INTO customer (first_name, last_name, phone_number, email, address) VALUES
('Nguyen', 'An', '0901234567', 'nguyenan@example.com', '123 Lê Lợi, Q1, TP.HCM'),
('Tran', 'Binh', '0912345678', 'tranbinh@example.com', '456 Hai Bà Trưng, Q3, TP.HCM');

-- User
INSERT INTO user (username, password) VALUES
('admin', '123456'),
('staff', '123456');

-- Booking
INSERT INTO booking (user_id, cust_id, booking_time, total_amount, status) VALUES
(1, 1, '2025-08-25 13:00:00', 220.00, 'paid'),
(2, 2, '2025-08-26 15:00:00', 100.00, 'pending');

-- Payment
INSERT INTO payment (booking_id, payment_method, amount, payment_time, status) VALUES
(1, 'CREDIT_CARD', 220.00, '2025-08-25 13:05:00', 'paid'),
(2, 'MOMO', 100.00, '2025-08-26 15:10:00', 'pending');

-- BookingDetail
INSERT INTO booking_detail (booking_id, ticket_id, price) VALUES
(1, 2, 120.00),
(1, 3, 100.00),
(2, 4, 100.00);
