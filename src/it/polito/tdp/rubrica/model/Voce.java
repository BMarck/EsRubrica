package it.polito.tdp.rubrica.model;

/*un singolo elmento della rubrica
 * 
 * questo tipo di oggetti semplici gli chiamiamo
 * Java Bean(pojo: plain old java object)
 * */

public class Voce {
	private String nome;
	private String mail;
	private String telefono;
	
	
	public Voce(String nome, String mail, String telefono) {
		this.nome = nome;
		this.mail = mail;
		this.telefono = telefono;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public String getMail() {
		return mail;
	}


	public void setMail(String mail) {
		this.mail = mail;
	}


	public String getTelefono() {
		return telefono;
	}


	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
		return result;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Voce other = (Voce) obj;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		return true;
	}


	@Override
	public String toString() {
		return "Voce [nome=" + nome + ", mail=" + mail + ", telefono=" + telefono + "]";
	}
	
	
	
	
	

}
