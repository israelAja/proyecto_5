public class Circulo {
    //4 niveles de acceso
    //public , private , protected , default
    // xd
    protected double radio;
    
    public Circulo(){}
    
    public Circulo (double r){
        this.radio = r;
    }
    
    public void setRadio(double r){
        this.radio = r;
    }
    public double getRadio(){
        return this.radio;
    }

    @Override
    public String toString() {
        return "Circulo{" + "radio=" + radio + '}';
    }
    
    protected double calcularArea(double radioTemp) {
        if (radioTemp < 0) {
            System.out.println("El radio es negativo");
            return 0;
        } else {
            return Math.PI * Math.pow(radioTemp, 2);
        }
    }
    protected double calcularLongitud(){ 
        return 2*Math.PI*this.getRadio();
    }
    protected double calcularLongitud(double radioTemp) {
        return 2 * Math.PI * radioTemp;
    }
}