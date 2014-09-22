package idv.hsiehpinghan.web.controller;

import idv.hsiehpinghan.web.domain.Subscriber;
import idv.hsiehpinghan.web.domain.Subscriber.Frequency;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class FormController {

	@ModelAttribute("frequencies")
	public Frequency[] frequencies() {
		return Frequency.values();
	}

	@RequestMapping(value="form", method=RequestMethod.GET)
	public String loadFormPage(Model m) {
		Subscriber subscriber = new Subscriber();
//		subscriber.setReceiveNewsletter(true);
//		subscriber.setNewsletterFrequency(Frequency.HOURLY);
		m.addAttribute("subscriber", subscriber);
		return "formPage";
	}
	
//	@RequestMapping(value="form", method=RequestMethod.POST)
//	public String submitForm(@ModelAttribute Subscriber subscriber, Model m) {
//		m.addAttribute("message", "Successfully saved person: " + subscriber.toString());
//		return "formPage";
//	}
	
	@RequestMapping(value="form", method=RequestMethod.POST)
	public String submitForm(@Valid Subscriber subscriber, BindingResult result, Model m) {
		if (result.hasErrors()) {
			return "formPage";
		}

		m.addAttribute("message", "Successfully saved person: " + subscriber.toString());
		return "formPage";
	}
}
