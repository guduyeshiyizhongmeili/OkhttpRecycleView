package com.bwie.test.liuhaifeng20170920;

import java.util.List;

/**
 * 刘海峰.8:34
 */

public class News {

    /**
     * date : 20170920
     * stories : [{"images":["https://pic4.zhimg.com/v2-9afcd53069c23fd9b9788280984c8c5b.jpg"],"type":0,"id":9617855,"ga_prefix":"092008","title":"直到他们的「蛋蛋」出了问题，人们才发现工作也会带来伤害"},{"images":["https://pic2.zhimg.com/v2-341dad1e064583201c7d373f2ed6a965.jpg"],"type":0,"id":9621235,"ga_prefix":"092007","title":"爱牙日到了，牙齿有小毛病的你，别再安慰自己「年纪大了」"},{"images":["https://pic3.zhimg.com/v2-1fe2f5ecbd293285bd1603a5c20ff7b2.jpg"],"type":0,"id":9623559,"ga_prefix":"092007","title":"比起 iPhone X，iPhone 8 像一个老朋友，有小惊喜，也让人安心"},{"images":["https://pic1.zhimg.com/v2-82a64a06ddff52be24bec37d7a3085bc.jpg"],"type":0,"id":9621945,"ga_prefix":"092007","title":"为什么女朋友不喜欢你玩游戏？"},{"images":["https://pic3.zhimg.com/v2-b79e153f6a7a81798cc10a5234463682.jpg"],"type":0,"id":9623569,"ga_prefix":"092006","title":"瞎扯 · 如何正确地吐槽"}]
     * top_stories : [{"image":"https://pic1.zhimg.com/v2-4a4070e7bc8c2db7da889f66f4cb0cec.jpg","type":0,"id":9621945,"ga_prefix":"092007","title":"为什么女朋友不喜欢你玩游戏？"},{"image":"https://pic4.zhimg.com/v2-bf158207a77d230d45adebf5a3973413.jpg","type":0,"id":9623559,"ga_prefix":"092007","title":"比起 iPhone X，iPhone 8 像一个老朋友，有小惊喜，也让人安心"},{"image":"https://pic2.zhimg.com/v2-5857d357cabae68dba56e3f5001a0601.jpg","type":0,"id":9623051,"ga_prefix":"091918","title":"《绝地求生：大逃杀》会火爆一时然后人气暴跌吗？"},{"image":"https://pic1.zhimg.com/v2-a63094fb6272c0b38c88c698e223723c.jpg","type":0,"id":9622887,"ga_prefix":"091917","title":"谁是你最敬佩的人？"},{"image":"https://pic2.zhimg.com/v2-a8b38d54bb649a8a6dff8205b9b3eb45.jpg","type":0,"id":9622737,"ga_prefix":"091915","title":"苹果放弃打赏抽成，也不许微博微信抽，这么做的原因是？"}]
     */

    private String date;
    private List<StoriesBean> stories;
    private List<TopStoriesBean> top_stories;

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public List<StoriesBean> getStories() {
        return stories;
    }

    public void setStories(List<StoriesBean> stories) {
        this.stories = stories;
    }

    public List<TopStoriesBean> getTop_stories() {
        return top_stories;
    }

    public void setTop_stories(List<TopStoriesBean> top_stories) {
        this.top_stories = top_stories;
    }

    public static class StoriesBean {
        /**
         * images : ["https://pic4.zhimg.com/v2-9afcd53069c23fd9b9788280984c8c5b.jpg"]
         * type : 0
         * id : 9617855
         * ga_prefix : 092008
         * title : 直到他们的「蛋蛋」出了问题，人们才发现工作也会带来伤害
         */

        private int type;
        private int id;
        private String ga_prefix;
        private String title;
        private List<String> images;

        public int getType() {
            return type;
        }

        public void setType(int type) {
            this.type = type;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getGa_prefix() {
            return ga_prefix;
        }

        public void setGa_prefix(String ga_prefix) {
            this.ga_prefix = ga_prefix;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public List<String> getImages() {
            return images;
        }

        public void setImages(List<String> images) {
            this.images = images;
        }
    }

    public static class TopStoriesBean {
        /**
         * image : https://pic1.zhimg.com/v2-4a4070e7bc8c2db7da889f66f4cb0cec.jpg
         * type : 0
         * id : 9621945
         * ga_prefix : 092007
         * title : 为什么女朋友不喜欢你玩游戏？
         */

        private String image;
        private int type;
        private int id;
        private String ga_prefix;
        private String title;

        public String getImage() {
            return image;
        }

        public void setImage(String image) {
            this.image = image;
        }

        public int getType() {
            return type;
        }

        public void setType(int type) {
            this.type = type;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getGa_prefix() {
            return ga_prefix;
        }

        public void setGa_prefix(String ga_prefix) {
            this.ga_prefix = ga_prefix;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }
    }
}
