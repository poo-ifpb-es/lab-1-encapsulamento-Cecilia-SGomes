public class Circulo{
    
    public float raio;
    public float pi = (float) 3.14159;

    public Circulo(float raio) {
        this.raio = raio;
    }

    public float getRaio() {
        return raio;
    }

    public void setRaio(float raio) {
        this.raio = raio;
    }

    public float getArea(float raio, float pi){
        float area = pi*raio*raio;

        return area;
    }

    public float getCircunferencia(float raio, float pi){
        float circunferencia =  2*pi*raio;

        return circunferencia;
    } 

    
    
}