package twitter;

import junit.framework.TestCase;

public class UtilsTest extends TestCase {

    public void testCharacterCount() {
        assertEquals("Challenge test", 63, Utils.getCount("Former UNM law professor named FERC chair http://bit.ly/1IifCDF"));

        assertEquals("café - 4 chars", 4, Utils.getCount("café"));
        assertEquals("Handle null input", 0, Utils.getCount(null));
        assertEquals("Handle empty input", 0, Utils.getCount(""));
        assertEquals("Count Latin chars normally", 11, Utils.getCount("Normal Text"));
        assertEquals("Count hashtags, @mentions and cashtags normally", 38, Utils.getCount("Text with #hashtag, @mention and $CASH"));
        assertEquals("Count CJK chars with their appropriate weights", 94, Utils.getCount("CJK Weighted chars: " +
                                                                                "あいうえおかきくけこあいうえおかきくけこあいうえおかきくけこあいうえおかき"));
        assertEquals("URLs should be counted without transformation", 69, Utils.getCount("Text with url: " +
                                                                                "a.com http://abc.com https://longurllongurllongurl.com"));
        assertEquals("t.co URLs should be counted without transformation", 39, Utils.getCount("Text with t.co url: https://t.co/foobar"));
    }
}
