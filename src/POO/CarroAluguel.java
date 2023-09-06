public class CarroAluguel {
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
    public void setDistanciaPercorrida(int distancia) {
        this.distancia = distancia;
    }
    public float getDistanciaPercorrida(){
        return distancia;
    }

    public void alugar() throws CarroDisponivelException {
        if(disponivel) {
            throw new CarroDisponivelException("O carro está disponível.");
        }
        disponivel = false;

    }
    public void devolver() throws CarroDisponivelException {
        if(disponivel) {
            throw new CarroDisponivelException("O carro está disponível.");
        }
        if(debito != 0) {
            throw new CarroNaoPagoException("Carro não foi pago.");

    
        disponivel = false;

        }

    }
    public boolean isDisponivel(){
        return disponivel;

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
    public void pagar(){
        


        }
    }
    

}
