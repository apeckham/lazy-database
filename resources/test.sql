-- :name now :? :1
select now()

-- :name bigdata :? :raw
select 1 as x from generate_series(1, 100000000) s(i)