//package com.ti2cc;

public class Usuario {
	private String ID;
	private String Nome;
	private String Curso;
	private char Sexo;
	private int Idade;
	
	public Usuario() {
		this.ID = "";
		this.Nome = "";
		this.Curso = "";
		this.Sexo = '*';
		this.Idade = -1;
	}
	
	public Usuario(String ID, String Nome, String Curso, char Sexo, int Idade) {
		this.ID = ID;
		this.Nome = Nome;
		this.Curso = Curso;
		this.Sexo = Sexo;
		this.Idade = Idade;
	}

	public String getID() {
		return ID;
	}

	public void setID(String ID) {
		this.ID = ID;
	}

	public String getNome() {
		return Nome;
	}

	public void setNome(String Nome) {
		this.Nome = Nome;
	}

	public String getCurso() {
		return Curso;
	}

	public void setCurso(String Curso) {
		this.Curso = Curso;
	}

	public char getSexo() {
		return Sexo;
	}

	public void setSexo(char Sexo) {
		this.Sexo = Sexo;
	}
	
	public int getIdade() {
		return Idade;
	}

	public void setIdade(int Idade) {
		this.Idade = Idade;
	}

	@Override
	public String toString() {
		return "Usuario [ID=" + ID+ ", Nome=" + Nome+ ", Curso=" + Curso+ ", Sexo=" + Sexo + "]";
	}
	
}
