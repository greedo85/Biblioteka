CREATE TABLE book 
( 
id INTEGER PRIMARY KEY AUTO_INCREMENT,
title varchar(255) NOT NULL UNIQUE,
author_id INT NOT NULL,
amount INTEGER,
CONSTRAINT FK_book_author FOREIGN KEY (author_id) REFERENCES author(id)
);

CREATE TABLE author 
(
id INTEGER PRIMARY KEY AUTO_INCREMENT,
name varchar(128) NOT NULL,
surname varchar(128) NOT NULL
);

CREATE TABLE library
(
id INTEGER PRIMARY KEY AUTO_INCREMENT,
author_id INTEGER NOT NULL,
book_id INTEGER UNIQUE,
CONSTRAINT FK_library_author FOREIGN KEY (author_id) REFERENCES author(id),
CONSTRAINT FK_library_book FOREIGN KEY (book_id) REFERENCES book(id)
);

----------------po modyfikacji
/* usuwanie ograniczeń klucza obcego */

ALTER TABLE book DROP FOREIGN KEY constraint_name

/* usuwanie kolumny author_id  */

ALTER TABLE book DROP COLUMN author_id

/* ustawienie UNIQUE na kolumnę book_id, ponieważ tytuł nie może być przypisany do wielu autorów */
ALTER TABLE library ADD UNIQUE(book_id)