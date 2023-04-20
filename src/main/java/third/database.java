package third;


import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;




public class database {
	
	@PersistenceContext
	private EntityManager em;
	
	public void insertoDB(calculation c)
	{
		em.persist(c);
	}
	
	public List <calculation> findCalculations() {
		
		
		TypedQuery <calculation> q = em.createQuery("SELECT cal  FROM calculation cal" , calculation.class);

		return q.getResultList();
	}

}

