public class bai1 {
        public static void main(String[] args) {
            char ch1 = 'A';
            char ch2 = 'z';
            char ch3 = '1';
            char ch4 = '#';
            System.out.println("isLetter(ch1): " + Character.isLetter(ch1));
            System.out.println("isLetter(ch3): " + Character.isLetter(ch3));
            System.out.println("isDigit(ch3): " + Character.isDigit(ch3));
            System.out.println("isDigit(ch1): " + Character.isDigit(ch1));
            System.out.println("isUpperCase(ch1): " + Character.isUpperCase(ch1));
            System.out.println("isUpperCase(ch2): " + Character.isUpperCase(ch2));
            System.out.println("isLowerCase(ch2): " + Character.isLowerCase(ch2));
            System.out.println("isLowerCase(ch1): " + Character.isLowerCase(ch1));
            System.out.println("toUpperCase(ch2): " + Character.toUpperCase(ch2));
            System.out.println("toLowerCase(ch1): " + Character.toLowerCase(ch1));
            System.out.println("isWhitespace(' '): " + Character.isWhitespace(' '));
            System.out.println("isWhitespace(ch4): " + Character.isWhitespace(ch4));
            System.out.println("isLetterOrDigit(ch1): " + Character.isLetterOrDigit(ch1));
            System.out.println("isLetterOrDigit(ch4): " + Character.isLetterOrDigit(ch4));
            System.out.println("digit('1'): " + Character.digit('1', 10));
            System.out.println("digit('A', 16): " + Character.digit('A', 16));
            System.out.println("toString(ch4): " + Character.toString(ch4));
        }
}
