package AKB11.com;

//Kelas   : AKB-11
//NIM     : 10116463
//Nama    : Mochamad Fajar Ismatulloh
//Tanggal : 1 Mei 2019

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

import AKB11.com.adapter.AdapterVideoActivity;
import AKB11.com.model.ModelVideoActivity;

public class VideoFragments extends Fragment {

    private RecyclerView FajarRecycleVideo;
    private RecyclerView.Adapter FajarAdappterVideo;
    private RecyclerView.LayoutManager FajarLayoutManagerVideo;


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        final View findView = inflater.inflate(R.layout.activity_video, container, false);
        String rawVideo1= "android.resource://" + getActivity().getPackageName() + "/" + R.raw.trailer_bsd;
        ArrayList<ModelVideoActivity> ModelVideoActivityArrayList = new ArrayList<>();
        ModelVideoActivityArrayList.add(new ModelVideoActivity(rawVideo1, "Bungou Stray Dogs 3 PV"));

        FajarRecycleVideo = findView.findViewById(R.id.video_recycle);
        FajarRecycleVideo.setHasFixedSize(true);
        FajarLayoutManagerVideo = new LinearLayoutManager(getActivity());
        FajarAdappterVideo = new AdapterVideoActivity(ModelVideoActivityArrayList);

        FajarRecycleVideo.setLayoutManager(FajarLayoutManagerVideo);
        FajarRecycleVideo.setAdapter(FajarAdappterVideo);

        return findView;

    }
}