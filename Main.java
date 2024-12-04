package Hospital;

import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("HOSPITAL: ");
        String hos=sc.nextLine();
        Hospital h=new Hospital(hos);
        int ch;
        while (true) {
            System.out.println("-----MENU-----");
            System.out.println("1. Add Patients: ");
            System.out.println("2. Assign Doctor to patient: ");
            System.out.println("3. Display All the Patients: ");
            System.out.println("4. Search for Patients Data: ");
            System.out.println("5. Total Number of Patients: ");
            System.out.println("6. Remove Doctor from Patient: ");
            System.out.println("7. Remove Patient: ");
            System.out.println("8. Exit: ");
            System.out.println("Enter your choice: ");
            ch=sc.nextInt();
            if (ch==1){
                System.out.println("Enter the number of patients");
                System.out.println("----------------------------");
                int n=sc.nextInt();
                sc.nextLine();
                System.out.println("");
                for(int i=1;i<=n;i++){
                    System.out.println("Enter Patient Data: ");
                    System.out.println("Enter the patient id :");
                    int id=sc.nextInt();
                    sc.nextLine();
                    System.out.println("Enter the patient name: ");
                    String name=sc.nextLine();
                    System.out.println("Enter the patient age: ");
                    int age=sc.nextInt();
                    System.out.println("----------------------------");
                    h.addPatient(id, name, age);
                }
            }
            else if (ch==2){
                System.out.println("Assigning Doctor to patient: ");
                System.out.println("----------------------------");
                System.out.println("Enter the patient id: ");
                int pid=sc.nextInt();
                sc.nextLine();
                System.out.println("Enter the Doctor name: ");
                String doc=sc.nextLine();
                h.addDoctor(pid, doc);
                System.out.println("Doctor has been assigned to patient");
                System.out.println("----------------------------");
            }
            else if (ch==3){
                System.out.println("Displaying all the patients: ");
                System.out.println("----------------------------");
                h.displayAllPatients();
            }
            else if (ch==4){
                System.out.println("Searching for Patients Data: ");
                System.out.println("----------------------------");
                System.out.println("Enter the patient id: ");
                int pid=sc.nextInt();
                int pos=h.search(pid);
                if(pos!=-1){
                    h.displayPatient(h.patients[pos]);
                }else{
                    System.out.println("Patient not found");
                }
            }
            else if (ch==5) {
                System.out.println("Total Number of Patients: ");
                System.out.println("----------------------------");
                System.out.println(Patient.getCount());
            }
            else if (ch==6){
                System.out.println("Removing Doctor from Patient: ");
                System.out.println("----------------------------");
                System.out.println("Enter the patient id: ");
                int pid=sc.nextInt();
                sc.nextLine();
                h.removeDoctor(pid);
            }
            else if (ch==7){
                System.out.println("Removing Patient: ");
                System.out.println("----------------------------");
                System.out.println("Enter the patient id: ");
                int pid=sc.nextInt();
                sc.nextLine();
                h.removePatient(pid);
            }
            else if (ch==8){
                System.out.println("Exiting the program... ");
                break;
            }
            else {
                System.out.println("Enter a valid choice: ");
            }
        }
        sc.close();
    }
}