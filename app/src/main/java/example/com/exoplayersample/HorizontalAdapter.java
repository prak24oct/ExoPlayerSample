package example.com.exoplayersample;

import android.content.Context;
import android.content.Intent;
import android.support.v4.content.LocalBroadcastManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.bumptech.glide.Glide;

import java.util.ArrayList;

/**
 * Created by takusemba on 2017/08/03.
 */

public class HorizontalAdapter extends RecyclerView.Adapter<HorizontalAdapter.ViewHolder> {

    private Context mContext;
    private ArrayList<ONLINE_MP3> musicData;

    public HorizontalAdapter(/*Context mContext,*/ArrayList<ONLINE_MP3> musicData) {
      //  this.mContext = mContext;
        this.musicData = musicData;
    }

    @Override
    public HorizontalAdapter.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int viewType) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_horizontal, viewGroup, false);
        return new HorizontalAdapter.ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(HorizontalAdapter.ViewHolder holder, int position) {
     /*   String title = titles[position];
        holder.title.setText(title);*/

     final ONLINE_MP3 online_mp3=musicData.get(position);
     holder.title.setText(online_mp3.getMp3_title());
     //Glide.with(mContext).load(online_mp3.getMp3_thumbnail_b()).into(holder.thumbnail);
     holder.songLayout.setOnClickListener(new View.OnClickListener() {
         @Override
         public void onClick(View view) {

             String mp3Url=online_mp3.getMp3_url();
             Log.d("mp3Url",mp3Url);
             Intent intent = new Intent("custom-message");
             intent.putExtra("mp3Url",mp3Url);
             intent.putExtra("release",true);
             LocalBroadcastManager.getInstance(mContext).sendBroadcast(intent);

         }
     });
    }

    @Override
    public int getItemCount() {
        return musicData.size();
    }

    class ViewHolder extends RecyclerView.ViewHolder {
        private TextView title;
        private LinearLayout songLayout;
       // private ImageView thumbnail;

        ViewHolder(final View itemView) {
            super(itemView);
            this.title = (TextView) itemView.findViewById(R.id.title);
            this.songLayout=(LinearLayout)itemView.findViewById(R.id.songLayout);
         //   this.thumbnail=(ImageView)itemView.findViewById(R.id.tiltle_image);
        }
    }
}