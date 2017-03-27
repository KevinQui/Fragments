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

public class MainActivity extends Activity implements BlankFragment2.OnFragmentInteractionListener {
    FragmentManager fm = getFragmentManager();

    BlankFragment2 frag2;
    Button bt;
    EditText tx;
    String texto = "";
    TextView ver;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bt = (Button) findViewById(R.id.enviar);
        tx = (EditText) findViewById(R.id.tx);
    }


    @Override
    public void onFragmentInteraction(Uri uri) {

    }

    public void Enviar(View v) {
        ver = (TextView) findViewById(R.id.ver);
        texto = tx.getText().toString();
        frag2 = new BlankFragment2(texto);
        FragmentTransaction t = fm.beginTransaction();
        t.replace(R.id.main, frag2);
        t.addToBackStack(null);
        t.commit();


    }

}