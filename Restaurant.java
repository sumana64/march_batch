class Restaurant{

                static String menuNames[] = {null,null,null,null,null,null,null,null,null,null,null,null,null,null,null};

                static int index;
				
				public  static boolean addMenu(String name){
					 
					 boolean isAdded = false;
					 
					 System.out.println("inside the add method");
					 
					 if(name!=null && index<menuNames.length){
						 
						 menuNames[index++] = name;
						 
						 isAdded = true;
						 
					 }else{
						 
						 System.out.println("menuNames is exceded");
					 }
					
                     return isAdded;					
					
				}
				
				public static void getMenu(){
					
					System.out.println("inside the getMenu");
					
					for(int i =0;i<menuNames.length;i++){
						
						String ref = menuNames[i];
						
						System.out.println(ref);
						
					}
					
					
				}
				
				public static boolean updateMenu(String oldName,String newName){
					
					  boolean isUpdated = false;
					  
					  System.out.println("inside the updateMenu method");
						  
						  for(int i =0;i<menuNames.length;i++){
							  
							  if(menuNames[i].equals(oldName)){
								  
								 menuNames[i] = newName; 
								  
								  isUpdated = true;
							  }
							  
						  }
		              return isUpdated;
					
				}
				
				public static String getMenuName(String menu){
					
					  System.out.println("indide the getMenu method");
					  
					  for(int i=0;i<menuNames.length;i++){
						  
						  if(menuNames[i].equals(menu)){
							  
							  System.out.println("menu is found");
							  
							  return menuNames[i];
							  
						  }
						  
					  }
						  
						return "menu is notfound";  	
					
				}
				
				









}