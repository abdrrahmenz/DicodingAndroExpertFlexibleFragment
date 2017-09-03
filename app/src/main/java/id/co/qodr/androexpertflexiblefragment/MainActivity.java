package id.co.qodr.androexpertflexiblefragment;

import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // (interface) untuk mengorganisir obyek fragment yang terdapat didalam sebuah Activity
        // support library v4 agar bisa kompatibel ke versi android sebelumnya (Backward Compability).
        FragmentManager mFragmentManager = getSupportFragmentManager();
        // api untuk melakukan operasi untuk fragment seperti add(), replace(), commit() dsb.
        FragmentTransaction mFragmentTransaction = mFragmentManager.beginTransaction();
        HomeFragment mHomeFragment = new HomeFragment();  // Pembuatan obyek HomeFragment
        mFragmentTransaction.add(R.id.frame_container, mHomeFragment, HomeFragment.class.getSimpleName());

        Log.d("MyFlexibleFragment", "Fragment Name : "+HomeFragment.class.getSimpleName());

        mFragmentTransaction.commit();
        /*Baris diatas akan meminta obyek mFragmentTransaction untuk melakukan pemasangan obyek
        secara asynchronous untuk ditampilkan ke antar muka pengguna (User Interface).*/
    }
}
