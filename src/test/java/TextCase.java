import java.io.IOException;

import org.junit.Test;
import org.springframework.web.servlet.DispatcherServlet;

import cn.java.reglogin.User;
import cn.java.reglogin.UserFile;

public class TextCase {
	//DispatcherServlet ds;
	@Test
		public void test1() {
			User user=new User();
			user.setUsername("sss");
			UserFile s=new UserFile();
			
			try {
				s.createUserFile(user);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
}
