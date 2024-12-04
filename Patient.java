package Hospital;
public class Patient{
    private int id, age;
    private String name, doctorName;
    private String[] prescriptions=new String[10];
    static int count=0;

    public Patient(int id, String name,int age){
        this.id=id;
        this.setName(name);
        this.setAge(age);

        Patient.count++;

    }

    public int getId(){
        return this.id;
    }

    public void setId(int id){
        this.id=id;
    }

    public int getAge(){
        return age;
    } 

    public void setAge(int age){
        this.age=age;
    }

    public String getName(){
        return this.name;
    }

    public void setName(String name){
        this.name=name;
    }

    public String getDoctorName(){
        return doctorName;
    }

    public void setDoctorName(String doctorName){
        this.doctorName=doctorName;
    }

    public String[] getPrescriptions(){
        return prescriptions;
    }

    public void setPrescriptions(String[] prescriptions){
        this.prescriptions=prescriptions;
    }

    public static int getCount(){
        return count;
    }
}