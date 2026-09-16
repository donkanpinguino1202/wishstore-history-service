CREATE DATABASE IF NOT EXISTS wishstore_history_db;

USE wishstore_history_db;

CREATE TABLE history (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    wishlist_id BIGINT NOT NULL,
    product_id BIGINT NOT NULL,
    action VARCHAR(20) NOT NULL,
    description VARCHAR(255),
    created_at DATETIME NOT NULL

);