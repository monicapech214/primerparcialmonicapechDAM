package com.example.primerparcialdam;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class Adaptador extends BaseAdapter {
   private static LayoutInflater  inflater = null;
Context contexto;
String [][] datos;
int[] datosimg;
public Adaptador(Context conexto, String[][] datos, int[] imagenes) {
    this.contexto = conexto;
    this.datos = datos;
    this.datosimg = imagenes;
    inflater = (LayoutInflater)conexto.getSystemService(conexto.LAYOUT_INFLATER_SERVICE);
}

   @Override
    public View getView(int i, View convertView, ViewGroup parent) {
    final View vista = inflater.inflate(R.layout.elemento_lista,null);
       TextView titulo = (TextView) vista.findViewById(R.id.tvTitulo);
       TextView descripcion = (TextView) vista.findViewById(R.id.tvdescripcion);
       ImageView imagen = (ImageView) vista.findViewById(R.id.ivimagen);
       titulo.setText(datos[i][0]);
       descripcion.setText(datos[i][1]);
       imagen.setImageResource(datosimg[i]);
       imagen.setTag(i);
       imagen.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               Intent visorimagen = new Intent(contexto, visorimagen.class);
               visorimagen.putExtra("IMG",datosimg[(Integer)v.getTag()]);
               contexto.startActivity(visorimagen);
           }
       });
        return vista;
    }
    @Override
    public int getCount() {
        return 0;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }


}
