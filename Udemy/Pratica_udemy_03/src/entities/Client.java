package entities;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Client {

	private static final SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	private String nome;
	private String email;
	private Date BirthDate;

	public Client() {

	}

	public Client(String nome, String email, Date BirthDate) {
		super();
		this.nome = nome;
		this.email = email;
		this.BirthDate = BirthDate;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Date getDate() {
		return BirthDate;
	}

	public void setDate(Date date) {
		this.BirthDate = date;
	}

	public String toString() {
		return nome + " (" + sdf.format(BirthDate) + ") - " + email;
	}

}
