package co.com.apuestasmas.view;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;
import android.widget.Toast;

import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

import co.com.apuestasmas.R;
import co.com.apuestasmas.adapter.ApuestasAdapter;
import co.com.apuestasmas.dto.Apuesta;
import co.com.apuestasmas.dto.ApuestaList;
import co.com.apuestasmas.dto.LoginOut;

/**
 * Created by manuelhenao on 31/10/16.
 */

public class ApuestasActivity extends AppCompatActivity {
    ListView listView;
    ApuestaList apuestas;
    String JSON_URL = "http://0d73c4c4.ngrok.io/apuestamas/Servicios.php?url=consultarApuestas/1";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_apuestas);

        listView = (ListView) findViewById(R.id.list);

        ArrayList<Apuesta> arrayOfUsers = new ArrayList<Apuesta>();

        //consulta
        sendRequest();

        ApuestasAdapter adapter = new ApuestasAdapter(this, arrayOfUsers);
        listView.setAdapter(adapter);


    }

    private void sendRequest() {

        StringRequest stringRequest = new StringRequest(JSON_URL,
                new Response.Listener<String>() {
                    @Override
                    public void onResponse(String response) {
                        showJSON(response);
                    }
                },
                new Response.ErrorListener() {
                    @Override
                    public void onErrorResponse(VolleyError error) {
                        Toast.makeText(ApuestasActivity.this, error.getMessage(), Toast.LENGTH_LONG).show();
                    }
                });

        RequestQueue requestQueue = Volley.newRequestQueue(this);
        requestQueue.add(stringRequest);
    }

    private void showJSON(String json) {
        Gson gson = new GsonBuilder().create();
        try {
            apuestas = gson.fromJson(json, ApuestaList.class);
        }catch (Exception e){
            e.printStackTrace();
        }

        Intent i = new Intent(this, ApuestasActivity.class);
        startActivity(i);
    }
}
