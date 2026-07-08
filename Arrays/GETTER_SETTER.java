class GETTER_SETTER
{
    // PRIVATE VARIABLES
    private int studentid;
    private String studentname;

    // SETTERS
    public void setStudentid(int id)
    {
        studentid = id;
    }

    public void setStudentname(String sname)
    {
        studentname = sname;
    }

    // GETTERS
    public int getStudentid()
    {
        return studentid;
    }

    public String getStudentname()
    {
        return studentname;
    }

    public static void main(String args[])
    {
        GETTER_SETTER S = new GETTER_SETTER();

        S.setStudentid(33);
        S.setStudentname("JAY");

        System.out.println(S.getStudentid());
        System.out.println(S.getStudentname());
    }
}
