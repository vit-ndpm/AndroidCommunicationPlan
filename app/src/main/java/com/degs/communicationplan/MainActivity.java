package com.degs.communicationplan;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Toast;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity {
BottomNavigationView bottomNavigationView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bottomNavigationView=findViewById(R.id.bottomNavigationView);

        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                int id=item.getItemId();
                switch (id){

                        case R.id.seonimalwa:
                            loadFrag(new SeonimalwaFragment(),false);
                        break;
                        case R.id.narmadapuram:
                            loadFrag(new NarmadapuramFragment(),false);
                        break;
                        case R.id.sohagpur:
                            loadFrag(new SohagpurFragment(),false);
                        break;
                        case R.id.pipariya:
                            loadFrag(new PipariyaFragment(),false);
                        break;
                     default:
                        loadFrag(new DEOFragment(),true);
                        break;
                }
            return  true;
            }
        });
        bottomNavigationView.setSelectedItemId(R.id.deo);
    }

    private void loadFrag(Fragment fragment,Boolean flag) {
        FragmentManager fm=getSupportFragmentManager();
        FragmentTransaction ft= fm.beginTransaction();
        if (flag){
            ft.add(R.id.fmcontainer,fragment);
        }else {
            ft.replace(R.id.fmcontainer,fragment);
        }

        ft.commit();
    }
}