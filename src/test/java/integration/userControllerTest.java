package integration;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import controllers.UserController;
import models.User;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

/**
 * Created by mackenzie on 06/07/17.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes={UserController.class})
@WebAppConfiguration
@EnableWebMvc
public class userControllerTest {

    private MockMvc mockMVC;
    private ObjectMapper mapper = new ObjectMapper();
    private User goodUser;
    public User badUser;

    @Autowired
    private WebApplicationContext wac;

    @Before
    public void setUp() {
        mockMVC = MockMvcBuilders.webAppContextSetup(this.wac).build();
        goodUser = new User("leeroyJ", "Leeroy", "Jenkins",
                "1499444684", "UNIX");
        badUser =  new User("leeroyJ", "Leeroy", "Jenkins",
                "1499444684", "UNIX");
        badUser.setUsername("");
    }

    @Test
    public void testSuccessfulUserPost() throws Exception {
        String userJson = mapper.writeValueAsString(goodUser);

        mockMVC.perform(
                post("/user/create")
                        .accept(MediaType.APPLICATION_JSON)
                        .contentType(MediaType.APPLICATION_JSON)
                        .content(userJson)).andExpect(status().isCreated());
    }

    @Test
    public void respondToFailedPost() throws Exception {
        String userJson = mapper.writeValueAsString(badUser);

        mockMVC.perform(
                post("/user/create")
                        .accept(MediaType.APPLICATION_JSON)
                        .contentType(MediaType.APPLICATION_JSON)
                        .content(userJson)).andExpect(status().is4xxClientError());
    }

    @Test
    public void respondToSuccessfulGet() throws Exception {
        //Add testing for authentication and stuff here too
        //Need to send an ID here as well?
        //TODO Send IDs in GET
        mockMVC.perform(
                get("/user")
                .accept(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk());
    }


    @Test
    public void respondToSuccessfulPut() throws Exception {
        goodUser.setFirstName("Jenky");
        String userJson = mapper.writeValueAsString(goodUser);

        mockMVC.perform(
                put("/user")
                .accept(MediaType.APPLICATION_JSON)
                .contentType(MediaType.APPLICATION_JSON)
                .content(userJson))
                .andExpect(status().is2xxSuccessful());
    }

    @Test
    public void respondToFailedPut() throws Exception {
        badUser.setUsername("    ");
        String userJson = mapper.writeValueAsString(goodUser);

        mockMVC.perform(
                put("/user")
                .accept(MediaType.APPLICATION_JSON)
                .contentType(MediaType.APPLICATION_JSON)
                .content(userJson))
                .andExpect(status().is2xxSuccessful());
    }

    @Test
    public void respondToSuccessfulDelete() throws Exception {
        mockMVC.perform(
                delete("/user")
                .accept(MediaType.APPLICATION_JSON))
                .andExpect(status().is2xxSuccessful());
    }

    @Test
    public void respondToFailedDelete() throws Exception{
        mockMVC.perform(
                delete("/user")
                .accept(MediaType.APPLICATION_JSON))
                .andExpect(status().is4xxClientError());
    }
}