SELECT * FROM db_study3.library_mst;

SELECT * FROM library_mst;

select
	*
from
	library_mst lm
    left outer join author_mst am on(am.author_id = lm.저작자)