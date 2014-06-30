package com.guestbook;

import java.util.List;
import javax.sql.DataSource;


public interface PostingDAO {
	
	   public void setDataSource(DataSource ds);
	   
	   public void create(String Email, String Password, String Content);
	   
	   public void update(String id, String Email, String Content);
	   
	   public List<Posting> listPostings();
	   
}