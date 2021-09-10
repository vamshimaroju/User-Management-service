package com.avm.UserManagement.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserManagementControllerImpl implements UserManagementController {

	@Override
	public ResponseEntity<String> testApiGet() {
		// TODO Auto-generated method stub
		String a = "Hello World!";
		return ResponseEntity.ok(a);
	}

	@Override
	public ResponseEntity<?> registerUserPost(String userDetails) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ResponseEntity<?> authenticateUserPost(String loginDetails) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ResponseEntity<?> usersListGet(String userId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ResponseEntity<?> updateUserDetailsPut(String userId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ResponseEntity<?> addRolePost(String userId, String role) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ResponseEntity<?> removeRoleToUserDelete(String userId, String role) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ResponseEntity<?> inactivateUserDelete(String userId) {
		// TODO Auto-generated method stub
		return null;
	}

}
