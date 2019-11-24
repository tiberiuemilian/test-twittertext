package twitter;

import java.text.Normalizer;

public class Utils {

        /**
         * @param tweet text for which we want to counter the number of characters
         * @return return the number of “effective” characters this tweet corresponds with.
         */
        public static int getCount(String tweet) {

            if (tweet == null || tweet.trim().length() == 0) {
                return 0;
            } else {
                String normalizedTweet = Normalizer.normalize(tweet, Normalizer.Form.NFC);
                int tweetLength = normalizedTweet.length();

                if (tweetLength == 0) {
                    return 0;
                } else {
                    return tweetLength;
                }


            }

        }

}
