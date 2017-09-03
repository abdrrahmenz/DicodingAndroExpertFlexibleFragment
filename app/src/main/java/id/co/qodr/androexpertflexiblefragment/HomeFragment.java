package id.co.qodr.androexpertflexiblefragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;


/**
 * A simple {@link Fragment} subclass.
 */
public class HomeFragment extends Fragment implements View.OnClickListener {
    public HomeFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_home, container, false);

        Button btnCategory = view.findViewById(R.id.btn_category);
        btnCategory.setOnClickListener(this);

        return view;
    }

    @Override
    public void onClick(View view) {
        if (view.getId() == R.id.btn_category){
            //todo pindah fragment ke CategoryFragment
            CategoryFragment mCategoryFragment = new CategoryFragment();
            FragmentManager mFragmentManager = getFragmentManager();
            FragmentTransaction mFragmentTransaction = mFragmentManager.beginTransaction();
            mFragmentTransaction.replace(R.id.frame_container, mCategoryFragment, CategoryFragment.class.getSimpleName());
            mFragmentTransaction.addToBackStack(null);
            mFragmentTransaction.commit();
            /*kenapa ada mFragmentTransaction.addToBackStack(null); setelahnya?
             Kita menggunakan addToBackStack(null) karena kita ingin obyek fragment yang saat ini
             kita ciptakan masuk kedalam sebuah Fragment Stack yang nantinya ketika
             kita tekan tombol back dia akan pop-out keluar dari stack dan menampilkan
             obyek fragment sebelumnya, HomeFragment. Konsep hampir sama dengan konsep yang berlaku
             di Activity namun bedanya stack fragment dimiliki oleh Activity dimana ia ditampilkan
             dan ditempelkan.*/
        }
    }
}
