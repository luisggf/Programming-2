import java.util.Objects;

public class Produtos {
    private String Code;
    String name;
    float prize;

    public Produtos(String bar, String name, float prize) {
        this.Code = bar;
        this.name = name;
        this.prize = prize;

    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null || getClass() != obj.getClass())
            return false;
        Produtos produto = (Produtos) obj;
        return Objects.equals(Code, produto.getBarocod());

    }

    @Override
    public int hashCode() {
        return this.Code.charAt(0);
    }

    @Override
    public String toString() {
        return "" + this.getNome() + "--" + this.getPreco() + "--" + this.getBarocod();
    }

    public String getBarocod() {
        return Code;
    }

    public void setBarocod(String Code) {
        this.Code = Code;
    }

    public String getNome() {
        return name;
    }

    public void setNome(String name) {
        this.name = name;
    }

    public float getPreco() {
        return prize;
    }

    public void setPreco(float prize) {
        this.prize = prize;
    }
}