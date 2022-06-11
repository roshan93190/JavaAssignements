package day11.question2;

public enum Item {
	SUGER,RICE,SALT;
	public void info(){
	System.out.println("This is grocerry item");  
}
 
		public static void main(String[] args) {
			Item[] itr= Item.values();
			for(Item item:itr){
			item.info();
			}
			}

	 
	
}