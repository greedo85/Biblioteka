/* Pokaż mi ile książek ma każdy autor */

SELECT author_id, count(*) as 'ile książek' FROM `library` group by author_id;

/* wyświetl książki autora o id =2 */

SELECT * FROM book where author_id=2;

/* wyświetl dane autorów książek */

SELECT * from book JOIN author ON author_id = author.id

/*  pokaż wszystkie książki które mają ilość większą iż 10 i których autorem jest Sienkiewicz*/


SELECT * from book JOIN author ON author_id=author.id
where author_id=3 AND amount>10


------- nowe podejście
/* Pokaż mi ile książek ma każdy autor */

SELECT author_id, count(*) as 'ile książek' FROM `library` group by author_id;

/* wyświetl książki autora o id =2 */

SELECT * FROM library where author_id=2;

/* wyświetl dane autorów książek i tytuły */

SELECT * from library JOIN author ON author_id=author.id JOIN book ON book_id=book.id 

/*  pokaż wszystkie książki które mają ilość większą iż 10 i których autorem jest Sienkiewicz*/
SELECT * from library JOIN author ON author_id=author.id JOIN book ON book_id=book.id  where author_id=3 AND amount >10