package twitter;

import com.twitter.twittertext.TwitterTextParseResults;
import com.twitter.twittertext.TwitterTextParser;

public class Utils {

        /**
         * @param tweet text for which we want to counter the number of characters
         * @return return the number of “effective” characters this tweet corresponds with.
         */
        public static int getCount(String tweet) {
                final TwitterTextParseResults parsingResult = TwitterTextParser.parseTweetWithoutUrlExtraction(tweet);
                return parsingResult.weightedLength;
        }

}
