/*
    32. Write a Java program to create a class called Student with private instance variables student_id, student_name, and grades. Provide public getter and setter methods to access and modify the student_id and student_name variables. However, provide a method called addGrade() that allows adding a grade to the grades variable while performing additional validation. 
*/
class Test
{
    public static void main(String args[])
    {
        Student student = new Student();

        student.addGrade(12);
        student.addGrade(12); 
        student.addGrade(12);

        student.setStudentId("7027/21");
        student.setStudentName("Mayank");

        System.out.println(student.getStudentId());
        System.out.println(student.getStudentName());
        
        student.displayGrade();
    }
}
class Student
{
    private String student_id;
    private String student_name;
    private int index, mark[] = new int[3];

    public void setStudentId(String id)
    {
        student_id = id;
    }
    public void setStudentName(String name)
    {
        student_name = name;
    }
    public void addGrade(int m)
    {
        if (index < mark.length)
        {
            mark[index++] = m;
        }
        else
        {
            System.out.println("index out of bounds");
        }
    }
    public String getStudentId()
    {
        return student_id;
    }
    public String getStudentName()
    {
        return student_name;
    }
    public void displayGrade()
    {
        for (int n : mark)
            System.out.println(n);
    }
}