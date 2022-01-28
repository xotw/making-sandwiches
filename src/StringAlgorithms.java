public class StringAlgorithms {
    public StringAlgorithms() {
    }

    //----- String Validation algorithms ------//

    // ALL OR NOTHING //
    public boolean isUpperCase(String s){
        return s.chars().allMatch(Character::isUpperCase);
    }

    public boolean isLowerCase(String s){
        return s.chars().allMatch(Character::isLowerCase);
    }

    // SPECIFIC PROPERTIES //

    public boolean isPasswordComplex(String s){
        return s.chars().anyMatch(Character::isUpperCase) &&
                s.chars().anyMatch(Character::isLowerCase) &&
                s.chars().anyMatch(Character::isDigit);
    }

    // NORMALIZE STRINGS //

    public String normalizeString(String s){
        return s.toLowerCase().trim().replace(",", "");
    }

    // BASIC PARSING AND SEARCHING STRINGS //
    public void parseContents(String s){
        System.out.println("Option 1");
        for (char c : s.toCharArray()) {
            System.out.print(c);
        }

        System.out.println();
        System.out.println("Option 2");
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            System.out.print(c);
        }
    }

    // CUSTOM PARSING AND SEARCHING STRINGS //
    public boolean isAtEvenIndex(String s, char item) {
        if (s == null || s.isEmpty()) {
            return false;
        }
        for (int i = 0; i < s.length() / 2 + 1; i = i+2) {
            if (s.charAt(i) == item) {
                return true;
            }
        }
        return false;
    }

    // REVERSE STRINGS //
    public String reverse(String s) {
        if (s == null || s.isEmpty()){
            return s;
        }
        StringBuilder reversed = new StringBuilder();
        for (int i = s.length() - 1; i >= 0; i--) {
            reversed.append(s.charAt(i));
        }
        return reversed.toString();
    }

    public String reverse2(String s){
        if (s == null || s.isEmpty()){
            return s;
        }
        StringBuilder sb = new StringBuilder(s);
        return sb.reverse().toString();
    }

    public String reverseEachWord(String s){
        if (s == null || s.isEmpty()){
            return s;
        }

        StringBuilder result = new StringBuilder();
        String[] arr = s.split(" ");

        for (int i = 0; i < arr.length; i++) {
            result.append(reverse(arr[i]));
            if (i != arr.length - 1) {
                result.append(" ");
            }
        }
        return result.toString();
    }

}
