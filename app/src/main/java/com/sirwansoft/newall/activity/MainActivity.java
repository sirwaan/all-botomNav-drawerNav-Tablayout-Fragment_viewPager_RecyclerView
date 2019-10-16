package com.sirwansoft.newall.activity;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.MenuItem;
import android.widget.FrameLayout;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.sirwansoft.newall.R;
import com.sirwansoft.newall.fragmentsBotton.Frag_B_One;
import com.sirwansoft.newall.fragmentsBotton.Frag_B_three;
import com.sirwansoft.newall.fragmentsBotton.Frag_B_two;

public class MainActivity extends AppCompatActivity {
    private BottomNavigationView bottomNavigationView;
    private FrameLayout frameLayout;
    private Frag_B_One frag_one;
    private Frag_B_two frag_two;
    private Frag_B_three frag_three;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        frag_one = new Frag_B_One();
        frag_two = new Frag_B_two();
        frag_three = new Frag_B_three();

        frameLayout = findViewById(R.id.mainfream);
        bottomNavigationView = findViewById(R.id.mainnav);

        //default fragment before click on etch bottom navigation menu item by this :  setFragment(first_fragment);
        setFragment(frag_one);




        // when we click on itch item in bottom navigation , what to do ?
        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
                int id = menuItem.getItemId();

                switch (id) {

                    case R.id.nav_one:
                        //set background color if you need use
//                        bottomNavigationView.setItemBackgroundResource(R.color.colorPrimary);
                        setFragment(frag_one);
                        return true;

                    case R.id.nav_two:

                        setFragment(frag_two);
                        return true;
                    case R.id.nav_three:

                        setFragment(frag_three);
                        return true;

                    default:
                        return false;


                }


            }
        });


    }

    private void setFragment(Fragment fragment) {

        FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
        fragmentTransaction.replace(R.id.mainfream, fragment);
        fragmentTransaction.commit();
    }
}

//todo nobay awaya ka mn menu ziad kam ba projaka