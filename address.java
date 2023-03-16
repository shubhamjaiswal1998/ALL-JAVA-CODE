package hybernate.com.tut1;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;
@Entity
@Table(name="address_details")
public class address {
	// for id 
      @Id
      @GeneratedValue(strategy=GenerationType.IDENTITY)
      @Column(name="address_id")
      private int addressid;
      
      // for street
      @Column(name="STREET",length = 50)
	  private String street;
      
      // for city
      @Column(name="CITY",length = 100)
	  private String  city;
      
	  private boolean isopen;
	  // for x
	  @Transient
	  private double x;
	  
	  // for date
	  @Temporal(TemporalType.DATE)
	  private Date addeded;
	  private byte[] image;
	  
	public address() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public int getAddressid() {
		return addressid;
	}
	public void setAddressid(int addressid) {
		this.addressid = addressid;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public boolean isIsopen() {
		return isopen;
	}
	public void setIsopen(boolean isopen) {
		this.isopen = isopen;
	}
	public double getX() {
		return x;
	}
	public void setX(double x) {
		this.x = x;
	}
	public Date getAddeded() {
		return addeded;
	}
	public void setAddeded(Date addeded) {
		this.addeded = addeded;
	}
	public byte[] getImage() {
		return image;
	}
	public void setImage(byte[] image) {
		this.image = image;
	}
	  
	  
	  
	
	
}
