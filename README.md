# java-
Java课程作业项目仓库
#阅读程序
package banking;
public class Account {
  private double   balance;
  public Account(Stringbal) {
    balance=bal;
  }
  public double getBalance() {
    return balance;
  }
  public boolean deposit(doubleamount) {
  balance=balance+amount;
  return true;
  }
  public boolean withdraw(double amount) {
    boolean result=true;
    if(balance<amount) {
      result=false;
    } else {
      balance=balance-amount;
    }
    return result;
  }
}
##实验目的
基本掌握本人所选择的集成开发工具的使用方法
掌握Java源程序命名、运行方法
理解、掌握创建包的方法
初步了解类的实例化方法
##实验过程
步骤一：给出了程序的源文件（如下面的三个源文件），请阅读、理解其功能、含义，分析如下三个Java源程序文件的关系，理解以下三个源文件表达的实体业务逻辑关系（源文件分别描述了银行账户、存款人员、测试类）。
步骤二：在开发环境中组织代码并运行。
步骤三：请在Customer类新添加一个属性，描述其年龄，并补充操作年龄的方法。在测试类中调用这些方法。
步骤四：在理解上述程序的情况下，尝试从头分析并复写该程序。
