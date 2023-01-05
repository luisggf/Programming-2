class Test {
    public static void main(String args[]) {
        Oficina o = new Oficina();
        veicle v;

        for (int i = 0; i < 4; ++i) {
            v = o.proximo();
            o.maintence(v);
        }
    }
}