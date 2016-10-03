package class_demo;

public class ClassDemoTwo {

	static public class Cat {
		String speak;
		String name;
		String color;
	}

	public static void main(String[] args) {		
		Cat prafulCat = new Cat();
		Cat poojsCat = new Cat();
		Cat kiranCat = new Cat();
		
		prafulCat.color = "Black";
		prafulCat.name = "Anything";
		prafulCat.speak = "Mew Mew";
		
		poojsCat.color = "Gray";
		poojsCat.name = "Something";
		poojsCat.speak = "Mew Mew.......";
		
		kiranCat.color = "Blak-Gray";
		kiranCat.name = "Nothing";
		kiranCat.speak = "Mew.......";
		
		System.out.println("Prafuls Cat name is " +  prafulCat.name);
		System.out.println("Poojas Cat name is " +  poojsCat.name);
		System.out.println("Kiran Cat name is " +  kiranCat.name);
		
//		String kiranCatName;
//		String kiranCatColor;
//		String kiranCatSpeak;
//		
//		
//		String prafulCatName;
//		String prafulCatColor;
//		String prafulCatSpeak;
//		
//		String poojaCatName;
//		String poojaCatColor;
//		String poojaCatSpeak;
		
	}
}
