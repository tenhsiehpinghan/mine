package idv.hsiehpinghan.web.controller;

import idv.hsiehpinghan.web.domain.Account;

import javax.security.sasl.AuthenticationException;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
@RequestMapping(value = "/login")
public class LoginController {
	public static final String ACCOUNT_ATTRIBUTE = "account";

	@RequestMapping(method = RequestMethod.GET)
	public String login() {
		return "login";
	}

	@RequestMapping(method = RequestMethod.POST)
	public String handleLogin(@RequestParam String username, @RequestParam String password, RedirectAttributes reAttrs, HttpSession session) {
		session.setAttribute(ACCOUNT_ATTRIBUTE, genAccount(username, password));
		return "redirect:/search";
	}
	
	private Account genAccount(String username, String password) {
		Account acc = new Account();
		acc.setUsername(username);
		acc.setPassword(password);
		return acc;
	}
}
