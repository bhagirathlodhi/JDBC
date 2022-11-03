package emp.org;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.SQLException;
import java.util.Scanner;



public class ControlPanel {
	public static void main(String[] args) throws Exception {
		System.out.println("Welcome to User");
		Scanner  br = new Scanner(System.in);
		boolean answer=false;
		while(true) {
			System.out.println("             press 1 to add New Employee");
			System.out.println("             press 2 to delete Employee records");
			System.out.println("             press 3 to display Employee Record");
			System.out.println("             press 4 to Update Employee record..");
			System.out.println("             press 5 to exit from app");
			int coiche = br.nextInt();
		
		if(coiche==1)
		{
			System.out.println("enter Employee First name:");
			String  fname = br.nextLine();br.nextLine();
			System.out.println("enter Employee Last name:");
			String lname =br.nextLine();
			System.out.println("Enter Employee address : ");
			String address= br.nextLine();
			System.out.println("Enter Employee Mobile number:");
			long number = br.nextLong();
			System.out.println("Enter Employee Gmail ID:");
			String mail =br.nextLine();br.nextLine();
			System.out.println("Enter Employee Salary:");
			double salary = br.nextDouble();
			System.out.println("Enter Employee Designation :");
			String designation = br.nextLine();br.nextLine();
			System.out.println("Enter Employee Department Name");
			String deptName = br.nextLine();
			
			EmpData empdata=new EmpData(fname,lname,address,number,mail,salary,designation,deptName);
			
			try {
				 answer = EmpOperation.EmpRecordInsert(empdata);
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			if(answer)
			{
				System.out.println(" New Employee is added successfully");
				CreateConnection.Massage();
				System.out.println();
			}
			else
			{
				System.out.println("something went wrong try again");
			}
		}
		else if(coiche==2)
		{
			System.out.println("Enter Employee id::");
			int id  = br.nextInt();
			boolean f=false;
			try {
				f = EmpOperation.deleteEmpRecord(id);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			if(f)
			{
				System.out.println("Record Deleted successfully...");
				CreateConnection.Massage();
				System.out.println();
			}
			else
				System.out.println("something went wrong");
		}
		else if(coiche==3)
		{   System.out.println("press 1 to one Employee records--");
			System.out.println("press 2 for all employee records--");
			int c=br.nextInt();
			switch(c)
			{
			case 1 :
				System.out.println("Enter Employee id:");
				int id =br.nextInt();
				EmpOperation.showEmpRecord(id);
				CreateConnection.Massage();
				System.out.println();
				break;
			case 2 :
				EmpOperation.showEmpsRecord();
				CreateConnection.Massage();
				System.out.println();
				break;
			default:
				break;
			}
		}
		else if(coiche==4)
		{
			System.out.println("Enter student id::");
			int id =br.nextInt();
			boolean f = EmpOperation.updateEmpRecord(id);
			if(f)
			{
				System.out.println("Employee Record Updated successfully");
				CreateConnection.Massage();
				System.out.println();
			}
			else
				System.out.println("somthing went wrong please try again");
		}
		else if(coiche==5)
		{
			System.out.println("          you exit");
			break;
		}
		else
		{
			System.out.println(" inalid input");
		}
		}
	System.out.println("                 thank you for using our application");
	System.out.println("                 see you soon");
	}
}
