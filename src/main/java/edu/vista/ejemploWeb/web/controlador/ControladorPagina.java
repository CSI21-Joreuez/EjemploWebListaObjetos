package edu.vista.ejemploWeb.web.controlador;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.cglib.core.Converter;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import Modelo.Empleado;

@Controller
public class ControladorPagina {

protected final Log logger = LogFactory.getLog(getClass());
public static final String RESULT_VIEW = "segunda";

@RequestMapping(value="/segunda")
	public ModelAndView gestionSolicitud( HttpServletRequest request) {

	String nombre = request.getParameter("nombre");
	String apellidos = request.getParameter("apellidos");
	String nivel_acceso = request.getParameter("nivel_acceso");
		
	
		
		Map<String, Object> empl= new HashMap<String,Object>();
		
		logger.info("Navegamos a la vista segunda");
		Map<String, Object> miModelo= new HashMap<String,Object>();
		List<Empleado> listaEmpleado = new ArrayList();
		Empleado em = new Empleado(nombre, apellidos, nivel_acceso);
		listaEmpleado.add(em);
		System.out.println(listaEmpleado.toString());
		empl.put("empleados", listaEmpleado);
		
		miModelo.put("mensaje", "Todo Ok");
		
		return new ModelAndView("segunda","empl",empl);
	}

}
