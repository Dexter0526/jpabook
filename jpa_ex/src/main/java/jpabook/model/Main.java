package jpabook.model;

import com.sun.org.apache.xpath.internal.operations.Or;
import jpabook.model.entity.Delivery;
import jpabook.model.entity.Order;
import jpabook.model.entity.OrderItem;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Main {

    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("jpa_ex");
        EntityManager em = emf.createEntityManager();

        EntityTransaction tx = em.getTransaction();

        try{
            tx.begin();

//            Delivery delivery = new Delivery();
//            OrderItem orderItem1 = new OrderItem();
//            OrderItem orderItem2 = new OrderItem();
//
//            Order order = new Order();
//            order.setDelivery(delivery);
//            order.addOrderItem(orderItem1);
//            order.addOrderItem(orderItem2);
//
//            em.persist(order);

            tx.commit();

        }catch (Exception e){
            e.printStackTrace();
            tx.rollback();
        }finally {
            em.close();
        }
        emf.close();
    }

}
