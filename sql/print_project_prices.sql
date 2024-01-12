select c.name,
 (select DATEDIFF(month, p.start_date, p.finish_date)) AS month_count,
 SUM(w. salary) as Total_Month_Salary,
 SUM(w. salary) * (select DATEDIFF(month, p.start_date, p.finish_date)) as project_price
 from project p
  join client c
   on p.client_id = c.id
  join project_worker pw
   on p.id = pw.project_id
  join worker w
   on pw.worker_id = w.id
 group by c.name, month_count
 order by month_count desc;