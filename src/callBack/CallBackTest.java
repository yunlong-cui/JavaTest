package callBack;

import java.awt.event.ActionListener;

import javax.swing.Timer;

public class CallBackTest {

	/*
	 * 鍥炶皟鍑芥暟鏄竴涓皢鎺ュ彛瀵硅薄浣滀负鍩熺殑绫伙紝鍦ㄥ疄渚嬪寲鍚庨�氳繃鎺ュ彛鍩熷璞¤祴鍊煎悗锛屽疄鐜版帴鍙ｄ腑鐨勬柟娉�
	 * https://www.cnblogs.com/snowbook/p/5802804.html
	 * class A {
	 *     private interfaceA a;
	 *     
	 *     setInterface(interfaceA b)
	 *     {
	 *         this.a = b;
	 *     }
	 *     
	 *     useInterface()
	 *     {
	 *         a.callBack();
	 *     }
	 * }
	 * 
	 * class B implements interfaceA 
	 * {
	 *     callBack()
	 *     {
	 *         //code...
	 *     }
	 * }
	 * 
	 * interface interfaceA 
	 * {
	 *     callBack();
	 * }
	 * 
	 * A a = new A.setInterface(new B);
	 * a.useInterface();
	 * 
	 * 
	 */
	public static void main(String[] args) 
	{
		//匿名内部类
//		Timer timer = new Timer(0, new ActionListener() {
//			
//			public void actionPerformed(ActionEvent e) {
//				System.out.println("this is anonymous inner class");
//				
//			}
//		});
		
		//lambda表达式
		Timer timer = new Timer(1000, event ->
		{
			System.out.println("this is anonymous inner class");
		});
		
		timer.start();
	}
}
