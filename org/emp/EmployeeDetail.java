package org.emp;

public class EmployeeDetail  extends StudentDetail{
	public void empID() {
		System.out.println("Emp ID-100");
	}
	public void empName() {
		System.out.println("Emp Name-gowtham");
	}
		public static void main(String[]args) {
			EmployeeDetail k=new EmployeeDetail();
		k.empID();
		k.empName();
		k.stuID();
		k.stuNAME();
		k.Hdfc();
		k.Afri();
	}

}
