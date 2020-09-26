package com.juliany.CarteiraVacinacaoPet;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Vacinacao {
	//Crud para carteira digital de vacinação de animais
	//O projeto terá uma classe contendo os dados do animal e da vacinação;
    //A classe vacinacao, 
	//com os dados das vacinas tomadas pelo animal (nome, tipo, qtdDoses,  dataVacinacao, dataProximaDose),
	//e nome e data de nascimento do animal.
    //Todos os atributos serão do tipo String e int, exceto o id, que será um long. 
    //O banco de dados utilizado será PostgreSQL.
	
	@Id //indica que esse atributo é chave primária
	@GeneratedValue (strategy = GenerationType.AUTO) //indica que é um atributo com autoincremento	
	private long id_vacinacao;
	private String nome_animal;
	private String data_nasc_animal;
	private String nome_vacina;
	private String tipo_vacina;
	private String qtd_doses;
	private String data_vacinacao;
	private String data_proxima_dose;
	public long getId_vacinacao() {
		return id_vacinacao;
	}
	public void setId_vacinacao(long id_vacinacao) {
		this.id_vacinacao = id_vacinacao;
	}
	public String getNome_animal() {
		return nome_animal;
	}
	public void setNome_animal(String nome_animal) {
		this.nome_animal = nome_animal;
	}
	public String getData_nasc_animal() {
		return data_nasc_animal;
	}
	public void setData_nasc_animal(String data_nasc_animal) {
		this.data_nasc_animal = data_nasc_animal;
	}
	public String getNome_vacina() {
		return nome_vacina;
	}
	public void setNome_vacina(String nome_vacina) {
		this.nome_vacina = nome_vacina;
	}
	public String getTipo_vacina() {
		return tipo_vacina;
	}
	public void setTipo_vacina(String tipo_vacina) {
		this.tipo_vacina = tipo_vacina;
	}
	public String getQtd_doses() {
		return qtd_doses;
	}
	public void setQtd_doses(String qtd_doses) {
		this.qtd_doses = qtd_doses;
	}
	public String getData_vacinacao() {
		return data_vacinacao;
	}
	public void setData_vacinacao(String data_vacinacao) {
		this.data_vacinacao = data_vacinacao;
	}
	public String getData_proxima_dose() {
		return data_proxima_dose;
	}
	public void setData_proxima_dose(String data_proxima_dose) {
		this.data_proxima_dose = data_proxima_dose;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((data_nasc_animal == null) ? 0 : data_nasc_animal.hashCode());
		result = prime * result + ((data_proxima_dose == null) ? 0 : data_proxima_dose.hashCode());
		result = prime * result + ((data_vacinacao == null) ? 0 : data_vacinacao.hashCode());
		result = prime * result + (int) (id_vacinacao ^ (id_vacinacao >>> 32));
		result = prime * result + ((nome_animal == null) ? 0 : nome_animal.hashCode());
		result = prime * result + ((nome_vacina == null) ? 0 : nome_vacina.hashCode());
		result = prime * result + ((qtd_doses == null) ? 0 : qtd_doses.hashCode());
		result = prime * result + ((tipo_vacina == null) ? 0 : tipo_vacina.hashCode());
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
		Vacinacao other = (Vacinacao) obj;
		if (data_nasc_animal == null) {
			if (other.data_nasc_animal != null)
				return false;
		} else if (!data_nasc_animal.equals(other.data_nasc_animal))
			return false;
		if (data_proxima_dose == null) {
			if (other.data_proxima_dose != null)
				return false;
		} else if (!data_proxima_dose.equals(other.data_proxima_dose))
			return false;
		if (data_vacinacao == null) {
			if (other.data_vacinacao != null)
				return false;
		} else if (!data_vacinacao.equals(other.data_vacinacao))
			return false;
		if (id_vacinacao != other.id_vacinacao)
			return false;
		if (nome_animal == null) {
			if (other.nome_animal != null)
				return false;
		} else if (!nome_animal.equals(other.nome_animal))
			return false;
		if (nome_vacina == null) {
			if (other.nome_vacina != null)
				return false;
		} else if (!nome_vacina.equals(other.nome_vacina))
			return false;
		if (qtd_doses == null) {
			if (other.qtd_doses != null)
				return false;
		} else if (!qtd_doses.equals(other.qtd_doses))
			return false;
		if (tipo_vacina == null) {
			if (other.tipo_vacina != null)
				return false;
		} else if (!tipo_vacina.equals(other.tipo_vacina))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Vacinacao [id_vacinacao=" + id_vacinacao + ", nome_animal=" + nome_animal + ", data_nasc_animal="
				+ data_nasc_animal + ", nome_vacina=" + nome_vacina + ", tipo_vacina=" + tipo_vacina + ", qtd_doses="
				+ qtd_doses + ", data_vacinacao=" + data_vacinacao + ", data_proxima_dose=" + data_proxima_dose + "]";
	}
	
	
}
