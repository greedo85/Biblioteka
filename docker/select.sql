/* Pokaż mi ile książek ma każdy autor */

SELECT author_id, count(*) as 'ile książek' FROM `book` group by author_id;

/* wyświetl książki autora o id =2 */

SELECT * FROM book where author_id=2;

/* wyświetl dane autorów książek */

SELECT * from book JOIN author ON author_id = author.id

/*  pokaż wszystkie książki które mają ilość większą iż 10 i których autorem jest Sienkiewicz*/


SELECT * from book JOIN author ON author_id=author.id
where author_id=3 AND amount>10

