package AKB11.com.adapter;

//Kelas   : AKB-11
//NIM     : 10116463
//Nama    : Mochamad Fajar Ismatulloh
//Tanggal : 1 Mei 2019

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import AKB11.com.model.ModelDailyActivity;
import AKB11.com.R;

import java.util.ArrayList;


public class AdapterDailyActivity extends RecyclerView.Adapter<AdapterDailyActivity.DailyViewHolder> {

    private ArrayList<ModelDailyActivity> mdailyList;

    @NonNull
    @Override
    public DailyViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View v = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.fragment_daily_activ, viewGroup, false);
        DailyViewHolder Da = new DailyViewHolder(v);
        return Da;
    }

    @Override
    public void onBindViewHolder(@NonNull DailyViewHolder holder, int position) {
        ModelDailyActivity currentItem = mdailyList.get(position);
        holder.mImageView.setImageResource(currentItem.getImgGambarDaily());
        holder.txtJudul1.setText(currentItem.getTxtJudulDaily());
    }

    @Override
    public int getItemCount() {
        return mdailyList.size();
    }


    public static class DailyViewHolder extends RecyclerView.ViewHolder {
        public ImageView mImageView;
        public TextView txtJudul1;

        public DailyViewHolder(@NonNull View itemView) {
            super(itemView);
            mImageView = itemView.findViewById(R.id.imageViewdaily);
            txtJudul1 = itemView.findViewById(R.id.textViewTitledaily);
        }
    }

    public AdapterDailyActivity(ArrayList<ModelDailyActivity> dailyList) {
        mdailyList = dailyList;
    }
}
