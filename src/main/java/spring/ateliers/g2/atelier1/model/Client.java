package spring.ateliers.g2.atelier1.model;

import java.time.LocalDate;
import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
public class Client {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String firsname;
	private String lastname;
	private String cin;
	private LocalDate date_birth;
	private String email;
	private String password;

	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	
	public String getFirsname() {
		return firsname;
	}
	public void setFirsname(String firsname) {
		this.firsname = firsname;
	}
	
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public String getCin() {
		return cin;
	}
	public void setCin(String cin) {
		this.cin = cin;
	}
	public LocalDate getDate_birth() {
		return date_birth;
	}
	public void setDate_birth(LocalDate date_birth) {
		this.date_birth = date_birth;
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
	public Client( String firsname, String lastname, String cin, LocalDate date_birth, String email,
			String password) {
		this.firsname = firsname;
		this.lastname = lastname;
		this.cin = cin;
		this.date_birth = date_birth;
		this.email = email;
		this.password = password;
	}
	@Override
	public String toString() {
		return "Client [id=" + id + ", firsname=" + firsname + ", lastname=" + lastname + ", cin=" + cin
				+ ", date_birth=" + date_birth + ", email=" + email + ", password=" + password + "]";
	}
	public Client() {
		super();
	}
	
	
}
