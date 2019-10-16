package edu.jspiders.trainreservationapp.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.springframework.stereotype.Component;

import edu.jspiders.trainreservationapp.dto.TrainDTO;

@Component
public class TrainDAOImpl 
{
	public void createTrain(TrainDTO train)
	{
		Configuration config = new Configuration().configure().addAnnotatedClass(TrainDTO.class);
	
		SessionFactory factory = config.buildSessionFactory();
		Session session = factory.openSession();
		
		
		Transaction tx = session.beginTransaction();
		session.save(train);
		tx.commit();
		session.close();
		factory.close();
	}
	public List<TrainDTO> searchTrain(String sStation, String dStation) 
	{
		Configuration config = new Configuration().configure().addAnnotatedClass(TrainDTO.class);
		
		SessionFactory factory = config.buildSessionFactory();
		Session session = factory.openSession();
		
		String hql = "FROM TrainDTO where sourceStation = :sStation and destinationStation = :dStation";
		
		Query query = session.createQuery(hql);
		
		query.setParameter("sStation", sStation);
		query.setParameter("dStation", dStation);
		
		List<TrainDTO> trainDTOs = (List<TrainDTO>)query.list();
		
		session.close();
		
		return trainDTOs;
	}
	
}
