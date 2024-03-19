package model.dao;



import db.DB;
import model.dao.impl.DepartamenteDaoJdbc;
import model.dao.impl.SellerDaoJdbc;

public class DaoFactory {

	public static SellerDao createSellerDao() {
		return new SellerDaoJdbc(DB.getConnection());
				}
	
	public static DepartmentDao createDepartmentDao() {
		return new DepartamenteDaoJdbc(DB.getConnection());
				}
	}
