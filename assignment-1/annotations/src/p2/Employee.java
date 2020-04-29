package p2;

public class Employee {
	int Eid;
	String Ename;
	int Esal;
	Address ad;
	
	public Employee() {
		
	}
	public Employee(Address ad) {
		this.ad=ad;
	}

	public Employee(int eid, String ename, int esal, Address ad) {
		super();
		Eid = eid;
		Ename = ename;
		Esal = esal;
		this.ad = ad;
	}

	public int getEid() {
		return Eid;
	}

	public void setEid(int eid) {
		Eid = eid;
	}

	public String getEname() {
		return Ename;
	}

	public void setEname(String ename) {
		Ename = ename;
	}

	public int getEsal() {
		return Esal;
	}

	public void setEsal(int esal) {
		Esal = esal;
	}

	public Address getAd() {
		return ad;
	}

	public void setAd(Address ad) {
		this.ad = ad;
	}

	@Override
	public String toString() {
		return "Employee [Eid=" + Eid + ", Ename=" + Ename + ", Esal=" + Esal + ", ad=" + ad + "]";
	}
	
	
	
	
	

}
