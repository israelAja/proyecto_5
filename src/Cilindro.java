
public class Cilindro extends Circulo{
    private double altura;
    
    public Cilindro(){}

    public Cilindro(double radioP, double alt) {
        super(radioP);
        this.altura = alt;
    }
    
    public void setAltura(double a){
        this.altura = a;
    }
    public double getAltura(){
        return this.altura;
    }

    @Override
    public String toString() {
        return "Cilindro{" + "Radio= " + 
                super.getRadio()+ " altura=" + 
                this.getAltura() + '}';
    }
//2PI*r2 + 2PI*radio*alt
    @Override
    protected double calcularArea() {
        return ( 2*Math.PI*Math.pow(super.getRadio(), 2)+
                2*Math.PI*this.getAltura()*super.getRadio());
    }
   //PI*radio2*h
    protected double calcularVolumen(){
        return (Math.PI*Math.pow(super.getRadio(),2)*
                this.getAltura());
    }
         
}

