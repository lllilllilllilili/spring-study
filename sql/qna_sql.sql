create table QNA 
(num int primary key auto_increment, 
 pass varchar(20) not null , 
 name text not null,
 wdate date,
 title varchar(20) not null,
 content text not null,
 ans text not null);
 
  INSERT INTO QNA VALUES('1','ssafy','ssafy',sysdate(),'ssafy','ssafy','ssafy');
  INSERT INTO QNA VALUES(null,'ssafy2','ssafy2',sysdate(),'ssafy2','ssafy2','ssafy2');
  INSERT INTO QNA VALUES(null,'승완','승완',sysdate(),'오늘 점심은 뭐에요','점심이 궁금해','저두 몰라요');