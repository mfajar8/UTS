package AKB11.com.adapter;

//Kelas   : AKB-11
//NIM     : 10116463
//Nama    : Mochamad Fajar Ismatulloh
//Tanggal : 1 Mei 2019

import android.net.Uri;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.VideoView;

import AKB11.com.R;
import AKB11.com.model.ModelVideoActivity;

import java.util.ArrayList;

public class AdapterVideoActivity extends RecyclerView.Adapter<AdapterVideoActivity.DailyViewHolder> {

    private ArrayList<ModelVideoActivity> mvideoList;

    @NonNull
    @Override
    public DailyViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View v = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.fragment_video, viewGroup, false);
        DailyViewHolder Dv = new DailyViewHolder(v);
        return Dv;
    }

    @Override
    public void onBindViewHolder(@NonNull DailyViewHolder holder, int position) {
        ModelVideoActivity currentItem = mvideoList.get(position);
        holder.mVideoView.setVideoURI(Uri.parse(currentItem.getTxtNamaVideo()));
        holder.mVideoView.start();
        holder.txtJudul1.setText(currentItem.getRawVideo());
    }

    @Override
    public int getItemCount() {
        return mvideoList.size();
    }

    public static class DailyViewHolder extends RecyclerView.ViewHolder {
        public VideoView mVideoView;
        public TextView txtJudul1;

        public DailyViewHolder(@NonNull View itemView) {
            super(itemView);
            mVideoView = itemView.findViewById(R.id.rawVideo);
            txtJudul1 = itemView.findViewById(R.id.txtVideo);
        }
    }

    public AdapterVideoActivity(ArrayList<ModelVideoActivity> videoList) {
        mvideoList = videoList;
    }
}