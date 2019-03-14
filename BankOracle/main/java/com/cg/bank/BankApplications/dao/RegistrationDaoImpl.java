package com.cg.bank.BankApplications.dao;

import java.sql.*;

import com.cg.bank.BankApplications.bean.DetailsDTO;

public class RegistrationDaoImpl implements RegistrationDao{

	public DetailsDTO register(DetailsDTO details){
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","SHRUTHI","Annay@27");
			String stmnt="insert into customer_details (first_name,last_name,email_id,password,pancard_no,aadhar_no,address,mobile_no,balance"
					+ "values(?,?,?,?,?,?,?,?,?)";
			PreparedStatement ps=con.prepareStatement(stmnt);
			ps.setString(1,details.getFirstName());
			ps.setString(2,details.getLastName());
			ps.setString(3,details.getEmailId());
			ps.setString(3,details.getPassword());
			ps.setString(4,details.getPancardNo());
			ps.setString(5,details.getAadharNo());
			ps.setString(6,details.getAddress());
			ps.setString(7,details.getMobileNo());
			ps.setDouble(8,details.getBalance());
			ResultSet rs=ps.executeQuery();
			int i=ps.executeUpdate();
			System.out.println(i);
		} catch (Exception e) {
		}
		return details;
	}

	public boolean login(long accountNo, String password) {
		// TODO Auto-generated method stub
		return false;
	}

}
