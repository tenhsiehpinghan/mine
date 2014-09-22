package idv.hsiehpinghan.web.initializer;

import idv.hsiehpinghan.web.configuration.WebMvcContextConfiguration;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

public class WebMvcInitializer implements WebApplicationInitializer {
	@Override
	public void onStartup(ServletContext servletContext)throws ServletException {
		registerDispatcherServlet(servletContext);
	}

	private void registerDispatcherServlet(final ServletContext servletContext) {
		WebApplicationContext dispatcherContext = createContext(WebMvcContextConfiguration.class);
		DispatcherServlet dispatcherServlet = new DispatcherServlet(dispatcherContext);
		ServletRegistration.Dynamic dynamic;
		dynamic = servletContext.addServlet("dispatcher", dispatcherServlet);
		dynamic.setLoadOnStartup(1);
		dynamic.addMapping("/");
	}

	private WebApplicationContext createContext(
			final Class<?>... annotatedClasses) {
		AnnotationConfigWebApplicationContext context = new AnnotationConfigWebApplicationContext();
		context.register(annotatedClasses);
		return context;
	}
}
