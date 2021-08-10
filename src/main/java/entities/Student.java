package entities;


public class Student {
	String stuid;
	String username;
	String sex;
	String college;
	public String getStuid() {
		return stuid;
	}
	public void setStuid(String stuid) {
		this.stuid = stuid;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public String getCollege() {
		return college;
	}
	public void setCollege(String college) {
		this.college = college;
	}
	
	@Override
	public String toString() {
		return "Student [stuid=" + stuid + ", username=" + username + ", sex=" + sex + ", college=" + college + "]";
	}
	public Student selectById(String userid)
	{
		Student stu = new Student();
		stu.stuid=userid;
		stu.username="小刘";
		stu.sex="男";
		stu.college="山东农业大学";
		return stu;
	}
	
}
