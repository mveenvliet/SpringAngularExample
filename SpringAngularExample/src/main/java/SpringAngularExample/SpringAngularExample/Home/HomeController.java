package SpringAngularExample.SpringAngularExample.Home;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMethod;

@RestController

public class HomeController {

	@RequestMapping(value = "/Test", method = RequestMethod.GET, headers = "Accept=application/json")
	public void Test() {
		System.out.println("Test 123");
	}

}