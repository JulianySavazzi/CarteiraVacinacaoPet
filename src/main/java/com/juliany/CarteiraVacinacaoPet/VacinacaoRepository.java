package com.juliany.CarteiraVacinacaoPet;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface VacinacaoRepository extends CrudRepository 
<Vacinacao,Long> {
	//private String nome_animal;
	//private String data_nasc_animal;
	//private String nome_vacina;
	//private String tipo_vacina;
	//private String qtd_doses;
	//private String data_vacinacao;
	//private String data_proxima_dose;
	//criar métodos emcima dos valores das entidades
	
	//	List<Vacinacao> findByAnimal(String Nome_animal);
	//	List<Vacinacao> findByNascimento(String Data_nasc_animal);
	//	List<Vacinacao> findByVacina(String Nome_vacina);
	//	List<Vacinacao> findByTipo(String Tipo_vacina);
	//	List<Vacinacao> findByDoses(String Qtd_doses);
	//	List<Vacinacao> findByVacinacao(String Data_vacinacao);
	//	List<Vacinacao> findByProxima(String Data_proxima_dose);
		
}
