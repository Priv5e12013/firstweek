package week1.day1;

public class Mobile{
	 public void makeCall()
	 {
		String model="infinix";
		float weight=25.5f;
		System.out.println("mobilemodel"+ model );
		System.out.println("mobileweight" + weight);
     }
	 public void sendSms()
	 {
		 boolean charge=true;
	     int value=20000;
	     System.out.println("mobilecharge" + charge);
	     System.out.println("mobilevalue" + value);
	  }
	 public static void main(String[] args)
      {
		 Mobile mob=new Mobile();
		 mob.makeCall();
		 mob.sendSms();
	     System.out.println("This is my mobile");
	}

}
