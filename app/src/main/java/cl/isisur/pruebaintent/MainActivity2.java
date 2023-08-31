package cl.isisur.pruebaintent;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    TextView tvresultad

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        tvresultado=(TextView) findViewById(R.id.tvresultado);
        tvresultado.setText("Resultado Nombre:"+getIntent().getStringExtra("nombre"));


    }
}