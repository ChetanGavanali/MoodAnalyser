import com.moodanalyser.MoodAnalyserException;
import com.moodanalyser.MoodAnalyserWithException;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MoodAnalyserWithExceptionTest {
    @Test
    public void userProvidesInvalidMood() throws MoodAnalyserException {
        MoodAnalyserWithException moodAnalyzer = new MoodAnalyserWithException(null);
        String result = moodAnalyzer.analyseMood();
        System.out.println("Iam in " + result + " mood.");
        Assertions.assertEquals("Invalid", result);
    }

    @Test
    public void givenNullMoodShouldReturnHappy() throws MoodAnalyserException {
        try {
            MoodAnalyserWithException moodAnalyzer = new MoodAnalyserWithException("null");
            String result = moodAnalyzer.analyseMood();
            System.out.println("Iam in " + result + " mood.");
        } catch (MoodAnalyserException e) {
            Assertions.assertEquals("HAPPY", e.type);
        }
    }
}
