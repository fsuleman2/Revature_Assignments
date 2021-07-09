select * from product p ;
select * from manufacturer m ;

-- print product with min rating
select name, rating from product where rating in
(select min(rating) from product);
-- print products which are above the avg cost of the total products
select * from product
where cost >(select avg(rating) from product);
-- print products which are having ratings below average ratings
select * from manufacturer ;
where rating <(select avg(rating) from product);

--UNION Operator print only distinct values 14 values
select name from product
union
select name from manufacturer;

--UNIONALL print all with duplicates 16 values
select name from product
union all
select name from manufacturer;

--like operator %
--this below query will print the names starts with s
select name from product
where name like 's%';
--this below query will print the names ends with s
select name from product
where name like '%s';

-- '%or%' Finds any values that have "or" in any position
-- '_r%' Finds any values that have "r" in the second position
--  'a_%' Finds any values that start with "a" and are at least 2 characters in length
-- 'a__%' Finds any values that start with "a" and are at least 3 characters in length
-- 'a%o' Finds any values that start with "a" and ends with "o"