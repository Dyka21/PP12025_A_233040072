package pertemuan10.stack2;

public class ParsePost {
    private MyStack stack;
    private String input;

    public ParsePost(String input) {
        this.input = input;
    }

    public int doParse() {
        stack = new MyStack(20);
        char ch;
        int bil1, bil2, hasilOps;

        for (int i = 0; i < input.length(); i++) {
            ch = input.charAt(i);
            stack.displayStack("" + ch + " ");

            if (ch >= '0' && ch <= '9') {
                stack.push((int)(ch - '0'));
            } else {
                bil2 = stack.pop();
                bil1 = stack.pop();

                switch (ch) {
                    case '+': hasilOps = bil1 + bil2; break;
                    case '-': hasilOps = bil1 - bil2; break;
                    case '*': hasilOps = bil1 * bil2; break;
                    case '/': hasilOps = bil1 / bil2; break;
                    default : hasilOps = 0; break;
                }

                stack.push(hasilOps);
            }
        }

        hasilOps = stack.pop();
        return hasilOps;
    }
}
