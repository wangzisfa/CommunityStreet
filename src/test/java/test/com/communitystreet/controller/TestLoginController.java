package test.com.communitystreet.controller;

import com.DemoApplication;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

//import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;


@RunWith(SpringRunner.class)
//@WebMvcTest(LoginController.class)

@AutoConfigureMockMvc
@SpringBootTest(classes = DemoApplication.class)
public class TestLoginController {
	@Autowired
	private MockMvc mvc;

	@Test
	public void testIsLogin() throws Exception {
		mvc.perform(post("/login/check")
				.contentType("Application/json")
				.content("{" +
						"\"stuNumber\" : 123456, " +
						"\"password\" : \"wzh2001\"" +
						"}")
		)
				.andExpect(status().isOk());
	}
}
