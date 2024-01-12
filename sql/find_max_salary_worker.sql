select name, salary FROM worker WHERE salary = (select MAX(salary) FROM worker)
    