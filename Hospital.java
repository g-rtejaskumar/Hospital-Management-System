package Hospital;
public class Hospital{
    private String name;
    private static final int MAX=50;
    Patient[] patients = new Patient[MAX];

    public Hospital(String name) {
        this.name=name;
    }        
    public void addPatient(int id, String name, int age) {
        int currCount=Patient.getCount();
        patients[currCount] = new Patient(id, name, age);
    }

    public void displayAllPatients() {
        for (int i=0;i<Patient.getCount();i++){
            System.out.println("Patient id :"+this.patients[i].getId());
            System.out.println("Name: "+this.patients[i].getName());
            System.out.println("Age: "+this.patients[i].getAge());
            System.out.println("Doctor Name: "+this.patients[i].getDoctorName());
            System.out.println();
        }
    }

    public void displayPatient(Patient patient) {
        System.out.println("Patient id: " + patient.getId());
        System.out.println("Name: " + patient.getName());
        System.out.println("Age: " + patient.getAge());
        System.out.println("Doctor Name: " + patient.getDoctorName());
        System.out.println();
    }

    public void addDoctor(int pid, String name) {
        int pos=this.search(pid);
        if (pos != -1) {
            this.patients[pos].setDoctorName(name);
        }
        else{
            System.out.println("Cannot set Doctor Name");
        }
    }

    public int search(int pid) {
        for (int i=0;i<Patient.getCount();i++){
            if (this.patients[i].getId()==pid){
                return i;
            }
        }
        return -1;
    }

    public void removeDoctor(int pid) {
        int pos = this.search(pid);
        if (pos != -1) {
            this.patients[pos].setDoctorName(null);
            System.out.println("Doctor Name removed");
        }
        else{
            System.out.println("Cannot remove Doctor Name");
        }
    }

    public void removePatient(int pid) {
        int pos = this.search(pid);
        if (pos != -1) {
            for (int i=pos;i<Patient.getCount()-1;i++){
                this.patients[i]=this.patients[i+1];
            }
            Patient.count--;
            System.out.println("Patient removed");
        }
        else{
            System.out.println("Cannot remove Patient");
        }
    }
}