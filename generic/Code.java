package generic;

public class Code<T> {
	T code;

	public Code(T code) {
		super();
		this.code = code;
	}

	public T getCode() {
		return code;
	}

	public void setCode(T code) {
		this.code = code;
	}
	public void print() {
		//System.out.println("Code type is :" +code.getClass().getSimpleName());
		System.out.println("Code is :" + code);
	}
	
	

}
