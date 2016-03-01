package razibkani.recycleviewdifferentitem.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import java.util.ArrayList;

import razibkani.recycleviewdifferentitem.R;
import razibkani.recycleviewdifferentitem.model.News;

/**
 * Created by razibkani on 3/1/16.
 */
public class NewsAdapter extends RecyclerView.Adapter<NewsAdapter.ViewHolder> {

    private final int BIG = 0;
    private final int SMALL = 1;
    private ArrayList<News> newsList;
    private Context context;

    public NewsAdapter(Context context, ArrayList<News> newsList) {
        this.context = context;
        this.newsList = newsList;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view;
        if (viewType == BIG) {
            view = LayoutInflater.from(parent.getContext())
                    .inflate(R.layout.item_big_news, parent, false);

            return new NewsAdapter.ViewHolder(view);
        } else {
            view = LayoutInflater.from(parent.getContext())
                    .inflate(R.layout.item_small_news, parent, false);

            return new NewsAdapter.ViewHolder(view);
        }
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        NewsAdapter.ViewHolder viewHolder = holder;
        Picasso.with(context)
                .load(newsList.get(position).getImage())
                .into(viewHolder.image);
        viewHolder.title.setText(newsList.get(position).getTitle());
        viewHolder.description.setText(newsList.get(position).getDescription());
        viewHolder.date.setText(newsList.get(position).getDate());
    }

    @Override
    public int getItemCount() {
        return this.newsList.size();
    }

    @Override
    public int getItemViewType(int position) {
        return newsList.get(position).getNewsType();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        ImageView image;
        TextView title;
        TextView description;
        TextView date;

        public ViewHolder(View view) {
            super(view);

            image       = (ImageView) view.findViewById(R.id.image);
            title       = (TextView) view.findViewById(R.id.title);
            description = (TextView) view.findViewById(R.id.description);
            date        = (TextView) view.findViewById(R.id.date);
        }
    }
}
