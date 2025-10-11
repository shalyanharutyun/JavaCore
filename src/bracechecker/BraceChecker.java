package bracechecker;

public class BraceChecker {
    private String text;

    public BraceChecker(String text) {
        this.text = text;
    }

    public void check() {
        Stack stack = new Stack();

        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);

            if (c == '(' || c == '[' || c == '{') {
                stack.push(c);
            }
            else if (c == ')' || c == ']' || c == '}') {
                if (stack.isEmpty()) {
                    System.out.println("Error: closed " + c + " at " + i + " but nothing opened before it");
                } else {
                    char last = (char) stack.pop();
                    if (!matches(last, c)) {
                        System.out.println("Error: opened " + last + " but closed " + c + " at " + i);
                    }
                }
            }
        }
        while (!stack.isEmpty()) {
            char unclosed = (char) stack.pop();
            System.out.println("Error: opened " + unclosed + " but not closed");
        }
    }

    private boolean matches(char open, char close) {
        return (open == '(' && close == ')') ||
                (open == '[' && close == ']') ||
                (open == '{' && close == '}');
    }
}
