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
import android.widget.LinearLayout;

import AKB11.com.adapter.AdapterDailyActivity;
import AKB11.com.adapter.AdapterFriendActivity;
import AKB11.com.model.ModelDailyActivity;
import AKB11.com.model.ModelFriendActivity;

import java.util.ArrayList;

public class DailyFragments extends Fragment {

    private RecyclerView FajarRecycleFriend;
    private RecyclerView.Adapter FajarAdappterFriend;
    private RecyclerView.LayoutManager FajarLayoutManagerFriend;

    private RecyclerView FajarRecycleActivity;
    private RecyclerView.Adapter FajarAdapterActivity;
    private RecyclerView.LayoutManager FajarLayoutManagerActivity;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View findView = inflater.inflate(R.layout.activity_dailyactiv, container, false);

        //Untuk Friend Activity

        ArrayList<ModelFriendActivity> ModelFreindActivityArrayList = new ArrayList<>();
        ModelFreindActivityArrayList.add(new ModelFriendActivity(R.drawable.f_adhit, "Adhitya Kuncoro"));
        ModelFreindActivityArrayList.add(new ModelFriendActivity(R.drawable.f_jarm, "M Fajar Maulana"));
        ModelFreindActivityArrayList.add(new ModelFriendActivity(R.drawable.f_eko, "M Nurcahya Eko D"));
        ModelFreindActivityArrayList.add(new ModelFriendActivity(R.drawable.f_ilham, "Ilham Prasetyo"));

        FajarRecycleFriend = findView.findViewById(R.id.friend_recycle);
        FajarRecycleFriend.setHasFixedSize(true);
        FajarLayoutManagerFriend = new LinearLayoutManager(getActivity());
        FajarAdappterFriend = new AdapterFriendActivity(ModelFreindActivityArrayList);

        FajarRecycleFriend.setLayoutManager(new LinearLayoutManager(getActivity(), LinearLayout.HORIZONTAL, false));
        FajarRecycleFriend.setAdapter(FajarAdappterFriend);


        ArrayList<ModelDailyActivity> modelDailyActivityArrayList = new ArrayList<>();
        modelDailyActivityArrayList.add(new ModelDailyActivity(R.drawable.ic_time, "Pukul 04:30 - 04:45 bangun tidur + membersihkan temmpat tidur"));
        modelDailyActivityArrayList.add(new ModelDailyActivity(R.drawable.ic_time, "Pukul 04:45 - 05:00 Shalat Shubuh"));
        modelDailyActivityArrayList.add(new ModelDailyActivity(R.drawable.ic_time, "Pukul 05:00 - 05:15 Login HI3"));
        modelDailyActivityArrayList.add(new ModelDailyActivity(R.drawable.ic_time, "Pukul 05:15 - 05:30 Mandi"));
        modelDailyActivityArrayList.add(new ModelDailyActivity(R.drawable.ic_time, "Pukul 05:30 - 06:00 Makan + Persiapan ke kampus"));
        modelDailyActivityArrayList.add(new ModelDailyActivity(R.drawable.ic_time, "Pukul 06:00 - 07:00 Perjalanan Ke Kampus"));
        modelDailyActivityArrayList.add(new ModelDailyActivity(R.drawable.ic_time, "Pukul 07:00 - 12:00 Bengong sampai siang "));
        modelDailyActivityArrayList.add(new ModelDailyActivity(R.drawable.ic_time, "Pukul 12:00 - 13:00 Isoma"));
        modelDailyActivityArrayList.add(new ModelDailyActivity(R.drawable.ic_time, "Pukul 13:30 - 14:30 Perjalanan pulang"));
        modelDailyActivityArrayList.add(new ModelDailyActivity(R.drawable.ic_time, "Pukul 14:45 - 15:30 Login HI3"));
        modelDailyActivityArrayList.add(new ModelDailyActivity(R.drawable.ic_time, "Pukul 15:30 - 16:00 Shalat Ashar"));
        modelDailyActivityArrayList.add(new ModelDailyActivity(R.drawable.ic_time, "Pukul 16:00 - 18:00 Login HI3"));
        modelDailyActivityArrayList.add(new ModelDailyActivity(R.drawable.ic_time, "Pukul 18:00 - 18:15 Shalat Maghrib"));
        modelDailyActivityArrayList.add(new ModelDailyActivity(R.drawable.ic_time, "Pukul 18:15 - 19:00 Makan Malam + Waktu Keluarga"));
        modelDailyActivityArrayList.add(new ModelDailyActivity(R.drawable.ic_time, "Pukul 19:00 - 19:15 Shalat Isya"));
        modelDailyActivityArrayList.add(new ModelDailyActivity(R.drawable.ic_time, "Pukul 19:15 - 21:00 Di depan laptop terus tidur"));


        FajarRecycleActivity = findView.findViewById(R.id.daily_recycle);
        FajarRecycleActivity.setHasFixedSize(true);
        FajarLayoutManagerActivity = new LinearLayoutManager(getActivity());
        FajarAdapterActivity = new AdapterDailyActivity(modelDailyActivityArrayList);

        FajarRecycleActivity.setLayoutManager(FajarLayoutManagerActivity);
        FajarRecycleActivity.setAdapter(FajarAdapterActivity);

        return findView;

    }
}
