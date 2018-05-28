package com.pst.oclock;

import android.os.AsyncTask;
import android.util.Log;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Map;

/**
 * Created by Vincent on 16/05/2018.
 */

class fetchData2 extends AsyncTask<Void, Void, String> {
    String data2="Hyperplanning";
    String data1="Google maps api";
    String data="";
    String idea;
    String adresse,finallll;
    String x =" https://ical-to-json.herokuapp.com/convert.json?url=https%";
    String y="3A%2F%2Fedt.esiea.fr%2FTelechargements%2Fical%2FEdT_MONNERIE_Vincent.ics%3Fversion%3D2017.0.3.6%26idICal%3D3BE0639232429D89F42AD6B23E1ED947%26param%3D643d5b312e2e36325d2666683d3126663d31";

    @Override
    protected String doInBackground(Void... voids) {
        try {
            adresse = x + y;
            URL urledt = new URL(adresse);
            HttpURLConnection httpURLConnection1 = (HttpURLConnection) urledt.openConnection();
            InputStream inputStream1 = httpURLConnection1.getInputStream();
            BufferedReader bufferedReader1 = new BufferedReader((new InputStreamReader((inputStream1))));
            String line = "";
            while (line != null) {
                line =bufferedReader1.readLine();
                idea = idea + "\n"+ line;
            }

            JSONObject JO1= new JSONObject(data);
            JSONArray JA1 = JO1.getJSONArray("routes");
            JSONObject JO2 = JA1.getJSONObject(0);
            JSONArray JA2 = JO2.getJSONArray("legs");
            JSONObject JO3 =JA2.getJSONObject(0);
            JSONObject JO4 = JO3.getJSONObject("duration");
            data = JO4.getString("value");



        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (JSONException e) {
            e.printStackTrace();
        }

        finallll = data+idea;

        return null;
    }

    @Override
    protected void onPostExecute(String aVoid) {
        super.onPostExecute(aVoid);

        Main2Activity.data.setText(this.finallll);

    }
}