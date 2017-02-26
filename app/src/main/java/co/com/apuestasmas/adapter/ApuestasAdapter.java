package co.com.apuestasmas.adapter;


import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

import co.com.apuestasmas.R;
import co.com.apuestasmas.dto.Apuesta;

/**
 * Created by manuelhenao
 */
public class ApuestasAdapter extends ArrayAdapter<Apuesta> {

    public ApuestasAdapter(Context context, ArrayList<Apuesta> apuestas) {
        super(context, 0, apuestas);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        Apuesta apuesta = getItem(position);
        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.item_apuesta, parent, false);
        }
        TextView nombreApuestaTextView = (TextView) convertView.findViewById(R.id.nombreApuestaTextView);
        TextView valorApostadoTextView = (TextView) convertView.findViewById(R.id.valorApostadoTextView);
        TextView resultadoApostadoTextView = (TextView) convertView.findViewById(R.id.resultadoApostadoTextView);
        TextView resultadoTextView = (TextView) convertView.findViewById(R.id.resultadoTextView);
        ImageView imageView = (ImageView) convertView.findViewById(R.id.imageView);

        nombreApuestaTextView.setText(apuesta.getEquipo1() + " Vs " + apuesta.getEquipo2());
        valorApostadoTextView.setText("" + apuesta.getValor_apostado());
        resultadoApostadoTextView.setText(apuesta.getResultado_usuario());
        resultadoTextView.setText(apuesta.getResultado_real());
        return convertView;
    }
}
