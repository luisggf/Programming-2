public abstract class CartaoWeb {
    private String dest;
    public CartaoWeb(){

    }

    /**
     * @return String return the dest
     */
    public String getDest() {
        return dest;
    }

    /**
     * @param dest the dest to set
     */
    public void setDest(String dest) {
        this.dest = dest;
    }

    public abstract void showMessage();

}
