package Model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;


import com.mysql.cj.jdbc.Driver;

public class ProductDAO {
	String url="jdbc:mysql://localhost:3306/classimodels";
	String user="root";	
	String password="1234";
	Connection conn = null;
	Statement st=null;
	ResultSet rt=null; 
	ArrayList a=new ArrayList();
	String query = "SELECT productCode as code , quantityInStock as quantity, productDescription as description,buyPrice as price FROM Products where buyPrice>=90.0";
	try {  	
        Class.forName("com.mysql.jdbc.Driver");
        conn = DriverManager.getConnection(url,user,password);
        st = conn.createStatement();
        rt = st.executeQuery(query);
        while (rt.next()) {
            Product ur = new Product();
            ur.setCode(rt.getString("code"));
            ur.setQuantity(rt.getInt("quantity"));
            ur.setDescription(rt.getString("description"));
            ur.setPrice(rt.getString("price"));
            a.add(ur);
        }
        rt.close();
        conn.close();
    } catch (Exception e) {
        System.out.println(e.getMessage());
    }
    return list;
}
}

