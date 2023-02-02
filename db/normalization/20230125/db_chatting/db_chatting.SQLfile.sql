SELECT * FROM user_mst;
SHOW VARIABLES LIKE 'AUTOCOMMIT';
SET AUTOCOMMIT = 0;

START TRANSACTION;

SAVEPOINT save1;

SELECT * FROM user_mst;

INSERT INTO user_mst VALUES (0, 'aafw', '1234', 'dwf', 'gga@gmail.com');

UPDATE 
	user_mst 
SET 
	user_mst.name = 'dfwwf'
WHERE
	user_mst.name = 'dwf';

SELECT * FROM user_mst;

ROLLBACK TO save1;

