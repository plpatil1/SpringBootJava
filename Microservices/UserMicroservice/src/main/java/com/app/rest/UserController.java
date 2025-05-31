package com.app.rest;

import org.modelmapper.ModelMapper;
import org.modelmapper.convention.MatchingStrategies;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.model.CreateUserRequestModel;
import com.app.service.UserService;
import com.app.shared.UserDTO;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/api")
public class UserController {
	
	@Autowired
	private Environment env;
	
	@Autowired
	private UserService userService;


	
	//2.
	
	/*
	 * @GetMapping("/users/check") public String status(HttpServletRequest request)
	 * { return "Working!!"+request.getRequestURL(); }
	 */
	 
	 
	//3.
	
	  @GetMapping("/users/check") public String status() { return
	  "Working on port = "+env.getProperty("local.server.port"); }
	 
	
	
	//1
	
	  @GetMapping("/users/status") 
	  public String statusCheck() 
	  { 
		  return "Working!! - Status"; 
	  }
	 

	  
	  //4. CreateUser
		/*
		 * @PostMapping("/users/create") public String saveUser( @RequestBody
		 * CreateUserRequestModel userDetails) { System.out.println(userDetails); return
		 * "Create user was called"; }
		 */
	  //With APi Gateway: http://localhost:8082/hello/create
	  //Without: http://localhost:port/api/users/check
	  
	  
	  //5. Add Api Gateway
		/*
		 * @PostMapping("/users/save") public String createUser(@Valid @RequestBody
		 * CreateUserRequestModel userDetails) { System.out.println(userDetails); return
		 * "Create user was called"; }
		 */
	  
	  
	  //6.http://localhost:8082/hello/create
	  @PostMapping("/users/create")
		public ResponseEntity<UserDTO> createUser(@Valid @RequestBody CreateUserRequestModel userDetails)
		{
			ModelMapper modelMapper = new ModelMapper();
			modelMapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);
			UserDTO userDTO = modelMapper.map(userDetails, UserDTO.class);
			userService.createUser(userDTO);
			return new ResponseEntity<UserDTO>(userDTO, HttpStatus.CREATED);	
		}

	  

}
