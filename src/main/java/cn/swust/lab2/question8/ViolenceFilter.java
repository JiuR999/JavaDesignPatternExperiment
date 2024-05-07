package cn.swust.lab2.question8;

import java.util.ArrayList;
import java.util.List;

class ViolenceFilter implements ContentFilter {
    private List<String> profanityWords;

    public ViolenceFilter() {
        profanityWords = new ArrayList<>();
        profanityWords.add("暴力");
        profanityWords.add("血腥");
    }
    public void process(Comment comment) {
        String text = comment.getText();
        for (String profanityWord : profanityWords) {
            text = text.replaceAll(profanityWord,"***");
        }
        comment.setText(text);
    }
}