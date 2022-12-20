package enum_class_test;

public enum Transportation {
	BUS(1500){
		public int fare(int distance) {
			return distance*BASIC_FARE;
		}
	}, SUBWAY(2000){
		public int fare(int distance) {
			return distance*BASIC_FARE;
		}
	}, TAXI(4000){
		public int fare(int distance) {
			return distance*BASIC_FARE;
		}
	}, AIRPLANE(10000){
		public int fare(int distance) {
			return distance*BASIC_FARE;
		}
	};
	
	//기본요금 멤버변수
	protected final int BASIC_FARE;
	
	//생성자
	Transportation(int basicfare){
		BASIC_FARE = basicfare;
	}
	
	//기본 요금 조회 메서드
	public int getBasicFare() {
		return BASIC_FARE;
	}
	
	//거리에 따른 요금을 정의한 추상메서드 정의
	public abstract int fare(int distance);
}
