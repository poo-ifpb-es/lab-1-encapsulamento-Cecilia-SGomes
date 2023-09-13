public class CarroAluguel extends Exception {
    public float valorPorKm;
    public int distancia;
    public boolean sinistro;
    public boolean disponivel;
    public float debito;

    public CarroAluguel(float valorPorKm) {
        this.valorPorKm = valorPorKm;
        this.distancia = 0;
        this.sinistro= false;
        this.disponivel = true;
        this.debito = 0;
    }
    public float getValorPorKm() {
        return valorPorKm;
    }
     public void setValorPorKm(float valorPorKm) {
        this.valorPorKm = valorPorKm;
    }
     public void setDistanciaPercorrida(int distancia) {
        this.distancia = distancia;
    }
    public float getDistanciaPercorrida(){
        return distancia;
    }
    public boolean isDisponivel(){
        return disponivel;
    } 
    public void alugar() throws CarroIndisponivelException{
        if(!disponivel) {
            throw new CarroIndisponivelException();
        }
        disponivel = false;
    }
    public void devolver() throws CarroDisponivelException, CarroNaoPagoException{
        if(disponivel) {
            throw new CarroDisponivelException();
        }
        if(debito > 0) {
            throw new CarroNaoPagoException();
        }
        disponivel = true;
        sinistro = false;
        distancia = 0;
    }
    public boolean hasSinistro(){
        return sinistro;
    }
    public void setSinistro(boolean sinistro) {
        this.sinistro = sinistro;
    }
    public float getDebito(){
        float debito = valorPorKm*distancia;
        return debito;
    }
    public void pagar() throws CarroDisponivelException{
        if(distancia == 0){
            debito = 0;
        }
        if(disponivel){
            throw new CarroDisponivelException();
        }
        if(sinistro){
          debito = debito+0.6f;
        }
        disponivel = true;
        sinistro = true;
        }
    }
