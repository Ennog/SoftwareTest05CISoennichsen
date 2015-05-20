
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	}
	public int virtualShowRoom(int price){
		int rabatt = 0;
		if (price < 15000)
		{
			rabatt = 0;
		}
		if(price >= 15000 && price <= 20000)
		{
			rabatt = 5;
		}
		if(price > 20000 && price < 25000)
		{
			rabatt = 7;
		}
		if(price >= 25000 )
		{
			rabatt = 10;
		}
		return rabatt;
		
	}

}
