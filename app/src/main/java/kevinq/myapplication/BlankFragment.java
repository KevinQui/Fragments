package kevinq.myapplication;

import android.app.FragmentTransaction;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.app.Fragment;
import android.support.annotation.IdRes;
import android.app.FragmentManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.List;


/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the

 * to handle interaction events.
 */
public class BlankFragment extends Fragment {
EditText tx;
    Button bt;
    String texto;
 public BlankFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v=inflater.inflate(R.layout.fragment_blank, container, false);
        tx=(EditText)v.findViewById(R.id.tx);
        bt=(Button)v.findViewById(R.id.enviar);
        bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                texto = tx.getText().toString();
                BlankFragment2 newFragment = new BlankFragment2();
                Bundle args = new Bundle();
                args.putString("texto", texto);
                newFragment.setArguments(args);
                FragmentManager mf = getFragmentManager();
                FragmentTransaction t = mf.beginTransaction();
                t.replace(R.id.main, newFragment);
                t.commit();

            }


            });
            return v;
    }

}