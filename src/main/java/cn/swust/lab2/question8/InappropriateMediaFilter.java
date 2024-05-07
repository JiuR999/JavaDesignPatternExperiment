package cn.swust.lab2.question8;

class InappropriateMediaFilter implements ContentFilter {
    public void process(Comment comment) {
        System.out.println("处理过滤不当图片和视频");
    }
}