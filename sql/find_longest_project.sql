select top(1) with ties c.name, (select DATEDIFF(month, p.start_date, p.finish_date)) AS month_count from project p
 join client c on p.client_id = c.id
 group by c.name, month_count
 order by month_count desc;