package AKB11.com;

//Kelas   : AKB-11
//NIM     : 10116463
//Nama    : Mochamad Fajar Ismatulloh
//Tanggal : 1 Mei 2019

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import AKB11.com.adapter.AdapterGalleryActivity;
import AKB11.com.model.ModelGalleryActivity;

import java.util.ArrayList;

public class GalleryFragments extends Fragment {

    private RecyclerView FajarRecycleGallery;
    private RecyclerView.Adapter FajarAdappterGallery;
    private RecyclerView.LayoutManager FajarLayoutManagerGallery;


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        final View findView = inflater.inflate(R.layout.activity_gallery, container, false);

        ArrayList<ModelGalleryActivity> ModelGalleryActivityArrayList = new ArrayList<>();
        ModelGalleryActivityArrayList.add(new ModelGalleryActivity(R.drawable.g1));
        ModelGalleryActivityArrayList.add(new ModelGalleryActivity(R.drawable.g2));
        ModelGalleryActivityArrayList.add(new ModelGalleryActivity(R.drawable.g3));
        ModelGalleryActivityArrayList.add(new ModelGalleryActivity(R.drawable.g4));
        ModelGalleryActivityArrayList.add(new ModelGalleryActivity(R.drawable.g5));
        ModelGalleryActivityArrayList.add(new ModelGalleryActivity(R.drawable.g6));



        FajarRecycleGallery = findView.findViewById(R.id.gallery_recycle);
        FajarRecycleGallery.setHasFixedSize(true);
        FajarLayoutManagerGallery = new GridLayoutManager(getActivity(),3);
        FajarAdappterGallery = new AdapterGalleryActivity(ModelGalleryActivityArrayList);

        FajarRecycleGallery.setLayoutManager(FajarLayoutManagerGallery);
        FajarRecycleGallery.setAdapter(FajarAdappterGallery);



        return findView;

    }
}

