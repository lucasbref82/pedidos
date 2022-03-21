package br.com.pedidos.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.pedidos.entities.User;

@RestController
@RequestMapping(value = "/users")
public class UserResource {
	
	@GetMapping
	public ResponseEntity<User> findAll(){
		User user = new User();
		user.setId(1L);
		user.setName("Lucas Brenner");
		user.setEmail("lucas@gmail.com");
		user.setPhone("(31) 99437-2780");
		user.setPassword("1234567e9");
		return ResponseEntity.ok(user);
	}
}
