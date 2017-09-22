package com.hibernate.kou;

/**
 * Hello world!
 *
 */
import org.hibernate.Session;

public class App 
{
    public static void main( String[] args )
    {
    	
    	Flower flower1 = new Flower();
    	flower1.setFlowerId("56858");
    	flower1.setFlowerType("peony");
    	flower1.setWeeklySales("50122");
    	
    	Flower flower2 = new Flower();
    	flower2.setFlowerId("22");
    	flower2.setFlowerType("dhalia");
    	flower2.setWeeklySales("6056");
    		
    	Manager manager1 = new Manager();
    	manager1.setManagerId("102683");
    	manager1.setManagerFirstName("kavin");
    	manager1.setManagerLastName("obrain");
    	
    	
    	Manager manager2 = new Manager();
    	manager2.setManagerId("1025");
    	manager2.setManagerFirstName("steve");
    	manager2.setManagerLastName("austin");
    	
    	Flowershop shop = new Flowershop();
    	shop.setFlowerShopId("405");
    	shop.setFlowerShopName("Fressa");
    	
    	shop.getFlowers().add(flower1);
    	shop.getFlowers().add(flower2);
    	shop.getManagers().add(manager1);
    	shop.getManagers().add(manager2);
    	
    	Flowershop shop2 = new Flowershop();
    	shop2.setFlowerShopId("44959");
    	shop2.setFlowerShopName("Beautiful bloosoms");
    	
    	shop2.getFlowers().add(flower1);
    	shop2.getFlowers().add(flower2);
    	shop2.getManagers().add(manager1);
    	shop2.getManagers().add(manager2);
    	
    	Session session = SessionProvider.getSession();
    			
    	session.beginTransaction();
    //-----------------------------------

    	session.save(shop2);
    	session.save(shop);
    	session.save(manager1);
    	session.save(flower1);
    	session.save(flower2);
    	session.save(manager2);
    					
    		
    //------------------------------------	
    	session.getTransaction().commit();
    			
    	session.close();
    }
}