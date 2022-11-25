import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Assert;
import org.junit.Test;

public class EvenOddCheckerTests {

    @Test

    public void evenCheckTest() {
        Assert.assertTrue(EvenOddChecker.check(42));
    }

    @Test

    public void oddCheckTest() {
        Assert.assertFalse(EvenOddChecker.check(53));
    }
}
