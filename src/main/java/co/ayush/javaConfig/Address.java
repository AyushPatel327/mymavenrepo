package co.ayush.javaConfig;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("address")
public class Address {
		
		private String city;
		private String state;
		private String country;
		
		public Address() {
			
		}
		
		public Address(String city, String state, String country) {
			super();
			this.city = city;
			this.state = state;
			this.country = country;
		}

		public String toString() {
			return city + " " + state + " " + country;
		}
		
}
