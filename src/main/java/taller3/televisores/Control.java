package taller3.televisores;

public class Control {

    private TV tv;

    public Control() {}

    private boolean validarEnlaze() {
        return this.tv != null;
    }

    public void enlazar(TV tv){
        this.tv = tv;
        this.tv.setControl(this);
    }

    public void turnOn() {
        if(validarEnlaze()){
            this.tv.turnOn();
        }
    }

    public void turnOff() {
        if(validarEnlaze()){
            this.tv.turnOff();
        }
    }

    public void canalUp() {
        if(validarEnlaze()){
            this.tv.canalUp();
        }
    }

    public void canalDown() {
        if(validarEnlaze()){
            this.tv.canalDown();
        }
    }

    public void volumenUp() {
        if(validarEnlaze()){
            this.tv.volumenUp();
        }
    }

    public void volumenDown() {
        if(validarEnlaze()){
            this.tv.volumenDown();
        }
    }
    public void setCanal(int canal) {
        if(validarEnlaze()){
            this.tv.setCanal(canal);
        }
    }

    public TV getTv() {
        return tv;
    }

    public void setTv(TV tv) {
        this.tv = tv;
    }
}
