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

    @Test
    void saveTest() {
        //Arrange
        int result = 144;

        SlmTestXxxxController mc = new SlmTestXxxxController();

        //Act
        int factorial1 = mc.getFactorial(5);
        int factorial2 = mc.getFactorial(4);


        //Assert
        assertEquals(factorial1+factorial2, result);
    }

    @Test
    void totalTest() {
        //Arrange
        int result = 144;

        SlmTestXxxxController mc = new SlmTestXxxxController();

        //Act
        int factorial1 = mc.getFactorial(5);
        int factorial2 = mc.getFactorial(4);

        int save = mc.returnTotal();


        //Assert
        assertEquals(save, result);
    }
}
