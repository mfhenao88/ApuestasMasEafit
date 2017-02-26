package co.com.apuestasmas.view;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.util.ArrayList;

import co.com.apuestasmas.R;
import co.com.apuestasmas.adapter.ApuestasAdapter;
import co.com.apuestasmas.dto.Apuesta;
import co.com.apuestasmas.dto.ApuestaList;

/**
 * Created by manuelhenao
 */

public class ApuestasActivity extends AppCompatActivity {
    ListView listView;
    ApuestaList apuestas;
    String JSON_URL = "http://b605e941.ngrok.io/apuestamas/Servicios.php?url=consultarApuestas/1";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_apuestas);

        listView = (ListView) findViewById(R.id.list);

        //consulta
        sendRequest();
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
        apuestas = gson.fromJson(json, ApuestaList.class);
        ApuestasAdapter adapter = new ApuestasAdapter(this, (ArrayList)apuestas.getApuestas());
        listView.setAdapter(adapter);
    }
}
