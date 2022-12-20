package tpye_check_test;

public class Apple extends Fruit{
	public String toString() {
		return "사과";
	}

	@Override
	public String fruitInfo() {
		return "대구 사과";
	}
}
