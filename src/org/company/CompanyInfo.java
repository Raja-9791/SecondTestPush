package org.company;

public class CompanyInfo {
	public void companyName(String Name) {
		System.out.println("Company Name:" +Name);
	}
	
	public static void main(String[]args) {
		CompanyInfo c=new CompanyInfo();
		c.companyName("TCS");
	}

}
