package com.example.staticdemolistview;

import android.view.View;
import android.widget.ImageView;
import android.widget.RatingBar;

class ViewHolder {
    RatingBar rate=null;
    ViewHolder(View base) {
        this.rate=(RatingBar)base.findViewById(R.id.rate);
    }
}
