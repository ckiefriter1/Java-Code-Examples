
public class PublicPrivateProtected {

	private   int a = 1;
	protected int b = 2;
	public    int c = 3;
	
		
	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
		this.privateMethod();
	}

	private void privateMethod() {
		
	}
	

}

	