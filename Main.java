import org.jcp.xml.dsig.internal.dom.ApacheNodeSetData;
import java.awt.image.DataBufferFloat;
import java.util.Scanner;

public class Main
{
	public static void main(String[] args)
	{
     String name;
     double taxpercent,taxdeduction, FinalPay;
     Scanner input = new Scanner(System.in);
     System.out.print("Input name: ");
     name = input.nextLine();
     System.out.print("Input salary: ");
     int salary = input.nextInt();
     System.out.println("Starting to calculate tax for "+name);
     System.out.println("The starting salary is "+salary);
	 taxdeduction=gettaxcalc(salary);
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

    public static double gettaxcalc(int salary)
    {
        double amount,amount2,totalamount,remaining,remaining2;
        if (salary > 10000 & salary <=31000)
        {
        remaining=salary - 10000;
        amount =  remaining/ 5;
        return amount;
        }
        else if (salary >31000 & salary <= 150000)
        {
          remaining = salary - 31000;
             amount = (remaining/5)*2;
                 totalamount = 4200 + amount;
                     return totalamount;
        }
        else if (salary >150000)
        {
            remaining = salary - 150000;
            amount = (remaining/2);
            totalamount = 4200 + 41600 + amount;
            return totalamount;
        }
       else  {
            return 0;
        }
    }
}