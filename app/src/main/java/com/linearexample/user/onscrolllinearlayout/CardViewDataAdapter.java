package com.linearexample.user.onscrolllinearlayout;

import java.util.List;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.bumptech.glide.Glide;
import com.bumptech.glide.load.engine.DiskCacheStrategy;

public class CardViewDataAdapter extends
        RecyclerView.Adapter<CardViewDataAdapter.ViewHolder> {


    private List<String> stList;
    private Context mContext;

    public CardViewDataAdapter(Context c, List<String> students) {

        this.mContext = c;
        this.stList = students;

    }


    @Override
    public CardViewDataAdapter.ViewHolder onCreateViewHolder(ViewGroup parent,
                                                             int viewType) {

        View itemLayoutView = LayoutInflater.from(parent.getContext()).inflate(
                R.layout.cardview_row, null);


        ViewHolder viewHolder = new ViewHolder(itemLayoutView);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(ViewHolder viewHolder, int position) {

        Glide.with(mContext).load(stList.get(position)).placeholder(R.drawable.ic_launcher).diskCacheStrategy(DiskCacheStrategy.SOURCE).into(viewHolder.imageView);
    }


    @Override
    public int getItemCount() {
        return stList.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {

        public ProportionalImageView imageView;


        public ViewHolder(View itemLayoutView) {
            super(itemLayoutView);

            imageView = (ProportionalImageView) itemLayoutView.findViewById(R.id.image);



        }

    }

}
