package com.learnSpringWebApp.myfirstspringwebapp.hello;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class SayHelloController {

	// "say-hello" => "Hello ! What are you learning now ?"
	// http://localhost:8080/say-hello ( Check from log )
	@RequestMapping("say-hello")
	@ResponseBody
	public String sayHello() {
		return "Hello ! What are you learning now ?";

	}

	@RequestMapping("say-hello-html")
	@ResponseBody
	public String sayHelloHtml() {
		StringBuffer sb = new StringBuffer();
		sb.append("""
				<html>
					<head>
						<title>
							My first HTML Page
						</title>
					</head>
				<body>
					My first Html page with Body
				</body>
				</html>
								""");
		return sb.toString();
	}
	
	
	
	//	src/main/resources/META-INF/resources/WEB-INF/jsp/sayHello.jsp
	@RequestMapping("say-hello-jsp")
	public String sayHelloJSp() {
		return "sayHello";

	}
	
	
}
