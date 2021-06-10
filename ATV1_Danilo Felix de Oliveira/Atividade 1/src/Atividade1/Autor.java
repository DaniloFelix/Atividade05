package Atividade1;

public class Autor {
	
	private String nome;
	private String email;
	private char genero;
	
	public Autor(String nome, String email, char genero) {
		
		this.email = email;
		this.nome = nome;
		this.genero = genero;
	}
	
	public String GetNome() {
		
		return nome;
	}
	
	public String GetEmail() {
		
		return email;
	}
	
	public void SetEmail(String email) {
		this.email = email;
	}
	
	public char GetGenero() {
		
		return genero;
	}
	
	public String toString() {
		return " Autor : [nome= " + nome + ", email= " + email + ", genero=" + genero + "]";
	}

}
