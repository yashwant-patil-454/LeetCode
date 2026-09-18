class Solution {
    public boolean backspaceCompare(String s, String t) {
        Stack<Character> stackS = buildStack(s);
        Stack<Character> stackT = buildStack(t);

        return stackS.equals(stackT);

    }

    private Stack<Character> buildStack(String s) {

        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {

            if (s.charAt(i) != '#') {
                stack.push(s.charAt(i));
            } else {
                if (!stack.isEmpty()) {
                    stack.pop();
                }
            }
        }

        return stack;
    }
}