class Book{
 
          static String bookNames[] = {null,null,null,null,null,null,null,null,null,null,null,null,null,null,null};
                                               //array size is fixed as soon as declare array we need to intialize array
		  static int index;
		  
		                                                                  //compiler-check syntax nd convert source code to bytecode
		  public static boolean addBookNames(String name){
		                                                                  // jvm = .class
		 															       // comiler = .java
																		  
		    boolean isAdded = false;
		  
		   System.out.println("inside the addBookNames method");
		   
		    if(name!=null && index<bookNames.length){
				
				bookNames[index++] = name;
				
				isAdded = true;
				
			 }else{
				 
				 System.out.println("bookNames is exceded");
			 }
		  
		  return isAdded;
		  
		  
		  
		  }
		  
		  public static void getBookNames(){
			  
			  System.out.println("inside the getmethod");

              for(int i=0;i<bookNames.length;i++){
				  
				  System.out.println(bookNames[i]);    
			  }			  
			    
				
			  
		  }
		  
		  public static boolean updateName(String oldName,String newName){
			  
			  System.out.println("inside updateName method");
			  
			  boolean isUpdated = false;
			  
			  for(int i =0;i< bookNames.length;i++){
				  
				 if(bookNames[i].equals(oldName)){
					 
					 bookNames[i] = newName;
					 
					 isUpdated = true;
					 
				 } 
				  
				  
				  
			  }
			   
			 return isUpdated; 
			  
			  
			  
		  }
		  
		  public static String getbookName(String book){
			  
			System.out.println("inside the getbook method");

               for(int i=0;i<bookNames.length;i++){
				   
				   if(bookNames[i].equals(book)){
				   
				   System.out.println("book is found");
				   
				   return bookNames[i];
				   
				   
			   }			
			  
			  
			   }
			   
			   return "bookName is not found";
			  
			  
			  
			  
			  
		  }











}