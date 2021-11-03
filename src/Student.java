public class Student extends Person {
    // private instance members
    private String m_studentID;

    // public properties
    public String getStudentID()
    {
        return m_studentID;
    }

    public void setStudentID(String m_studentID)
    {
        this.m_studentID = m_studentID;
    }

    public void Set(String name, int age, String studentID)
    {
        Set(name, age);
        setStudentID(studentID);
    }

    // Constructors
    Student()
    {
        super(); // calls the super constructor
        setStudentID("000000000");
    }

    Student(String name, int age, String studentID)
    {
        super(name, age);
        setStudentID("000000000");
    }

    // methods
    public void Studies()
    {
        System.out.println(getName() + " is Studying");
    }

    @Override
    public String toString()
    {
        String outputString = super.toString();
        outputString += "StudentID: " + getStudentID() + "\n";
        return outputString;
    }
}
