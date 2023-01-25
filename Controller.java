package com.callcenter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
	@Autowired
	CallService service;
	
	@GetMapping("/hwv")
	public String hourWithHighVolume() {
		String ans=service.hourWithHighVolume();
		return ans;
	}
	@GetMapping("/hwc")
	public String hourWithLongestCall() {
		String ans=service.hourWithLongestCall();
		return ans;
	}
	@GetMapping("/dwv")
	public String dayWithHighVolume() {
		String ans=service.dayWithHighVolume();
		return ans;
	}
	@GetMapping("/dwc")
	public String dayWithLongestCall() {
		String ans=service.dayWithLongestCall();
		return ans;
	}
	

}
