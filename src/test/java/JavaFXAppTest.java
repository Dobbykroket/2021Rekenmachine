import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class JavaFXAppTest {
    @Test
    void aDummyTest() {
        assertEquals(0,0);
    }

    @Test
    void computeAddTest() {
        //Arrange
        int num1 = 3;
        int num2 = 4;
        int expected = 7;
        JavaFXApp SOT = new JavaFXApp();

        //Act
        int result = SOT.computeAdd(num1, num2);

        //Assert
        assertEquals(expected, result);

    }
}