package com.avm.UserManagement.controller;

import javax.websocket.server.PathParam;

import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMethod;

public interface UserManagementController {

	@GetMapping(value = "/testApi")
	public ResponseEntity<String> testApiGet();

	@PostMapping(value = "/registerUser", produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<?> registerUserPost(@RequestBody String userDetails);

	@PostMapping(value = "/authenticateUser", produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<?> authenticateUserPost(@RequestBody String loginDetails);

	@GetMapping(value = { "/users",
			"/user/{id}" }, produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<?> usersListGet(@PathVariable(name = "id", required = false) String userId);

	@PutMapping(value = "/user/{id}", produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<?> updateUserDetailsPut(@PathVariable(name = "id", required = true) String userId);

	@PostMapping(value = "/user/{id}/roles/{role}", produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<?> addRolePost(@PathVariable(name = "id", required = true) String userId,
			@PathVariable(name = "role", required = true) String role);

	@DeleteMapping(value = "/user/{id}/roles/{role}", produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<?> removeRoleToUserDelete(@PathVariable(name = "id", required = true) String userId,
			@PathVariable(name = "role", required = true) String role);

	@DeleteMapping(value = "/user/{id}", produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<?> inactivateUserDelete(@PathVariable(name = "id", required = true) String userId);

}
