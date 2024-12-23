		class student{
			int id;
			String name;
			int rollno;
			String branch;
			String section ;
			public student(int id, String name, int rollno, String branch, String section) {
				super();
				this.id = id;
				this.name = name;
				this.rollno = rollno;
				this.branch =  branch;
				this.section = section;
			}
			public String toString() {
				return "student [id=" + id + ", name=" + name + ", rollno=" + rollno + ", branch=" + branch + ", section=" + section
						+ "]";
			}
		}
		public class Test {
			public static void main(String[] args) {	
				student s1 = new student(100,"Divyatej",22062004,"AI&DS","A");
				System.out.println(s1);
		}
	}


