package idv.hsiehpinghan.web.controller;

import idv.hsiehpinghan.web.domain.Book;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class BookDetailController {
	@RequestMapping(value = "/detail/{bookId}")
	public String details(@PathVariable("bookId") long bookId, Model model) {

		System.out.println(bookId);

		model.addAttribute(Book.genBook());
		return "detail";
	}
}
