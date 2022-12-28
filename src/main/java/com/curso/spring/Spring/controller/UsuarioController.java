package com.curso.spring.Spring.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.curso.spring.Spring.model.Usuario;
import com.curso.spring.Spring.repositories.UsuarioRepository;

@RestController
@RequestMapping(value = "/usuario")
public class UsuarioController {
	
	@Autowired
	private UsuarioRepository usuarioRepository;
	
	
	@GetMapping(value="/{id}")
		public ResponseEntity<Usuario> pesquisarUsuarioID(@PathVariable (value= "id") Long id ) {
		
		Optional<Usuario> usuario = usuarioRepository.findById(id);
		return new ResponseEntity<Usuario>(usuario.get(),HttpStatus.OK );
		
	}
	
	@GetMapping(value="/")
	public ResponseEntity <List<Usuario>> listarUsuarios () {
	
		List<Usuario> list = (List<Usuario>) usuarioRepository.findAll();
		return new ResponseEntity<List<Usuario>> (list,HttpStatus.OK);
		
	}
}
