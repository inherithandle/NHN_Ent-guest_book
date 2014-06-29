package com.guestbook;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.ui.ModelMap;
import org.springframework.web.servlet.ModelAndView;

import com.guestbook.PostingJDBCTemplate;

import java.util.List;

@Controller
public class GuestbookController { 
	
	@Autowired
	private PostingJDBCTemplate postingJDBCTemplate;
	
	/*
	@RequestMapping(method = RequestMethod.GET)
	public String printHello(ModelMap model) {
	model.addAttribute("message", "Hello Spring MVC Framework!");
	
	
	List<Posting> postings = postingJDBCTemplate.listPostings();
	model.addAttribute("postings", postings);
	return "hello";
	}
	*/
	
	@RequestMapping(value = "/hello", method = RequestMethod.GET)
	public ModelAndView listPostings(ModelMap model) {
		
		List<Posting> postings = postingJDBCTemplate.listPostings();
		model.addAttribute("postings", postings);
		
		return new ModelAndView( "hello","posting", new Posting() );
	}
	
	@RequestMapping(value = "/hello", method = RequestMethod.POST)
	public String Afterinsert(@ModelAttribute("posting")Posting posting, BindingResult result, ModelMap model) {
		
		
		System.out.println("hello post!");
		System.out.println(posting.getEmail());
		System.out.println(posting.getContent());
		System.out.println(posting.getPassword());
		
		// execute insert query.
		postingJDBCTemplate.create( posting.getEmail(), posting.getPassword(), posting.getContent());
		
		List<Posting> postings = postingJDBCTemplate.listPostings();
		model.addAttribute("postings", postings);
		
		return "hello";
	}
	
	/*
	 * 
	 * 
	 * @RequestMapping(value = "/addStudent", method = RequestMethod.POST)
   public String addStudent(@ModelAttribute("SpringWeb")Student student, 
   ModelMap model) {
      model.addAttribute("name", student.getName());
      model.addAttribute("age", student.getAge());
      model.addAttribute("id", student.getId());
      
      return "result";
   }
   */
	 

}