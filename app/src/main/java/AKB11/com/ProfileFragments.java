package AKB11.com;

//Kelas   : AKB-11
//NIM     : 10116463
//Nama    : Mochamad Fajar Ismatulloh
//Tanggal : 1 Mei 2019

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class ProfileFragments extends Fragment {

    @BindView(R.id.btn_about)
    ImageView btn_about;
    @BindView(R.id.btn_fb)
    ImageView btn_fb;
    @BindView(R.id.btn_ig)
    ImageView btn_ig;
    @BindView(R.id.btn_wordpress)
    ImageView btn_wordpress;
    @BindView(R.id.btn_maps)
    ImageView btn_maps;


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View viewFragment=inflater.inflate(R.layout.activity_profile, container, false);
        ButterKnife.bind(this,viewFragment);

        return viewFragment;

    }
    @OnClick(R.id.btn_about)
    public void click(){
       CustomDialog cd = new CustomDialog();
       cd.showDialog(getActivity(), "FajarApps V1.0 Developed by Mochamad Fajar I AKB11-10116463");
    }
    @OnClick(R.id.btn_fb)
    public void click_fb() {
        Intent intent = new Intent(Intent.ACTION_VIEW);
        intent.setData(Uri.parse("https://www.facebook.com/mismatulloh"));
        startActivity(intent);
    }
    @OnClick(R.id.btn_ig)
    public void click_ig(){
        Intent intent = new Intent(Intent.ACTION_VIEW);
        intent.setData(Uri.parse("https://www.instagram.com/mfajar8/"));
        startActivity(intent);
    }

    @OnClick(R.id.btn_wordpress)
    public void click_wp(){
        Intent intent = new Intent(Intent.ACTION_VIEW);
        intent.setData(Uri.parse("https://www.mfajar8.wordpress.com"));
        startActivity(intent);
    }
    @OnClick(R.id.btn_maps)
    public void click_maps(){
        Intent intent = new Intent(Intent.ACTION_VIEW);
        intent.setData(Uri.parse("https://goo.gl/maps/VjgWdhTAjZ4ywDfo8"));
        startActivity(intent);
    }
}
