package com.guestbook;

import java.util.List;
import javax.sql.DataSource;
import org.springframework.jdbc.core.JdbcTemplate;


public class PostingJDBCTemplate implements PostingDAO {
   private DataSource dataSource;
   private JdbcTemplate jdbcTemplateObject;
   
   public void setDataSource(DataSource dataSource) {
      this.dataSource = dataSource;
      this.jdbcTemplateObject = new JdbcTemplate(dataSource);
   }

   public void create(String Email, String Password, String Content) {
      String SQL = "insert into Postings (password, content, email, created_time) values (?, ?, ?, now())";
      
      jdbcTemplateObject.update( SQL, Password, Content, Email);
      // System.out.println("Created Record Name = " + name + " Age = " + age);
      return;
   }

   public List<Posting> listPostings() {
      String SQL = "select * from Postings order by posting_id DESC";
      List <Posting> postings = jdbcTemplateObject.query(SQL, 
                                new PostingMapper());
      return postings;
   }
   
  



}