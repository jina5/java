select s.sno, s.sname, m.major_name, s.score 
from STUDENT s, major m
where s.major_no=m.major_no;

delete student where sno like 1;
SELECT S.*, RANK() OVER (ORDER BY SCORE DESC) FROM STUDENT S;
