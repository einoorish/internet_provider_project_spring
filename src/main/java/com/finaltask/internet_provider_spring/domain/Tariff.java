package com.finaltask.internet_provider_spring.domain;

import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Tariff {
	 @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
		private long id;
	 
		private String title;
		private String title_uk;
		
	    @Enumerated(EnumType.STRING)
		private TariffType type;
		
	    private BigDecimal price;
		private String description;
		private String description_uk;
	
		public Tariff() {
		}
		
		public Tariff(String title, String title_uk, TariffType type, BigDecimal price, String description, String description_uk){
			this.title = title;
			this.title_uk = title_uk;
			this.type = type;
			this.price = price;
			this.description = description;
			this.description_uk = description_uk;
		}
		
		public Tariff(long id, String title, String title_uk, TariffType type, BigDecimal price, String description, String description_uk){
			this.id = id;
			this.title = title;
			this.title_uk = title_uk;
			this.type = type;
			this.price = price;
			this.description = description;
			this.description_uk = description_uk;
		}

		public long getId() {
			return id;
		}

		public void setId(long id) {
			this.id = id;
		}

		public String getTitle() {
			return title;
		}

		public void setTitle(String title) {
			this.title = title;
		}

		public String getTitle_uk() {
			return title_uk;
		}

		public void setTitle_uk(String title_uk) {
			this.title_uk = title_uk;
		}

		public TariffType getType() {
			return type;
		}

		public void setType(TariffType type) {
			this.type = type;
		}

		public BigDecimal getPrice() {
			return price;
		}

		public void setPrice(BigDecimal price) {
			this.price = price;
		}

		public String getDescription() {
			return description;
		}

		public void setDescription(String description) {
			this.description = description;
		}

		public String getDescription_uk() {
			return description_uk;
		}

		public void setDescription_uk(String description_uk) {
			this.description_uk = description_uk;
		}
		
		
}