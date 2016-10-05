package scope.of.variable;

public class PrivateModifier {

	public static void main(String[] args) {

		Data data = new Data();

		data.dataInteger = 3;
		
		
		System.out.println(data.getDataInteger());
	}
	
	
	class SubClass {
		public void subClassMethod() {
			Data data = new Data();
			data.dataInteger = 23;
		}
	}
	
	

}
