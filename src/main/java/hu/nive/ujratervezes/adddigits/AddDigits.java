package hu.nive.ujratervezes.adddigits;

public class AddDigits {
    Integer counter = 0;

    public Integer addDigits(String input) {
        if(input == null || input.isEmpty()) {
            counter--;
        } else {

            for (int i = 0; i < input.length(); i++) {
                char c = input.charAt(i);
                if (Character.isDigit(c)) {
                    int a = Character.getNumericValue(c);
                    counter = counter + a;
                }
            }
        }
        return counter;
    }
}
