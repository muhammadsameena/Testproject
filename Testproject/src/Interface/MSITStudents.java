
package Interface;


interface MSITStudent{
	double getGPA();
	
}
interface MSITMentor{
	double getSalary();
}
class TA implements MSITStudent,MSITMentor{
	String name,course;
	double gpa,salary;
	TA(String name,String course,double gpa,double salary){
		this.name=name;
		this.course=course;
		this.gpa=gpa;
		this.salary=salary;
	}
	public double getGPA() {
		return gpa;
	}
	public double getSalary() {
		return salary;
	}
}
public class MSITStudents{
	public static void main(String[] args) {
	TA ob= new TA("sameena","MSIT",90,70000);
	System.out.println(ob.getGPA());
	System.out.println(ob.getSalary());
}
}
	