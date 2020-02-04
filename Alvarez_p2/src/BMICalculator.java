import java.util.Scanner;

public class BMICalculator {
	
	Scanner input = new Scanner(System.in);
	private double weight;
	private double height;
	private double bmi;
	private String category;
	private int unit_type;
	
	private int readUnitType() {
		System.out.println("Choose your preferred unit system (1 = Imperial, 2 = Metric");
		int unit_type = input.nextInt();	
		return unit_type;
	}
	
	private void readImperialData() {
		System.out.println("Enter your weight in pounds:");
		weight = input.nextDouble();
		if (weight < 0) {
			System.exit(0);
		}
		System.out.println("Enter your height in inches:");
		height = input.nextDouble();
		if (height < 0) {
			System.exit(0);
		}
	}
	
	private void readMetricData() {
		System.out.println("Enter your weight in kilograms:");
		weight = input.nextDouble();
		if (height < 0) {
			System.exit(0);
		}
		System.out.println("Enter your height in inches:");
		height = input.nextDouble();
		if (height < 0) {
			System.exit(0);
		}
	}
	
	public double calculateBmi() {
		if (unit_type == 1) {
			bmi = (703.00 * weight)/(height*height);
			calculateBmiCategory();
		}
		if (unit_type == 2) {
			bmi = height/weight;
			calculateBmiCategory();
		}
	  return bmi;
	}
	
	public void readUserData() {
		unit_type = readUnitType();
		readMeasurementData();
	}
	
	public void readMeasurementData() {
		if (unit_type == 1) {
			readImperialData();
		}
		if (unit_type == 2) {
			readMetricData();
		}
	}
	
	private void calculateBmiCategory() {
		if(bmi < 18.5) {
			category = "Underweight";
		}
		if(18.5 < bmi && 24.9 > bmi) {
			category = "Normal weight";
		}
		if(25 < bmi && 29.9 > bmi) {
			category = "Overweight";
		}
		if(bmi > 30.0) {
			category = "Obese";
		}
		
	}
	
	public void displayBmi() {
		System.out.printf("%nYour BMI: %n%.1f%n", getBmi());
		System.out.printf("%nYou are: %s%n%nGoodbye!", getBmiCategory());
	}
	
	public double getWeight(int unit_type) {
		return weight;
	}
	
	public void setWeight(double weight) {
		this.weight = weight;
	}
	
	public double getHeight() {
		return height;
	}
	
	public void setHeight(double height) {
		this.height = height;
	}
	
	public double getBmi() {
		return calculateBmi();
	}
	
	public String getBmiCategory() {
		return category;
	
	}
}
