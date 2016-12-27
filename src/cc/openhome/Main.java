package cc.openhome;  
/* Java 关键字
 * 
 * 访问控制：
	private 私有的
	protected 受保护的
	public 公共的
	 
	类、方法和变量修饰符：
	abstract 声明抽象
	class 类
	extends 扩允,继承
	final 终极,不可改变的
	implements 实现
	interface 接口
	native 本地
	new 创建
	static 静态 
	strictfp 严格,精准
	synchronized 线程,同步
	transient 短暂
	volatile 易失
	
	程序控制语句：
	break 跳出循环
	continue 继续
	return 返回
	do 运行
	while 循环
	if 如果
	else 反之
	for 循环
	instanceof 实例
	switch 开关
	case 返回开关里的结果
	default 默认
	 
	错误处理：
	try 捕获异常
	catch 处理异常
	finally 有没有异常都执行
	throw 抛出一个异常对象
	throws 声明一个异常可能被抛出
	assert 断言
	
	包相关：
	import 引入
	package 包
	
	基本类型：
	boolean 布尔型
	byte 字节型
	char 字符型
	double 双精度,
	float 浮点
	int 整型
	long 长整型
	short 短整型
	null 空
	true 真
	false 假
	enum 枚举
	
	变量引用：
	super 父类,超类
	this 本类
	void 无返回值
 * */
import cc.openhome.util.Console;
/* 当编译程序剖析Main.java看到 import声明时，会先记得import的名称
 * 后续剖析程序时，若看到Console名称，原本会不知道 Console是什么东西，但编译程序记得你用import告诉过它
 * 如果遇到不认识的名称，可以比对一下import过的名称，编译程序试着使用cc.openhome.util.Console，结果
 * 可以在指定的类路径中，cc/openhome/util文件夹找到Console.class，于是可以进行编译。
 * 
 * 注意：如果在同一个包中使用到多个类，你也可以多次使用 import；
 * 		也可以使用 import cc.openhome.*;
*/
//import cc.openhome.util.*;

/*
 * 当原始码开始使用 package进行分类时，就会有4种管理上的意义：
 * 1：原始码文档要放置在与 package所定义名称层级相同的文件夹层级中。
 * 2：package所定义名称与class所定义名称，会结合而成类的完全吻合名称。
 * 3：位码文档要放置在与package所定义的名称层级相同的文件夹层级中。
 * 4：要在包间可以直接使用类或方法 必须声明为public （牵扯包间的权限管理，后面介绍）
 * 
 * 包通常会用组织或单位的网址命名，例如，我的网址是 openhome.cc，包就会反过来命名为 cc.openhome;
*/
public class Main {

	/*	public：一个.java文档可定义多个类，但是只能有一个公开类，而且主文档名必须与公开类名称相同。（public表示可以被JVM公开执行）
	 * 	static：表示JVM不用生成类实例就可以调用
	*/	
		public static void main(String[] args) {
			// TODO Auto-generated method stub
	/*	
	 * 其实使用了 java.lang包（package）中System类的 public static 成员 out。
	 * java.lang很常用，不用写import也可以直接使用class定义的名称。
	*/
			System.out.println(args);
			// syso按回车即可
			System.out.println("Hello World!");
			
//			HelloWorld.printfMessageHelloWorld();
			/*	那么，非默认包是可以调用到默认包里的类呢？
			 * 	默认包的确无法引入。
			 */
			
			/*  相同包中的类，只要使用class所定义的名称即可
			 *  不同包的类（不同包中的类名不相同，若是有两个包中有相同名的类，还是需要使用吻合名称），必须使用吻合名称，不能偷懒使用import。
			 * */			
//			Console.writeLine("Console writeLine");
			cc.openhome.util.Console.writeLine("package Console Class");
			
			/* 使用包管理，解决了实体文档与撰写程序时类名称冲突的问题，但若每次撰写程序时，都得输入完全吻合名称，却也是件麻烦但事，若有些包名称很长时，单是要输入完全吻合名称得花多少时间。
			 * 可以用import 偷懒一下，注意import只是偷懒工具，加入不能偷懒时，还是回归最保守的写法（吻合名称）
			 * import会让编译时间拉长，其他对性能没有影响。
			 * */
			Console.writeLine("import Console Class");
			
			// 获取 JRE支持的位码版本
			System.clearProperty("java.class.version");
			// 获取 JRE版本
			System.getProperty("java.runtime.version");
			
			// 打印
			System.out.println("JRE支持的位码版本: " + System.clearProperty("java.class.version"));
			System.out.println("JRE version: " + System.getProperty("java.runtime.version"));
		}
}

/* 使用了哪个JRE？
 * 	因为各种原因，你的计算机中可能不只存在一套JRE，可以试着搜索计算机中的文档
 * 
 * 	在Eclipse中，想要切换项目的JRE，那么需要在项目中 右键选择：
 * 	Properties -> Java Build path -> Libraries -> JRE -> 单击 Edit -> 在Alternate JRE中选择
 *
*/

/* 编译指定版本？
 * 在编译的时候，可以使用-target指定编译出来的位码，必须符合指定平台允许的版本号
 * 使用 -source要求编译程序检查使用的语法，不超过指定的版本。
 * 
 * 注意：1.在不指定-target 和-source的情况下，编译程序会有默认的-target值。
 * 		2.-target在指定时，值必须大于或者等于 -source
 * 
 * 那么在 IDE中如何指定呢？ 
 *  在Eclipse中，可以在项目上右击，选择Properties -> 在Java Compiler中设定。 
 * 
 * */


