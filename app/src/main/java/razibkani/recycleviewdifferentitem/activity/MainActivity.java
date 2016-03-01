package razibkani.recycleviewdifferentitem.activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

import razibkani.recycleviewdifferentitem.R;
import razibkani.recycleviewdifferentitem.adapter.NewsAdapter;
import razibkani.recycleviewdifferentitem.model.News;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private RecyclerView.LayoutManager mLayoutManager;
    private NewsAdapter newsAdapter;
    private ArrayList<News> newsList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        loadNewsData();

        recyclerView = (RecyclerView) findViewById(R.id.list);
        mLayoutManager = new LinearLayoutManager(MainActivity.this);
        recyclerView.setLayoutManager(mLayoutManager);
        newsAdapter = new NewsAdapter(this, newsList);
        recyclerView.setAdapter(newsAdapter);
    }

    private void loadNewsData() {
        newsList = new ArrayList<News>();
        newsList.add(new News("http://cdn-media-2.lifehack.org/wp-content/files/2014/03/25-Inspirational-Movie-Quotes-That-Will-Teach-You-The-Most-Valuable-Life-Lessons.jpg",
                "25 Inspirational Movie Quotes That Will Teach You", "Movies’ one of the most influential sources of inspiration for me. When my life goes rough, motivational movies remind me to be stronger.\n" +
                "\n" + "Here I’ve collected 25 inspirational movie quotes which will teach you the most valuable life lessons.",
                "01-03-2016", 0));
        newsList.add(new News("http://cdn-media-2.lifehack.org/wp-content/files/2016/02/12013009/8371975708_d87d3163c2_k-1024x683.jpg",
                "5 Cute Japanese Origami Ideas For Beginners", "Origami, or the art of paper folding, " +
                "originated in China around 100 BC and migrated to Japan several hundred years later. " +
                "The word “origami” is in fact a Japanese word that literally translates to “folding paper.” " +
                "Origami is sometimes confused with another Japanese paper art, kirigami, which means “cutting paper.”",
                "01-03-2016", 1));
        newsList.add(new News("http://cdn-media-2.lifehack.org/wp-content/files/2016/03/29043404/grow-hair-faster.jpg",
                "Easy And Natural Ways To Make Your Hair Grow Faster",
                "Do you dream of long, flowing, healthy hair? Lots of women wish that they had locks like Rapunzel, but sometimes it can seem like your hair isn’t even growing. " +
                        "If you are frustrated by slow hair growth, check out 12 simple and natural ways to help you to grow hair faster.",
                "01-03-2016", 1));
        newsList.add(new News("http://cdn-media-2.lifehack.org/wp-content/files/2016/03/01035222/nerd1-1024x683.jpg",
                "If You’ve Found a Nerd, Congratulations!", "If you find you are looking at someone " +
                "close to you and noticing that they are a bit of a nerd, then you may just be in luck. " +
                "Having a nerd to love and rely on may be the best thing that has happened to you in a long time. " +
                "Nerds are often given a bad rap but there is much more to nerds that you may give credit to.", "01-03-2016", 0));
    }
}
