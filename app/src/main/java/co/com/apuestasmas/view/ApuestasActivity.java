package co.com.apuestasmas.view;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

import co.com.apuestasmas.R;
import co.com.apuestasmas.adapter.ApuestasAdapter;
import co.com.apuestasmas.dto.Apuesta;

/**
 * Created by manuelhenao on 31/10/16.
 */

public class ApuestasActivity extends Activity {
    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_apuestas);

        listView = (ListView) findViewById(R.id.list);

        ArrayList<Apuesta> arrayOfUsers = new ArrayList<Apuesta>();

        for (int i = 0; i < 5; i++) {
            Apuesta apuesta = new Apuesta();
            apuesta.setNombreApuesta("nacional" + i);
            apuesta.setResultadoApostado(i + ":0");
            apuesta.setValorApostado(i);
            arrayOfUsers.add(apuesta);
        }

        ApuestasAdapter adapter = new ApuestasAdapter(this, arrayOfUsers);
        listView.setAdapter(adapter);


    }


}
