use quanlysinhvien;

select * from `subject` order by `Credit` desc limit 1;

select `subject`.subid,`subject`.subname,`subject`.Credit,`subject`.Status from `subject` left join `mark` on `subject`.subid=`mark`.subid order by `Mark` desc limit 1;

select `student`.StudentId,`student`.StudentName,`student`.Address,`student`.phone,`student`.Status,`student`.classid,avg(`mark`.mark) as avg
from `student`
join `mark` on `student`.StudentId=`mark`.studentid
group by `mark`.studentid order by `mark`.mark desc