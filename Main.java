import java.util.*;

class patient
{
    String pa_id, name_p , disease ,  gender, admit_status;
    int age_p;
    void new_patient()
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Patient id:-");
        pa_id = input.nextLine();
        System.out.print("Patient Name:-");
        name_p = input.nextLine();
        System.out.print("Patient's Age:-");
        age_p = input.nextInt();
        System.out.print("Disease Caused:-");
        disease = input.nextLine();
        System.out.print("Sex:-");
        gender = input.nextLine();
        System.out.print("Admission Status:-");
        admit_status = input.nextLine();
    }
    void patient_info()
    {
        System.out.println(pa_id + "\t\t" + name_p + " \t\t" + disease + "    ]\t\t" + gender + "     \t\t" + admit_status + "\t\t" + age_p);
    }
}
class doctor
{
    String id_d, name_doc, specialist, appoint_time, doc_qual;
    int droom;
    void new_doctor()
    {
        Scanner input = new Scanner(System.in);
        System.out.print("id:-");
        id_d = input.nextLine();
        System.out.print("name:-");
        name_doc = input.nextLine();
        System.out.print("specilization:-");
        specialist = input.nextLine();
        System.out.print("work time:-");
        appoint_time = input.nextLine();
        System.out.print("qualification:-");
        doc_qual = input.nextLine();
        System.out.print("room no.:-");
        droom = input.nextInt();
    }
    void doctor_info()
    {
        System.out.println(id_d + "\t" + name_doc + "  \t" + specialist + "     \t" + appoint_time + "    \t" + doc_qual + "       \t" + droom);
    }
}
class staff
{
    String id_s, name_s, designation, sex;
    int salary;
    void new_staff()
    {
        Scanner input = new Scanner(System.in);
        System.out.print("id:-");
        id_s = input.nextLine();
        System.out.print("name:-");
        name_s = input.nextLine();
        System.out.print("desigination:-");
        designation = input.nextLine();
        System.out.print("sex:-");
        sex = input.nextLine();
        System.out.print("salary:-");
        salary = input.nextInt();
    }
    void staff_info()
    {
        System.out.println(id_s + "\t" + name_s + "\t" + sex + "\t" + salary);
    }
}

public class Main 
{
    public static void main(String args[])
    {
        int count1 = 0, count2 = 0, count3 = 0, count4 = 0, count5 = 0, count6 = 0;
        System.out.println("\n_________________________________________________________________________________________________________________________________________________________");
        System.out.println(" \n                                   \t\t\t\t\t  SemIII Java Mini Project                                        ");
        System.out.println("___________________________________________________________________________________________________________________________________________________________");

        patient[] p = new patient[100];
        for (int i = 0; i < 100; i++)
            p[i] = new patient();

        Scanner input = new Scanner(System.in);
        int choice, j, c1, status = 1, s1 = 1, s2 = 1, s3 = 1, s4 = 1, s5 = 1, s6 = 1;
        while (status == 1)
        {
            System.out.println("\n                                    MAIN MENU");
            System.out.println("_______________________________________________________________________________________________");
            System.out.println("\n1.Doctos  2. Patients  3.Medicines  4.Laboratories  5. Facilities  6. Staff ");
            System.out.println("_______________________________________________________________________________________________");
            choice = input.nextInt();
            switch (choice)
            {
                case 1:
                {
                    System.out.println("_______________________________________________________________________________________");
                    System.out.println("        \n             **PATIENT SECTION**");
                    System.out.println("_______________________________________________________________________________________");
                    s2 = 1;
                    while (s2 == 1)
                    {
                        System.out.println("1. Add New Patient Entries\n2.Check Existing Patient List");
                        c1 = input.nextInt();
                        switch (c1)
                        {
                            case 1:
                                {
                                    p[count2].new_patient();count2++;
                                    break;
                                }
                            case 2:
                                {
                                    System.out.println("_______________________________________________________________________________________");
                                    System.out.println("\n id \t Name \t Disease \t Gender \t Admit Status \t Age");
                                    System.out.println("_______________________________________________________________________________________");
                                    for (j = 0; j < count2; j++) {
                                        p[j].patient_info();
                                    }
                                    break;
                                }
                        }
                        System.out.println("\nReturn to Back Press 1 and for Main Menu Press 0");
                        s2 = input.nextInt();
                    }
                    break;
                }
            }
        }
    }
}