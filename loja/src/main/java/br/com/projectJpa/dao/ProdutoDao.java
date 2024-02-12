package br.com.projectJpa.dao;
import javax.persistence.EntityManager;

import br.com.projectJpa.modelo.Produto;

public class ProdutoDao {

	    private EntityManager em;

	    public ProdutoDao(EntityManager em) {
	        this.em = em;
	    }

	    public void cadastrar(Produto produto) {
	        this.em.persist(produto);
	    }
}
