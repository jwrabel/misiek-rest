package com.jwrabel;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by jakubwrabel on 05.03.2017.
 */
@Controller
public class MyRestController {

	// default -> GET, path "/"
	@RequestMapping
	@ResponseBody
	public String getName() {
		return "Misiek";
	}

	// PathVariable
	@RequestMapping("/misiek/{name}")
	@ResponseBody
	public String getNamePathVariable(@PathVariable("name") String name) {
		return "Hello " + name;
	}

	// RequestParam
	@RequestMapping("/misiek")
	@ResponseBody
	public String getNameRP(@RequestParam("name") String name, @RequestParam("surname") String surname) {
		return "Hello " + name + "    " + surname;
	}

	// RequestParam
	@RequestMapping("/customer")
	@ResponseBody
	public Customer getCustomer() {
		return new Customer("Michał", "Ziętek");
	}

}
