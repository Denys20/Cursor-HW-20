CREATE DATABASE IF NOT EXISTS Docker;

\c Docker;

CREATE TABLE IF NOT EXISTS info (
	id SERIAL PRIMARY KEY,
	data VARCHAR(255) NOT NULL
)

INSERT INTO info(data) 
VALUES ('Дані1'), 
('Дані2'), 
('Дані3'), 
('Дані4');