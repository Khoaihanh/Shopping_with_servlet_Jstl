package Model;

public class User {
	private String user_mail;
	private String password;
	private int account_role;
	private String user_name;
	private String user_address;
	private String user_phone;
	public User() {
		super();
	}
	public User(String user_mail, String password, int account_role, String user_name, String user_address,
			String user_phone) {
		super();
		this.user_mail = user_mail;
		this.password = password;
		this.account_role = account_role;
		this.user_name = user_name;
		this.user_address = user_address;
		this.user_phone = user_phone;
	}
	public String getUser_mail() {
		return user_mail;
	}
	public void setUser_mail(String user_mail) {
		this.user_mail = user_mail;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public int getAccount_role() {
		return account_role;
	}
	public void setAccount_role(int account_role) {
		this.account_role = account_role;
	}
	public String getUser_name() {
		return user_name;
	}
	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}
	public String getUser_address() {
		return user_address;
	}
	public void setUser_address(String user_address) {
		this.user_address = user_address;
	}
	public String getUser_phone() {
		return user_phone;
	}
	public void setUser_phone(String user_phone) {
		this.user_phone = user_phone;
	}
	@Override
	public String toString() {
		return "User [user_mail=" + user_mail + ", password=" + password + ", account_role=" + account_role
				+ ", user_name=" + user_name + ", user_address=" + user_address + ", user_phone=" + user_phone + "]";
	}
	

}
