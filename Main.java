import java.awt.image.DataBufferFloat;

public class Main
{
	public static void main(String[] args)
	{
     int salary;
     String name;
     Double taxpercent;
     double taxdeduction, FinalPay;
     salary = 1000;
     name = "Jake";
     taxpercent = 0.1;
     System.out.println("Starting to calculate tax for "+name);
     System.out.println("The starting salary is "+salary);
	 taxdeduction=getpercentage(salary,taxpercent);
     System.out.println("The amount to be deducted is "+taxdeduction);
     System.out.println("Finished calculating tax for "+name);
     FinalPay=finalsalary(salary, taxdeduction);
     System.out.println("Final salary is "+FinalPay);
	}

    public static double getpercentage(int tax, double deduction)
    {
        return tax * deduction;
    }

    public static double finalsalary(int salary, double taxdeduction)
    {
        return salary - taxdeduction;
    }
}
