package com.juliany.CarteiraVacinacaoPet;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/vacinacao") 
@CrossOrigin(origins = "*") //permitir qualquer url
public class VacinacaoController {
	@Autowired
	private VacinacaoRepository repository;
	
	//url base: http://localhost:8080/vacinacao
	
		//O Mapping especifica o tipo de método da requisição HTML que você está usando
		//Os nomes get, post, put e delete foram colocados por convenção
		
		@PostMapping(path="/add") //olha os parâmetros da requisição para salvar no bd
		public @ResponseBody String novoCadastro 
		(@RequestParam String nome_animal, @RequestParam String data_nasc_animal, @RequestParam String nome_vacina,
				@RequestParam String tipo_vacina,@RequestParam String qtd_doses, @RequestParam String data_vacinacao,
				@RequestParam String data_proxima_dose) {
			
			//private String nome_animal;
			//private String data_nasc_animal;
			//private String nome_vacina;
			//private String tipo_vacina;
			//private String qtd_doses;
			//private String data_vacinacao;
			//private String data_proxima_dose;
			
				Vacinacao vac = new Vacinacao();
				vac.setNome_animal(nome_animal);
				vac.setData_nasc_animal(data_nasc_animal);
				vac.setNome_vacina(nome_vacina);
				vac.setTipo_vacina(tipo_vacina);
				vac.setQtd_doses(qtd_doses);
				vac.setData_vacinacao(data_vacinacao);
				vac.setData_proxima_dose(data_proxima_dose);
				return "Valores salvos com sucesso!";
		} 
		
		//usar no react
		@PostMapping(path="/add_vacinacao") //olha o corpo da requisição para salvar no bd
		public @ResponseBody String novaVacinacao(@RequestBody Vacinacao nova) {
			repository.save(nova); //recebe o objeto
			return "Vacinação inserida com sucesso!";
		}
	
		//usar no react
		//mais utilizado
		@GetMapping(path="/all") //retornar todas as vacinações
		public @ResponseBody Iterable<Vacinacao> retornaTodos(){
			return repository.findAll();
		}
		
		//usar no react
		//mais utilizado
		@GetMapping(path="/locate_vacinacao/{id}") //retornar pelo id, sem precisar passar o parâmetro na url, o parâmetro já faz parte da url
		public @ResponseBody Optional<Vacinacao> retornaVacinacao (@PathVariable(required = true, name = "id") Long id){
			return repository.findById(id);
		}
		
		//usar no react
		//deletar
		@DeleteMapping(path="delete_vacinacao/{id}") //deletar pelo id
		public @ResponseBody String deleteVacinacao (@PathVariable(required=true, name="id") Long id) {
			//verificar se o usuário existe pelo Optional
			Optional<Vacinacao> vac = repository.findById(id);
			if(vac.isPresent()) {
				repository.delete(vac.get());
				return "Vacinação deletada com sucesso";
			}
			return "Vacinação não encontrada";
		}
		
		//usar no react
		//update
		@PutMapping(path="update_vacinacao/{id}") //PathVariable: variável de caminho, o parâmetro já está incluido na url
		public @ResponseBody Optional<Vacinacao> updateVacinacao(@PathVariable(required = true, name = "id") Long id, 
				@RequestBody Vacinacao vac){
				Optional<Vacinacao> v  = repository.findById(id);
				
				//private String nome_animal;
				//private String data_nasc_animal;
				//private String nome_vacina;
				//private String tipo_vacina;
				//private int qtd_doses;
				//private String data_vacinacao;
				//private String data_proxima_dose;
				
					if(v.isPresent()) {
						v.get().setNome_animal(vac.getNome_animal());
						v.get().setData_nasc_animal(vac.getData_nasc_animal());
						v.get().setNome_vacina(vac.getNome_vacina());
						v.get().setTipo_vacina(vac.getTipo_vacina());
						v.get().setQtd_doses(vac.getQtd_doses());
						v.get().setData_vacinacao(vac.getData_vacinacao());
						v.get().setData_proxima_dose(vac.getData_proxima_dose());
						repository.save(v.get());
						return v; //retornar o objeto modificado
					}
			return null;
			
		}
		
}
