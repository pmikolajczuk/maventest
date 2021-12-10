package pl.mikolaj.rest;


import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class DatabaseClientMockTest {

    DatabaseClientMock dbMock;

    @Before
    public void setUp() {
        dbMock = new DatabaseClientMock();

        User user = new User("Piotr", 38, "yyy");
        dbMock.addUser(user);

//        user = new User("Stefan", 34, "yyy");
//        dbMock.addUser(user);
    }


    @Test
    public void testGetUsers() {
        String expected = "[{\"id\":0,\"userName\":\"Piotr\",\"age\":38,\"name\":\"yyy\"}]";
        String usersString = dbMock.getUsers();
        System.out.println(usersString);

        Assert.assertEquals(expected, usersString);
    }
}
