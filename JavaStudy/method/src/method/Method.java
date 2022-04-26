package method;

public class Method {

	public static void main(String[] args) {
//		戻り値の型　変数名
		double height = 180.0;
		double weight = 73.0;
		
		double bmi = calculateBmi(height, weight);
		System.out.println("BMI値 : " + bmi);
	}
	private static double calculateBmi(double height, double weight) {
		double bmi = weight / ((height / 100.0) * (height / 100.0));
		return bmi;
	}

}
