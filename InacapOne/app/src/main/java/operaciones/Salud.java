package operaciones;

public class Salud {

    private int edad;
    private String nombre;
    private int pesoActual;
    private int pesoIdeal;
    private String resultado;

    private int pesoIngresado;

    public String getResultado() {
        return resultado;
    }

    public void setResultado(String resultado) {
        this.resultado = resultado;
    }

    public int getPesoActual() {
        return pesoIngresado;
    }

    public void setPesoActual(int pesoActual) {
        this.pesoIngresado = pesoActual;
    }

    //Creamos método para calcular peso ideal

    public String calcularPesoIdeal(){

               pesoIdeal = edad*2+8;

               if (pesoIngresado == pesoIdeal){
                   resultado = "Peso ideal";
               }else{
                   if (pesoIngresado < pesoIdeal){
                       resultado = "Bajo peso";
                   }else{
                       resultado = "sobre peso";
                   }
               }
               return resultado;
    }

    public int getPesoIdeal() {
        return pesoIdeal;
    }

    public void setPesoIdeal(int pesoIdeal) {
        this.pesoIdeal = pesoIdeal;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getpesoActual(){
        return pesoActual;
    }

    public void setpesoActual(int pesoActual) {
        this.pesoActual = pesoActual;
    }
}

