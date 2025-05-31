package com.app.service;

import java.util.ArrayList;
import java.util.UUID;
import org.modelmapper.ModelMapper;
import org.modelmapper.convention.MatchingStrategies;
/*import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;*/
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.app.data.UserEntity;
import com.app.data.UserRepository;
import com.app.shared.UserDTO;

@Service
public class UserServiceImpl implements UserService {
	
	UserRepository userRepository;
	BCryptPasswordEncoder byBCryptPasswordEncoder;
	
		//@Autowired
		
		  public UserServiceImpl(UserRepository userRepository, BCryptPasswordEncoder
		  byBCryptPasswordEncoder) { super(); System.out.println("In UserServiceImpl");
		  this.userRepository = userRepository; this.byBCryptPasswordEncoder =
		  byBCryptPasswordEncoder; }
		 

	

	@Override
	public UserDTO createUser(UserDTO usersDetails) {
		usersDetails.setUserId(UUID.randomUUID().toString());
		usersDetails.setEncryptedPassword(byBCryptPasswordEncoder.encode(usersDetails.getPassword()));
		ModelMapper modelMapper = new ModelMapper();
		modelMapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);
		UserEntity userEntity = modelMapper.map(usersDetails, UserEntity.class);
		userRepository.save(userEntity);
		return usersDetails;
	}


	@Override
	public UserDTO getUserDetailsByEmail(String email) {
		// TODO Auto-generated method stub
		return null;
	}


}
