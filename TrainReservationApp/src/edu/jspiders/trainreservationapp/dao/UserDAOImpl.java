package edu.jspiders.trainreservationapp.dao;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.springframework.stereotype.Component;

import edu.jspiders.trainreservationapp.dto.UserDTO;

@Component
public class UserDAOImpl 
{
	public boolean validate(String username,String password)
	{
		// Hibernate Logic
		Configuration config = new Configuration().configure().addAnnotatedClass(UserDTO.class);
		
		SessionFactory factory = config.buildSessionFactory();
		Session session = factory.openSession();
		
		String hql = "from UserDTO where userName = :user and password = :pswd ";
		
		Query query = session.createQuery(hql);
		query.setString("user", username);
		query.setString("pswd", password);
		
		UserDTO dto = (UserDTO) query.uniqueResult();
		
		session.close();
		factory.close();
		
		if(dto == null)
		{
			return false;
		}
		else
		{
			return true;
		}
	}
}
