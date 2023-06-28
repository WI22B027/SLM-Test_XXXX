package at.technikum;

import at.technikum.controller.SlmTestXxxxController;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class SlmTestXxxApplicationTests {

    @Test
    void getFactTest() {
        //Arrange
        int result = 120;
        SlmTestXxxxController mc = new SlmTestXxxxController();

        //Act
        int factorial = mc.getFactorial(5);


        //Assert
        assertEquals(factorial, result);
    }

}
