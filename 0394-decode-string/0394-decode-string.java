class Solution {
    public String decodeString(String s) {
        Stack<Integer> numStack = new Stack<>();

        Stack<String> stringStack = new Stack<>();

        StringBuilder currentString = new StringBuilder();
        int number = 0;
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (Character.isDigit(ch)) {
                number = number * 10 + (ch - '0');
            } else if (ch == '[') {
                numStack.push(number);
                stringStack.push(currentString.toString());
                currentString = new StringBuilder();
                number = 0;
            } else if (ch == ']') {
                int repeateNumber = numStack.pop();
                String previous = stringStack.pop();
                StringBuilder repeatePart = new StringBuilder();
                for (int j = 0; j < repeateNumber; j++) {
                    repeatePart.append(currentString);
                }
                currentString = new StringBuilder(previous);
                currentString.append(repeatePart);
            } else {
                currentString.append(ch);
            }

        }

        return currentString.toString();

    }
}