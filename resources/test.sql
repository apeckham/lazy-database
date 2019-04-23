-- :name now :? :1
select now()

-- :name bigdata :? :raw
select
  left(md5(i::text), 10),
  md5(random()::text),
  md5(random()::text),
  left(md5(random()::text), 4)
from generate_series(1, 100000000) s(i)