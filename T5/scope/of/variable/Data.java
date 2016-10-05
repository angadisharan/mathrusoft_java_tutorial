package scope.of.variable;

public class Data {
	
	protected int dataInteger;

	public int getDataInteger() {
		return dataInteger;
	}

	class SubClass {
		public void subClassMethod() {
			Data data = new Data();
			data.dataInteger = 22;
		}
	}
}
