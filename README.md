NHN_Ent-guest_book
==================

implementation of guestbook.

mysql과 spring framework를 이용하여 최소로 구현했습니다.  
cubrid, ibatis를 연동하여 나중에 커밋할 예정입니다.  

데이터베이스 커넥션 관련 객체와 DAO는 Guestbook/WEB-INF/Guestbook-servlet.xml에 bean으로 등록되어있습니다.  
mysql user id와 password를 해당 데스크탑에 맞게 잘 수정하시면 됩니다.  
mysql에 Guestbook 데이터베이스와 이 데이터베이스 안에 Postings 테이블이 있다고 가정합니다.  

column들은 다음과 같습니다.  
```
+---------------+--------------+------+-----+---------+----------------+  
| Field         | Type         | Null | Key | Default | Extra          |  
+---------------+--------------+------+-----+---------+----------------+  
| posting_id    | int(11)      | NO   | PRI | NULL    | auto_increment |  
| password      | varchar(15)  | NO   |     | NULL    |                |  
| content       | varchar(500) | NO   |     | NULL    |                |  
| created_time  | datetime     | YES  |     | NULL    |                |  
| modified_time | datetime     | YES  |     | NULL    |                |  
| email         | varchar(30)  | NO   |     | NULL    |                |  
+---------------+--------------+------+-----+---------+----------------+  
```