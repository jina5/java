select s.sno, s.sname, m.major_name, s.score 
from STUDENT s, major m
where s.major_no=m.major_no;