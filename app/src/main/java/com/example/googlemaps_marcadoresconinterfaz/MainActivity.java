package com.example.googlemaps_marcadoresconinterfaz;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import com.android.volley.AuthFailureError;
import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonArrayRequest;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;
import com.google.android.gms.maps.CameraUpdate;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

import org.json.JSONArray;
import org.json.JSONObject;

import java.util.HashMap;
import java.util.Map;

public class MainActivity extends AppCompatActivity implements OnMapReadyCallback, GoogleMap.OnMapClickListener {
    GoogleMap Mapas;

    public TextView txtview;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);

        /*RequestQueue queue = Volley.newRequestQueue(this);
        String url ="https://maps.googleapis.com/maps/api/place/nearbysearch/json?fields=name&location=-1.024267389863566,-79.46938086135764&radius=1500&type=bar&key=AIzaSyB5MkIB5lNnQH1kC1tZ3ATeEsv7z66moKs";

        // Request a string response from the provided URL.
        StringRequest stringRequest = new StringRequest(Request.Method.GET, url,
                new Response.Listener<String>() {
                    @Override
                    public void onResponse(String response) {

                        TextView textView = (TextView) findViewById(R.id.snippet5);
                        textView.setText(response);


                    }
                }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                txtview.setText("No conecta con la API!");
            }
        });

        // Add the request to the RequestQueue.
        queue.add(stringRequest);*/


    }

    @Override
    public void onMapReady(@NonNull GoogleMap googleMap) {

        Mapas=googleMap;

        LatLng ltUteq= new LatLng(-1.024267389863566, -79.46621960993701);


        //Activar los controles del Zoom
        Mapas.getUiSettings().setZoomControlsEnabled(true);

        //Enfocar el zoom del Mapas en la UTEQ
        CameraUpdate camUpdUteq= CameraUpdateFactory.newLatLngZoom(ltUteq,15);
        Mapas.moveCamera(camUpdUteq);

        LatLng CHINISSESFOODEXPRESS = new LatLng(-1.0242929847081381, -79.46703649905092);
        Mapas.addMarker(new MarkerOptions().position(CHINISSESFOODEXPRESS).title("CHINISSES FOOD EXPRESS").snippet(String.valueOf("Restaurante")).icon(BitmapDescriptorFactory.fromResource(R.mipmap.iconcomido2)).anchor(0.1f,0.1f));

        LatLng SANANTONIO = new LatLng(-1.023203577288594, -79.46571976799041);
        Mapas.addMarker(new MarkerOptions().position(SANANTONIO).title("SAN ANTONIO (Café-Restaurant)").snippet("Restaurante").icon(BitmapDescriptorFactory.fromResource(R.mipmap.iconcomido2)));

        LatLng PIQUEOS = new LatLng(-1.0275373328926727, -79.46795136583404);
        Mapas.addMarker(new MarkerOptions().position(PIQUEOS).title("Piqueos y algo +").snippet("Restaurante").icon(BitmapDescriptorFactory.fromResource(R.mipmap.iconcomido2)));

        LatLng CHIFLEPAPIPOLLO = new LatLng(-1.027709014982549, -79.4699157485532);
        Mapas.addMarker(new MarkerOptions().position(CHIFLEPAPIPOLLO).title("Chifle Papipollo El Sabroson").snippet("Restaurante").icon(BitmapDescriptorFactory.fromResource(R.mipmap.iconcomido2)));

        LatLng FOSTER = new LatLng(-1.0293394869590857, -79.46949631783541);
        Mapas.addMarker(new MarkerOptions().position(FOSTER).title("Restaurant Foster").snippet("Restaurante").icon(BitmapDescriptorFactory.fromResource(R.mipmap.iconcomido2)));

        LatLng KFC = new LatLng(-1.0295454112544167, -79.46864520818968);
        Mapas.addMarker(new MarkerOptions().position(KFC).title("KFC - Quevedo").snippet("Restaurante").icon(BitmapDescriptorFactory.fromResource(R.mipmap.iconcomido2)));


        LatLng SUPERPINCHO = new LatLng(-1.032464196089297, -79.47079995669313);
        Mapas.addMarker(new MarkerOptions().position(SUPERPINCHO).title("Super Pincho").snippet("Restaurante").icon(BitmapDescriptorFactory.fromResource(R.mipmap.iconcomido2)));


        LatLng LOSMOROS = new LatLng(-1.023203577288594, -79.46571976799041);
        Mapas.addMarker(new MarkerOptions().position(LOSMOROS).title("Los Moros").snippet("Restaurante").icon(BitmapDescriptorFactory.fromResource(R.mipmap.iconcomido2)));

        LatLng RESTAURANTDCARLOS = new LatLng(-1.029265372620842, -79.4684874589593);
        Mapas.addMarker(new MarkerOptions().position(PIQUEOS).title("RESTAURANT D CARLOS").snippet("Restaurante").icon(BitmapDescriptorFactory.fromResource(R.mipmap.iconcomido2)));

        LatLng AROMACOFFEE = new LatLng(-1.0328025933355522, -79.46684119094303);
        Mapas.addMarker(new MarkerOptions().position(AROMACOFFEE).title("Aroma Coffee Lounge").snippet("Restaurante").icon(BitmapDescriptorFactory.fromResource(R.mipmap.iconcomido2)));

        LatLng TIPITAPA = new LatLng(-1.0257635198753026, -79.46262313416064);
        Mapas.addMarker(new MarkerOptions().position(TIPITAPA).title("Tipitapa").snippet("Restaurante").icon(BitmapDescriptorFactory.fromResource(R.mipmap.iconcomido2)));

        LatLng FOODGOOD = new LatLng(-1.0224867044853387, -79.46089342752803);
        Mapas.addMarker(new MarkerOptions().position(FOODGOOD).title("Food Good").snippet("Restaurante").icon(BitmapDescriptorFactory.fromResource(R.mipmap.iconcomido2)));


        LatLng ELBOMBOLI = new LatLng(-1.0399275407608615, -79.46789269275033);
        Mapas.addMarker(new MarkerOptions().position(ELBOMBOLI).title("EL BOMBOLÍ").snippet("Restaurante").icon(BitmapDescriptorFactory.fromResource(R.mipmap.iconcomido2)));

        LatLng CASAMONTIEL = new LatLng(-1.0323756753779003, -79.46291451260221);
        Mapas.addMarker(new MarkerOptions().position(CASAMONTIEL).title("La Casade Montiel").snippet("Restaurante").icon(BitmapDescriptorFactory.fromResource(R.mipmap.iconcomido2)));

        LatLng JUANDIEGO = new LatLng(-1.024652158138716, -79.46188454429571);
        Mapas.addMarker(new MarkerOptions().position(JUANDIEGO).title("Parrilla Juan Diego").snippet("Restaurante").icon(BitmapDescriptorFactory.fromResource(R.mipmap.iconcomido2)));

        LatLng PAPASPRIMO = new LatLng(-1.021047843712603, -79.4606829146048);
        Mapas.addMarker(new MarkerOptions().position(PAPASPRIMO).title("Papas El Primo").snippet("Restaurante").icon(BitmapDescriptorFactory.fromResource(R.mipmap.iconcomido2)));

        LatLng SPORTFISH  = new LatLng(-1.0343923684625904, -79.46368698883211);
        Mapas.addMarker(new MarkerOptions().position(SPORTFISH).title("Cevichería Sport Fish").snippet("Restaurante").icon(BitmapDescriptorFactory.fromResource(R.mipmap.iconcomido2)));

        LatLng PAPANELSON  = new LatLng(-1.0224867044853387, -79.46089342752803);
        Mapas.addMarker(new MarkerOptions().position(PAPANELSON).title("Papá Nelson - Costillas Asadas").snippet("Restaurante").icon(BitmapDescriptorFactory.fromResource(R.mipmap.iconcomido2)));


        LatLng LASMARUCHAS = new LatLng(-1.026924359701129, -79.46275258838617);
        Mapas.addMarker(new MarkerOptions().position(LASMARUCHAS).title("ASADERO \"LAS MARUCHAS\"").snippet("Restaurante").icon(BitmapDescriptorFactory.fromResource(R.mipmap.iconcomido2)));

        LatLng ELCHATO = new LatLng(-1.0277903170766984, -79.4628067194272);
        Mapas.addMarker(new MarkerOptions().position(LOSMOROS).title("Asadero El Chato").snippet("Restaurante").icon(BitmapDescriptorFactory.fromResource(R.mipmap.iconcomido2)));

        LatLng CHIFARAYMOND = new LatLng(-1.029265372620842, -79.4684874589593);
        Mapas.addMarker(new MarkerOptions().position(CHIFARAYMOND).title("Chifa Raymond").snippet("Restaurante").icon(BitmapDescriptorFactory.fromResource(R.mipmap.iconcomido2)));

        LatLng ZONALIGHT = new LatLng(-1.0190766102252649, -79.46935657510299);
        Mapas.addMarker(new MarkerOptions().position(ZONALIGHT).title("ZONA LIGHT, RESTAURANT VEGETARIANO, QUEVEDO.").snippet("Restaurante").icon(BitmapDescriptorFactory.fromResource(R.mipmap.iconcomido2)));

        LatLng BOCADOSYALGOMAS = new LatLng(-1.0171101596756997, -79.46805743011784);
        Mapas.addMarker(new MarkerOptions().position(BOCADOSYALGOMAS).title("Bocados & algo mas").snippet("Restaurante").icon(BitmapDescriptorFactory.fromResource(R.mipmap.iconcomido2)));

        LatLng PIQUEYPASE = new LatLng(-1.015077776176928, -79.46701798602881);
        Mapas.addMarker(new MarkerOptions().position(PIQUEYPASE).title("PIQUE Y PASE").snippet("Restaurante").icon(BitmapDescriptorFactory.fromResource(R.mipmap.iconcomido2)));


        LatLng DELICIASDELOLIMPO = new LatLng(-1.0143251245552953, -79.46644383963586);
        Mapas.addMarker(new MarkerOptions().position(DELICIASDELOLIMPO).title("Cafe Restaurante Las Delicias Del Olimpo").snippet("Restaurante").icon(BitmapDescriptorFactory.fromResource(R.mipmap.iconcomido2)));

        LatLng SWETLAND = new LatLng(-1.0323756753779003, -79.46291451260221);
        Mapas.addMarker(new MarkerOptions().position(SWETLAND).title("Sweet Land").snippet("Restaurante").icon(BitmapDescriptorFactory.fromResource(R.mipmap.iconcomido2)));

        LatLng GORDOGLENN = new LatLng(-1.0145164766790888, -79.46715833292487);
        Mapas.addMarker(new MarkerOptions().position(GORDOGLENN).title("Gordo Glenn").snippet("Restaurante").icon(BitmapDescriptorFactory.fromResource(R.mipmap.iconcomido2)));

        LatLng MARBELLA = new LatLng(-1.012921875301878, -79.46681384508909);
        Mapas.addMarker(new MarkerOptions().position(MARBELLA).title("Mar' Bella").snippet("Restaurante").icon(BitmapDescriptorFactory.fromResource(R.mipmap.iconcomido2)));

        LatLng PICUDOBLANCO  = new LatLng(-1.0355775974808004, -79.47114192172303);
        Mapas.addMarker(new MarkerOptions().position(PICUDOBLANCO).title("Cevichería El Picudo Blanco Internacional").snippet("Restaurante").icon(BitmapDescriptorFactory.fromResource(R.mipmap.iconcomido2)));

        LatLng MOROSYASADOS  = new LatLng(-1.0365430348451965, -79.46830950888014);
        Mapas.addMarker(new MarkerOptions().position(PAPANELSON).title("La Tuka Moros y Asados").snippet("Restaurante").icon(BitmapDescriptorFactory.fromResource(R.mipmap.iconcomido2)));

        Mapas.setInfoWindowAdapter(new MyInfoWindowAdapter(this));
        }
    @Override
    public void onMapClick(@NonNull LatLng latLng) {

    }

    private void  obtenerMarcadores(){

    }


}




