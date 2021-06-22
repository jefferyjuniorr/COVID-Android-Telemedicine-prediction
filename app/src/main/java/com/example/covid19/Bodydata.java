package com.example.covid19;

import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import android.widget.TextClock;
import android.widget.TextView;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.IOException;
import java.text.ParseException;

import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

public class Bodydata extends AppCompatActivity {
    TextClock textclock;
    JSONArray jsonhr;
    JSONArray jsonfour;
    JSONArray jsonaecopd;

    @RequiresApi(api = Build.VERSION_CODES.JELLY_BEAN_MR1)
    @Override
    protected void onCreate(Bundle saveInstanceState){
        super.onCreate(saveInstanceState);
        setContentView(R.layout.activity_bodydata);
        textclock = (TextClock)findViewById(R.id.textclock);
        textclock.setFormat12Hour("yyyy-MM-dd hh:mm");

        //run the Api
        getheartrate();
        getfour();

        //Handle the Get Strings
        final Handler handler = new Handler();
        handler.postDelayed(new Runnable(){
            @Override
            public void run(){
                try {
                    updatehr();
                    updatefour();
                } catch (JSONException e) {
                    e.printStackTrace();
                } catch (ParseException e) {
                    e.printStackTrace();
                }
            }
        }, 5000);//delay 5 seconds
    }

    //Api of Heartrate
    public JSONArray getheartrate(){
        new Thread(new Runnable() {
            @Override
            public void run() {
                OkHttpClient client = new OkHttpClient().newBuilder()
                        .build();
                Request request = new Request.Builder()
                        .url("https://ntu-med-god.ml/api/getHeartRateMeanByRange?id=k87j6e7c&start=2021-03-11&end=2021-03-11")
                        .method("GET", null)
                        .addHeader("Cookie", "connect.sid=s%3AivhWWzzmpA3EvvtmzDXnmSdUiGr14HWD.G7h3iqUA9URxjXTXAIWFnNnhiEvbkUxLOY4Dpom%2Fn0c; connect.sid=s%3Ag7lg1dYKE72JwJ5sz3bf07w-6H_mIya8.vjQREVRfhJ%2Bi4GlSkhJNHe3AXIsa1%2FYyZHwvzPPtaFg")
                        .build();
                try {
                    Response response = client.newCall(request).execute();
                    String responseDatahr = response.body().string();
                    jsonhr = new JSONArray(responseDatahr);
                    //Log.d("BodydataActivity", String.valueOf(jsonhr));
                } catch (IOException | JSONException e){
                    e.printStackTrace();
                }

            }
        }).start();
        return jsonhr;
    }

    //Api of cal, dis, floor, step
    public JSONArray getfour(){
        new Thread(new Runnable() {
            @Override
            public void run() {
                OkHttpClient client = new OkHttpClient().newBuilder()
                        .build();
                Request request = new Request.Builder()
                        .url("https://ntu-med-god.ml/api/getUserFitbitByRange?id=k87j6e7c&start=2021-03-11&end=2021-03-11")
                        .method("GET", null)
                        .addHeader("Cookie", "connect.sid=s%3AivhWWzzmpA3EvvtmzDXnmSdUiGr14HWD.G7h3iqUA9URxjXTXAIWFnNnhiEvbkUxLOY4Dpom%2Fn0c; connect.sid=s%3AypiO6GaTNnM8bkP75l5Z1JjPUekrN0Mk.xs0p45DIxtLbuAarqk7DWxpvUvXo6qu5Vosi4DTR7Xo")
                        .build();
                try {
                    Response response = client.newCall(request).execute();
                    String responseDatafour = response.body().string();
                    jsonfour = new JSONArray(responseDatafour);
                    //Log.d("BodydataActivity", String.valueOf(jsonfour));
                } catch (IOException | JSONException e){
                    e.printStackTrace();
                }

            }
        }).start();
        return jsonfour;
    }

    //
    public void updatehr() throws JSONException, ParseException {
        TextView Hrval = (TextView) findViewById(R.id.meanhrdata);
        //Log.d("BodyDataActivity", String.valueOf(jsonhr));
        if (jsonhr != null) {
            //Get heartrate
            JSONObject jsonObject = jsonhr.getJSONObject(0);
            String meanheartrate = jsonObject.getString("mean");
            String submeanheartrate = meanheartrate.substring(0,5);
            //Log.d("BodyDataActivity", submeanheartrate);
            Hrval.setText(String.valueOf(submeanheartrate));
        }
    }

    //
    public void updatefour() throws JSONException, ParseException {
        //Set up Textview
        TextView Caldata = (TextView) findViewById(R.id.caloriesdata);
        TextView Disdata = (TextView) findViewById(R.id.distancedata);
        TextView Floordata = (TextView) findViewById(R.id.floorsdata);
        TextView Stepdata = (TextView) findViewById(R.id.stepsdata);
        //Log.d("BodyDataActivity", String.valueOf(jsonfour));
        if (jsonfour != null) {
            //Get calories
            JSONObject jsonObjectcal = jsonfour.getJSONObject(0);
            JSONArray jsonArraycal = jsonObjectcal.getJSONArray("value");
            JSONObject jsonObjectcallast = jsonArraycal.getJSONObject(0);
            String calories = jsonObjectcallast.getString("sum");
            String subcalories = calories.substring(0,7);
            //Log.d("BodyDataActivity", subcalories);
            Caldata.setText(String.valueOf(subcalories));
            //Get distances
            JSONObject jsonObjectdis = jsonfour.getJSONObject(1);
            JSONArray jsonArraydis = jsonObjectdis.getJSONArray("value");
            JSONObject jsonObjectdislast = jsonArraydis.getJSONObject(0);
            String distances = jsonObjectdislast.getString("sum");
            String subdistances = distances.substring(0,4);
            //Log.d("BodyDataActivity", subdistances);
            Disdata.setText(String.valueOf(subdistances));
            //Get floors
            JSONObject jsonObjectfloor = jsonfour.getJSONObject(2);
            JSONArray jsonArrayfloor = jsonObjectfloor.getJSONArray("value");
            JSONObject jsonObjectfloorlast = jsonArrayfloor.getJSONObject(0);
            String floors = jsonObjectfloorlast.getString("sum");
            //Log.d("BodyDataActivity", floors);
            Floordata.setText(String.valueOf(floors));
            //Get steps
            JSONObject jsonObjectstep = jsonfour.getJSONObject(3);
            JSONArray jsonArraystep = jsonObjectstep.getJSONArray("value");
            JSONObject jsonObjectsteplast = jsonArraystep.getJSONObject(0);
            String steps = jsonObjectsteplast.getString("sum");
            //Log.d("BodyDataActivity", steps);
            Stepdata.setText(String.valueOf(steps));
        }
    }


}
