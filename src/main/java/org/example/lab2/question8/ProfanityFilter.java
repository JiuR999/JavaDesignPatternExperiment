package org.example.lab2.question8;

import java.util.ArrayList;
import java.util.List;

class ProfanityFilter implements ContentFilter {
    private List<String> profanityWords;

    public ProfanityFilter() {
        profanityWords = new ArrayList<>();
        profanityWords.add("黄色");
        profanityWords.add("广告");
    }

    public void process(Comment comment) {
        String text = comment.getText();
        for (String word : profanityWords) {
            text = text.replaceAll(word, "***");
        }
        comment.setText(text);
    }
}