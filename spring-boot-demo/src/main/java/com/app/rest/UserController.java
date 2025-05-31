package com.app.rest;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.app.model.UserDetailsRequestModel;
import com.app.model.UserRest;
import jakarta.validation.Valid;

@RestController
@RequestMapping("/users")
public class UserController {
	
	private Map<String,UserRest> user;
	
	
	/*
	 * @GetMapping(path = "/{userId}", 
	 * produces = {MediaType.APPLICATION_JSON_VALUE,
	 * MediaType.APPLICATION_XML_VALUE}) 
	 * public UserRest getUser(@PathVariable String userId)
	 *  { 
	 *  UserRest userRest = new UserRest();
	 * userRest.setFirstName("Rahul"); 
	 * userRest.setLastName("abc");
	 * userRest.setEmail("rahul@gmail.com"); 
	 * userRest.setUserId(userId);
	 * 
	 * return userRest; 
	    }
	 */
	
	/*
	 * @GetMapping(path = "/{userId}", 
	 * produces = {MediaType.APPLICATION_JSON_VALUE,
	 * MediaType.APPLICATION_XML_VALUE}) 
	 * public ResponseEntity<UserRest>
	 * getUser(@PathVariable String userId) 
	 * { 
	 * UserRest userRest = new UserRest();
	 * userRest.setFirstName("Rahul"); 
	 * userRest.setLastName("abc");
	 * userRest.setEmail("rahul@gmail.com"); 
	 * userRest.setUserId(userId);
	 * 
	 * HttpHeaders headers = new HttpHeaders();
	 * headers.add("Content-Type","application/xml");
	 * 
	 * //return new ResponseEntity<UserRest>(userRest, HttpStatus.OK);
	 * 
	 * return new ResponseEntity<UserRest>(userRest, headers, HttpStatus.OK);
	 * 
	 * }
	 */
	 
	
	
	@PostMapping(
			produces = {MediaType.APPLICATION_JSON_VALUE,
					MediaType.APPLICATION_XML_VALUE},
			consumes = {MediaType.APPLICATION_JSON_VALUE,
					MediaType.APPLICATION_XML_VALUE})
	public ResponseEntity<UserRest> getUser(@RequestBody UserRest user)
	{
		UserRest userRest = new UserRest();
		userRest.setFirstName(user.getFirstName());
		userRest.setLastName(user.getLastName());
		
		return new ResponseEntity<UserRest>(userRest, HttpStatus.OK);
		
		//return new ResponseEntity<UserRest>(userRest, headers, HttpStatus.OK);
		
	}
	
	@GetMapping /* (path="/{userId}") */
	public ResponseEntity<Map> getUser(/* @PathVariable String userId */)
	{
//		if(user.containsKey(userId))
//		{
//			return new ResponseEntity<>(user.get(userId),HttpStatus.OK);
//		}
//		else
//			return new ResponseEntity<>(HttpStatus.NO_CONTENT);
		
		//Map<String,UserRest> m = user;
		
		return new ResponseEntity<Map>(user, HttpStatus.OK);
		
	}			
	
	@PostMapping("/create")
	public ResponseEntity<UserRest> createUser(@Valid @RequestBody 
			UserDetailsRequestModel userDetails)
	{
		UserRest returnValue = new UserRest();
		returnValue.setEmail(userDetails.getEmail());
		returnValue.setFirstName(userDetails.getFirstName());
		returnValue.setLastName(userDetails.getLastName());
		String userId = UUID.randomUUID().toString();
		returnValue.setUserId(userId);
		if(user==null)
		{
			user = new HashMap<String, UserRest>();
			
		}
		user.put(userId, returnValue);
		
		return new ResponseEntity<UserRest>(returnValue, HttpStatus.OK);
	}
	
	@PutMapping(path ="/{userId}",produces = {MediaType.APPLICATION_JSON_VALUE,
			MediaType.APPLICATION_XML_VALUE},
	consumes = {MediaType.APPLICATION_JSON_VALUE,
			MediaType.APPLICATION_XML_VALUE}) 
	public UserRest updateUser(@PathVariable String userId,  @RequestBody UserDetailsRequestModel userDetails )
	{
		UserRest returnValue = user.get(userId);
		returnValue.setFirstName(userDetails.getFirstName());
		returnValue.setLastName(userDetails.getLastName());
		user.put(userId, returnValue);
		return returnValue;
	}
	
	
	@DeleteMapping(path = "/{id}")
	public ResponseEntity<Void> deleteUser(@PathVariable String id)
	{
		user.remove(id);
		return ResponseEntity.noContent().build();
	}
	
	

}



