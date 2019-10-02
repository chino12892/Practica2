package bamr.itics.tesoem.edu.practica2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Ventada2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ventada2);
    }
    public void cargarpantalla(View v){
        Intent frm3 = new Intent(this,Ventana3Activity.class);
        startActivity(frm3);
        finish();
    }
}
