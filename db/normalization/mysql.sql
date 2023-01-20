/*
	DML
    C: insert ~ into	데이터 추가
    R: select ~ from	데이터 조회
    U: update ~ set		데이터 수정
    D: delete ~ from	데이터 삭제
*/

/*============<< insert >>==============*/

select * from student_mst;

insert into 
	`db_study_explane`.`student_mst`
    (`student_id`, `student_name`)
values (4, '손지호');

insert into student_mst 
	(student_id,	student_name,	mentor_id)
values 
	(5,				'이강용',			10),
	(6,				'김준경',			10),
	(7,				'이현수',			10),
	(8,				'정의현',			10);

select * from student_mst;

insert into university_mst
values
	(4, '동서대'),
	(5, '서경대'),
    (6, '백석대'),
    (7, '고신대'),
    (8, '동아대');
select * from university_mst;

/*============<< update : 수정>>==============*/
select * from student_mst;
update student_mst
set
	student_name = '김재영',
	mentor_id = 15 /*멘토id 전부 15로 바꿔라... */
where 
	student_id = 5;/*중요함(어디를 바꿀것인지 Key값으로 접근해야 안전)*/

/*멘토 아이디가 10인 학생들의 멘토 아이디를 1로 바꿔라*/

update student_mst
set
	mentor_id = 1 /*set에서 쓰면 대입이고 where 에서쓰면 비교다*/
where 
	mentor_id = 10;
    
select * from student_mst;

/*============<< delete : 삭제>>==============*/
delete 
from 
	student_mst /*테이블 전체삭제(무조건 키값으로 지워주기)*/ 
where 
	student_id = 4 
and student_name = '손지호';

select * from student_mst;

delete
from 
	university_mst
where/* where은 key값이다. */
	university_id = 3
or 	university_id = 4 /*조건 university_id > 5  (5보다 큰것 지워라)*/
or	university_name = '고신대';

select * from university_mst;



