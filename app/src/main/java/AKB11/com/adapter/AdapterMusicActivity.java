package AKB11.com.adapter;

//Kelas   : AKB-11
//NIM     : 10116463
//Nama    : Mochamad Fajar Ismatulloh
//Tanggal : 1 Mei 2019

import android.content.Context;
import android.media.MediaPlayer;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import AKB11.com.R;
import AKB11.com.model.ModelMusicActivity;
import butterknife.ButterKnife;
import butterknife.OnClick;

import java.util.ArrayList;

public class AdapterMusicActivity extends RecyclerView.Adapter<AdapterMusicActivity.DailyViewHolder> {

    private ArrayList<ModelMusicActivity> mmusicList;
    private Context context;
    private ArrayList<Integer> newMusic=new ArrayList<>();

    @NonNull
    @Override
    public DailyViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View v = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.fragment_music, viewGroup, false);
        DailyViewHolder Dv = new DailyViewHolder(v);
        return Dv;
    }

    @Override
    public void onBindViewHolder(@NonNull DailyViewHolder holder, int position) {

        ModelMusicActivity currentItem = mmusicList.get(position);
        holder.imgLagu.setImageResource(currentItem.getImgMusicLagu());
        holder.txtArtis.setText(currentItem.getTxtArtisMusic());
        holder.txtJudulMusic.setText(currentItem.getTxtJudulMusic());
        int uri=currentItem.getRawMusic();
        newMusic.add(uri);
        holder.setItem(newMusic);

    }

    @Override
    public int getItemCount() {
        return mmusicList.size();
    }


    public static class DailyViewHolder extends RecyclerView.ViewHolder {
        public TextView txtJudulMusic;
        public TextView txtArtis;
        public ImageView imgLagu;
        private ArrayList<Integer> musicModel=new ArrayList<>();
        private static MediaPlayer mediaPlayer;

        public DailyViewHolder(@NonNull View itemView) {
            super(itemView);
            ButterKnife.bind(this,itemView);
            txtArtis = itemView.findViewById(R.id.txtBand);
            txtJudulMusic = itemView.findViewById(R.id.txtJudullagu);
            imgLagu = itemView.findViewById(R.id.imgLagu);
        }

        public void setItem(ArrayList<Integer> item){
            musicModel=item;
        }

        @OnClick
        void klik(@NonNull View itemView){
            int position=getAdapterPosition();
            int uri=musicModel.get(position);
            if (mediaPlayer != null && mediaPlayer.isPlaying()) {
                mediaPlayer.stop();
                mediaPlayer.reset();
                mediaPlayer.release();
                mediaPlayer = null;
            }else{
                mediaPlayer = MediaPlayer.create(itemView.getContext(), uri);
                mediaPlayer.start();
            }
        }
    }
    public AdapterMusicActivity(ArrayList<ModelMusicActivity> musicLiist, Context context)
    {
        mmusicList = musicLiist;
        this.context = context;
    }
}
