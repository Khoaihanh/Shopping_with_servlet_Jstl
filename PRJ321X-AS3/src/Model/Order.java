package Model;

import java.sql.Date;
import java.util.List;

public class Order {
	private int orderId;
	private float price;
	private int status;
	private Date orderDate;
	private String address;
	private String phoneNumber;
	private List<ProductOders> lP;
	private String userEmail;
	private Date receivedDate;
	private String dissCount;
	public Order() {
		super();
	}
	public Order(int orderId, float price, int status, Date orderDate, String address, String phoneNumber,
			List<ProductOders> lP, String userEmail, Date receivedDate, String dissCount) {
		super();
		this.orderId = orderId;
		this.price = price;
		this.status = status;
		this.orderDate = orderDate;
		this.address = address;
		this.phoneNumber = phoneNumber;
		this.lP = lP;
		this.userEmail = userEmail;
		this.receivedDate = receivedDate;
		this.dissCount = dissCount;
	}
	public int getOrderId() {
		return orderId;
	}
	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	public Date getOrderDate() {
		return orderDate;
	}
	public void setOrderDate(Date orderDate) {
		this.orderDate = orderDate;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public List<ProductOders> getlP() {
		return lP;
	}
	public void setlP(List<ProductOders> lP) {
		this.lP = lP;
	}
	public String getUserEmail() {
		return userEmail;
	}
	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}
	public Date getReceivedDate() {
		return receivedDate;
	}
	public void setReceivedDate(Date receivedDate) {
		this.receivedDate = receivedDate;
	}
	public String getDissCount() {
		return dissCount;
	}
	public void setDissCount(String dissCount) {
		this.dissCount = dissCount;
	}
	

}
