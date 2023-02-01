SELECT * FROM db_study3.library_mst;
CREATE VIEW library_view AS /*view를 만들겠다 아래 select의 결과를 view로 쓰겠다*/ /*자주 쓰는 select를 view로 빼버림(가짜 테이블을 만듬)*/
SELECT
	ROW_NUMBER() OVER(/*PARTITION BY 도서관명 */ORDER BY 도서관명) AS 도서관순번,
	도서관명
FROM
	library_mst
GROUP BY
	도서관명;