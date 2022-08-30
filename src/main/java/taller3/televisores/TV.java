package taller3.televisores;

public class TV {

    private static int numTV = 0;

    private Marca marca;
    private int canal = 1;
    private int precio = 500;
    private boolean estado;
    private int volumen = 1;
    private Control control;

    public TV(Marca marca, boolean estado){
        this.marca =marca;
        this.estado = estado;
        numTV++;
    }

    private boolean canalValido(int canal){
        return this.estado && canal >= 1 && canal <= 120;
    }

    private boolean volumenValido(int volumen){
        return this.estado && volumen >= 0 && volumen <= 7;
    }


    public Control getControl() {
        return this.control;
    }

    public Marca getMarca() {
        return this.marca;
    }

    public int getCanal() {
        return this.canal;
    }

    public int getPrecio() {
        return this.precio;
    }

    public int getVolumen() {
        return this.volumen;
    }

    public static int getNumTV() {
        return TV.numTV;
    }

    public boolean getEstado() {
        return this.estado;
    }

    public void setMarca(Marca marca) {
        this.marca = marca;
    }

    public void setCanal(int canal) {
        this.canal = canalValido(canal) ? canal : this.canal;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public void setVolumen(int volumen) {
        this.volumen = volumen;
    }

    public void setControl(Control control) {
        this.control = control;
    }

    public void turnOn(){
        this.estado = true;
    }

    public void turnOff(){
        this.estado = false;
    }

    public void canalUp(){
        final int canalNuevo = this.canal + 1;
        this.canal = canalValido(canalNuevo) ? canalNuevo : this.canal;
    }

    public void canalDown() {
        final int canalNuevo = this.canal - 1;
        this.canal = canalValido(canalNuevo) ? canalNuevo : this.canal;
    }

    public void volumenUp(){
       final int volumenNuevo =  this.volumen + 1;
       this.volumen = volumenValido(volumenNuevo) ? volumenNuevo : this.volumen;
    }

    public void volumenDown() {
        final int volumenNuevo =  this.volumen - 1;
        this.volumen = volumenValido(volumenNuevo) ? volumenNuevo : this.volumen;
    }

    public static void setNumTV(int numTV) {
        TV.numTV = numTV;
    }
}
