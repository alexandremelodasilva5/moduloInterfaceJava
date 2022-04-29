package model.entities;

import java.util.Date;
import java.util.ArrayList;
import java.util.List;

public class Contract {
	private Integer number;
	private Date date;
	private Double totalValue;
	
	private List<Installiment> installiments = new ArrayList<>();

	public Contract(Integer number, Date date, Double totalValue) {
		this.number = number;
		this.date = date;
		this.totalValue = totalValue;
	}

	public Integer getNumber() {
		return number;
	}

	public Date getDate() {
		return date;
	}

	public Double getTotalValue() {
		return totalValue;
	}

	public List<Installiment> getInstalliments() {
		return installiments;
	}
	
	public void addInstallments(Installiment installiment) {
		installiments.add(installiment);
	}
	
	public void removeInstallment(Installiment installiment) {
		installiments.remove(installiment);
	}
}
