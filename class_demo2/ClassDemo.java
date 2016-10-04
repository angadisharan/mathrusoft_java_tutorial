package class_demo2;

public class ClassDemo {
	static public class Cat {
		String speak;
		String name;
		String color;

		public void printDetails() {
			System.out.println("Name : " + name);
			System.out.println("Color : " + color);
			System.out.println("Says : " + speak);
		}

		@Override
		public String toString() {
			// System.out.println("Inside toString");
			return "Name: " + name + " speak: " + speak + " color: " + color;
		}

	}

	public static void main(String[] args) {

		Cat catOne = new Cat();
		catOne.speak = "Hello...";
		catOne.name = "Tom";
		catOne.color = "Blak";
		System.out.println("catOne :" + catOne);


		Cat catTwo = new Cat();
		catTwo.speak = "Mew...";
		catTwo.name = "Tommy";
		catTwo.color = "White";


		System.out.println("catTwo :" + catTwo);


		
		
		
		
	}

}
