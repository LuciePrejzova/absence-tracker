CREATE TABLE users (
    sys_id BIGINT AUTO_INCREMENT PRIMARY KEY,
    first_name VARCHAR(255) NOT NULL,
    last_name VARCHAR(255) NOT NULL,
    tel_number VARCHAR(20),
    email VARCHAR(255),
    user_name VARCHAR(255) NOT NULL,
    password VARCHAR(255) NOT NULL
);

CREATE TABLE kids (
    substitutes INT DEFAULT 0,
    dayType INT,
    attendance ENUM('MO', 'TUE', 'WED', 'THU', 'FRI')
);