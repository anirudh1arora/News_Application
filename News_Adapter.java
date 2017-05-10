package com.anirudh.android.news_application;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;

/**
 * Created by Anirudh on 3/1/2017.
 */

public class News_Adapter extends ArrayAdapter<News_Display> {


    public News_Adapter(Context context, List<News_Display> news_display) {
        super(context, 0,news_display);
    }

    public View getView(int position, View convertView, ViewGroup parent) {

        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.activity_main, parent, false);
        }
        News_Display currentNews = getItem(position);

        // Find the TextView in the list_item.xml layout with the ID version_name
        TextView titileView = (TextView) listItemView.findViewById(R.id.primary_location);
        // set this text on the name TextView
        titileView.setText(currentNews.getNewsTitle());


        TextView date = (TextView) listItemView.findViewById(R.id.dateDisplay);
        // set this text on the name TextView
        date.setText(currentNews.getNewsDate());

        return listItemView;
    }

}
