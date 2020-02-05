import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class UserEntryProgramTest {
    @Test
    void testValidUserId(){
        // valid test
        assertEquals(true, UserEntryProgram.validUserId("abbAAaaNMA11"), "data entered is valid");
        assertTrue(UserEntryProgram.validUserId("abbAAaaNMA11"));
    }

    @Test
    void testValidUserIdLength(){
        // valid test
        assertEquals(true,UserEntryProgram.validUserIdLength("pbnjisgood90"));
        assertTrue(UserEntryProgram.validUserIdLength("pbnjisgood90"));
    }

    @Test
    void testInvalidUserId(){
        // invalid test
        assertEquals(false, UserEntryProgram.validUserId("user id"), "data entered is invalid");
        assertFalse(UserEntryProgram.validUserId("user id"));
    }

    @Test
    void testInvalidUserIdLength(){
        // invalid test
        assertEquals(false, UserEntryProgram.validUserIdLength("user id"), "data entered is invalid");
        assertFalse(UserEntryProgram.validUserIdLength("user id"));
    }

    @Test
    void testValidUserPassword(){
        // valid test
        assertEquals(true, UserEntryProgram.validUserPassword("MyBdayis1290"), "data entered is valid");
        assertTrue(UserEntryProgram.validUserPassword("MyBdayis1290"));
    }

    @Test
    void testValidUserPasswordLength(){
        // valid test
        assertEquals(true, UserEntryProgram.validUserPassword("MyBdayis1290"), "data entered is valid");
        assertTrue(UserEntryProgram.validUserPassword("MyBdayis1290"));
    }

    @Test
    void testInvalidUserPassword(){
        // invalid test
        assertEquals(false, UserEntryProgram.validUserPassword("password"), "data entered is invalid");
        assertFalse(UserEntryProgram.validUserPassword("password"));
    }

    @Test
    void testInvalidUserPasswordLength(){
        // invalid test
        assertEquals(false, UserEntryProgram.validUserPasswordLength("aB1"), "data entered is invalid");
        assertFalse(UserEntryProgram.validUserPasswordLength("aB1"));
    }

}