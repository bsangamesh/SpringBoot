package com.springBasics.springinfewsteps.externalProperty;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class SomeExternalFile {

	@Value("${service.url}")
	String url;

	public String getUrl() {
		return url;
	}
}
