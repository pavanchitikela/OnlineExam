package com.example.demo.layer2;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the EXAM_ADMIN database table.
 * 
 */
@Entity
@Table(name="EXAM_ADMIN")
@NamedQuery(name="ExamAdmin.findAll", query="SELECT e FROM ExamAdmin e")
public class ExamAdmin implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="ADMIN_ID")
	private int adminId;

	private String email;

	private String password;

	@Column(name="RESET_PASSWORD_TOKEN")
	private String resetPasswordToken;

	private String username;

	public ExamAdmin() {
	}

	public int getAdminId() {
		return this.adminId;
	}

	public void setAdminId(int adminId) {
		this.adminId = adminId;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getResetPasswordToken() {
		return this.resetPasswordToken;
	}

	public void setResetPasswordToken(String resetPasswordToken) {
		this.resetPasswordToken = resetPasswordToken;
	}

	public String getUsername() {
		return this.username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

}