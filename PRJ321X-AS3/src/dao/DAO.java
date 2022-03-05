package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import org.apache.coyote.Request;

import Model.product;
import Model.User;
import Model.product;
import context.java.DBcontext;



public class DAO {
	Connection conn=null;
	PreparedStatement ps=null;
	ResultSet rs=null;
	public List<product> getAllProduct(){
		List<product> list=new ArrayList<>();
		String query="select * from products";
		try {
			conn= new DBcontext().getConnection();
			ps=conn.prepareStatement(query);
			rs=ps.executeQuery();
			while(rs.next()) {
				list.add(new product(rs.getInt(1),
						rs.getString(2),
						rs.getString(3),
						rs.getFloat(4),
						rs.getString(5),
						rs.getString(6),
						rs.getString(7)));
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		return list;
		
	}
	public product getProductById(String id) {
		String query="select * from products where product_id=?";
		try {
			conn=new DBcontext().getConnection();
			ps=conn.prepareStatement(query);
			ps.setString(1, id);
			rs=ps.executeQuery();
			while(rs.next()) {
				return new product(rs.getInt(1),
						rs.getString(2),
						rs.getString(3),
						rs.getFloat(4),
						rs.getString(5),
						rs.getString(6),
						rs.getString(7));
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
		return null;
	}
	public List<product> searchProduc(String txtname){
		List<product> list=new ArrayList<>();
		String query="select * from products where product_name like ?";
		try {
			conn= new DBcontext().getConnection();
			ps=conn.prepareStatement(query);
			ps.setString(1, "%"+txtname+"%");
			rs=ps.executeQuery();
			while(rs.next()) {
				list.add(new product(rs.getInt(1),
						rs.getString(2),
						rs.getString(3),
						rs.getFloat(4),
						rs.getString(5),
						rs.getString(6),
						rs.getString(7)));
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		return list;
		
	}
	public User login(String user, String pass) {
		String query="select * from account where user_mail=? and password=?";
		try {
			conn=new DBcontext().getConnection();
			ps=conn.prepareStatement(query);
			ps.setString(1, user);
			ps.setString(2, pass);
			rs=ps.executeQuery();
			while(rs.next()) {
				return new User(
						rs.getString(1),
						rs.getString(2),
						rs.getInt(3),
						rs.getString(4),
						rs.getString(5),
						rs.getString(6)
				
						);
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return null;
		
	}
	
	public User check(String user) {
		String query="select * from account where user_mail=?";
		try {
			conn= new DBcontext().getConnection();
			ps=conn.prepareStatement(query);
			ps.setString(1, user);
			rs=ps.executeQuery();
			while(rs.next()) {
				return new User(
						rs.getString(1),
						rs.getString(2),
						rs.getInt(3),
						rs.getString(4),
						rs.getString(5),
						rs.getString(6)
				
						);
				
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		
		return null;
	}
	public void adduser( String user_mail,String password,String user) {
		String queryString="INSERT INTO account( user_mail,password,account_role,user_name,user_address,user_phone) values(?,?,0,?,'','')";
		
		try {
			
			conn= new DBcontext().getConnection();
			ps=conn.prepareStatement(queryString);
			ps.setString(1, user_mail);
			ps.setString(2, password);
			ps.setString(3, user);
			ps.executeUpdate();
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
	}
	
	
	 public product getProductc(String id) {
			String query="select * from products where product_id=?";
			try {
				conn=new DBcontext().getConnection();
				ps=conn.prepareStatement(query);
				ps.setString(1, id);
				rs=ps.executeQuery();
				while(rs.next()) {
					return new product(rs.getInt(1),
							rs.getString(2),
							rs.getFloat(3),
							rs.getString(4),
							1);
				}
			} catch (Exception e) {
				// TODO: handle exception
			}
			return null;
		}
	 
public static void main(String[] args) {
	DAO dao=new DAO();
	product u = dao.getProductc("3");
	
		System.out.println(u);
		
	
	
} 
}
