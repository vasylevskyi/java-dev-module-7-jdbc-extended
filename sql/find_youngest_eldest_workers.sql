select replace(w.level, w.level, 'Eldest') as type, w.name, w.birthday from worker w
 where w.birthday = (select MIN(birthday) from worker)
 union
 select replace(w.level, w.level, 'Youngest') as type, w.name, w.birthday from worker w
 where w.birthday = (select MAX(birthday) from worker);