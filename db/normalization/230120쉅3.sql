select * from library_mst;

insert into author_mst 
	(author_name)
select distinct
	저작자
from
	library_mst
order by
	저작자;

select * from author_mst;

insert into publisher_mst
	(publisher_name)
select distinct
	출판사
from
	library_mst
order by
	출판사;



update library_mst, publisher_mst
set
	출판사 = publisher_id
where
	출판사 = publisher_name;
    
update library_mst, author_mst
set
	저작자 = author_id
where
	저작자 = author_name;
    
    select * from library_mst;
    
select
	*
from
	library_mst lm
    left outer join author_mst am on(am.author_id = lm.저작자)
    left outer join publisher_mst pm on(pm.publisher_id = lm.출판사);
    
/*===========================================================*/
select * from author_mst;
/*김주로 검색했을때 도서명이 나와야됨.*/ 


select * from library_mst;

select
	도서관명,
    도서명
from
	library_mst
where
	저작자 in (select
				author_id
			from 
				author_mst
			where
				author_name 
			like '김주%');
            
set profiling = 1;
set profiling_history_size = 30;

select
	도서관명,
    도서명,
    저작자
from
	library_mst
where
	저작자 in(select/*김주 라는 이름을 가진 id가 4개가 나온다. ( in: 각각중에 하나라도 포함되어있으면 true)*/
				author_id
			from
				author_mst
			where
				author_name like '%김주%'
			or author_name like '%김민%'); /*in속에 like가 두개 (or 사용)*/
            
            
            
            
select/*위와 같은 내용*/
	도서관명,
    도서명
from
	library_mst lm
    left outer join author_mst am on(am.author_id = lm.저작자)/*am.author_id값과 lm의 저작자와 같으면 붙여라*/
where
	am.author_name like '%김주%';

show profiles;

