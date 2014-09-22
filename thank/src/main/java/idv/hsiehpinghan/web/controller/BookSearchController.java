package idv.hsiehpinghan.web.controller;

import idv.hsiehpinghan.web.criteria.BookSearchCriteria;
import idv.hsiehpinghan.web.domain.Book;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class BookSearchController {

	// @RequestMapping(value = "/search", method = RequestMethod.GET)
	// public String list(Model model, BookSearchCriteria criteria) {
	//
	// System.out.println(criteria.getTitle());
	//
	// model.addAttribute(genBooks());
	// return "search";
	// }

	@RequestMapping(value = "/search", method = RequestMethod.GET)
	public Collection<Book> list(BookSearchCriteria criteria) {
		
		System.out.println(criteria.getTitle());
		
		return Book.genBooks();
	}

}
