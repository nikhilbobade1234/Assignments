package Que_15;

import java.time.LocalDate;

public class Iteam {
	int itemid;
	String itemname;
	int cost_price; 
	int sell_price;
	LocalDate dateofmanufacturing;
	 LocalDate dateofexpiring;
	public Iteam(int itemid, String itemname, int cost_price, int sell_price, LocalDate dateofmanufacturing,
			LocalDate dateofexpiring) {
		super();
		this.itemid = itemid;
		this.itemname = itemname;
		this.cost_price = cost_price;
		this.sell_price = sell_price;
		this.dateofmanufacturing = dateofmanufacturing;
		this.dateofexpiring = dateofexpiring;
	}
	
	
	 Iteam i=null;
	 public boolean createObject(Iteam i) {
		 if(countDigit(i.itemid)>=3)
			 if(i.itemname.matches("[a-zA-Z]-"))
				 if(i.sell_price>0 &&i.cost_price>0)
					 if(i.dateofexpiring!=LocalDate.now())
						 if(i.sell_price!=i.cost_price)
							 i =new Iteam(i.itemid,i.itemname,i.cost_price,i.sell_price, i.dateofmanufacturing,i.dateofexpiring);
		
		if(i!=null)
			return true;
		else
			return false;
		
		 
	 }
	public static  int countDigit(int itemid) {
		int count =0;
		while(itemid>0) {
			count++;
			itemid/=10;
			
		}
			
		return count;
	}
}
