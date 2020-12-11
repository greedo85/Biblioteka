-------------author-----------------
INSERT into author (name, surname)
VALUE ("Maria", "Konopnicka"); 

INSERT into author (name, surname)
VALUE ("Adam", "Mickiewicz"); 

INSERT into author (name, surname)
VALUE ("Henryk", "Sienkiewicz"); 

INSERT into author (name, surname)
VALUE ("Bolesław", "Prus"); 

INSERT into author (name, surname)
VALUE ("Stephen", "King"); 

INSERT into author (name, surname)
VALUE ("Charles", "Bukowski");

INSERT INTO author (name, surname)
VALUE ("Adam", "Michnik");

---------------------book---------------------

INSERT INTO book (title, author_id, amount)
VALUE ("Nasza szkapa", 1, 34);

INSERT INTO book (title, author_id, amount)
VALUE ("Noc", 1, 3);

INSERT INTO book (title, author_id, amount)
VALUE ("Mendel Gdański", 1, 14);

INSERT INTO book (title, author_id, amount)
VALUE ("Rota", 1, 29);

INSERT INTO book (title, author_id, amount)
VALUE ("Pan Balcer w Brazylii", 1, 34);

INSERT INTO book (title, author_id, amount)
VALUE ("Pan Tadeusz", 2, 5);

INSERT INTO book (title, author_id, amount)
VALUE ("Dziady", 2, 89);

INSERT INTO book (title, author_id, amount)
VALUE ("Reduta Ordona", 2, 34);

INSERT INTO book (title, author_id, amount)
VALUE ("W pustyni i w puszczy", 3, 15);

INSERT INTO book (title, author_id, amount)
VALUE ("Ogniem i mieczem", 3, 3);

INSERT INTO book (title, author_id, amount)
VALUE ("Pan Wołodyjowski", 3, 9);

INSERT INTO book (title, author_id, amount)
VALUE ("Lśnienie", 5, 231);

INSERT INTO book (title, author_id, amount)
VALUE ("To", 5, 431);

INSERT INTO book (title, author_id, amount)
VALUE ("Carrie", 5, 51);

INSERT INTO book (title, author_id, amount)
VALUE ("Zielona Mila", 5, 201);

INSERT INTO book (title, author_id, amount)
VALUE ("Post Office ", 6, 121);

INSERT INTO book (title, author_id, amount)
VALUE ("Factotum ", 6, 211);

INSERT INTO book (title, author_id, amount)
VALUE ("Hollywood", 6, 131);

INSERT INTO book (title, author_id, amount)
VALUE ("Lalka", 4, 221);

---------------------library
---------------------po modyfikacji
INSERT INTO library (author_id, book_id) VALUE (3,9) 

INSERT INTO library (author_id, book_id) VALUE (3,10) 

INSERT INTO library (author_id, book_id) VALUE (3,11) 

INSERT INTO library (author_id, book_id) VALUE (5,12);
INSERT INTO library (author_id, book_id) VALUE (5,13);
INSERT INTO library (author_id, book_id) VALUE (5,14);
INSERT INTO library (author_id, book_id) VALUE (5,15);

INSERT INTO library (author_id, book_id) VALUE (6,16);
INSERT INTO library (author_id, book_id) VALUE (6,17);
INSERT INTO library (author_id, book_id) VALUE (6,18);

INSERT INTO library (author_id, book_id) VALUE (4,19);








