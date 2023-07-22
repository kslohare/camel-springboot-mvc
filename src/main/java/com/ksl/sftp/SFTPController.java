package com.ksl.sftp;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SFTPController {

	@RequestMapping("/hello")  
    public String hello()  
    {  
        return "Hello, Being Hight Energy";  
    }  
	
	@RequestMapping("/sendFile")
	public String sendFile() {
		return "sent file - ok";
	}
	
}
