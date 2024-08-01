public class PalindromeChecker {
    public static void main(String[] args) {
        String s1 = "A man, a plan, a canal: Panama";
        String s2 = "race a car";
        String s3 = " ";

        System.out.println(isPalindrome(s1));
        System.out.println(isPalindrome(s2));
        System.out.println(isPalindrome(s3));
    }

        public static boolean isPalindrome(String s) {
            StringBuilder cleaned = new StringBuilder();

            for(int i = 0 ; i< s.length(); i++){
                char x = s.charAt(i);
                if (Character.isLetterOrDigit(x)) {
                    cleaned.append(Character.toLowerCase(x));
                }

            }
            String original = cleaned.toString();
            String reversed = cleaned.reverse().toString();

            return original.equals(reversed);


        }
    }

