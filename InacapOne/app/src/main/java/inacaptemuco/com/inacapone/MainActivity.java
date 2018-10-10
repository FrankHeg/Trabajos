package inacaptemuco.com.inacapone;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    //1.- Creamos objetos de componentes a utilizar en este activit, luego las vinculamos
    //Con la definición en el archivo de layout.
    EditText edtEdad;
    TextView txvResultado;
    Button btnCalcular;
    EditText edtNombre;
    Button btnInstrucciones;
    EditText edtpesoActual;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
     //2.- Asociamos los objetos de la clase con los elemntos de la interfaz

        edtEdad = (EditText) findViewById(R.id.edt_age);
        txvResultado = (TextView) findViewById(R.id.txv_result);
        btnCalcular = (Button) findViewById(R.id.btn_calculate);
        edtNombre = (EditText) findViewById(R.id.edt_name);
        btnInstrucciones = (Button) findViewById(R.id.btn_instucciones);
        edtpesoActual = (EditText) findViewById(R.id.edt_peso_actual);

     //3.- Habilitamos la posibilidad de que un elemento de la interfaz ejecute una acción en el evento click(tap)

        btnCalcular.setOnClickListener(this);
        btnInstrucciones.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

     //Para poder determinar el comportamiento según el boton seleccionado utilizamos la estructura switch
        switch (v.getId()){
            case R.id.btn_calculate:
                abrirResultado();

                break;
            case R.id.btn_instucciones:
                abrirInstrucciones();

                break;
        }

    }

    private void abrirInstrucciones() {
        //Deben abrir mediante un intent el activity de instrucciones
    }

    public void abrirResultado(){
        //4.- Capturamos el valor ingresados en las cajas

        int edadIngresada = Integer.parseInt(edtEdad.getText().toString());
        String nombreIngresado = edtNombre.getText().toString();
        int pesoIngresado = Integer.parseInt(edtpesoActual.getText().toString());

         /*int pesoIdeal = edadIngresada * 2 +8;
         txvResultado.setText("El peso ideal es " +pesoIdeal);*/
        //5.- Establecemos un intento para abrir un nuevo activity (ResultadoActivity)

        Intent intento = new Intent(MainActivity.this,ResultadoActivity.class);

        //6.- Especificamos los datos que queremos enviar al activity ResultadoActivity.

        intento.putExtra( "p_edad",edadIngresada);
        intento.putExtra("p_nombre",nombreIngresado);
        intento.putExtra("p_pesoIngresado",pesoIngresado);

        //7.- Ejecutamos el activity con startActivity especificando cual es el objeto
        // de la clase Intent que define el destino y los datos a transportar
        startActivity(intento);

    }
}
