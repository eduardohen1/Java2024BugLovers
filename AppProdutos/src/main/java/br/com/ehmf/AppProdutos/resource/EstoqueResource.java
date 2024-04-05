package br.com.ehmf.AppProdutos.resource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.ehmf.AppProdutos.model.Estoque;
import br.com.ehmf.AppProdutos.service.EstoqueService;

@RestController
@RequestMapping("/api/estoque")
public class EstoqueResource {

	@Autowired
	EstoqueService estoqueService;
	
	@PostMapping
	public ResponseEntity<Estoque> save(@RequestBody Estoque estoque){
		Estoque newEstoque = estoqueService.save(estoque);
		if(newEstoque == null)
			return ResponseEntity.notFound().build();
		return ResponseEntity.ok(newEstoque);
	}
	
	@GetMapping
	public ResponseEntity<List<Estoque>> findAll(){
		List<Estoque> estoques = estoqueService.findAll();
		if(estoques == null)
			return ResponseEntity.notFound().build();
		return ResponseEntity.ok(estoques);
	}
	
	@PutMapping
	public ResponseEntity<Estoque> update(@RequestBody Estoque estoque){
		Estoque updEstoque = estoqueService.save(estoque);
		if(updEstoque == null)
			return ResponseEntity.notFound().build();
		return ResponseEntity.ok(updEstoque);
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<?> delete(@PathVariable Long id){
		estoqueService.delete(id);
		return new ResponseEntity<>(HttpStatus.NO_CONTENT);
	}
	
	
}
