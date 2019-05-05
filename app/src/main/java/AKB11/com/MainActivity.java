package AKB11.com;

//Kelas   : AKB-11
//NIM     : 10116463
//Nama    : Mochamad Fajar Ismatulloh
//Tanggal : 1 Mei 2019

import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        BottomNavigationView navBottom = findViewById(R.id.nav_bar);
        navBottom.setOnNavigationItemSelectedListener(navListen);
        getSupportFragmentManager().beginTransaction().replace(R.id.fram_menu, new HomeFragments()).commit();
    }

    private BottomNavigationView.OnNavigationItemSelectedListener navListen = new BottomNavigationView.OnNavigationItemSelectedListener() {
        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {

            Fragment selectedFragment = null;

            switch (menuItem.getItemId()) {
                case R.id.home_nav:
                    selectedFragment = new HomeFragments();
                    break;

                case R.id.act_nav:
                    selectedFragment = new DailyFragments();
                    break;
                case R.id.galery_nav:
                    selectedFragment = new GalleryFragments();
                    break;
                case R.id.music_nav:
                    selectedFragment = new MediaFragments();
                    break;
                case R.id.profile_nav:
                    selectedFragment = new ProfileFragments();
                    break;
            }

            getSupportFragmentManager().beginTransaction().replace(R.id.fram_menu, selectedFragment).commit();
            return true;
        }

    };
}
