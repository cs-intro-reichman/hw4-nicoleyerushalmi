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
            for (int t = 0; t < sentences[i].length(); t++) { // go throw the length of sentences and check number of string inside
                choose_word = sentences[i].substring(sentences[i].indexOf(" "), sentences[i].indexOf(" "));
                for (int k = 0; k < keywords.length; k++) { // go throw 
                    if (choose_word == keywords[k]) {
                        System.out.println(sentences[i]);
                        break;
                    }
                }
            }

        }
    }
}
