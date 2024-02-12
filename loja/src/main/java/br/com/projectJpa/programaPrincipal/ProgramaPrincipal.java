package br.com.projectJpa.programaPrincipal;

import java.math.BigDecimal;
import javax.persistence.EntityManager;
import br.com.projectJpa.dao.ProdutoDao;
import br.com.projectJpa.modelo.Categoria;
import br.com.projectJpa.modelo.Produto;
import br.com.projectJpa.util.JpaUtil;

public class ProgramaPrincipal {
	
	public static void main(String []args) {
		
		Produto carro = new Produto("jetta","SEDAN",new BigDecimal(1000.000),new Categoria("VEICULOS")) ; 
	   EntityManager em  = JpaUtil.getEntityManager() ; 
	   ProdutoDao dao = new ProdutoDao(em) ; 
	   em.getTransaction().begin();
	   dao.cadastrar(carro);
	   em.getTransaction().commit();	 
	   em.close();
	   
	}

}
