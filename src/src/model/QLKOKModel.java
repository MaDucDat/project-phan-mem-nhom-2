package model;

import java.util.ArrayList;
import java.util.Collection;

import model.Customer;
import staff.staff;

public class QLKOKModel{
	private ArrayList<Customer> dsCustomer;
	private String luachon;

	public QLKOKModel(){
		this.dsCustomer = new ArrayList <Customer>();
		this.luachon = "";
	}

	public QLKOKModel(ArrayList<Customer> dsCustomer) {
		this.dsCustomer = dsCustomer;
	}

	public ArrayList<Customer> getDsCustomer() {
		return dsCustomer;
	}

	public void setDsCustomer(ArrayList<Customer> dsCustomer) {
		this.dsCustomer = dsCustomer;
	}
	
	public void  insert(staff st) {
		this.dsCustomer.addAll((Collection<? extends Customer>) st);
	}
	
	public void  delete(Customer khach) {
		this.dsCustomer.add(khach);
	}
	
	public void  Edit(Customer khach) {
		this.dsCustomer.add(khach);
	}
	
	public void  update(Customer khach) {
		this.dsCustomer.remove(khach);
		this.dsCustomer.add(khach);
	}

	public String getLuachon() {
		return luachon;
	}

	public void setLuachon(String luachon) {
		this.luachon = luachon;
	}

		
}
