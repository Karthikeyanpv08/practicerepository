
public class InterfaceDemo {

	public static void main(String[] args) {
		ICalculator calc = new ICalculator()
		{
			
			@Override
			public void Subtraction() {
				// TODO Auto-generated method stub
				System.out.println(6-5);
			}
			
			@Override
			public void Addition() {
				// TODO Auto-generated method stub
				System.out.println(6+5);
			}
		};
		
		calc.Addition();
		calc.Subtraction();

	}

}
