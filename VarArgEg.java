package assignment;
public class VarArgEg {
	static void show(String... text) { //usign varargs
		System.out.println("show method invoked");
		for(String s:text ) {//for each loop
			System.out.println(s);
		}
	}

	public static void main(String[] args) {
		show(); //zero arguments
		show("hi"); //one arguments
		show("i","Love","Coding"); //two arguments
		show("a","b","c","d"); //four arguments
	}
}