package br.com.ehmf.AppProdutos.resource;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.ehmf.AppProdutos.model.Produto;
import br.com.ehmf.AppProdutos.service.ProdutoService;

@RestController
@RequestMapping("/api/produtos") //http://localhost:8080/api/produtos
public class ProdutoResource {

	@Autowired
	private ProdutoService produtoService;
	
	@GetMapping("/hello") //http://localhost:8080/api/produtos/hello
	public String hello() {
		return "Hello pessoal! Buglovers!!!";
	}
	
	@GetMapping
	public ResponseEntity<List<Produto>> getAllProdutos(){
		List<Produto> produtos = produtoService.readProdutos();
		if(produtos.size() == 0)
			return ResponseEntity.notFound().build();
		return ResponseEntity.ok(produtos);
	}
	
	@PostMapping
	public ResponseEntity<Produto> save(@RequestBody Produto produto){
		Produto retornoProduto = produtoService.criar(produto);
		if(retornoProduto == null)
			return ResponseEntity.notFound().build();
		return ResponseEntity.ok(retornoProduto);
	}
	
	@GetMapping("/{id}") //http://localhost:8080/api/produtos/1
	public ResponseEntity<Optional<Produto>> getById(@PathVariable Long id){
		Optional<Produto> produto = produtoService.getProdutoId(id);
		if(produto == null)
			return ResponseEntity.notFound().build();
		return ResponseEntity.ok(produto);
	}
	
	
	/**
	 * GET     - RECUPERAR
	 * POST    - GRAVAR
	 * PUT     - ATUALIZAR
	 * DELETE  - DELETAR
	 */
	
}
