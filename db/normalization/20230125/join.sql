select
	순번,
    도서관명,
    구분,
    도서명,
    저작자,
    (select author_name from author_mst where author_id = 저작자) as 저작자명, /*단순 값 추가, 어디선가 찾아오는게 아님! select엔 자유롭게 데이터를 넣을 수 있음.*/
    출판사,
    (select publisher_name from publisher_mst where publisher_id = 출판사) as 출판사명, /* "publisher_id < 출판사"=> 한 행에 여러개의 값이 나오기 때문에 에러발생.*/
    (select publisher_year from publisher_mst where publisher_id = 출판사) as 출판사설립일,
    발행연도,
    청구기호
from
	library_mst;
set profiling = 1;
set profiling_history_size = 30;

/*==================================< join >====================================*/
insert into library_mst
values (0, '테스트도서관', '999(테스트)', '테스트도서명', '9999', '9999', '2023', '999.9-테99ㅌ');

/*가장 기본 join (모든 경우의 수 다 나옴)*/
select 
	*
from
	library_mst lm,
    author_mst am;
  
/*inner join => 중복되는 것 출력(교집합 부분)*/
select 
	*
from
	library_mst lm /*첫번째 from줄이 master table이다.(inner, outer join 일떄 쉽표 없애야됨*/
	inner join publisher_mst pm on(pm.publisher_id = lm.출판사) /*pm.조회하고자 하는 녀석의 key 값 = lm. 조회하고자 하는 녀셕*/
order by
	lm.순번 desc;


/*==========================<left outer>===========================*/
select 
	*
from
	library_mst lm /*master table 기준이 되는 table*/
	left outer join publisher_mst pm on(pm.publisher_id = lm.출판사) 
order by
	lm.순번 desc;
    
    
    
select 
	*
from
	library_mst lm /*master table 기준이 되는 table*/
	left outer join publisher_mst pm on(pm.publisher_id = lm.출판사) 
where
	pm.publisher_id is null
order by
	lm.순번 desc;
    
    
select 
	lm.순번,
    lm.도서관명,
    lm.구분,
    lm.도서명,
    lm.출판사,
    pm.publisher_name,
    pm.publisher_year
from
	library_mst lm /*master table 기준이 되는 table*/
	left outer join publisher_mst pm on(pm.publisher_id = lm.출판사) 
order by
	lm.순번 desc;

show profiles;

    
    
