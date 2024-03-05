
public class MethodsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodsDemo d=new MethodsDemo();
		String name=d.getData();
		System.out.println(name);
		System.out.println(getData2());
		MethodDemo2 d1=new MethodDemo2();
		System.out.println(d1.getUserData());

	}
	public String getData() {
		System.out.println("hello world");
		return "Rahul shetty";
	}
	public static String getData2() {
		System.out.println("hai world");
		return "rahul";
	}

}
