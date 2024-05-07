package cn.swust.lab2.question8;

import java.util.ArrayList;
import java.util.List;

class ContentFilterChain {
    private List<ContentFilter> filters;

    public ContentFilterChain() {
        filters = new ArrayList<>();
    }

    public void addFilter(ContentFilter filter) {
        filters.add(filter);
    }

    public void process(Comment content) {
        for (ContentFilter filter : filters) {
            filter.process(content);
        }
    }
}