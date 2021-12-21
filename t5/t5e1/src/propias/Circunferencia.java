package propias;

public class Circunferencia {
    //ATRIBUTOS
    private float radio;

    //CONSTRUCTOR
    public Circunferencia(float radio) {
        this.radio = radio;
    }

    //METODOS
    //get y set
    public float getRadio() {
        return radio;
    }

    public void setRadio(float radio) {
        this.radio = radio;
    }

    //calulo area
    public double area() {
        return 2 * Math.PI * radio;
    }

    //calculo volumen
    public double volumen() {
        return 4 * Math.PI * radio * radio * (radio / 3);
    }
}
