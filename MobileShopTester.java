class MobileShopTester{
	
	
	           public static void main(String args[]){
				   
				 MobileShop.addMobileNames("sumsung galaxy");
				 MobileShop.addMobileNames("oneplusnord");
               	 MobileShop.addMobileNames("applepro");			 
				 MobileShop.addMobileNames("nokia");  
				 MobileShop.addMobileNames("googlepixel");  
				 MobileShop.addMobileNames("realme");  
				 MobileShop.addMobileNames("redme"); 
				 MobileShop.addMobileNames("motorola");
                 MobileShop.addMobileNames("vivo");	
                 MobileShop.addMobileNames("blackberry");
				 MobileShop.addMobileNames("xiome");
				 
			     String ref	= MobileShop.getMobileName("vivo");
				 
				 System.out.println(ref);

                // MobileShop.getMobileNames();				 
				 
				 MobileShop.updateMobileName("blackberry","sony");
           

                 MobileShop.getMobileNames();				 
				   
			   }
	
	
	
}