package edu.vista.ejemploWeb;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

import edu.vista.ejemploWeb.aplicacion.AplicacionConfiguracionContexto;
import edu.vista.ejemploWeb.web.WebConfiguracionContexto;


public class EnrutadorEjemploWeb extends AbstractAnnotationConfigDispatcherServletInitializer{

	@Override
	protected Class<?>[] getRootConfigClasses() {
		// TODO Auto-generated method stub
		return new Class<?>[] { AplicacionConfiguracionContexto.class };
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		// TODO Auto-generated method stub
		return new Class<?>[] { WebConfiguracionContexto.class };
	}

	@Override
	protected String[] getServletMappings() {
		// TODO Auto-generated method stub
		return new String[] {"/"};
	}

}
