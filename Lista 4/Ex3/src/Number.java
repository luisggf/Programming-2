import java.util.Objects;
public class Number {
	private int num;
    public int getNum() {
        return this.num;
    }

    public void setNum(int number) {
        this.num = number;
    }
	public Number(int N) {
		this.setNum(N);;
	}

    
    @Override
    public int hashCode() {
        return this.getNum();
    }

	@Override
	public boolean equals(Object obj) {
		if(this == obj ) 
            return true;
		else if(obj==null || getClass()!= obj.getClass())
            return false;
		Number numero = (Number) obj;
		return Objects.equals(num, numero.num );
	}
	
	@Override
	public String toString() {
		return "Número: " + this.getNum();
	}
	
}