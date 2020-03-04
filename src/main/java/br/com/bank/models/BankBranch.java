package br.com.bank.models;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class BankBranch implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String agencyNumber;
	
	@OneToMany(mappedBy = "bankBranch")
	private List<Acount> acounts;
	
	@ManyToOne
	@JoinColumn(name="bank_id")
	private BankBranch bank;

	public BankBranch() {
	
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getAgencyNumber() {
		return agencyNumber;
	}

	public void setAgencyNumber(String agencyNumber) {
		this.agencyNumber = agencyNumber;
	}

	public List<Acount> getAcounts() {
		return acounts;
	}

	public void setAcounts(List<Acount> acounts) {
		this.acounts = acounts;
	}

	public BankBranch getBank() {
		return bank;
	}

	public void setBank(BankBranch bank) {
		this.bank = bank;
	}
}
