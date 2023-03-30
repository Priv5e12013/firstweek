package week1.day2;

public class Tab {
    
	public int tabPrice(int tabPrice) {
	return tabPrice;	
	}
	public String tabBrand(String tabBrand) {
	return tabBrand;
	}
	public static void main(String[] args) {
		Tab tab=new Tab();
		String brand=tab.tabBrand("infinix");
		int price=tab.tabPrice(20000);
		System.out.println("Tab price is" +price);
		System.out.println("Tab brand is" +brand);
	}

}
