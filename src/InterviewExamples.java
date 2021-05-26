

import java.io.*;
import java.util.*;


public class InterviewExamples {
  
  
  public static void test() {
    
    ProductInfo info = new ProductInfo();
    List<String> products = 
    		Arrays.asList("Selfie Stick,98,29", "iPhone Case,90,15", "Fire TV Stick,48,49","Wyze Cam,48,25", 
    				"Water Filter,56,49","Blue Light Blocking Glasses,90,16","Ice Maker,47,119","Video Doorbell,47,199",
    				"AA Batteries,64,12","Disinfecting Wipes,37,12","Baseball Cards,73,16","Winter Gloves,32,112",
    				"Microphone,44,22","Pet Kennel,5,24","Jenga Classic Game,100,7","Ink Cartridges,88,45",
    				"Instant Pot,98,59","Hoze Nozzle,74,26","Gift Card,45,25","Keyboard,82,19");
    info.printSortedProduts(products);
  }
}












class ProductInfo {
  private static int PROD_TITLE = 0;
  private static int PROD_PROPULARITY = 1;
  private static int PRODUCT_PRICE = 2;
  
  
  public void printSortedProduts(List<String> products) {
    SortedMap<Integer,List<Product>> map  = new TreeMap<>();
    
    for(String str:products) {
      
      
      List<String> details = Arrays.asList(str.split(","));
     
      
      Integer popularity =   Integer.parseInt(details.get(PROD_PROPULARITY));
      Product prod = new Product(details.get(PROD_TITLE),Integer.parseInt(details.get(PROD_PROPULARITY)),Integer.parseInt(details.get(PRODUCT_PRICE)));
      
      if(map.containsKey(popularity)) {
        List<Product> existing = map.get(popularity);
        existing.add(prod);
        
        
        
        Collections.sort(existing, new Comparator<Product>(){
        	   public int compare(Product o1, Product o2){
        	      return o1.price - o2.price;
        	   }
        	});
        
        
        map.put(popularity,existing);
      }
      else {
  
        List<Product> newDetails = new ArrayList<Product>();
        
        newDetails.add(prod);
        map.put(popularity,newDetails);
        
        
      }
    }
  
    printHelper(map);
    
  }
  

  private void printHelper(SortedMap<Integer,List<Product>>  map) {
   
    for(Integer popularity:map.keySet()) {
    	List<Product> products = map.get(popularity);
    	
    	for(Product prod:products) {

    		System.out.println(prod.title+"\t\t"+prod.popularity+" "+prod.price);
    	}
    }
    
  }

}



class Product {
	  public String title;
	  public Integer popularity;
	  public Integer price;
	
	  public Product(String _title,Integer _popularity, Integer _price) {
		  super();
		  this.title = _title;
		  this.popularity = _popularity;
		  this.price = _price;
	  }
}





