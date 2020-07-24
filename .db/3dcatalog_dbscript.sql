DROP DATABASE IF EXISTS 3dcatalog;
SET NAMES utf8;
CREATE DATABASE 3dcatalog;
USE 3dcatalog;

CREATE TABLE GENERATION(
	generation_id   Int  Auto_increment  NOT NULL,
	generation_name Varchar(30) NOT NULL,
    CONSTRAINT GENERATION_PK PRIMARY KEY (generation_id)
)ENGINE=InnoDB;

CREATE TABLE GENDER(
	gender_id   Int  Auto_increment  NOT NULL,
	gender_name Varchar(30) NOT NULL,
    CONSTRAINT GENDER_PK PRIMARY KEY (gender_id)
)ENGINE=InnoDB;

CREATE TABLE SOFTWARE(
	software_id   Int  Auto_increment  NOT NULL,
	software_name Varchar(30) NOT NULL,
    CONSTRAINT SOFTWARE_PK PRIMARY KEY (software_id)
)ENGINE=InnoDB;

CREATE TABLE TYPE(
	type_id   Int  Auto_increment  NOT NULL,
	type_name Varchar(30) NOT NULL,
    CONSTRAINT TYPE_PK PRIMARY KEY (type_id)
)ENGINE=InnoDB;

CREATE TABLE CREATOR(
	vendor_id   Int  Auto_increment  NOT NULL,
	vendor_name Varchar(30) NOT NULL,
    CONSTRAINT CREATOR_PK PRIMARY KEY (vendor_id)
)ENGINE=InnoDB;

CREATE TABLE WEBSITE(
	website_id   Int  Auto_increment  NOT NULL,
	website_name Varchar(100) NOT NULL,
    website_url Varchar(200) NOT NULL,
    CONSTRAINT WEBSITE_PK PRIMARY KEY (website_id)
)ENGINE=InnoDB;

CREATE TABLE CONTENT(
	content_id                Int  Auto_increment  NOT NULL,
	content_sku               Varchar(15) NOT NULL,
	content_name              Varchar(100) NOT NULL,
	content_isactive          Bool NOT NULL,
    content_url               Varchar(2000) NOT NULL,
	type_id                   Int NOT NULL,
    website_id                Int,
	gender_id   Int,
    CONSTRAINT CONTENT_PK PRIMARY KEY (content_id),
    CONSTRAINT CONTENT_TYPE_FK FOREIGN KEY (type_id) REFERENCES TYPE(type_id),
	CONSTRAINT CONTENT_WEBSITE_FK FOREIGN KEY (website_id) REFERENCES WEBSITE(website_id),
    CONSTRAINT CONTENT_GENDER_FK FOREIGN KEY (gender_id) REFERENCES GENDER(gender_id)
)ENGINE=InnoDB;

CREATE TABLE belongs_to(
	generation_id Int NOT NULL,
	content_id     Int NOT NULL,
    CONSTRAINT belongs_to_PK PRIMARY KEY (generation_id,content_id),
    CONSTRAINT belongs_to_GENERATION_FK FOREIGN KEY (generation_id) REFERENCES GENERATION(generation_id),
    CONSTRAINT belongs_to_CONTENT_FK FOREIGN KEY (content_id) REFERENCES CONTENT(content_id)
)ENGINE=InnoDB;

CREATE TABLE is_compatible_with(
	software_id Int NOT NULL,
	content_id  Int NOT NULL,
    CONSTRAINT is_compatible_with_PK PRIMARY KEY (software_id,content_id),
    CONSTRAINT is_compatible_with_SOFTWARE_FK FOREIGN KEY (software_id) REFERENCES SOFTWARE(software_id),
    CONSTRAINT is_compatible_with_CONTENT_FK FOREIGN KEY (content_id) REFERENCES CONTENT(content_id)
)ENGINE=InnoDB;

CREATE TABLE is_made_by(
	content_id Int NOT NULL,
	vendor_id  Int NOT NULL,
    CONSTRAINT is_made_by_PK PRIMARY KEY (content_id,vendor_id),
    CONSTRAINT is_made_by_CONTENT_FK FOREIGN KEY (content_id) REFERENCES CONTENT(content_id),
    CONSTRAINT is_made_by_CREATOR_FK FOREIGN KEY (vendor_id) REFERENCES CREATOR(vendor_id)
)ENGINE=InnoDB;