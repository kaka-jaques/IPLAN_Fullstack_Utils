package br.com.kalil.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import br.com.kalil.objects.Login;
import br.com.kalil.repository.LoginRepository;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/login")
public class LoginController {

	@Autowired
	private LoginRepository loginRep;
	
	@PostMapping()
	@ResponseStatus(code = HttpStatus.OK)
	public @ResponseBody boolean login (@RequestBody Login credentials) {
		
		Login response = loginRep.getProtectedLogin();
		
		if(response == null) return false;
		
	}
	
}
