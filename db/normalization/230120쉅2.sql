/*============<< select >>===========*/
select * from student_mst;

/*전체 컬럼 조회*/
select
	 *
from
	student_mst;

/* 지정 컬럼 조회*/
select
	student_id,
    student_name,
    mentor_id
from 
	student_mst;
    
/* 임시 컬럼 추가 */
select 
	1 as num,
    '김준일' as name;
    
select 
	student_id,
    student_name,
    '김준일' as instructor_name
from
	student_mst;

/* 컬럼명을 임시로 바꾸는 방법 as(alias) 알리아스 */
select
	sm.student_id as studentId /*컬럼에는 생략하지않음 */
from
	student_mst sm; /*테이블에선 as 생략가능*/
    
/* 조회 조건 where */
select	/*순서 : from 1번, where 2번, select 3번*/
	*
from 
	student_mst
where/*조건: 멘토 id가 1인 학생*/
	mentor_id = (select
					mentor_id
				from
					mentor_mst
				where
					mentor_name = '문자영'); 

select
	student_id,
    student_name,
    mentor_id,
    (select 
		mentor_name 
	from 	
		mentor_mst 
    where 
		mentor_id = student_mst.mentor_id) as mentor_name
from
	student_mst;
    
/* 그룹으로 묶어서 조회하기 : group by*/

select
	count(mentor_id), 
    min(student_id),
    max(student_id),
    avg(student_id),
    sum(student_id),
	mentor_id
from
	student_mst
group by
	mentor_id;
    
/* 중복 제거 */
select distinct
	mentor_id
from
	student_mst;
	
/* 그룹으로 조회한 결괴에 조건주는 방법*/
select
	count(mentor_id) as mentor_count, 
    min(student_id),
    max(student_id),
    avg(student_id),
    sum(student_id),
	mentor_id
from
	student_mst
group by
	mentor_id
having
	mentor_count = 5; /*그룹으로 조회한 결과에 조건.(group by쓰고 난 후 씀)*/
    
/* 정렬 */
select 
	*
from
	student_mst
order by
	mentor_id ,
    student_id desc; /*desc 내림차순*/
    
/* 전체 조합 실습 */
select				/*5번*/
	count(*) as student_count,
    mentor_id
from				/*1번*/
	student_mst
where				/*2번*/
	student_id > 2
group by			/*3번*/
	mentor_id
having				/*4번*/	
	student_count = 1
order by 			/*6번*/
	mentor_id desc;
	
    

