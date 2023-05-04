class Theatre{
	
	        static String movieNames[] = {null,null,null,null,null,null,null,null,null,null};
			
			static int index;
			
			public static boolean addMovieNames(String movieName){
				
				boolean isAdded = false;
				
				System.out.println("inside the addMovieNames method");
				
				if(movieName!=null && index<movieNames.length){
				
				movieNames[index++] = movieName;
				
				    isAdded = true;
				}	
				
				else{
					
					System.out.println("the movieName is execeded");
						
					
			      }
				  
				  return isAdded;
			}
			
			public static void getMovieNames(){
				
				System.out.println("inside the getMovieNames");
				
				for(int i = 0;i<movieNames.length;i++){
					
					System.out.println(movieNames[i]);
					
				}	
				
			}
			
			public static boolean updateMovieName(String oldName,String newName){
				
				boolean isUpdated = false;
				
				   System.out.println("inside the update method");
				
				  for(int i =0;i<movieNames.length;i++){
					  
					  if(movieNames[i].equals(oldName)){
						  
						  movieNames[i] = newName;
						  
						  isUpdated= true;
						  
					  }  
					  
				  }
			   
			   return isUpdated;	
			}
			
			public static String getMovieName(String movieName){
				
				System.out.println("inside the getMovieName method");
				
				for(int i=0;i<movieNames.length;i++){
				
				if(movieNames[i].equals(movieName)){
					
					System.out.println("movieName is found");
					
					return movieNames[i];
					
				}
				
			}
				
				return "movieName is not found";
				
				
				
				
			}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}