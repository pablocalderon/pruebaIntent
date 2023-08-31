package cl.isisur.pruebaintent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
     Button boton;
     EditText nombre;
     Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        nombre =(EditText) findViewById(R.id.etNombre);
        boton =(Button) findViewById(R.id.btboton);
        intent = new Intent(this, MainActivity2.class);
        boton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                intent.putExtra("nombre",nombre.getText().toString());
                intent.putExtra("dato","hola");
                startActivity(intent);
            }
        });


    }
}