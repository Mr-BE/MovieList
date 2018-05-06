package com.genesis.be.android.movielist;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;


public class MovieAdapter extends ArrayAdapter {
    /**
     *
     * @param context refers to the current context(activity) ie Movie list activity
     * @param moviesArrayList refers to the list of movies to be displayed
     */
    public MovieAdapter(@NonNull Activity context, ArrayList<Movies> moviesArrayList) {
        super(context, 0, moviesArrayList);
    }

    //Get view to be displayed on the screen
    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
       //Check to see if view is being used, if not in use, populate view
        View listItemView = convertView;
        if (listItemView == null){
            listItemView = //inflate view from context to parent
                    LayoutInflater.from(getContext()).inflate(R.layout.activity_main, parent,false);
        }
        //Get movie objects for each list position
        Movies currentMovie = (Movies) getItem(position);

        //Locate Movie title textview
        TextView titleText = (TextView) listItemView.findViewById(R.id.titleText);
        //Set Title text to the aforementioned view
        titleText.setText(currentMovie.getmTitle());

        //Locate Movie genre
        TextView genreText = (TextView) listItemView.findViewById(R.id.genre_text);
        //Set genre text
        genreText.setText(currentMovie.getmGenre());

        //Locate release date
        TextView dateTExt = (TextView) listItemView.findViewById(R.id.release_date);
        //Set text to view
        dateTExt.setText(currentMovie.getmDate());

        //Locate thumbnail view
        ImageView thumbNail = (ImageView) listItemView.findViewById(R.id.movieImage);

        if (currentMovie.hasImage()) {
            //Get resource and set it to button
            thumbNail.setImageResource(currentMovie.getmImageResource());
            //Make sure image shows up
            thumbNail.setVisibility(View.VISIBLE);
        }
        else {
            //  Otherwise, hide image
            thumbNail.setVisibility(View.GONE
            );
        }
        //Locate Initials text
        TextView movieInitials = (TextView) listItemView.findViewById(R.id.initials);
        //Parameter to handle initials
        String initialsObject = currentMovie.getmTitle();
        //Format movie title to get initials
        String formattedInitials = formatMovieInitials(initialsObject);
        //Set initials to the appropriate view
        movieInitials.setText(formattedInitials);





        return listItemView;
        }
    /**
     * Helper method to get the initials of a book from its title
     * @param title is the book's title
     * @return book initials
     */
    private String formatMovieInitials(String title){
        String s = title.substring(0,3);
        return String.format(s);
    }
}
