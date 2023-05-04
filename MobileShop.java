class MobileShop{

            static String mobileNames[] = {null,null,null,null,null,null,null,null,null,null} ;  
           
            static int index;
			
			public static boolean addMobileNames(String mobileName){
				    
					 boolean isAdded = false;
					 
					 if(mobileName!= null && index<mobileNames.length){
					
				      System.out.println("inside the add method");
				
				      mobileNames[index++] = mobileName;
				        
						  isAdded = true;
						
					 }else{
						 
						 System.out.println("mobileName is exceded");
					 }
			
                 return isAdded;			
			}
			
			public static void getMobileNames(){
				
				  System.out.println("inside the getMobileNames");
				  
				  for(int i =0;i<mobileNames.length;i++){
					  
					    String ref = mobileNames[i];
						
						System.out.println(ref);
					  
					  
				  }
				
				
				
			}
			
			public static boolean updateMobileName(String oldName,String newName){
				
				     boolean isUpdated = true;
					 
					 System.out.println("inside the update method");
					 
					 for(int i =0;i<mobileNames.length;i++){
						 
						  if(mobileNames[i].equals(oldName)){
							    
							 mobileNames[i] = newName; 
							    
								isUpdated = false;
						  }
						  
					 }
				return isUpdated;
			}
			
			public static String getMobileName(String mobileName){
				
				   System.out.println("inside the getMobileName method");
				   
				   for(int i=0;i<mobileNames.length;i++){
					   
					   if(mobileNames[i].equals(mobileName)){
					     
					          System.out.println("mobileName is found");
							  
							  return mobileNames[i];
					   } 
				   }
				
				
				return "mobileName is not found";
			}
			
		



















}