package com.ksl.sftp;

import org.apache.camel.builder.RouteBuilder;
import org.springframework.stereotype.Component;

//@Component
class SftpRoute extends RouteBuilder {

	@Override
	public void configure() throws Exception {
		System.out.println("My Routing Started");
		from("file:/home/ksl/temp/test.txt?noop=true").to("sftp://demo@test.rebex.net//pub?password=password");
		System.out.println("My Routing complete");

	}

}