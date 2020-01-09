USE tommy;
CREATE TABLE `notice` (
  `NUM` int(10) NOT NULL AUTO_INCREMENT,
  `PASS` varchar(20) CHARACTER SET utf8 COLLATE utf8_bin NOT NULL,
  `NAME` varchar(20) CHARACTER SET utf8 COLLATE utf8_bin NOT NULL,
  `WDATE` date NOT NULL,
  `TITLE` varchar(40) CHARACTER SET utf8 COLLATE utf8_bin NOT NULL,
  `CONTENT` varchar(100) CHARACTER SET utf8 COLLATE utf8_bin NOT NULL,
  `COUNT` int(11) NOT NULL DEFAULT '0',
  PRIMARY KEY (`NUM`)
) ENGINE=InnoDB AUTO_INCREMENT=43 DEFAULT CHARSET=utf8 COLLATE=utf8_binnotice;



INSERT INTO `notice` (`NUM`,`PASS`,`NAME`,`WDATE`,`TITLE`,`CONTENT`,`COUNT`) VALUES (1,'guest','Mel Gibson','2019-09-23','게시판 연습1','게시판연습입니다.',14);
INSERT INTO `notice` (`NUM`,`PASS`,`NAME`,`WDATE`,`TITLE`,`CONTENT`,`COUNT`) VALUES (2,'guest','Mel Gibson','2019-09-23','게시판 연습2','게시판연습입니다.',1);
INSERT INTO `notice` (`NUM`,`PASS`,`NAME`,`WDATE`,`TITLE`,`CONTENT`,`COUNT`) VALUES (3,'guest','Mel Gibson','2019-09-23','게시판 연습3','게시판연습입니다.',1);
INSERT INTO `notice` (`NUM`,`PASS`,`NAME`,`WDATE`,`TITLE`,`CONTENT`,`COUNT`) VALUES (4,'guest','Mel Gibson','2019-09-23','게시판 연습4','게시판연습입니다.',3);
INSERT INTO `notice` (`NUM`,`PASS`,`NAME`,`WDATE`,`TITLE`,`CONTENT`,`COUNT`) VALUES (5,'guest','Mel Gibson','2019-09-23','게시판 연습5','게시판연습입니다.',4);
INSERT INTO `notice` (`NUM`,`PASS`,`NAME`,`WDATE`,`TITLE`,`CONTENT`,`COUNT`) VALUES (6,'guest','Mel Gibson','2019-09-23','게시판 연습6','게시판연습입니다.',0);
INSERT INTO `notice` (`NUM`,`PASS`,`NAME`,`WDATE`,`TITLE`,`CONTENT`,`COUNT`) VALUES (7,'guest','Mel Gibson','2019-09-23','게시판 연습7','게시판연습입니다.',0);
INSERT INTO `notice` (`NUM`,`PASS`,`NAME`,`WDATE`,`TITLE`,`CONTENT`,`COUNT`) VALUES (8,'guest','Mel Gibson','2019-09-23','게시판 연습8','게시판연습입니다.',0);
INSERT INTO `notice` (`NUM`,`PASS`,`NAME`,`WDATE`,`TITLE`,`CONTENT`,`COUNT`) VALUES (9,'guest','Mel Gibson','2019-09-23','게시판 연습9','게시판연습입니다.',0);
INSERT INTO `notice` (`NUM`,`PASS`,`NAME`,`WDATE`,`TITLE`,`CONTENT`,`COUNT`) VALUES (10,'guest','Mel Gibson','2019-09-23','게시판 연습10','게시판연습입니다.',0);
INSERT INTO `notice` (`NUM`,`PASS`,`NAME`,`WDATE`,`TITLE`,`CONTENT`,`COUNT`) VALUES (11,'guest','Mel Gibson','2019-09-23','게시판 연습11','게시판연습입니다.',9);
INSERT INTO `notice` (`NUM`,`PASS`,`NAME`,`WDATE`,`TITLE`,`CONTENT`,`COUNT`) VALUES (12,'guest','Mel Gibson','2019-09-23','게시판 연습12','게시판연습입니다.',2);
INSERT INTO `notice` (`NUM`,`PASS`,`NAME`,`WDATE`,`TITLE`,`CONTENT`,`COUNT`) VALUES (13,'guest','Mel Gibson','2019-09-23','게시판 연습13','게시판연습입니다.',0);
INSERT INTO `notice` (`NUM`,`PASS`,`NAME`,`WDATE`,`TITLE`,`CONTENT`,`COUNT`) VALUES (14,'guest','Mel Gibson','2019-09-23','게시판 연습14','게시판연습입니다.',1);
INSERT INTO `notice` (`NUM`,`PASS`,`NAME`,`WDATE`,`TITLE`,`CONTENT`,`COUNT`) VALUES (15,'guest','Mel Gibson','2019-09-23','게시판 연습15','게시판연습입니다.',0);
INSERT INTO `notice` (`NUM`,`PASS`,`NAME`,`WDATE`,`TITLE`,`CONTENT`,`COUNT`) VALUES (16,'guest','Mel Gibson','2019-09-23','게시판 연습16','게시판연습입니다.',1);
INSERT INTO `notice` (`NUM`,`PASS`,`NAME`,`WDATE`,`TITLE`,`CONTENT`,`COUNT`) VALUES (17,'guest','Mel Gibson','2019-09-23','게시판 연습17','게시판연습입니다.',0);
INSERT INTO `notice` (`NUM`,`PASS`,`NAME`,`WDATE`,`TITLE`,`CONTENT`,`COUNT`) VALUES (18,'guest','Mel Gibson','2019-09-23','게시판 연습18','게시판연습입니다.',0);
INSERT INTO `notice` (`NUM`,`PASS`,`NAME`,`WDATE`,`TITLE`,`CONTENT`,`COUNT`) VALUES (19,'guest','Mel Gibson','2019-09-23','게시판 연습19','게시판연습입니다.',1);
INSERT INTO `notice` (`NUM`,`PASS`,`NAME`,`WDATE`,`TITLE`,`CONTENT`,`COUNT`) VALUES (20,'guest','Mel Gibson','2019-09-23','게시판 연습20','게시판연습입니다.',1);
INSERT INTO `notice` (`NUM`,`PASS`,`NAME`,`WDATE`,`TITLE`,`CONTENT`,`COUNT`) VALUES (21,'guest','Mel Gibson','2019-09-23','게시판 연습21','게시판연습입니다.',1);
INSERT INTO `notice` (`NUM`,`PASS`,`NAME`,`WDATE`,`TITLE`,`CONTENT`,`COUNT`) VALUES (22,'guest','Mel Gibson','2019-09-23','게시판 연습22','게시판연습입니다.',0);
INSERT INTO `notice` (`NUM`,`PASS`,`NAME`,`WDATE`,`TITLE`,`CONTENT`,`COUNT`) VALUES (23,'jfho','가','2019-09-23','update test','contenet test',1);
INSERT INTO `notice` (`NUM`,`PASS`,`NAME`,`WDATE`,`TITLE`,`CONTENT`,`COUNT`) VALUES (26,'fqwefqwe','fqefq','2019-09-23','제목이랍니다','내용이에요',14);
INSERT INTO `notice` (`NUM`,`PASS`,`NAME`,`WDATE`,`TITLE`,`CONTENT`,`COUNT`) VALUES (38,'1234','갓중기','2019-10-22','오늘도 테스트','언제쯤이면.....',24);
INSERT INTO `notice` (`NUM`,`PASS`,`NAME`,`WDATE`,`TITLE`,`CONTENT`,`COUNT`) VALUES (40,'123','갓중기','2019-10-28','1028 테스트','오늘도 테스트 성공 나는 갓중기',1);
INSERT INTO `notice` (`NUM`,`PASS`,`NAME`,`WDATE`,`TITLE`,`CONTENT`,`COUNT`) VALUES (41,'1123','스스스','2019-10-28','테스스스스스','tmtmttmtmtmtmtmtmtmtm',2);
