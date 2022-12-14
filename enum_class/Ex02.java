package enum_class;

public class Ex02 {

	public static void main(String[] args) {
		Transportation[] trans = Transportation.values();
		for(Transportation t : trans) {
			System.out.println(t+" : "+ t.getBasicFare()+"원");
		}
		
		System.out.println(Transportation.BUS.fare(100)+"원");
		System.out.println(Transportation.SUBWAY.fare(100)+"원");
		System.out.println(Transportation.TAXI.fare(100)+"원");
		System.out.println(Transportation.AIRPLANE.fare(100)+"원");
		
	}

}
