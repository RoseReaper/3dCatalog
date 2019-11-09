package com.rosealacroix.catalog.test;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

import com.rosealacroix.catalog.entity.Content;
import com.rosealacroix.catalog.entity.Website;

public class AccesDB {
	
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("3dcatalog");
		EntityManager em = emf.createEntityManager();
		
		Website ws1 = new Website();
		ws1.setName("DAZ Studio");
		ws1.setUrl("http://dazstudio.com");
		
		try {
			
			TypedQuery<Content> query = em.createQuery("select c from Content c", Content.class);
			List<Content> result = query.getResultList();
			
			for(Content s : result) {
				System.out.println(s.getId());
			}
			
		} finally {
			em.close();
			emf.close();
		}
		
	}

}
