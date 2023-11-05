package assment;

import java.util.ArrayList;

public class QLKOKModel{
	private ArrayList<Customer> dsCustomer;

	public QLKOKModel(){
		this.dsCustomer = new ArrayList <Customer>();
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
	
	public void  insert(Customer khach) {
		this.dsCustomer.add(khach);
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

		
}
