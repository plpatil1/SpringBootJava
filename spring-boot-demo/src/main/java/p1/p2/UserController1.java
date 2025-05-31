package p1.p2;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users1")
public class UserController1 {
	
	@GetMapping("/visit")
	public String getUser(@RequestParam(value = "page",required = false) String page ,@RequestParam(value = "limit",defaultValue = "0") int limit)
	{
		return "get User called with page = "+page+" limit = "+limit;
	}

}
