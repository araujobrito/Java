public class Telefonecelular {

    public static void main (String [] args){
       Telefonecelular celular = new Telefonecelular();

        celular.setCor("Black");
        celular.setMarca ("Iphone 17");
        celular.setArmazenamento (1500);
        celular.setPreco (100000);
        celular.setTamanho ("15 polegadas");

        System.out.println(celular.getCor());
        System.out.println(celular.getMarca());
        System.out.println(celular.getArmazenamento());
        System.out.println(celular.getPreco());
        System.out.println(celular.getTamanho());
    }

    private String cor;
    private String marca;
    private double armazenamento;
    private int preco;
    private String tamanho;

    public String getCor(){
        return cor;
    }

    public String getMarca(){
        return marca;
    }

    public double getArmazenamento(){
        return armazenamento;
    }

    public int getPreco(){
        return preco;
    }

    public String getTamanho(){
        return tamanho;
    }

    public void setCor(String cor){
        this.cor = cor;
    }

    public void setMarca(String marca){
        this.marca = marca;
    }

    public void setArmazenamento(double armazenamento){
        this.armazenamento = armazenamento;
    }

    public void setPreco(int preco){
        this.preco = preco;
    }

    public void setTamanho(String tamanho){
        this.tamanho = tamanho;
    }
}
