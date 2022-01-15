use quanlysinhvien;
select student.* from student where student.StudentName like "h%";
select class.* from class where class.startdate between '2008-12-1' and '2008-12-31';
select subject.* from subject where subject.credit between 3 and 5;
SET SQL_SAFE_UPDATES = 0;
update student set classid=2 where studentname='Hung';