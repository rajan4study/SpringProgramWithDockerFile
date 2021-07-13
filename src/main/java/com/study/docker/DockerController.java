package com.study.docker;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/docker/test")
public class DockerController {

	@GetMapping
	public String display() {
		return "Docker success";
	}
}
