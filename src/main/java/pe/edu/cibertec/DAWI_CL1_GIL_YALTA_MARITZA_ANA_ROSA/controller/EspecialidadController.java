package pe.edu.cibertec.DAWI_CL1_GIL_YALTA_MARITZA_ANA_ROSA.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import pe.edu.cibertec.DAWI_CL1_GIL_YALTA_MARITZA_ANA_ROSA.model.bd.Especialidad;
import pe.edu.cibertec.DAWI_CL1_GIL_YALTA_MARITZA_ANA_ROSA.service.EspecialidadService;

@Controller
@RequestMapping("/Especialidad")
public class EspecialidadController {
	@Autowired
	private EspecialidadService especialidadService;
	
	@GetMapping("/frmListEspe")
	public String frmListEspe(Model model) {
		model.addAttribute("listaEspecialidad", especialidadService.listarEspecialidad());
		return "Especialidad/frmListEspe";
	}
	
	@GetMapping("/frmRegEspe")
	public String frmRegEspe(Model model) {
		model.addAttribute("espeForm", new Especialidad());
		model.addAttribute("visualizar", false);
		return "Especialidad/frmRegEspe";
	}
	
	@PostMapping("/frmRegEspe")
	public String registrarEspe(@ModelAttribute("espeForm") Especialidad especialidad, Model model) {
		String mensaje = "Especialidad registrado correctamente";
		try {
			especialidadService.registrarEspecialidad(especialidad);
		} catch (Exception e) {
			mensaje = "Especialidad no registrado";
		}
		model.addAttribute("espeForm", new Especialidad());
		model.addAttribute("visualizar", true);
		model.addAttribute("respuesta", mensaje);
		return "Especialidad/frmRegEspe";
	}
	
	
	
	
	
	
	
	
}
