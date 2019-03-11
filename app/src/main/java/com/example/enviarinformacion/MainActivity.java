package com.example.enviarinformacion;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.Toast;

import com.android.volley.Request;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonArrayRequest;
import com.android.volley.toolbox.JsonObjectRequest;
import com.example.enviarinformacion.modelo.Alumno;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {


    RecyclerView rc;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void onClick(View view) throws JSONException {

            JSONObject nom = new JSONObject();
            nom.put("Nombre", "Suseth");

            JsonObjectRequest json = new JsonObjectRequest(Request.Method.POST, "http://nuevo.rnrsiilge-org.mx/nombre", nom, new Response.Listener<JSONObject>() {
                        @Override
                        public void onResponse(JSONObject response) {
                            //Log.d("a", response.toString());
                            Toast.makeText(MainActivity.this, response.toString(), Toast.LENGTH_SHORT).show();
                        }
                    }, new Response.ErrorListener() {

                        @Override
                        public void onErrorResponse(VolleyError error) {
                            Toast.makeText(MainActivity.this, "Error", Toast.LENGTH_SHORT).show();
                        }
                    });

            VolleyS.getInstance(this).getMyRequestQueue().add(json);



    }

}
