package co.com.apuestasmas.adapter;


import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

import co.com.apuestasmas.R;
import co.com.apuestasmas.dto.Apuesta;

/**
 * Created by manuelhenao on 31/10/16.
 */

public class ApuestasAdapter extends ArrayAdapter<Apuesta> {

    public ApuestasAdapter(Context context, ArrayList<Apuesta> apuestas) {
        super(context, 0, apuestas);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Get the data item for this position
        Apuesta apuesta = getItem(position);
        // Check if an existing view is being reused, otherwise inflate the view
        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.item_apuesta, parent, false);
        }
        TextView nombreApuestaTextView = (TextView) convertView.findViewById(R.id.nombreApuestaTextView);
        TextView valorApostadoTextView = (TextView) convertView.findViewById(R.id.valorApostadoTextView);
        TextView resultadoApostadoTextView = (TextView) convertView.findViewById(R.id.resultadoApostadoTextView);

/*        nombreApuestaTextView.setText(apuesta.getNombreApuesta());
        valorApostadoTextView.setText("" + apuesta.getValorApostado());
        resultadoApostadoTextView.setText(apuesta.getResultadoApostado());*/
        return convertView;
    }
}
