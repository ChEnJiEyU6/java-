# 实验一 程序组织及验证

#### 一.实验目的
1. 基本掌握本人所选择的集成开发工具的使用方法。
2. 掌握Java源程序命名、运行方法理解、掌握创建包的方法。
3. 初步了解类的实例化方法。
#### 二.实验要求
1. 定义包。
2. 组织类。
3. 定义类的属性、方法。


#### 三.实验步骤

1. 步骤一：给出了程序的源文件（如下面的三个源文件），请阅读、理解其功能、含义，分析如下三个Java源程序文件的关系，理解以下三个源文件表达的实体业务逻辑关系（源文件分别描述了银行账户、存款人员、测试类）。
2. 步骤二：在开发环境中组织代码并运行。
3. 步骤三：请在Customer类新添加一个属性，描述其年龄，并补充操作年龄的方法。在测试类中调用这些方法。
4. 步骤四：在理解上述程序的情况下，尝试从头分析并复写该程序。
#### 四.解题思路

1. 分别定义了三个源文件，分别在这三个源文件中定义了三个类Account，Customer，TestBanking。
2. Account类中主要是设置了余额和通过if判断余额与取出钱的数额大小，输出正确还是错误。
3. Customer类中主要定义了顾客的姓，名，年龄和银行账户名称。
4. TestBanking类中主要是测试这两个类中定义的是否正确。

#### 五.关键代码

1. Account类中定义了一个balance属性，四个行为，其中withdraw行为中使用if语句判断balance和amount的差值。
```
        public class Account{
	private double balance;
	public Account(double bal) {
		balance = bal;
	}
	public double getBalance() {
		return balance;
	}
	public boolean deposit(double amount) {
		balance = balance + amount;
		return true;
	}
	public boolean withdraw(double amount) {
		boolean result = true;
		if(balance < amount) {
			result = false;
		}
		else {
			balance = balance - amount;
		}
		return result;
	}
}
```
2. Customer类中定义了四个属性，并通过行为返回值。
```public class Customer{
	private Account account;
	private String firstName;
	private String lastName;
	private int age;
	public Customer(String f, String l, int cAge) {
		firstName = f;
		lastName = l;
		age = cAge;
	}

	public String getFirstName() {
		return firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public Account getAccount() {
		return account;
	}
	public int getage() {
		return age;
	}
	public Customer(int age){
		this.age = age;
	}
	public int age() {
		return age;
	}
		
	public void setAccount(Account acct) {
		account = acct;
	}
}
```
3. TestBanking类中通过对形参赋予值并输出。
```public class TestBanking {
	public static void main(String[] args) {
		Customer customer;
		Account account;
		System.out.println("Creating the customer Jane Smith.");
		customer = new Customer("Jane", "Smith", 26);
		System.out.println("Creating her account with a 500.00 balance.");
		customer.setAccount(new Account(500.00));
		account = customer.getAccount();
		System.out.println("Withdraw 150.00:" + account.withdraw(150.00));
		System.out.println("Deposit 22.50:" + account.deposit(22.50));
		System.out.println("Withdraw 47.62:" + account.withdraw(47.62));
		System.out.println("Withdraw 400.00:" + account.withdraw(400.00));
		System.out.println("Customer[" + customer.getLastName() + ","+customer.getFirstName() + ","+customer.getage()+"]has a balance of " + account.getBalance());
        Customer cus = new Customer(28);
        System.out.println("修改后的年龄为:"+cus.age());
		}
 
}
```
#### 六.结果截图
![输入图片说明](https://images.gitee.com/uploads/images/2021/1101/202626_a177ab4f_9911418.png "屏幕截图.png")
#### 七.感想与体会
通过此次实验，基本能通过三个源文件弄明白整个的业务逻辑，增强了自己读代码的能力。

