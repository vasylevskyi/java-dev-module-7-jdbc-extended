select top (1) with ties c.name, count(*) AS project_count from project p join client c on p.client_id = c.id
 group by client_id
 order by count(*)
 desc;