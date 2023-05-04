class OrionMallTester{


                   public static void main(String args[]){
					   
					   
					OrionMall.addshopName("lifestyle");   
					OrionMall.addshopName("dominoz");  
                    OrionMall.addshopName("peter england");
                    OrionMall.addshopName("zara");  
                    OrionMall.addshopName("lenskart");  
                    OrionMall.addshopName("mcdonolds");  
                    OrionMall.addshopName("max");  
                    OrionMall.addshopName("puma");  
                    OrionMall.addshopName("adidas");  
                    OrionMall.addshopName("soch");  
                    OrionMall.addshopName("subway");  
                    OrionMall.addshopName("nike"); 
					OrionMall.addshopName("pantaloons");
                    OrionMall.addshopName("marks Spencer");
                    OrionMall.addshopName("here&nw");
					OrionMall.addshopName("libas");
					
					String ref1 = OrionMall.getShopName("zivame");
					
					System.out.println(ref1);
					
					boolean ref = OrionMall.updateNames("here&nw","health&glow");
					
					System.out.println("shopname is updated :" + ref);

                    OrionMall.getNames();

                					
					   
					   
					   
					   
					   
				   }























}