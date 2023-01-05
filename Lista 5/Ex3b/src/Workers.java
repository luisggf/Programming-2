public class Workers {
    private String name;
    private String codigo;
    private Double salary;
    private String AdmissionDate;

    public Workers(String id, String n, double salary, String AdmissionDate) {
        this.name = id;
        this.codigo = n;
        this.salary = salary;
        this.AdmissionDate = AdmissionDate;
    }

    public String getNome() {
        return name;
    }

    public String getID() {
        return codigo;
    }

    public String toString() {
        return "\nNome: " + this.name + "\nCódigo: " + this.codigo + "\nSalário: " + this.salary
                + "\nData de admissão: " + this.AdmissionDate;
    }


    /**
     * @return String return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return String return the codigo
     */
    public String getCodigo() {
        return codigo;
    }

    /**
     * @param codigo the codigo to set
     */
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    /**
     * @return Double return the salary
     */
    public Double getSalary() {
        return salary;
    }

    /**
     * @param salary the salary to set
     */
    public void setSalary(Double salary) {
        this.salary = salary;
    }

    /**
     * @return String return the AdmissionDate
     */
    public String getAdmissionDate() {
        return AdmissionDate;
    }

    /**
     * @param AdmissionDate the AdmissionDate to set
     */
    public void setAdmissionDate(String AdmissionDate) {
        this.AdmissionDate = AdmissionDate;
    }

}