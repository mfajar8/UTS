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

import AKB11.com.R;
import AKB11.com.model.ModelFriendActivity;

import java.util.ArrayList;

public class AdapterFriendActivity extends RecyclerView.Adapter<AdapterFriendActivity.DailyViewHolder> {

    private ArrayList<ModelFriendActivity> mfriendList;

    @NonNull
    @Override
    public DailyViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View v = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.fragment_friend_activ, viewGroup, false);
        DailyViewHolder Da = new DailyViewHolder(v);
        return Da;
    }

    @Override
    public void onBindViewHolder(@NonNull DailyViewHolder holder, int position) {
        ModelFriendActivity currentItem = mfriendList.get(position);
        holder.mImageViewFriend.setImageResource(currentItem.getImgGambarFriend());
        holder.txtFriend.setText(currentItem.getTxtJudulFriend());
    }

    @Override
    public int getItemCount() {

        return mfriendList.size();
    }


    public static class DailyViewHolder extends RecyclerView.ViewHolder {
        public ImageView mImageViewFriend;
        public TextView txtFriend;

        public DailyViewHolder(@NonNull View itemView) {
            super(itemView);
            mImageViewFriend = itemView.findViewById(R.id.imageViewfriend);
            txtFriend = itemView.findViewById(R.id.textViewTitlefriend);
        }
    }

    public AdapterFriendActivity(ArrayList<ModelFriendActivity> dailyList) {
        mfriendList = dailyList;
    }
}
