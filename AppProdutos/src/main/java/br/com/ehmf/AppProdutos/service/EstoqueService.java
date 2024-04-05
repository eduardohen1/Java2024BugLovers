package br.com.ehmf.AppProdutos.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.ehmf.AppProdutos.model.Estoque;
import br.com.ehmf.AppProdutos.model.Produto;
import br.com.ehmf.AppProdutos.repository.EstoqueRepository;
import br.com.ehmf.AppProdutos.repository.ProdutoRepository;

@Service
public class EstoqueService {

	@Autowired
	private EstoqueRepository estoqueRepository;
	
	@Autowired
	private ProdutoRepository produtoRepository;
	
	public Estoque save(Estoque estoque) {
		//preciso verificar se o produto existe
		Optional<Produto> findProduto = produtoRepository
				.findById(estoque.getProduto().getId());
		if(findProduto.isEmpty()) {
			System.out.println("Produto nao encontrado!");
			return null;
		}else {
			estoque.setProduto(findProduto.get());
			return estoqueRepository.save(estoque);
		}
		
	}
	
	public Estoque update(Estoque estoque) {
		Optional<Estoque> findEstoque = estoqueRepository.findById(estoque.getId());
		if(findEstoque.isPresent()) {
			Estoque updateEstoque = findEstoque.get();
			updateEstoque.setProduto(findEstoque.get().getProduto());
			updateEstoque.setQuantidade(estoque.getQuantidade());
			return estoqueRepository.save(updateEstoque);
		}
		return null;
	}
	
	public List<Estoque> findAll(){
		return estoqueRepository.findAll();
	}
	
	public void delete(Long id) {
		estoqueRepository.deleteById(id);
	}
	
}
