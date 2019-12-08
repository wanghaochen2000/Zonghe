package Dota;

public class Course {
		private  String StuNum; 
		private  String clasName; 
		private  String didian; 
		private  String shijian; 
		private  String xuefen;
		private  String laoshi;
		private boolean fla;
		private Student[] students;
		public int length;
		public Course(String StuNum, String clasName, String didian, String shijian,String xuefen,String laoshi){//构造函数
		this.StuNum = StuNum; 
		this.fla=true;
		this.clasName = clasName; 
		this.didian = didian; 
		this.shijian = shijian; 
		 students = new Student[30];
		this.laoshi=laoshi;
		this.xuefen=xuefen;
		} 
		public String toString() {
			return StuNum+clasName+didian+shijian+xuefen+laoshi+fla;
		}
		public boolean addStudent(Student stu){
	        boolean flag = false;//标志值：是否加入成功
	        //如果学生没有选过这门课，同时课的学生还没满则执行
	        if(!isSelectedStudent(stu)&&isNullStudent(stu)){
	            for(int i=0;i<students.length;i++){
	                if(students[i]==null){
	                    students[i]=stu;
	                    flag=true;
	                    fla=false;
	                    break;
	                }
	            }
	        }
	        return flag;
	    }
	    //课移除学生
	    public boolean removeStudent(Student stu){
	        boolean flag=false;
	        if(isSelectedStudent(stu)){//选过这门课
	            for(int i=0;i<students.length;i++){
	                if(students[i]==stu){
	                    students[i]=null;
	                    flag=false;
	                    fla=true;
	                    break;
	                }
	            }
	        }
	        return flag;
	    }
	    //显示选择课程的学生：
	    public void displayStudent(){
	        System.out.println("选择的课程："+this.clasName+"的学生有:");
	        for(Student s:students){
	            if(s!=null){
	                System.out.print(s.getName()+" ");
	            }
	        }
	        System.out.println();
	    }
	    //子方法1：学生是否选过这门课
	    public boolean isSelectedStudent(Student stu){
	        boolean flag=false;
	        for(Student s:students){//只能用于检查，不能修改
	            if(s==stu){
	                flag=true;
	                break;
	            }
	        }
	        return flag;
	    }
	    public boolean isNullStudent(Student stu){
	        boolean flag=false;
	        for(Student s:students){
	            if(s==null){//还有空位
	                flag=true;
	                break;
	            }
	        }
	        return flag;
	    }

	    public static void main(String[] args) {
	        // TODO Auto-generated method stub

	    }
		public void setStuNum(String StuNum){
	        this.StuNum= StuNum;
	    }
		public void setclasName(String clasName){
	        this.clasName=clasName;
	    }
		public void setdidian(String didian){
	        this.didian= didian;
	    }
		public void shijian(String shijian){
	        this. shijian=shijian;
	    }
		public void setxuefen(String xuefen){
	        this. xuefen= xuefen;
	    }
		public void setlaoshi(String laoshi){
	        this. laoshi= laoshi;
	    }
		public  String getStuNum() { 
		return StuNum; 
		} 
		public  String getclasName() {
		return clasName; 
		}
		public  String getdidian() {
		return didian; 
		} 
		public String getshijian() { 
		return shijian; 
		} 
		public  String getxuefen() { 
		return xuefen; 
		} 
		public  String getlaoshi() { 
			return laoshi; 
		}
}