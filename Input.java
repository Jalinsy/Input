import java.util.Scanner;//表示把java.util下的Scanner导入
public class Input  {
	public static void main(String[] args) {
		
		//演示接受用户的输入
		//步骤
		//1: 引入Scanner类所在的包
		//2: 创建 Scanner 对象， new 创建一个对象
		// myScanner 就是 Scanner类的对象
		Scanner myScanner = new Scanner(System.in);
		//3: 接收用户的输入了，使用 相关的方法
		System.out.println("请输入名字");
		
		//当程序执行到 next 方法时， 会等待用户输入～～
		String name = myScanner.next();
		System.out.println("请输入年龄");
		int age = myScanner.nextInt();
		System.out.println("请输入收入");
		double sal = myScanner.nextDouble();
		System.out.println("人的信息如下:");
		System.out.println("名字:" + name + " 年龄: " + age + 
				" 收入: " + sal);
	}
}