package com.finaltask.internet_provider_spring.domain;

import java.math.BigDecimal;
import java.util.Collection;
import java.util.Collections;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

@Entity
public class User implements UserDetails {
	 @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private long id;

	    private String login;
	    private String password;

	    @Enumerated(EnumType.STRING)
	    private UserRole role;

	    @Enumerated(EnumType.STRING)
	    private UserStatus status;
	    
	    private BigDecimal funds;

	    
	    public User() {
	    	
	    }
	    
	    public User(String login, String password) {
	    	this.login = login;
	    	this.password = password;
	    	role = UserRole.USER;
	    	status = UserStatus.BLOCKED;
	    	funds = new BigDecimal(0);
	    };
	    
	    public User(long id, String login, String password, BigDecimal funds, UserRole role) {
	    	this.id = id;
	    	this.login = login;
	    	this.password = password;
	    	this.funds = funds;
	    	this.role = role;
	    }
	    
	    public User(long id, String login, String password, BigDecimal funds, UserRole role, UserStatus status) {
	    	this.id = id;
	    	this.login = login;
	    	this.password = password;
	    	this.funds = funds;
	    	this.role = role;
	    }
	    
		public long getId() {
			return id;
		}

		public void setId(long id) {
			this.id = id;
		}

		public String getLogin() {
			return login;
		}

		public void setLogin(String login) {
			this.login = login;
		}

		public String getPassword() {
			return password;
		}

		public void setPassword(String password) {
			this.password = password;
		}

		public UserRole getRole() {
			return role;
		}

		public void setRole(UserRole role) {
			this.role = role;
		}

		public UserStatus getStatus() {
			return status;
		}

		public void setStatus(UserStatus status) {
			this.status = status;
		}

		public BigDecimal getFunds() {
			return funds;
		}

		public void setFunds(BigDecimal funds) {
			this.funds = funds;
		}

		@Override
		public Collection<? extends GrantedAuthority> getAuthorities() {
	        return Collections.singleton(role);
		}

		@Override
		public String getUsername() {
			return getLogin();
		}

		@Override
		public boolean isAccountNonExpired() {
			return true;
		}

		@Override
		public boolean isAccountNonLocked() {
			return true;
		}

		@Override
		public boolean isCredentialsNonExpired() {
			return true;
		}

		@Override
		public boolean isEnabled() {
			return true;
		}

	    
	    
}
