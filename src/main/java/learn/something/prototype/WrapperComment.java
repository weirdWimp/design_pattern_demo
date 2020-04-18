package learn.something.prototype;

import learn.something.prototype.framework.Comment;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

/**
 * Concrete Prototype, 负责实现复制现有实例生成新实例
 */
public class WrapperComment implements Comment {

    private String commentSign;

    private int lineWords;

    public WrapperComment(String commentSign, int lineWords) {
        this.commentSign = commentSign;
        this.lineWords = lineWords;
    }

    /**
     *
     */
    @Override
    public void comment(String string) {
        String[] words = string.split(" ", -1);
        List<String> list = new ArrayList<>();

        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < words.length; i++) {
            builder.append(" ").append(words[i]);

            if ((i + 1) % lineWords == 0 || i == (words.length - 1)) {
                list.add(builder.toString());
                builder = new StringBuilder();
            }
        }

        Optional<Integer> maxSize = list.stream().map(String::length).max(Integer::compareTo);
        if (maxSize.isPresent()) {
            int maxLength = maxSize.get();

            for (int i = 0; i < maxLength + 4; i++) {
                System.out.print(commentSign);
            }

            System.out.println();

            String formatStr = "%s %-" + maxLength + "s %s\n";

            for (String comment : list) {
                System.out.printf(formatStr, commentSign, comment, commentSign);
            }

            for (int i = 0; i < maxLength + 4; i++) {
                System.out.print(commentSign);
            }
            System.out.println();
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
