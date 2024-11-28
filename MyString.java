public class MyString {
    public static void main(String[] args) {
        System.out.println("Testing lowercase:");
        System.out.println("UnHappy : " + lowerCase("UnHappy"));
        System.out.println("This costs 15 Sheksls : " + lowerCase("This costs 15 Sheksls"));
        System.out.println("TLV : " + lowerCase("TLV"));
        System.out.println("lowercase : " + lowerCase("lowercase"));

        System.out.println("Testing contains:");
        System.out.println(contains("unhappy", "happy")); // true
        System.out.println(contains("happy", "unhappy")); // false
        System.out.println(contains("historical", "story")); // false
        System.out.println(contains("psychology", "psycho")); // true
        System.out.println(contains("personality", "son")); // true
        System.out.println(contains("personality", "dad")); // false
        System.out.println(contains("resignation", "sign")); // true
    }

    /** Returns the lowercase version of the given string. */
    public static String lowerCase(String str) {
        // Replace the following statement with your code
        return str.toLowerCase();
    }

    /** If str1 contains str2, returns true; otherwise returns false. */
    public static boolean contains(String str1, String str2) {
        // Replace the following statement with your code
        str1 = lowerCase(str1);
        str2 = lowerCase(str2);
        boolean bool = true;
        if ((str2.length() == 0)) {
            return true;
        }
        //boolean[] arr = new boolean[str2.length()];
        // for (int i = 0; i < str1.length() - str2.length(); i++) {
        //     if ((str1.length() - i + 1) < (str2.length())) {
        //         //System.out.println(str1.length() - i);
        //         //System.out.println(str2.length() + 1);
        //         bool = false;
        //         return bool;
        //     }
            //int counter = 0;
            for (int k = 0; k < str1.length() - str2.length(); k++) {
                if (str1.charAt(k) == str2.charAt(k)) {
                    bool = true;
                }else{bool = false; break;}

                //     for (int t = 0; t < str2.length(); t++) {
                //         if (str1.charAt(i + t) != str2.charAt(t)) {
                //             bool = false;
                //             break;
                //         }
                //     }
                //     if (bool) {
                //         return true;
                //     }
                // }
            }
            if ((bool)) {
                return true;
            }
        return false;

    }

}
