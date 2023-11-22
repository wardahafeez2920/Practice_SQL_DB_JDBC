SELECT B.name,BC.name
FROM books B
         INNER JOIN book_categories BC
                    ON B.book_category_id=BC.id;

-- US01 -1
    select  count(id) from users; -- 4891

    select count(distinct id) from users; -- 4891


select bc.name,count(*) from book_borrow bb
                                 inner join books b on bb.book_id = b.id
                                 inner join book_categories bc on b.book_category_id=bc.id
group by name order by 2 desc;


-- US01 -2
select * from users;


-- US02
-- -- is returned column shows whether book returned the library
    -- 0 NOT RETURNED
    -- 1 RETURNED
select count(*) from book_borrow
where is_returned=0;

select count(*) from book_borrow
where returned_date IS NULL;

-- US03
select name from book_categories;

select b.name,isbn,author ,b.description,bc.name
from books b inner join book_categories bc
    on b.book_category_id=bc.id
where b.name='Clean Code Nataliia';

