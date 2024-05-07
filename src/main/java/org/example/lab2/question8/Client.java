package org.example.lab2.question8;

public class Client {
    public static void main(String[] args) {
        ContentFilterChain filterChain = new ContentFilterChain();
        filterChain.addFilter(new ProfanityFilter());
        filterChain.addFilter(new ViolenceFilter());
        filterChain.addFilter(new InappropriateMediaFilter());

        Comment comment = new Comment("这是一条包含敏感词和暴力内容的评论:黄色情节和暴力行为。");

        System.out.println("审核前的内容：" + comment.getText());
        filterChain.process(comment);
        System.out.println("审核后的内容：" + comment.getText());
    }
}
