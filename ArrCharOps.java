/**
 * A library of operations on arrays of characters (char values).
 * The library also features a string comparison method.
 */
public class ArrCharOps {
    public static void main(String[] args) {
        String str = "clearly";
        char[] arr1 = { 'c', 'l', 'e', 'a', 'r', 'l', 'y' };
        char[] arr2 = { 'U', 'n', 'd', 'e', 'r', 's', 't', 'o', 'o', 'd' };
        System.out.println(str); // Prints the string
        println(arr1); // Prints an array of characters
        System.out.println(charAt(arr1, 2));
        System.out.println(indexOf(arr1, 'l'));
        System.out.println(indexOf(arr1, 'l', 3));
        System.out.println(lastIndexOf(arr1, 'l'));
        System.out.println(concat(arr1, arr2));
        System.out.println(subArray(arr2, 2, 9));
        System.out.println(compareTo("abcd", "abcd"));
        System.out.println(compareTo("abc", "abcd"));
        System.out.println(compareTo("abw", "abcd"));
        System.out.println(compareTo("Abcd", "a"));
        System.out.println(compareTo("apple", "banana"));
        System.out.println(compareTo("apple", "applepie"));
        System.out.println(compareTo("Zoo", "zoo"));
        System.out.println(hashCode(arr1));
        System.out.println(hashCode(arr2));
    }

    /**
     * Prints the given array of characters, and moves the cursor to the next line.
     */
    public static void println(char[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
        }
        System.out.println();
    }

    /**
     * Returns the char value at the specified index. Assume that the array is
     * non-empty.
     */
    public static char charAt(char[] arr, int index) {
        // Replace the following statement with your code
        return arr[index];
    }

    /**
     * If the two arrays have the same value in every index,
     * returns true; Otherwise returns false.
     */
    public static boolean equals(char[] arr1, char[] arr2) {
        // Replace the following statement with your code
        boolean bool = true;
        if ((arr1.length == 0 || arr2.length == 0)) {
            bool = true;
        }
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] != arr2[i]) {
                bool = false;
            }
        }
        return bool;
    }

    /**
     * Returns the index within the given array of the first occurrence of the given
     * character.
     * If no such character is found, returns -1.
     */
    public static int indexOf(char[] arr, char ch) {
        // Replace the following statement with your code
        int is_it = -1;
        if (arr.length == 0) {
            is_it = 0;
        }
        for (int i = 0; i < arr.length; i++) {
            if ((arr[i] == ch)) {
                is_it = i + 1;
            }
        }
        return is_it;
    }

    /**
     * Same as indexOf(char[], char), but starts the search in the given index.
     */
    public static int indexOf(char[] arr, char ch, int fromIndex) {
        // Replace the following statement with your code
        int is_it = -1;
        for (int i = fromIndex; i < arr.length; i++) {
            if ((arr[i] == ch)) {
                is_it = i + 1;
            }
        }
        return is_it;
    }

    /**
     * Returns the index within the given arr of the last occurrence of the given
     * character.
     * If no such character is found, returns -1.
     */
    public static int lastIndexOf(char[] arr, char ch) {
        // Replace the following statement with your code
        int is_it = -1;
        for (int i = arr.length; i < 0; i--) {
            if ((arr[i] == ch)) {
                is_it = i + 1;
            }
        }
        return is_it;
    }

    /*
     * Returns an array which is the concatanation of the two given arrays.
     */
    public static char[] concat(char[] arr1, char[] arr2) {
        // Replace the following statement with your code
        char[] new_arr = new char[arr1.length + arr2.length];
        for (int i = 0; i < arr1.length; i++) {
            new_arr[i] = arr1[i];
        }
        for (int k = arr1.length; k < arr1.length + arr2.length; k++) {
            new_arr[k] = arr1[k - arr1.length];
        }
        return new_arr;
    }

    /**
     * Returns a new array that can be described as a sub-array of this array.
     * The sub-array begins at the specified beginIndex and extends to the character
     * at index endIndex - 1.
     * For example, if arr contains the characters "hamburger", then subArray(4, 8)
     * returns an array of
     * characters containing the characters "urge".
     */
    public static char[] subArray(char[] arr, int beginIndex, int endIndex) {
        // Replace the following statement with your code
        char[] new_arr1 = new char[endIndex - beginIndex];
        int k = 0;
        for (int i = beginIndex; i < endIndex; i++) {
            new_arr1[k] = arr[i];
            k++;
        }
        return new_arr1;
    }

    /**
     * Returns a single integer that represents the given array. This integer is
     * sometimes
     * referred to as the array's "hash code". Later in the course we'll explain
     * what these
     * hash codes are used for. For now, simply implement the specification given
     * below.
     * The hash code is computed as: arr[0]*7^(n-1) + arr[1]*7^(n-2) + ... +
     * arr[n-2]*7 + arr[n-1]
     * where arr[i] is the i'th character of the array, and n is the array's length.
     * The hash value of an empty array is zero.
     */
    public static long hashCode(char[] arr) {
        // Replace the following statement with your code
        int hash_value = 0;
        int n = arr.length;
        int k = 1;
        for (int i = 0; i < arr.length - 2; i++) {
            hash_value = hash_value + (int) Math.pow((arr[i] * 7), (n - k));
            k++;
        }
        hash_value = hash_value + arr[n - 1] + (arr[n - 2] * 7);
        return hash_value;
    }

    /**
     * Compares the two strings lexicographically.
     * Assume that both strings are not empty.
     * 
     * Characters are compared one by one from left to right, using their numeric
     * Unicode values,
     * as follows:
     * 1. If two characters at the same position in both strings are different,
     * the string with the smaller character is considered lexicographically
     * smaller.
     * 2. If all characters in the shorter string match the corresponding characters
     * in the longer string, the shorter string is considered lexicographically
     * smaller.
     * 3. If both strings have the same characters and the same length, they are
     * considered equal.
     * 
     * Examples:
     * - "apple" is less than "banana" because 'a' comes before 'b'.
     * - "abc" is less than "abcd" because it is shorter.
     * - "hello" is equal to "hello".
     * - "date" is greater than "dark" because 't' comes after 'k'.
     * 
     * @param str1 the first string to compare
     * @param str2 the second string to compare
     * @return -1 if str1 is lexicographically less than str2,
     *         zero if they are equal, and 1 if str1 is
     *         lexicographically greater than str2.
     *         return -2 if there is an error with the input.
     */
    public static int compareTo(String str1, String str2) {
        // Replace the following statement with your code
        int code = 0;
        if (str1.length() == 0 || str2.length() == 0) {
            code = -2;
        } else {
            if (str2.length() >= str1.length()) {
                for (int i = 0; i < str1.length(); i++) {
                    if (str2.charAt(i) > str1.charAt(i)) {
                        code = 1;
                    } else {
                        if (str1.charAt(i) > str2.charAt(i)) {
                            code = -1;
                        }
                    }
                } // close for
                if (code == 0) {
                    if (str1.length() > str2.length()) {
                        code = 1;
                    }
                }
            } // close first if
            else {
                for (int i = 0; i < str2.length(); i++) {
                    if (str2.charAt(i) > str1.charAt(i)) {
                        code = 1;
                    } else {
                        if (str1.charAt(i) > str2.charAt(i)) {
                            code = -1;
                        }
                    }
                } // close for
            }
        }
        return code;

    }
}
