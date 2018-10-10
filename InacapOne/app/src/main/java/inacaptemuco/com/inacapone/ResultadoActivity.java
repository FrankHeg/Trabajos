package inacaptemuco.com.inacapone;

import android.content.Intent;
import android.content.IntentFilter;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import org.w3c.dom.Text;

import operaciones.Salud;

public class ResultadoActivity extends AppCompatActivity {
    //1.- Creamos un objeto de la clase TextView
    TextView txvResultado;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resultado);
        //2.- Asociar al objeto el componente del layout

        txvResultado = (TextView) findViewById(R.id.txv_resultado);

        //3.- Capturamos el objeto de la clase Intent que se envía desde el MainActivity

        Intent intento = getIntent();

        //4.- Obtenemos los datos enviados al activity

        Bundle datosReciidos = intento.getExtras();

        //5.- Capturamos uno de los datos enviados al Activity mediante el intento.

        // 5.1.- Creamos objeto de la clase Salud

        Salud salud = new Salud();

        // 5.2.- Mediante los setter asignamos las propiedades al objeto
        int edadRecibida = datosReciidos.getInt("p_edad");
        String nombreRecibido = datosReciidos.getString("p_nombre");
        int pesoActualRecibido = datosReciidos.getInt("p_peso_ingresado");
        salud.setNombre(nombreRecibido);
        salud.setEdad(edadRecibida);
        salud.setpesoActual(pesoActualRecibido);

        // 5.3.- Calculamos el peso ideal utilizando el metodo de la clase Salud

        //6.- Modificamos el TextView de resultado con lo que corresponde

        txvResultado.setText(salud.getNombre()+ " se encuentra en " + salud.calcularPesoIdeal());
    }
}
