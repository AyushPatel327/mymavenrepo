package co.ayush.javaConfig;
import org.springframework.context.annotation.ComponentScan;


@ComponentScan (basePackages ="co.ayush.javaConfig")
public class Student {
	
		private int stid;
		private String stname;
		
		public Student() {

		}
		public Student(int stid, String stname) {
			super();
			this.stid = stid;
			this.stname = stname;
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

		
		public String toString() {
			return stid + " " + stname ;
		}
		
		
}
