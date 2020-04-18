package learn.something.prototype;

import learn.something.prototype.framework.Comment;

/**
 * Concrete Prototype, 负责实现复制现有实例生成新实例
 */
public class StartComment implements Comment {

    private String commentSign;

    private int lineWords;

    public StartComment(String commentSign, int lineWords) {
        this.commentSign = commentSign;
        this.lineWords = lineWords;
    }

    @Override
    public void comment(String string) {
        String[] words = string.split(" ", -1);
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < words.length; i++) {
            builder.append(" ").append(words[i]);

            if ((i + 1) % lineWords == 0 || i == (words.length - 1)) {
                System.out.println(commentSign + " " + builder.toString());
                builder = new StringBuilder();
            }
        }
    }

    @Override
    public Comment createClone() {
        Comment product = null;
        try {
            product = (Comment) clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return product;
    }
}
