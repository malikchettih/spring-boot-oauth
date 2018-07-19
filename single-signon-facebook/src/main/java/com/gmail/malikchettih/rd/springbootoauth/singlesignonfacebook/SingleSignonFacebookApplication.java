package com.gmail.malikchettih.rd.springbootoauth.singlesignonfacebook;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.oauth2.client.EnableOAuth2Sso;

@EnableOAuth2Sso
@SpringBootApplication
public class SingleSignonFacebookApplication {

	public static void main(String[] args) {
		SpringApplication.run(SingleSignonFacebookApplication.class, args);
	}
}
