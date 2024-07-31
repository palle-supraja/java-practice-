package javaPractiece;

interface Person
{
	void Speak();
}

class Teacher implements Person
{
	public void Speak()
	{
		System.out.println("Speak method From Teacher Class");
	}
}

class Student implements Person 
{
	public void Speak()
	{
		System.out.println("Speak method From Student Class");
	}

	public static void main(String[] args) {
	Teacher t = new Teacher();
	t.Speak();
	Student s= new Student();
	s.Speak();
			
	}
}
