package uberApp4semicolon.paragon.demo;

import com.zaxxer.hikari.util.DriverDataSource;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

@SpringBootTest
class UberApplicationTests {

	@Test
	void contextLoads(){
	}
	@Test
	void testDatabaseConnection(){
		DriverManagerDataSource dataSource = new DriverManagerDataSource("jdbc:mysql://127.0.0.1:3306/?user=root", "root", "samucolonerrr");
		try{
			Connection connection = dataSource.getConnection();
			assertThat(connection).isNotNull();
		}catch (SQLException e){
		throw new RuntimeException(e);
		}
	}
}
