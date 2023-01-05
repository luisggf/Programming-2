public class Invoice {
    public int productcode;
    public String product_dscpt;
    public int buy_amount;
    public float unitary_prz;

    public Invoice(String product_dscpt, int productcode, int buy_amount, float unitary_prz){
        this.product_dscpt = product_dscpt;
        this.buy_amount = buy_amount;
        this.unitary_prz = unitary_prz;
        this.productcode = productcode;
    }

}

