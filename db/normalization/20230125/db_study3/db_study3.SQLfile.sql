SHOW VARIABLES LIKE 'AUTOCOMMIT';
SET autocommit = 0;

START TRANSACTION; /*TRANSACTION 열어줌 / commit이 일어나야 닫힘*/

SAVEPOINT sp2; /*지금부터 내 작업은 여기서부터 시작이다. 라고 명시*/

INSERT INTO user_mst 
VALUES (0, 'ㄹㄹ', '1234', '김준일', 'ㅎㅎ@gmail.com');

SELECT * FROM user_mst;

/*ROLLBACK;*/ /*실행 전으로 완전 돌아감*/
ROLLBACK TO sp1; /*sp1 부터 작업해서 sp2까지로 저장함. (~~작업 전~~ sp1 ~~작업~~ sp2 */
/*creat table , rename, drop, truncate(테이블 내부의 정보만 없앤다) => ROLLBACK이 안된다. */

COMMIT; /*COMMIT을 하고나면 ROLLBACK이 되지않음. 정확히 확인 후 COMMIT을 해줘야함. COMMIT을 해줘야 TRANSATION이 닫힘.*/

/*start transaction, savepoint, 작업, rollback , commit*/