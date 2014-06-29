package com.guestbook;

import java.util.List;
import javax.sql.DataSource;


public interface PostingDAO {
	/** 
	    * This is the method to be used to initialize
	    * database resources ie. connection.
	    */
	   public void setDataSource(DataSource ds);
	   /** 
	    * This is the method to be used to create
	    * a posting in the Posting table.
	    */
	   public void create(String Email, String Password, String Content);
	   
	   /** 
	    * This is the method to be used to list down
	    * all the records from the Postings table.
	    */
	   
	   public List<Posting> listPostings();
	   /** 
	    * This is the method to be used to delete
	    * a record from the Student table corresponding
	    * to a passed student id.
	    */
	   
}