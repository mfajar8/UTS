package AKB11.com.adapter;

//Kelas   : AKB-11
//NIM     : 10116463
//Nama    : Mochamad Fajar Ismatulloh
//Tanggal : 1 Mei 2019



import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import AKB11.com.R;
import AKB11.com.model.ModelGalleryActivity;

import java.util.ArrayList;

public class AdapterGalleryActivity extends RecyclerView.Adapter<AdapterGalleryActivity.DailyViewHolder> {

    private ArrayList<ModelGalleryActivity> mgalleryList;
    Context cntx;


    @NonNull
    @Override
    public DailyViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View v = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.fragment_gallery_activ, viewGroup, false);
        DailyViewHolder galleryView = new DailyViewHolder(v);
        return galleryView;
    }

    @Override
    public void onBindViewHolder(@NonNull DailyViewHolder holder, int position) {
        final ModelGalleryActivity currentItem = mgalleryList.get(position);
        holder.mImageViewGallery.setImageResource(currentItem.getimgGambarGallery());
    }

    @Override
    public int getItemCount() {

        return mgalleryList.size();
    }


    public static class DailyViewHolder extends RecyclerView.ViewHolder {
        public ImageView mImageViewGallery;

        public DailyViewHolder(@NonNull View itemView) {
            super(itemView);
            mImageViewGallery= itemView.findViewById(R.id.imageViewgallery);
        }
    }

    public AdapterGalleryActivity(ArrayList<ModelGalleryActivity> mgalleryList) {
        this.mgalleryList = mgalleryList;
    }

}