package com.sec4dev.unsecure.model;

import javax.validation.constraints.Email;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

public class ValidatedInfos {
	
	@NotNull
	@Min(value=200, message = ">= 200")
	private Long id;
	
	@NotNull
	@Size(min=5, max=50)
	private String name;
	
	@NotEmpty
	@Email
	private String email;
	
	@NotNull
	private String permission;
	
	@NotNull
	private String options;
	
	@NotNull
	@Pattern(regexp= "[\sa-zA-Z0-9]{3,255}", message = "Somente letras e números") // espacos tambem
	private String content;
	
	public Long getId() {
		return id;
	}
	
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getPermission() {
		return permission;
	}
	
	public void setPermission(String permission) {
		this.permission = permission;
	}
	
	public String getOptions() {
		return options;
	}
	
	public void setOptions(String options) {
		this.options = options;
	}
	
	public String getContent() {
		return content;
	}
	
	public void setContent(String content) {
		this.content = content;
	}
	

}
