package model;

public class User {
	private String pseudo;
	private String pwd;
	private String nom;
	private String prenom;
	private String age;
		
	public User(String pseudo, String pwd, String nom, String prenom, String age) {
		super();
		this.pseudo = pseudo;
		this.pwd = pwd;
		this.nom = nom;
		this.prenom = prenom;
		this.age = age;
	}
	public String getPseudo() {
		return pseudo;
	}
	public void setPseudo(String pseudo) {
		this.pseudo = pseudo;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	
	
}
