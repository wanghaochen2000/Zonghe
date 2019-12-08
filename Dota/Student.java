package Dota;
public class Student { 
private String StuNum; 
protected String Name; 
private String Sex; 
private String Age; 
public Student(String StuNum, String Name, String Sex, String Age){
this.StuNum = StuNum; 
this.Name = Name; 
this.Sex = Sex; 
this.Age = Age; 
} 
public void setStuNum(String StuNum){
    this.StuNum= StuNum;
}
public void setName(String Name){
    this.Name=Name;
}
public void setSex(String Sex){
    this.Sex= Sex;
}
public void setAge(String Age){
    this.Age=Age;
}
public String getStuNum() { 
return StuNum; 
} 
public String getName() {
return Name; 
}
public String getSex() {
return Sex; 
} 
public String getAge() { 
return Age; 
}

public String printInfo()
{
 String s="student info:"+"\nѧ��"+StuNum+"\n����"+Name+"\n�Ա�"+Sex+"\n����"+Age;
 System.out.println(s);
 return s;
}

}
class teacher extends Student{
 private String Teach;

 public teacher(String StuNum, String Name, String Sex, String Age,String Teach) {
  super(StuNum, Name, Sex, Age);
  this.Teach=Teach;
 }
 public String getTeach() {
  return Teach;
 }
 public void setTeach(String Teach){
	    this.Teach=Teach;
	}
}
class students extends Student{
 private static final String Courses = null;
//private String clas;
 private Course[] courses;

 public students(String StuNum, String Name, String Sex, String Age) {
	  super(StuNum, Name, Sex, Age);
	 // this.clas=clas;
	  courses = new Course[3];
	  // TODO Auto-generated constructor stub
	 }

   

	 //public String getclas() {
	  //return clas;
//}
 public void displayCourse(){
     System.out.println("ѧ��"+this.Name+"��ѡ�γ��У�");
     for(Course c:courses){
         if(c!=null){
             System.out.print(c.getclasName()+" ");
         }
     }
     System.out.println();
 }

	 public boolean addCourse(Course course){
	        boolean flag=false;
	        if(!isSelectedCourse(course)){
	            for(int i=0;i<this.courses.length;i++){
	                if(courses[i]==null){
	                    courses[i]=course;
	                    course.addStudent(this);//�γ�ҲҪ���ѧ��
	                    flag=true;
	                    break;
	                }
	            }
	        }
	        return flag;
	    }
	    //ѧ���Ƴ��γ�
	    public boolean removeCourse(Course course){
	        boolean flag=false;
	        if(isSelectedCourse(course)){
	            for(int i=0;i<this.courses.length;i++){
	                if(courses[i]==course){
	                    courses[i]=null;
	                    course.removeStudent(this);//�ڿγ����Ƴ�ѧ��
	                    flag=true;
	                    break;
	                }
	            }

	        }
	        return flag;
	    }
	    //��ʾѧ����ѡ�Ŀγ�


	    //�ӷ���1�����Ƿ�ѡ��
	    public boolean isSelectedCourse(Course course){
	        boolean flag=false;
	        for(Course c:courses){
	            if(c==course){
	                flag=true;
	                break;
	            }
	        }
	        return flag;
	    }

	// public void setclas(String clas){
		//    this.clas=clas;
		//}
}
