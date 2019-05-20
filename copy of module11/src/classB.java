
public class classB extends classA {

	public static void main(String[] args) {

		classA obj = new classB();
		obj.MethodA();
		obj.methodB();

		classB obj1 = new classB();
		obj1.MethodA();
		obj1.MethodC();
		obj1.methodB();
		classA obj2 = new classA();
		obj2.MethodA();

	}

	@Override
	public void MethodA() {
		System.out.println("Method A of ClassB");
	}

	public void MethodC() {
		System.out.println("Method c of ClassB");
	}
}
