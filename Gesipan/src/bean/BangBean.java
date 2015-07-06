package bean;

import java.sql.Date;
import java.sql.Timestamp;

public class BangBean {
	private int id;
    private Timestamp register;
    private String name;
    private String email;
    private String password;
    private String content;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Timestamp getRegister() {
		return register;
	}
	public void setRegister(Timestamp timestamp) {
		this.register = timestamp;
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
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}

}
