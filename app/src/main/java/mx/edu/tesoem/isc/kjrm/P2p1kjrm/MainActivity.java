package mx.edu.tesoem.isc.kjrm.P2p1kjrm;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.RadioButton;

public class MainActivity extends AppCompatActivity {
    RadioButton visc,vitics,vambiental,vgastronomia;
    CheckBox vcasa,vescuela,vtrabajo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        visc = (RadioButton) findViewById(R.id.rbisc);
        vitics = (RadioButton) findViewById(R.id.rbtics);
        vambiental = (RadioButton) findViewById(R.id.rba);
        vgastronomia = (RadioButton) findViewById(R.id.rbg);
        vcasa = (CheckBox) findViewById(R.id.cbcasa);
        vescuela = (CheckBox) findViewById(R.id.cbcasa);
        vtrabajo = (CheckBox) findViewById(R.id.cbtrabajo);

    }
    public void seleccion (View view){


        if(visc.isChecked()) Toast.makeText(this, "Ingenieria en Sistemas Computacionales", Toast.LENGTH_SHORT).show();
        if(vitics.isChecked()) Toast.makeText(this, "Ingenieria en Sistemas Computacionales", Toast.LENGTH_SHORT).show();
        if(vambiental.isChecked()) Toast.makeText(this, "Ingenieria en Sistemas Computacionales", Toast.LENGTH_SHORT).show();
        if(vgastronomia.isChecked()) Toast.makeText(this, "Ingenieria en Sistemas Computacionales", Toast.LENGTH_SHORT).show();
    }
    public void seleccion (View view){

        if(vcasa.isChecked()) Toast.makeText(this, "Ingenieria en Sistemas Computacionales", Toast.LENGTH_SHORT).show();
        if(vescuela.isChecked()) Toast.makeText(this, "Ingenieria en Sistemas Computacionales", Toast.LENGTH_SHORT).show();
        if(vtrabajo.isChecked()) Toast.makeText(this, "Ingenieria en Sistemas Computacionales", Toast.LENGTH_SHORT).show();

    }

}
