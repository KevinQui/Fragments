package kevinq.myapplication;

import android.app.Activity;
import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends Activity {
    FragmentManager fm = getFragmentManager();

    BlankFragment frag;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        frag=new BlankFragment();
        FragmentManager mf = getFragmentManager();
        FragmentTransaction t = mf.beginTransaction();
        t.add(R.id.main,frag);
        t.commit();

    }




}