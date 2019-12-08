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
 String s="student info:"+"\n学号"+StuNum+"\n名字"+Name+"\n性别"+Sex+"\n年龄"+Age;
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
     System.out.println("学生"+this.Name+"所选课程有：");
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
	                    course.addStudent(this);//课程也要添加学生
	                    flag=true;
	                    break;
	                }
	            }
	        }
	        return flag;
	    }
	    //学生移除课程
	    public boolean removeCourse(Course course){
	        boolean flag=false;
	        if(isSelectedCourse(course)){
	            for(int i=0;i<this.courses.length;i++){
	                if(courses[i]==course){
	                    courses[i]=null;
	                    course.removeStudent(this);//在课程中移除学生
	                    flag=true;
	                    break;
	                }
	            }

	        }
	        return flag;
	    }
	    //显示学生所选的课程


	    //子方法1：课是否被选过
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
