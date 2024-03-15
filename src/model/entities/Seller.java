package model.entities;


import java.io.Serializable;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;
import java.util.Objects;

public class Seller implements Serializable{
	
	private static final long serialVersionUID = 1L;
	private Integer id;
	private String name;
	private String email;
	private Date birthday;	
	private Double baseSalay;
	
	private Department department;
	
	public Seller() {
		// TODO Auto-generated constructor stub
	}

	public Seller(Integer id, String name, String email, Date birthday, Double baseSalay, Department department) {
		this.id = id;
		this.name = name;
		this.email = email;
		this.birthday = birthday;
		this.baseSalay = baseSalay;
		this.department = department;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Date getBirthday() {
		return birthday;
	}

	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}

	public Double getBaseSalay() {
		return baseSalay;
	}

	public void setBaseSalay(Double baseSalay) {
		this.baseSalay = baseSalay;
	}

	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Seller other = (Seller) obj;
		return Objects.equals(id, other.id);
	}

	@Override
	public String toString() {
		return "Seller [id=" + id + ", name=" + name + ", email=" + email + ", birthday=" + birthday + ", baseSalay="
				+ baseSalay + ", department=" + department + "]";
	}
	
	
	
	

}
