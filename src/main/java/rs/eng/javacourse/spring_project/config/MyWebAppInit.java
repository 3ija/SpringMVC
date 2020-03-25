package rs.eng.javacourse.spring_project.config;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

public class MyWebAppInit implements WebApplicationInitializer {

	@Override
	public void onStartup(ServletContext servletContext) throws ServletException {
		System.out.println("=====================================================");
		System.out.println("MyWebAppInit onStartup(ServletContext servletContext)");
		System.out.println("=====================================================");
		
		AnnotationConfigWebApplicationContext webApplicationContext = new AnnotationConfigWebApplicationContext();
		webApplicationContext.register(MyWebContextConfig.class);
		webApplicationContext.setServletContext(servletContext);
		
		ServletRegistration.Dynamic dispatcherServlet = 
				servletContext.addServlet("mySpringDispatcherServlet",
						new DispatcherServlet(webApplicationContext));
		dispatcherServlet.addMapping("/");
		dispatcherServlet.setLoadOnStartup(1);
	}
	
	
	
}
