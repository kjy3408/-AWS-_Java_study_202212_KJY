update publisher_mst
set
	publisher_year = '2023-01-25'
where
	publisher_id in (36, 37);
    
select
	*	
from
	publisher_mst;