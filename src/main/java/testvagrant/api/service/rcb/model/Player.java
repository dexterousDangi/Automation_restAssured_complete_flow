package testvagrant.api.service.rcb.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Player {
	
	private String name;

	private String country;

	private String role;

	@JsonProperty("price-in-crores")
	private String priceInCrores;

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return this.name;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getCountry() {
		return this.country;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public String getRole() {
		return this.role;
	}

	public void setPriceInCrores(String priceInCrores) {
		this.priceInCrores = priceInCrores;
	}

	public String getPriceInCrores() {
		return this.priceInCrores;
	}

	@Override
	public String toString() {
		return "Player [name=" + name + ", country=" + country + ", role=" + role + ", priceInCrores=" + priceInCrores
				+ "]";
	}
	
	
}