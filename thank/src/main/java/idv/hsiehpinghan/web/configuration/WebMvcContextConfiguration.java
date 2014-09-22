package idv.hsiehpinghan.web.configuration;

import idv.hsiehpinghan.web.converter.StringToEntityConverter;
import idv.hsiehpinghan.web.domain.Category;

import org.springframework.context.MessageSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ResourceBundleMessageSource;
import org.springframework.format.FormatterRegistry;
import org.springframework.format.datetime.DateFormatter;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.view.JstlView;
import org.springframework.web.servlet.view.UrlBasedViewResolver;

@Configuration
@EnableWebMvc
@ComponentScan(basePackages = { "idv.hsiehpinghan.web" })
 public class WebMvcContextConfiguration extends WebMvcConfigurerAdapter {
	@Bean
	public ViewResolver setupViewResolver() {
		UrlBasedViewResolver resolver = new UrlBasedViewResolver();
		resolver.setPrefix("/WEB-INF/view/");
		resolver.setSuffix(".jsp");
		resolver.setViewClass(JstlView.class);
		return resolver;
	}

	@Bean
	public StringToEntityConverter categoryConverter() {
		return new StringToEntityConverter(Category.class);
	}
	
	@Bean
	public MessageSource messageSource() {
	    ResourceBundleMessageSource messageSource = new ResourceBundleMessageSource();
	    messageSource.setBasename("messages");
	    return messageSource;
	}
	
	@Override
	public void addResourceHandlers(ResourceHandlerRegistry registry) {
		registry.addResourceHandler("/resource/**").addResourceLocations(
				"/resource/");
	}
	
	@Override
	public void addFormatters(final FormatterRegistry registry) {
		registry.addConverter(categoryConverter());
		registry.addFormatter(new DateFormatter("dd-MM-yyyy"));
	}
}
