package di;

public class BMICalResult {
	
	private double lowWeight;	//저체중
	private double normal;		//정상체중
	private double overWeight;	//과체중
	private double obesity;		//비만

	//setter만 정의
	public void setLowWeight(double lowWeight) {
		this.lowWeight = lowWeight;
	}
	public void setNormal(double normal) {
		this.normal = normal;
	}
	public void setOverWeight(double overWeight) {
		this.overWeight = overWeight;
	}
	public void setObesity(double obesity) {
		this.obesity = obesity;
	}
	
	//체질량지수 계산을 위한 메소드
	//몸무게와 신장을 전달받아 체질량지수를 계산하여 결과를 문자열로 반환한다.
	public String bmiCalculation(double weight, double height) {
		double h = height * 0.01;
		double result = weight / (h*h);
		
		String resultStr = "당신의 BMI지수는?" + (int)result;
		
		if(result > obesity) {
			resultStr += "<br/>비만입니다.";
		}
		else if(result > overWeight) {
			resultStr += "<br/>과체중입니다.";
		}
		else if(result > normal) {
			resultStr += "<br/>정상입니다.";
		}
		else {
			resultStr += "<br/>저체중입니다.";
		}
		
		return resultStr;
	}
}
