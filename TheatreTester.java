class TheatreTester{


              public static void main(String args[]){
			  
			  
			         Theatre.addMovieNames("googly");
					 Theatre.addMovieNames("tarak");
					 Theatre.addMovieNames("kgf");
					 Theatre.addMovieNames("pushpaka vimana");
					 Theatre.addMovieNames("kantara");
					 Theatre.addMovieNames("jollydays");
					 Theatre.addMovieNames("gurushishyaru");
					 Theatre.addMovieNames("veda");
					 Theatre.addMovieNames("3 idiots");
					 Theatre.addMovieNames("habba");
					 Theatre.addMovieNames("ABCD");
					 
					String ref = Theatre.getMovieName("habba");
					
					System.out.println(ref);
					 
					 Theatre.updateMovieName("habba","jaya janakinayaka");
					 
					 Theatre.getMovieNames();
			 
			  
			  
			  }



}