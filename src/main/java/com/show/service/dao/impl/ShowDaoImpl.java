package com.show.service.dao.impl;

import java.io.Serializable;
import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.show.service.dao.ShowDao;
import com.show.service.entity.SeatEntity;

@Repository
public class ShowDaoImpl implements ShowDao{

	@Autowired
	private SessionFactory sessionFactory;
	
	@Override
	public List<SeatEntity> getAllSeats(Integer showId) {

		 Session session = sessionFactory.openSession();
		 Query createQuery = session.createQuery("From SeatEntity seatEntity");
		 List<SeatEntity> list = createQuery.list();
		 
		
		return list;
	}

	@Override
	public SeatEntity addSeat(SeatEntity seatEntity) {
		Session session = sessionFactory.openSession();
		System.out.println("Inside DAO Imple : "+seatEntity);
		Transaction transaction = null;
		try {
			transaction = session.beginTransaction();
			 if(!transaction.isActive()) {
			transaction.begin();
			 }
		
		Integer save = (Integer)session.save(seatEntity);
		
		  if(save!= null) { 
			  seatEntity.setSeatId(save); return seatEntity;
			  }
		 
		  
		  /*
			 * Query createQuery = session.
			 * createNativeQuery("INSERT INTO show_details.tbl_seat(seatId, rowId, columnId, seatAvailable, price)"
			 * + "VALUES(?,?,?,?,?)");
			 * 
			 * 
			 * createQuery.setParameter(1, seatEntity.getSeatId());
			 * createQuery.setParameter(2, seatEntity.getRowId());
			 * createQuery.setParameter(3, seatEntity.getColumnId());
			 * createQuery.setParameter(4, seatEntity.getSeatAvailable());
			 * createQuery.setParameter(5, seatEntity.getPrice());
			 */
		//int executeUpdate = createQuery.executeUpdate();
		
		/*
		 * if(executeUpdate != 0) { return seatEntity; }
		 */
		  transaction.commit();
		}catch (Exception e) {
		      if (transaction != null) {
		          transaction.rollback();
		        }
		        e.printStackTrace();
		      } finally {
		        if (session != null) {
		          session.close();
		        }
		      }
		return null;
	}
	
	

}
