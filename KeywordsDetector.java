public class KeywordsDetector {
    public static void main(String[] args) {
        String[] sentences = {
                "Our product will transform the market",
                "Programming is both painful and engaging",
                "This has nothing to do with machine learning",
                "We need to leverage our core competencies",
                "Let's talk about data and algorithms",
                "Chatbots are great but must be used carefully",
                "This blockchain-based solution will disrupt the industry",
                "The team showed great Synergy in the last project",
                "Use simple words without hype and fluff",
                "Our new technology presents a significant paradigm shift",
                "Effective presentations must be clear, concise, and humble"
        };
        // Some keywords that typically signal bullshit contents in business
        // presentations
        String[] keywords = { "synergy", "disrupt", "leverage", "Paradigm", "transform" };
        detectAndPrint(sentences, keywords);
    }

    // Iterates through all the sentences.
    // If a sentence contains one or more of the kewords, prints it.
    public static void detectAndPrint(String[] sentences, String[] keywords) {
        // Replace this comment with your code
        String choose_word = "";
        for (int i = 0; i < sentences.length; i++) { // go thrugh the sentences and brine 1
            int index_of_word = 0;
            int index_end_word = 0;
            String now_sen = sentences[i];
            for (int s = 0; s < now_sen.length(); s++) { // all char in sentence
                if (now_sen.charAt(s) == ' ' || (s == now_sen.length() - 1)) {
                    choose_word = now_sen.substring(index_of_word, s);
                    
                }else{
                    choose_word = now_sen.substring(index_of_word, s + 1);
                    break;
                }
                index_of_word = s + 1;
            }
            // System.out.println(s);
            // System.out.println(index_end_word);
            for (int k = 0; k < keywords.length; k++) { // go throw
                if (contains(choose_word.toLowerCase(), keywords[k].toLowerCase()) == true) {
                    System.out.println(now_sen);
                    break;
                }

            }
        }

    }

    // for (int t = 0; t < sentences[i].length(); t++) { // go throw the length of
    // sentences and seprate words
    // index_end_word = sentences[i].indexOf(" ");
    // t = index_of_word;
    // index_of_word = index_end_word;

    // }
    // choose_word=sentences[i].substring(sentences[i].charAt(index_of_word),sentences[i].charAt(index_end_word));

    // s =

    // if (sentences[i].charAt(k) != keywords[k].charAt(k)) {
    // break;
    // break;
    // }
    // char [] only_sentence = new char[sentences[i].length()];
    // System.out.println(sentences[i].length());

    public static boolean contains(String str1, String str2) {
        // Replace the following statement with your code
        // str1 = lowerCase(str1);
        // str2 = lowerCase(str2);
        boolean bool = true;
        if ((str2.length() == 0)) {
            return true;
        }

        for (int i = 0; i <= str1.length() - str2.length(); i++) {
            bool = true;
            for (int t = 0; t < str2.length(); t++) {
                if (str1.charAt(i + t) != str2.charAt(t)) {
                    bool = false;
                    break;
                }
            }
            if (bool) {
                return true;
            }
        }
        return false;
    }
}

// seprate words
