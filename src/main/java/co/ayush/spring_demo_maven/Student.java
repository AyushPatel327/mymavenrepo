package co.ayush.spring_demo_maven;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("student")
public class Student {
		private int stid;
		private String stname;
		
		@Autowired
		private Address address;
		
		public Student() {
		
		}
		
		public Student(int stid, String stname, Address address) {
			super();
			this.stid = stid;
			this.stname = stname;
			this.address = address;
		}
		
		

		public int getStid() {
			return stid;
		}

		public void setStid(int stid) {
			this.stid = stid;
		}

		public String getStname() {
			return stname;
		}

		public void setStname(String stname) {
			this.stname = stname;
		}

		public Address getAddress() {
			return address;
		}

		public void setAddress(Address address) {
			this.address = address;
		}

		public String toString() {
			return stid + " " + stname + " " + address;
		}
		
		
}
