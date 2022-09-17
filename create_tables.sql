CREATE TABLE users
(
    id INTEGER PRIMARY KEY,
    ds_name VARCHAR(100) NOT NULL,
    ds_lastname VARCHAR(100) NOT NULL,
    age INTEGER NOT NULL
);
CREATE SEQUENCE mouse_seq
 START WITH     1
 INCREMENT BY   1;
CREATE TABLE mouses
(
	idmouse INTEGER PRIMARY KEY NOT NULL DEFAULT nextval('mouse_seq'),
	brand VARCHAR(100) NOT NULL,
	serialnumber INTEGER NOT NULL UNIQUE,
	model VARCHAR(100) NOT NULL
);
CREATE SEQUENCE monitor_seq
 START WITH     1
 INCREMENT BY   1;
CREATE TABLE monitors
(
	idmonitor INTEGER PRIMARY KEY NOT NULL DEFAULT nextval('monitor_seq'),
	brand VARCHAR(100) NOT NULL,
	serialnumber INTEGER NOT NULL UNIQUE,
	model VARCHAR(100) NOT NULL
);
CREATE SEQUENCE keyboard_seq
 START WITH     1
 INCREMENT BY   1;
CREATE TABLE keyboards
(
	idkeyboard INTEGER PRIMARY KEY NOT NULL DEFAULT nextval('keyboard_seq'),
	brand VARCHAR(100) NOT NULL,
	serialnumber INTEGER NOT NULL UNIQUE,
	model VARCHAR(100) NOT NULL
);
CREATE SEQUENCE orders_seq
 START WITH     1
 INCREMENT BY   1;
CREATE TABLE orders
(
	idorder INTEGER PRIMARY KEY NOT NULL DEFAULT nextval('orders_seq'),
	description VARCHAR(100) NOT NULL
);
CREATE SEQUENCE computer_seq
 START WITH     1
 INCREMENT BY   1;
CREATE TABLE computer
(
    idcomputer INTEGER PRIMARY KEY NOT NULL DEFAULT nextval('computer_seq'),
    brand VARCHAR(100) NOT NULL,
	serialnumber INTEGER NOT NULL UNIQUE,
	idorder INTEGER NOT NULL REFERENCES order(idorder),
    idkeyboard INTEGER NOT NULL REFERENCES keyboards(idkeyboard),
	idmouse INTEGER NOT NULL REFERENCES mouses(idmouse),
	idmonitor INTEGER NOT NULL REFERENCES monitors(idmonitor)
	
);

