package util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import org.junit.Test;

/**
 * 
 *  
 * @Description:Test data connection   
 * @author: maotao 
 * @date:   2019年5月28日 下午9:19:20       
 *
 */
public class TestConnectDB {
	@Test
	public  void test() {
        try {
			Class.forName("com.mysql.jdbc.Driver");
			
				try {
					Connection connection =  DriverManager.getConnection("jdbc:mysql://localhost:3306/ias?useUnicode=true&characterEncoding=utf-8","root","admin");
					Statement createStatement = connection.createStatement();
					String sql = "insert into ias_college value(1003,'太原工业学院北区')";
					createStatement.execute(sql);
					System.out.println("创建成功");
				} catch (SQLException e) {
					
					e.printStackTrace();
				}
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
        
	}

}
