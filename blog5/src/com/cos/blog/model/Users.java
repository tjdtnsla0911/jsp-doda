package com.cos.blog.model;

import java.sql.Timestamp;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Users {
	private int id;
	private String username;
	private String password;
	private String email;
	private String address;
	private String userprofile;
	private String userrole;
	private Timestamp crateDate;

}
