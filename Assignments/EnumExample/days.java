package EnumExample;

//import javax.print.attribute.SetOfIntegerSyntax;

enum dayss{
	SUNDAY(1),MONDAY(2),TUESDAY(3);
	
	dayss(int i){
		this.MYNO = i;
	}
	int MYNO;
	public int getMYNO() {
		return MYNO;
	}
}

enum TVS{
	SONY(200000),XIOMI(235000),SANSUNG(300000);
	
	int price;
	TVS(int i){
		this.price = i;
	}
	
	
	public int getPrice() {
		return price;
	}
}

class days{
	private int no;
	public String name;
	public void showdays() {
		dayss mydays[] = dayss.values();
		for(dayss d: mydays) {
			System.out.println(d);
		}
		for(dayss d: mydays) {
			System.out.println(d.ordinal());
		}
	}
	
	public void showtvs() {
		TVS myTVS[] = TVS.values();
		for(TVS tv: myTVS) {
			System.out.println(tv);
		}
		for(TVS tv: myTVS) {
			System.out.println(tv.ordinal());
		}
	}
	
	public static void main(String[] args) {
		System.out.println("Enum Examples");
		
		days obj = new days();
		obj.showdays();
		dayss s =dayss.MONDAY;
		System.out.println(s.ordinal());
		System.out.println();
		obj.showtvs();
		
	}
}