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