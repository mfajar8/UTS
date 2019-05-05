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

import AKB11.com.adapter.AdapterMusicActivity;
import AKB11.com.model.ModelMusicActivity;

public class MusicFragments extends Fragment {

    private RecyclerView FajarRecycleMmusic;
    private RecyclerView.Adapter FajarAdappterMusic;
    private RecyclerView.LayoutManager FajarLayoutManagerMusic;


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        final View findView = inflater.inflate(R.layout.activity_video, container, false);


        ArrayList<ModelMusicActivity> ModelMusicActivityArrayList = new ArrayList<>();
        ModelMusicActivityArrayList.add(new ModelMusicActivity(R.drawable.img_music,"Maps","Maroon V",R.raw.maps_marronfive));
        ModelMusicActivityArrayList.add(new ModelMusicActivity(R.drawable.img_music,"You Make Me Smile","Dave Koz",R.raw.dave_youmakemesmile));

        FajarRecycleMmusic = findView.findViewById(R.id.video_recycle);
        FajarRecycleMmusic.setHasFixedSize(true);
        FajarLayoutManagerMusic = new LinearLayoutManager(getActivity());
        FajarAdappterMusic = new AdapterMusicActivity(ModelMusicActivityArrayList, getContext());

        FajarRecycleMmusic.setLayoutManager(FajarLayoutManagerMusic);
        FajarRecycleMmusic.setAdapter(FajarAdappterMusic);

        return findView;
    }
}