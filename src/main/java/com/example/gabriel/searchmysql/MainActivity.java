package com.example.gabriel.searchmysql;

import android.os.AsyncTask;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.TextView;

import java.net.URL;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button Search;
    TextView Speciality;
    TextView Date;
    TextView Time;
    TextView Doctor;

    // IP del Url de la base de datos (Esto se tiene que enlazar de alguna manera con el usuario con que se entra
    String IP = "http://laravel.win/api/v1/patient";
    // Ruta para la busqueda de turnos
    String GET = IP + "/pending_appointment"; //Enlace de la ruta correspondiente (Ejemplo)

    ObtenerWebService hiloconexion;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        //Enlace para los layout
        Search = (Button)findViewById(R.id.BConsultTurn);
        Speciality = (TextView)findViewById(R.id.textView_Specialty);
        Date = (TextView)findViewById(R.id.textView_Date);
        Time = (TextView)findViewById(R.id.textView_Time);
        Doctor = (TextView)findViewById(R.id.textView_Doctor);

        //Listener del boton de busqueda
        Search.setOnClickListener(this);



        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.BConsultTurn:

                hiloconexion = new ObtenerWebService();
                hiloconexion.execute(GET,"1");   // Parámetros que recibe doInBackground

                break;
            default:

                break;

        }
    }

    public class ObtenerWebService extends AsyncTask<String,Void,String> {

        protected String doInBackground(String... params){


            return null;
        }

    }
}
