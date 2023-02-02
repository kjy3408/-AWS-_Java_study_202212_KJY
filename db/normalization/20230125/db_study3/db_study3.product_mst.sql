CREATE INDEX product_id ON product_mst(product_code);

SHOW INDEX FROM product_mst;

-- alter table 수정

alter table product_mst
add unique product_name(product_name);

alter table product_mst
drop index product_id1;

select * from product_mst;
