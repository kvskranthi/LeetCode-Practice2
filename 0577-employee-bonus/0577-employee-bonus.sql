SELECT name, bonus from Employee e
left join Bonus b
on e.empId = b.empId
WHERE bonus <1000 OR bonus is null ;