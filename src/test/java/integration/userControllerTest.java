package integration;

import controllers.userController;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

/**
 * Created by mackenzie on 06/07/17.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes={userController.class})
@WebAppConfiguration
@EnableWebMvc
public class userControllerTest {

    private MockMvc mockMVC;

    @Autowired
    private WebApplicationContext wac;

    @Before
    public void setUp(){
        mockMVC = MockMvcBuilders.webAppContextSetup(this.wac).build();
    }

    @Test
    public void testSuccessfulUserPost(){

    }

    @Test
    public void respondToFailedPost(){}
}
