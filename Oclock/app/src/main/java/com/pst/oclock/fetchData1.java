package com.pst.oclock;

import android.os.AsyncTask;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;


/**
 * Created by Vincent on 16/05/2018.
 */

class fetchData1 extends AsyncTask<Void, Void, String> {
    String data="";
    String x;

    String mapsapi ="https://maps.googleapis.com/maps/api/directions/json?origin=5_Rue_Ingres_Saint_Maur_des_foss%C3%A9s&destination=74_bis_avenue_maurice_thorez_ivry&mode=transit&key=AIzaSyCNggxIz_qjfnF7ZS_KPFB6DUqwq5a5d7s";
    @Override
    protected String doInBackground(Void... voids) {
        try {

            URL urlmaps = new URL(mapsapi);
            HttpURLConnection httpURLConnection1 = (HttpURLConnection) urlmaps.openConnection();
            InputStream inputStream1 = httpURLConnection1.getInputStream();
            BufferedReader bufferedReader1 = new BufferedReader((new InputStreamReader((inputStream1))));
            String line = "";
            while (line != null) {
                line =bufferedReader1.readLine();
                data = data + "\n"+ line;
            }

            //String jsonpathCreator= $.routes[*].legs[*].duration.text;
            //x=jsonpathCreator;



        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return null;
    }

    @Override
    protected void onPostExecute(String aVoid) {
        super.onPostExecute(aVoid);

        MainActivity.data.setText(this.x);

    }
}