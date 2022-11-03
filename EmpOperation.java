package emp.org;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class EmpOperation {

	public static boolean EmpRecordInsert(EmpData e) throws ClassNotFoundException, SQLException {
		boolean f = false;
		Connection con = null;

		String q = "insert into emp(Fname,Lname,Address,Phone_n,Gmail,Salary,Profile,DeptName) values(?,?,?,?,?,?,?,?)";
		try {
			con = CreateConnection.createConnection();
			PreparedStatement stmt = con.prepareCall(q);
			stmt.setString(1, e.getFirstNname());
			stmt.setString(2, e.getLastName());
			stmt.setString(3, e.getAddress());
			stmt.setLong(4, e.getPhoneNumber());
			stmt.setString(5, e.getGmail());
			stmt.setDouble(6, e.getSalary());
			stmt.setString(7, e.getProfile());
			stmt.setString(8, e.getDeptName());
			stmt.executeUpdate();
			f = true;
		} catch (Exception ee) {
			ee.printStackTrace();
		}

		return f;
	}

	public static boolean deleteEmpRecord(int id) throws Exception {

		boolean f = false;
		String q = "delete from emp where id=?";
		try {
			Connection con = CreateConnection.createConnection();
			PreparedStatement stmt = con.prepareStatement(q);
			stmt.setInt(1, id);
			stmt.executeUpdate();
			f = true;

		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		return f;
	}

	public static void showEmpRecord(int id) throws Exception {
		try {
			String q = "select * from emp where id=?";
			Connection con = CreateConnection.createConnection();
			PreparedStatement stmt = con.prepareStatement(q);
			stmt.setInt(1, id);
			ResultSet set = stmt.executeQuery();
			while (set.next()) {
				int eid = set.getInt("id");
				String efname = set.getString("Fname");
				String elname = set.getString("Lname");
				String eaddress = set.getString("Address");
				long ephone = set.getLong("Phone_n");
				String email = set.getString("Gmail");
				double esal = set.getDouble("Salary");
				String eprofile = set.getString("Profile");
				String edeptName = set.getString("DeptName");

				System.out.println("           Employee id is- " + eid);
				System.out.println("           Employee First Name is- " + efname);
				System.out.println("           Employee Last Name is- " + elname);
				System.out.println("           Employee Addess is- " + eaddress);
				System.out.println("           Employee Mobile Number  is- " + ephone);
				System.out.println("           Employee Mail ID is- " + email);
				System.out.println("           Employee salary is- " + esal);
				System.out.println("           Employee Profile is- " + eprofile);
				System.out.println("           Employee DepartName is- " + edeptName);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void showEmpsRecord() {
		try {
			String q = "select * from emp ";
			Connection con = CreateConnection.createConnection();
			PreparedStatement stmt = con.prepareStatement(q);
			ResultSet set = stmt.executeQuery();
			while (set.next()) {
				int eid = set.getInt("id");
				String efname = set.getString("Fname");
				String elname = set.getString("Lname");
				String eaddress = set.getString("Address");
				long ephone = set.getLong("Phone_n");
				String email = set.getString("Gmail");
				double esal = set.getDouble("Salary");
				String eprofile = set.getString("Profile");
				String edeptName = set.getString("DeptName");

				System.out.println("           Employee id is- " + eid);
				System.out.println("           Employee First Name is- " + efname);
				System.out.println("           Employee Last Name is- " + elname);
				System.out.println("           Employee Addess is- " + eaddress);
				System.out.println("           Employee Mobile Number  is- " + ephone);
				System.out.println("           Employee Mail ID is- " + email);
				System.out.println("           Employee salary is- " + esal);
				System.out.println("           Employee Profile is- " + eprofile);
				System.out.println("           Employee DepartName is- " + edeptName);
				System.out.println("*******************************************************************");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static boolean updateEmpRecord(int id) throws Exception {
		String query = "update emp set ";
		Connection con = null;
		boolean f = false;
		try
		{
		con = CreateConnection.createConnection();

		System.out.println("Employee Details are ");
		showEmpRecord(id);
		System.out.println();
		System.out.println("what you want to update");
		System.out.println();
		System.out.println("           press 1 for Employee First  Name");
		System.out.println("           press 2 for Employee Last Name");
		System.out.println("           press 3 for Employee Address ");
		System.out.println("           press 4 for Employee Mobile Number");
		System.out.println("           press 5 for Employee Mail ID ");
		System.out.println("           press 6 for Employee Salary");
		System.out.println("           press 7 for Employee Profile");
		System.out.println("           press 8 for Employee Department Name");
		System.out.println("           press 9 for All details");
		Scanner br = new Scanner(System.in);
		int choice = br.nextInt();
		switch (choice) {
		case 1:

			System.out.println("Enter new First Name:");
			String newName = br.nextLine();br.nextLine();
			query = query + "Fname=? where id=" + id;
			PreparedStatement ft = con.prepareStatement(query);
			ft.setString(1, newName);
			ft.executeUpdate();
			f=true;
			break;
		case 2:
			System.out.println("Enter new Last Name:");
			String newLname = br.nextLine();br.nextLine();
			query = query + "Lname=? where id=" + id;
			PreparedStatement lt = con.prepareStatement(query);
			lt.setString(1, newLname);
			lt.executeUpdate();
			f=true;
			break;
		case 3:
			System.out.println("Enter new Address:");
			String newAddress = br.nextLine();br.nextLine();
			query = query + "Address=? where id=" + id;
			PreparedStatement at = con.prepareStatement(query);
			at.setString(1, newAddress);
			at.executeUpdate();
			f=true;
			break;
		case 4:
			System.out.println("Enter new Mobile Number:");
			long newNumber = br.nextLong();
			query = query + "Phone_n=? where id=" + id;
			PreparedStatement nt = con.prepareStatement(query);
			nt.setLong(1, newNumber);
			nt.executeUpdate();
			f=true;
			break;
		case 5:
			System.out.println("Enter new Mail ID:");
			String newMail = br.nextLine();br.nextLine();
			query = query + "Gmail=? where id=" + id;
			PreparedStatement mt = con.prepareStatement(query);
			mt.setString(1, newMail);
			mt.executeUpdate();
			f=true;
			break;
		case 6:
			System.out.println("Enter new Salary-:");
			double newSal = br.nextDouble();
			query = query + "Salary=? where id=" + id;
			PreparedStatement st = con.prepareStatement(query);
			st.setDouble(1, newSal);
			st.executeUpdate();
			f=true;
			break;
		case 7:
			System.out.println("Enter new Position :");
			String newPosition = br.nextLine();br.nextLine();
			query = query + "Profile=? where id=" + id;
			PreparedStatement pt = con.prepareStatement(query);
			pt.setString(1, newPosition);
			pt.executeUpdate();
			f=true;
			break;
		case 8:
			System.out.println("Enter new Department-:");
			String newDept = br.nextLine();br.nextLine();
			query = query + "DeptName=? where id=" + id;
			PreparedStatement dt = con.prepareStatement(query);
			dt.setString(1, newDept);
			dt.executeUpdate();
			f=true;
			break;
		case 9:
			String qry = "update emp set Fname=?,Lname=?,Address=?,Phone_n=?,Gmail=?,Salary=?,Profile=?,DeptName=? where id="+id;
			con = CreateConnection.createConnection();
			System.out.println("Enter New First Name");
			String newFname = br.nextLine();br.nextLine();
			System.out.println("Enter New Last Name");
			String newlname = br.nextLine();
			System.out.println("Enter New Address");
			String newaddress = br.nextLine();br.nextLine();
			System.out.println("Enter New Phone Number");
			long newnumber = br.nextLong();
			System.out.println("Enter New Gmail");
			String newmail = br.nextLine();br.nextLine();
			System.out.println("Enter New Salary");
			double newsal = br.nextDouble();
			System.out.println("Enter New Profile");
			String newprofile = br.nextLine();br.nextLine();
			System.out.println("Enter New Department Name");
			String newdeptname = br.nextLine();
			PreparedStatement alt = con.prepareStatement(qry);
			alt.setString(1, newFname);
			alt.setString(2, newlname);
			alt.setString(3, newaddress);
			alt.setLong(4, newnumber);
			alt.setString(5, newmail);
			alt.setDouble(6, newsal);
			alt.setString(7, newprofile);
			alt.setString(8, newdeptname);
			alt.executeUpdate();
			f=true;

			break;
		default:
			break;
		}
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
		return f;
	}
}
