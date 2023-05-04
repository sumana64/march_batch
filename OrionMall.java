class OrionMall{

              static String shopNames[] = {null,null,null,null,null,null,null,null,null,null,null,null,null,null,null};

              static int index;
			  
			  public static boolean addshopName(String name){
				  
                  boolean isAdded = true;
				    System.out.println("inside the add method");
					
					if(shopNames!=null && index<shopNames.length){
						
						shopNames[index++] = name;
					
					   isAdded = false;
					
					} else {
						
						System.out.println("shopNames is exceded");
					}
				  
				  return isAdded;
			  }

               public static void getNames(){
				  
                     System.out.println("inside the get method");

                      for(int i =0;i<shopNames.length;i++){
						  
						  System.out.println(shopNames[i]);
					  }					 
				   
				   
				   
			   }
			   
			   public static boolean updateNames(String oldName,String newName){
				   
				   boolean isUpdated = false;
				   
				   System.out.println("inside the update method");
				   
				   for(int i = 0;i<shopNames.length;i++){
					   
					   if(shopNames[i].equals(oldName)){
						   
						   shopNames[i] = newName;
					   
					       isUpdated = true;
					   }
					   
				   }
				   
		           return isUpdated;  
				   
				   
			   }
			   
			   public static String getShopName(String ShopName){
				   
				    System.out.println("inside the getShopName method");
					  
					 for(int i=0;i<shopNames.length;i++){
						 
						 if(shopNames[i].equals(ShopName)){
							 
							 System.out.println("shopName is found");
							 
							 return shopNames[i];
							 
						 }
					 
				 
				 } 
				   
				  return "shopName is not found";   
				   
			   }


}