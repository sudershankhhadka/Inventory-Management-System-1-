package landing_page;

public class view {
	private String admin;
	private String cashier;
	public String getAdmin() {
		return admin;
	}
	public void setAdmin(String admin) {
		this.admin = admin;
	}
	public String getCashier() {
		return cashier;
	}
	public void setCashier(String cashier) {
		this.cashier = cashier;
	}
	@Override
	public String toString() {
		return "view [admin=" + admin + ", cashier=" + cashier + "]";
	}
	
	
}
