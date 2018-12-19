package Testframework;

import com.codoid.products.exception.FilloException;
import com.codoid.products.fillo.Connection;
import com.codoid.products.fillo.Fillo;
import com.codoid.products.fillo.Recordset;

public class Firstframework {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Fillo fillo =new Fillo();
				Connection connection;
				try {
					connection=fillo.getConnection("‪‪E:\\Practice\\Framework\\XLdata.xlsx");
					
					String strQuery="select * from Sheet1";
							
							Recordset recordset=connection.executeQuery(strQuery);
					 while(recordset.next())
					 {
						 System.out.println(recordset.getField("username1"));
						 System.out.println(recordset.getField("password1"));
					 }
					 recordset.close();
					 connection.close();
				}
				catch(FilloException e)
				{
					e.printStackTrace();
						 
					 }
							
				}
				

	}


