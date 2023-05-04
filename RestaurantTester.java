class RestaurantTester{

                  public static void main(String menu[]){
					  
					Restaurant.addMenu("Dosa");  
					Restaurant.addMenu("Idli");  
                    Restaurant.addMenu("puliyogare");  
                    Restaurant.addMenu("chapathi");  					
					Restaurant.addMenu("vada");    
				    Restaurant.addMenu("chitranna"); 
                    Restaurant.addMenu("mosaranna");  
                    Restaurant.addMenu("gobi manchurian");  					
                    Restaurant.addMenu("roti");  
					Restaurant.addMenu("tomotobath");  
					Restaurant.addMenu("friedrice");  
					Restaurant.addMenu("gheerice");  
					Restaurant.addMenu("rava idli");  
					Restaurant.addMenu("bisibele bath");  
					Restaurant.addMenu("pongal"); 
					Restaurant.addMenu("soup");
					
					String ref = Restaurant.getMenuName("soup");
					
					System.out.println(ref);

                    Restaurant.updateMenu("roti","southIndianMeal");					
				
                    Restaurant.getMenu();


				}




}