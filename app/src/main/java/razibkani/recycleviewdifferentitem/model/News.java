package razibkani.recycleviewdifferentitem.model;

/**
 * Created by razibkani on 3/1/16.
 */
public class News {

    private String image;
    private String title;
    private String description;
    private String date;
    private int newsType; //0 == big | 1 == small

    public News() {}

    public News(String image, String title, String description, String date, int newsType) {
        this.image = image;
        this.title = title;
        this.description = description;
        this.date = date;
        this.newsType = newsType;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public int getNewsType() {
        return newsType;
    }

    public void setNewsType(int newsType) {
        this.newsType = newsType;
    }

    @Override
    public String toString() {
        return "News{" +
                "image='" + image + '\'' +
                ", title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", date='" + date + '\'' +
                ", newsType=" + newsType +
                '}';
    }
}