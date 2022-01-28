package com.qa.chocolate.rest;

import java.util.ArrayList;
import java.util.List;

import javax.websocket.server.PathParam;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.qa.chocolate.domain.Chocolate;

// this class represents everything you get from your front end and the requests you make
@RestController
public class ChocolateController {

	private List<Chocolate> chocs = new ArrayList<>();

	// Create - POST
	@PostMapping("/createchoco")
	public ResponseEntity<Chocolate> createChoco(@RequestBody Chocolate c) {
		this.chocs.add(c);
		Chocolate newChoco = this.chocs.get(this.chocs.size() - 1);
		return new ResponseEntity<Chocolate>(newChoco, HttpStatus.CREATED);
	}

	// Read - GET
	@GetMapping("/getchoco")
	public List<Chocolate> getChoco() {
		return this.chocs;
	}

	// Read - GET by id
	@GetMapping("/getone/{id}")
	public Chocolate getOne(@PathVariable int id) {
		return this.chocs.get(id);
	}

	// Update - PUT / PATCH
	@PutMapping("/updatechoco")
	public void updateChoco(@PathParam("id") int id, @RequestBody Chocolate c) {
		this.chocs.set(id, c);
	}

	// Delete - DELETE
	@DeleteMapping("/deletechoco/{id}")
	public void deleteChoco(@PathVariable int id) {
		this.chocs.remove(id);
	}

}
