package corejava;

public class ps2ParameterizedConstructor extends p3ShowingUsageOfSuper{//link between ps2 and ps3
     int a;
	public ps2ParameterizedConstructor(int a) { // ps2ParameterizedConstructor 'Constructor'
		super(a);/*sending 'a' value to p3Constructor to invoke it, in order to utilize methods of p3*/
		this.a=a;
	}
	//methods 
	public int increment() {a=a+1;return a;};
	public int decrement() {a=a-1;return a;};

}
