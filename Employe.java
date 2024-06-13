public class Employe{
    private int eid;
    private String ename;
    public void setEnumber(int enumber){
        this.eid=enumber;
    }
    public int getEnumber(){
        return this.eid;
    }
    public void setEname(String EmpName){
        this.ename=EmpName;

    }
    public String getEname(){
        return this.ename;
    }
}
class A{
    public static void main(String[] args){
        Employe e1=new Employe();
        e1.setEnumber(101);
        e1.setEname("Rahul");
        System.out.println(e1.getEnumber());
        System.out.println(e1.getEname());

    }

}
class B{
    public static void main(String[] args){
        Employe e2=new Employe();
        e2.setEnumber(102);
        e2.setEname("priyanka");
        System.out.println(e2.getEnumber());
        System.out.println(e2.getEname()); 
    }
}


