package corejava;

import org.testng.annotations.Test;

public class ps1 extends ps{//link between ps1 and ps2
    
	@Test
	public void testRun(){
		// TODO Auto-generated method stub
        doThis();//calling ps method
        ps2ParameterizedConstructor ps2=new  ps2ParameterizedConstructor(3);/*creating link between  ps2ParameterizedConstructor and ps1 by
                                                                             creating ps2 class Object i.e 'ParameterizedConstructor' */
        System.out.println(ps2.decrement());System.out.println(ps2.increment());/*calling ps2 methods*/
        System.out.println(ps2.multiplyThree());System.out.println(ps2.multiplyTwo());//calling ps3 methods
	}

}
