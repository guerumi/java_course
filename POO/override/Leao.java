package POO.override;

public class Leao extends Animal {

    public Leao(String nome) {
        super(nome);
    }

    @Override
    public void emitirSom() {
        System.out.println("Roaaar!!");
    }
}
