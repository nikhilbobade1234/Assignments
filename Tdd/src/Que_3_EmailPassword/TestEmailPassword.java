package Que_3_EmailPassword;





import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.sql.SQLException;

import org.junit.jupiter.api.Test;

class TestEmailPassword {

	@Test
	void test123() throws ClassNotFoundException, SQLException {
		assertTrue(User.cheak("nikhilbobade", "nikhil"));
	}

}
