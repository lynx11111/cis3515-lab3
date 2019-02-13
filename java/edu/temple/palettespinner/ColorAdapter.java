package edu.temple.palettespinner;

import android.content.Context;
import android.graphics.Color;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by zc on 2/9/18.
 */

public class ColorAdapter extends BaseAdapter {

    Context ctx;
    ArrayList<String> colors;

    public ColorAdapter(Context c, ArrayList<String> colors ){
        this.ctx = c;
        this.colors = colors;
    }

    @Override
    public int getCount() {
        return colors.size();
    }

    @Override
    public Object getItem(int position) {
        return colors.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        TextView t = new TextView(this.ctx);
        t.setText( colors.get(position) );
        t.setGravity(Gravity.CENTER_HORIZONTAL);
        t.setTextSize(24);
        t.setPadding(10, 8, 10, 8);
        try {
            t.setBackgroundColor(Color.parseColor( colors.get(position) ));
        } catch( Exception e ) {

        }

        return t;
    }
}
