package com.guestbook;

import java.sql.ResultSet;
import java.sql.SQLException;


import org.springframework.jdbc.core.RowMapper;

public class PostingMapper implements RowMapper<Posting> {
   public Posting mapRow(ResultSet rs, int rowNum) throws SQLException {
      Posting posting = new Posting();
      
      
      posting.setEmail(rs.getString("email"));
      posting.setContent(rs.getString("content"));
      posting.setId(rs.getInt("posting_id"));
      posting.setPassword(rs.getString("password"));
      posting.setModifiedtime(rs.getDate("modified_time"));
      posting.setCreatedtime(rs.getDate("created_time"));
      
      return posting;
   }
}