package mx.edu.utez.talenting.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;



@Controller
@RequestMapping(value = "/talenting")
public class TalentingController {
	@GetMapping("/inicio")
	public String inicio(Model model) {
	
		

		return "index";

	}
	
	@GetMapping("/404")
	public String error404(Model model) {
	
		

		return "error_404";

	}
	@GetMapping("/500")
	public String error500(Model model) {
	
		

		return "error_500";

	}
	@GetMapping("/503")
	public String error503(Model model) {
	
		

		return "error_503";

	}
	@GetMapping("/login")
	public String login(Model model) {
	
		

		return "login";

	}
	
	@GetMapping("/password")
	public String password(Model model) {
	
		

		return "password";

	}
	
	@GetMapping("/inicioCandidato")
	public String inicioCandidato(Model model) {
	
		

		return "inicioCandidato";

	}
	@GetMapping("/crearCuenta")
	public String crearCuenta(Model model) {
	
		

		return "crearCuenta";

	}
	@GetMapping("/contactos")
	public String contactos(Model model) {
	
		

		return "contactos";

	}
	@GetMapping("/postulaciones")
	public String postulaciones(Model model) {
	
		

		return "postulaciones";

	}
	@GetMapping("/favoritos")
	public String favoritos(Model model) {
	
		

		return "favoritos";

	}
	@GetMapping("/perfil")
	public String perfil(Model model) {
	
		

		return "perfil";

	}
	@GetMapping("/perfilContacto")
	public String perfilContacto(Model model) {
	
		

		return "perfil-contacto";

	}
	
	@GetMapping("/vacante")
	public String vacante(Model model) {
	
		

		return "vacante";

	}
	@GetMapping("/inicioReclutador")
	public String inicioReclutador(Model model) {
	
		

		return "inicioReclutador";

	}
	
	@GetMapping("/crearCuentaReclutador")
	public String crearCuentaReclutador(Model model) {
	
		

		return "crearCuentaReclutador";

	}


}
