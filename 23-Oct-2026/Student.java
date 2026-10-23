package Oct23;

public class Student {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StudentDetails sd = new StudentDetails();

        sd.setStudentId(101);
        sd.setStudentName("Samrabinson P");
        sd.setMarks(85);

        System.out.println("Student ID: " + sd.getStudentId());
        System.out.println("Student Name: " + sd.getStudentName());
        System.out.println("Marks: " + sd.getMarks());

        //sd.setMarks(120);

	}

}
class StudentDetails{
	private int studentId;
	private String studentName;
	private int marks;
	
	public void setStudentId(int studentId){
		this.studentId =studentId;
	}
	public void setStudentName(String studentName){
		this.studentName=studentName;
	}
	public void setMarks(int marks){
		if(marks>=0 && marks<=100){
			this.marks=marks;
		}else{
			System.out.println("Invalid marks! Enter marks between 0 and 100.");
		}
	}
	public int getStudentId(){
		return studentId;
	}
	public String getStudentName(){
		return studentName;
	}
	public int getMarks(){
		return marks;
	}
}