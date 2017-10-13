package com.example.nikitasotnikov.newsapp;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

/**
 * Created by nikitasotnikov on 11.09.2017.
 */

public class NewsAdapter extends ArrayAdapter<News>{

    public NewsAdapter(Activity context, List<News> news) {
        super(context, 0, news);
    }

    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if there is an existing list item view (called convertView) that we can reuse,
        // otherwise, if convertView is null, then inflate a new list item layout.
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.news_example, parent, false);
        }

        // Find the news at the given position in the list of news
        News currentNews = getItem(position);

        // Find the TextView with view ID title
        TextView titleView = (TextView) listItemView.findViewById(R.id.title);

        // Display the title of the current news in that TextView
        titleView.setText(currentNews.getTitle());


        // Find the TextView with view ID sectionName
        TextView sectionNameView = (TextView) listItemView.findViewById(R.id.section_name);
        // Display the sectionName of the current news in that TextView
        sectionNameView.setText(currentNews.getSectionName());

        // Find the TextView with view ID date
        TextView dateView = (TextView) listItemView.findViewById(R.id.date);
        // Format the date string (i.e. "3 mar 1984")
        String formattedDate = formatDate(currentNews.getDate());
        // Display the date of the current news in that TextView
        dateView.setText(formattedDate);

        // Return the list item view that is now showing the appropriate data
        return listItemView;
    }

    /**
     * Return the formatted date string (i.e. "3 mar 1984") from a Date object.
     */

    private String formatDate(String dtStart) {
        SimpleDateFormat dateFormatStart = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss'Z'");
        SimpleDateFormat dateFormatEnd = new SimpleDateFormat("dd MMM yyyy");
        try {
            Date date = dateFormatStart.parse(dtStart);
            String endDate = dateFormatEnd.format(date);
            return endDate;
        } catch (ParseException e) {
            e.printStackTrace();
            return null;
        }
    }

}
