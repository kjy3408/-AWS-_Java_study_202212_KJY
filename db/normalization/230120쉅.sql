/*=============<< select insert >>=================*/
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
    
select * from publisher_mst;

/*===============<< select update >>=================*/

update library_mst lm
set lm.저작자 = (select
					author_id
				from
					author_mst
				where
					author_name = lm.저작자);
                    
select author_id from author_mst;


update library_mst, author_mst
set
	저작자 = author_id
where
	저작자 = author_name;


select * from library_mst ;

select
	*
from
	library_mst lm
    left outer join author_mst on(am.author_id = lm.저작자);
    
select * from library_mst;

delete 
from
	library_mst
where
	순번 > 1000;

update library_mst, publisher_mst
set
	출판사 = publisher_id
where
	출판사 = publisher_name;

select * from library_mst;

select
	*
from
	library_mst
order by
	저작자 desc,
    출판사 desc;




