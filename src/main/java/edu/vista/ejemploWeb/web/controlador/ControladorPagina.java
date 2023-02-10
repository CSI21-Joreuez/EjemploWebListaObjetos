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
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.bind.annotation.RequestMethod;

import Modelo.Empleado;

@Controller
public class ControladorPagina {

Map<String, Object> miModelo= new HashMap<String,Object>();
protected final Log logger = LogFactory.getLog(getClass());
List<Empleado> listaEmpleado = new ArrayList<Empleado>();


@RequestMapping(value="/segunda")
	public ModelAndView gestionSolicitud() {
				
		logger.info("Navegamos a la vista segunda");
		Empleado em = new Empleado("Juan Carlos","Orea","Alto");
		listaEmpleado.add(em);
		System.out.println(listaEmpleado.toString());
		miModelo.put("mensaje", "Todo Ok");
		miModelo.put("listaEmpleado", listaEmpleado);
		return new ModelAndView("segunda","miModelo",miModelo);
	}
@RequestMapping(value="/guardar",method = RequestMethod.POST)
	public ModelAndView guardar(@ModelAttribute("empl") Empleado empl) {
		logger.info("Navegamos al guardar empleado");
    	listaEmpleado.add(empl);  
    	System.out.println(listaEmpleado.toString());
        miModelo.put("listaEmpleado", listaEmpleado);
    	return new ModelAndView("segunda", "miModelo", miModelo);
	}
    @RequestMapping(value="/navegacionFormulario")
    public String navegacionFormulario(Model modelo) {
        logger.info("Navegamos al formulario");
        Empleado em = new Empleado();
        modelo.addAttribute("empl", em);
        return "formulario";
    } 
}
