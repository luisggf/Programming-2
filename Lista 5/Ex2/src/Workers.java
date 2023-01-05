public class Workers {
    private String Name;
    private String Code;

    public Workers(String code, String n) {
        this.Name = n;
        this.Code = code;
    }

    public String getNome() {
        return Name;
    }

    public String getID() {
        return Code;
    }
}