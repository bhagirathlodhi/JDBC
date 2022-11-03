package emp.org;

public class EmpData {
	private int id;
	private String firstNname;
	private String lastName;
	private String address;
	private long phoneNumber;
	private String gmail;
	private double salary;
	private String profile;
	private String deptName;
	public EmpData( String firstNname, String lastName, String address, long phoneNumber, String gmail,
			double salary, String profile, String deptName) {
		this.id = id;
		this.firstNname = firstNname;
		this.lastName = lastName;
		this.address = address;
		this.phoneNumber = phoneNumber;
		this.gmail = gmail;
		this.salary = salary;
		this.profile = profile;
		this.deptName = deptName;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFirstNname() {
		return firstNname;
	}
	public void setFirstNname(String firstNname) {
		this.firstNname = firstNname;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public long getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getGmail() {
		return gmail;
	}
	public void setGmail(String gmail) {
		this.gmail = gmail;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public String getProfile() {
		return profile;
	}
	public void setProfile(String profile) {
		this.profile = profile;
	}
	public String getDeptName() {
		return deptName;
	}
	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}

	@Override
	public String toString() {
		return "EmpData [id=" + id + ", firstNname=" + firstNname + ", lastName=" + lastName + ", address=" + address
				+ ", phoneNumber=" + phoneNumber + ", gmail=" + gmail + ", salary=" + salary + ", profile=" + profile
				+ ", deptName=" + deptName + "]";
	}
	

}
