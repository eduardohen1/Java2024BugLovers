package br.com.ehmf.AppProdutos.resource;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.ehmf.AppProdutos.model.Produto;

@RestController
@RequestMapping("/api/produtos") //http://localhost:8080/api/produtos
public class ProdutoResource {

	@GetMapping("/hello") //http://localhost:8080/api/produtos/hello
	public String hello() {
		return "Hello pessoal! Buglovers!!!";
	}
	
	@GetMapping
	public ResponseEntity<Produto> getProduto() {
		Produto p = new Produto();
		p.setId(1L);
		p.setCodigoBarras("123456");
		p.setNome("Produto1");
		p.setPreco(1000.0);
		
		//if(p == null)
			return ResponseEntity.notFound().build();
		
		//return ResponseEntity.ok(p);
	}
	
	
	/**
	 * GET     - RECUPERAR
	 * POST    - GRAVAR
	 * PUT     - ATUALIZAR
	 * DELETE  - DELETAR
	 */
	
}
