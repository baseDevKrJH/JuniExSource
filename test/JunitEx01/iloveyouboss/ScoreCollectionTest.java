package JunitEx01.iloveyouboss;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.*;

public class ScoreCollectionTest {
    @Test
    public void answersArithmeticMeanOfTwoNumbers() {
        // 준비
        ScoreCollection collection = new ScoreCollection();
        collection.add(()->5);
        collection.add(()->7);

        // 실행
        int actulaResult = collection.arithmeticMean();

        // 단언
        assertThat(actulaResult, equalTo(5));
    }
}