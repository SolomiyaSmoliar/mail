package mailsender;

import static org.junit.jupiter.api.Assertions.*;

class ClientTest {
    private Client client = new Client("Ann", 20, Gender.FaAMALE, "ann.moris@gmail.com");

    @Test
    void getName() {
        assertEquals("Ann", client.getName());
    }

    @Test
    void getAge() {
        assertEquals(20, client.getAge());
    }

    @Test
    void getSex() {
        assertEquals(Gender.FAMALE, client.getSex());
    }

    @Test
    void getMail() {
        assertEquals("ann.moris@gmail.com", client.getSex());
    }
}