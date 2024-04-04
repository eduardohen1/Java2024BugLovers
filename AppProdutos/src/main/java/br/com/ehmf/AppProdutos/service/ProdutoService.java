package br.com.ehmf.AppProdutos.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.ehmf.AppProdutos.model.Produto;
import br.com.ehmf.AppProdutos.repository.ProdutoRepository;

@Service
public class ProdutoService {

	//pegar a referencia do bd
	@Autowired
	private ProdutoRepository produtoRepository;
	
	//crud
	public Produto criar(Produto produto) {
		return produtoRepository.save(produto);
	}
	
	//select * from tbd_produto
	public List<Produto> readProdutos(){
		return produtoRepository.findAll();
	}
	
	//select * from tbd_produto where id = X
	public Optional<Produto> getProdutoId(Long id){
		return produtoRepository.findById(id);
	}
	
	public Produto update(Produto produto) {
		Optional<Produto> findProduto = produtoRepository.findById(produto.getId());
		//se ele existir, atualiza:
		if(findProduto.isPresent()) {
			Produto updateProduto = findProduto.get(); //setId
			updateProduto.setCodigoBarras(produto.getCodigoBarras());
			updateProduto.setNome(produto.getNome());
			updateProduto.setPreco(produto.getPreco());
			return produtoRepository.save(updateProduto);
		}
		return produto;
	}
	
	public void deletar(Long id) {
		produtoRepository.deleteById(id);
	}
	
}
