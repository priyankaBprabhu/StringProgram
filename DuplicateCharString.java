public class DuplicateCharString {
    public static void main(String[] args) {
        {
            String s = "abbccd";
            String s2 = "";
            for (int i = 0; i < s.length(); i++) {
                Boolean found = false;
                for (int j = 0; j < s2.length(); j++) {
                    if (s.charAt(i) == s2.charAt(j)) {
                        System.out.println(String.valueOf(s.charAt(i)));
                        found = true;
                        break;
                    }
                }

            }

        }
    }
}
