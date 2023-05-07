package pe.edu.cibertec.DAWI_CL1_GIL_YALTA_MARITZA_ANA_ROSA.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
	@GetMapping("/home")
	public String home() {
		return "home";
	}
}
