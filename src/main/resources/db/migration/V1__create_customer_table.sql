CREATE TABLE customer (
	customer_id     SERIAL PRIMARY KEY,
    email           VARCHAR (255) UNIQUE NOT NULL,
	first_name      VARCHAR (100) NOT NULL,
	middle_name     VARCHAR (100),
    last_name       VARCHAR (100) NOT NULL,
    suffix          VARCHAR (10),
    phone           VARCHAR (20)
);