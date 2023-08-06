package oscar;

public class Info {
	private int clave;
	private String info;

	public Info(int clave, String info) {
		super();
		this.clave = clave;
		this.info = info;
	}
	
	public Info(int clave) {
		super();
		this.clave = clave;
		this.info = null;
	}

	public int getClave() {
		return clave;
	}

	public void setClave(int clave) {
		this.clave = clave;
	}

	public String getInfo() {
		return info;
	}

	public void setInfo(String info) {
		this.info = info;
	}

	public String toString() {
		return clave + " " + info;
	}
	
	public boolean equals(Object fo)
	{
		
		if (fo==null) return false;
		
		if (this.getClass()!=fo.getClass()) return false;
		
		Info f=(Info)fo;
		return f.getClave()==getClave();
	}
	
	/*
	 * public int hashCode() { return 0; }
	 */
}
