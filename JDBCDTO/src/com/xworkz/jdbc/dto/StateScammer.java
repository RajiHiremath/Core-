package com.xworkz.jdbc.dto;

import com.xworkz.jdbc.dao.StateDAO;

public class StateScammer {

	public static void main(String[] args) {
		
		StateDTO state1 = new StateDTO(2, "Karnataka",29,"Bangalore");
		StateDTO state2 = new StateDTO(3, "Jammu Kashamir",19,"Shrinagar");
		StateDTO state3 = new StateDTO(4, "Punjab",21,"Chandigarh");
		

		StateDAO stateDAO = new StateDAO();
		stateDAO.save(state1);
		stateDAO.save(state2);
		stateDAO.save(state3);
		

		boolean element=stateDAO.deleteById(4);
		System.out.println(element); 

		stateDAO.displayById(2);
		stateDAO.displayAll();
		stateDAO.displayTotalRows();
	}

}
