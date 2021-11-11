import java.util.*;

class patient {
    String pa_id, name_p, disease, gender, admit_status;
    int age_p;

    void new_patient() {
        Scanner input = new Scanner(System.in);
        System.out.print("Patient Id:-");
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

    void patient_info() {
        System.out.println(pa_id + "\t\t" + name_p + " \t\t" + disease + "    ]\t\t" + gender + "     \t\t"
                + admit_status + "\t\t" + age_p);
    }
}

class doctor {
    String id_d, name_doc, specialist, appoint_time, doc_qual;
    int droom;

    void new_doctor() {
        Scanner input = new Scanner(System.in);
        System.out.print("Id:-");
        id_d = input.nextLine();
        System.out.print("Name:-");
        name_doc = input.nextLine();
        System.out.print("Specilization:-");
        specialist = input.nextLine();
        System.out.print("Work Time:-");
        appoint_time = input.nextLine();
        System.out.print("Qualification:-");
        doc_qual = input.nextLine();
        System.out.print("Room No.:-");
        droom = input.nextInt();
    }

    void doctor_info() {
        System.out.println(id_d + "\t" + name_doc + "  \t" + specialist + "     \t" + appoint_time + "    \t" + doc_qual
                + "       \t" + droom);
    }
}

class staff {
    String id_s, name_s, gender_s, department, time_s;
    int salary;

    void new_staff() {
        Scanner input = new Scanner(System.in);
        System.out.print("id:-");
        id_s = input.nextLine();
        System.out.print("name:-");
        name_s = input.nextLine();
        System.out.print("Gender:-");
        gender_s = input.nextLine();
        System.out.print("Department: ");
        department = input.nextLine();
        System.out.print("salary:-");
        salary = input.nextInt();
        System.out.print("Timing: ");
        time_s = input.nextLine();
    }

    void staff_info() {
        System.out.println(id_s + "\t" + name_s + "\t" + gender_s + "\t" + department + "\t" + salary + "\t" + time_s);
    }
}

class medical {
    String med_name, med_comp, exp_date;
    int med_cost, count;

    void new_medi() {
        Scanner input = new Scanner(System.in);
        System.out.print("Name:-");
        med_name = input.nextLine();
        System.out.print("Company:-");
        med_comp = input.nextLine();
        System.out.print("Expiry Date:-");
        exp_date = input.nextLine();
        System.out.print("Cost:-");
        med_cost = input.nextInt();
        System.out.print("No of Units:-");
        count = input.nextInt();
    }

    void find_medi() {
        System.out.println(med_name + "  \t" + med_comp + "    \t" + exp_date + "     \t" + med_cost);
    }
}

class facility {
    String fac_name;

    void add_faci() {
        Scanner input = new Scanner(System.in);
        System.out.print("facility:-");
        fac_name = input.nextLine();
    }

    void show_faci() {
        System.out.println(fac_name);
    }
}

public class Main {
    public static void main(String args[]) {
        int count1 = 0, count2 = 0, count3 = 0, count4 = 0, count5 = 0, count6 = 0;
        System.out.println(
                "\n_________________________________________________________________________________________________________________________________________________________");
        System.out.println(
                " \n                                   \t\t\t\t\t  SemIII Java Mini Project                                        ");
        System.out.println(
                "___________________________________________________________________________________________________________________________________________________________");

        patient[] p = new patient[100];
        for (int i = 0; i < 100; i++)
            p[i] = new patient();
        doctor[] d = new doctor[25];
        for (int i = 0; i < 25; i++)
            d[i] = new doctor();
        staff[] s = new staff[100];
        for (int i = 0; i < 100; i++)
            s[i] = new staff();
        medical[] m = new medical[100];
        for (int i = 0; i < 100; i++)
            m[i] = new medical();
        facility[] f = new facility[20];
        for (int i = 0; i < 20; i++) {
            f[i] = new facility();
        }

        d[0].id_d = "21";
        d[0].name_doc = "Dr.Ghanendra";
        d[0].specialist = "ENT";
        d[0].appoint_time = "5-11AM";
        d[0].doc_qual = "MBBS,MD";
        d[0].droom = 17;
        d[1].id_d = "32";
        d[1].name_doc = "Dr.Vikram";
        d[1].specialist = "Physician";
        d[1].appoint_time = "10-3AM";
        d[1].doc_qual = "MBBS,MD";
        d[1].droom = 45;
        d[2].id_d = "17";
        d[2].name_doc = "Dr.Rekha";
        d[2].specialist = "Surgeon";
        d[2].appoint_time = "8-2AM";
        d[2].doc_qual = "BDM";
        d[2].droom = 8;
        d[3].id_d = "33";
        d[3].name_doc = "Dr.Pramod";
        d[3].specialist = "Artho";
        d[3].appoint_time = "10-4PM";
        d[3].doc_qual = "MBBS,MS";
        d[3].droom = 40;

        m[0].med_name = "Corex";
        m[0].med_comp = "Cino pvt";
        m[0].exp_date = "9-5-16";
        m[0].med_cost = 55;
        m[0].count = 8;
        m[1].med_name = "Nytra";
        m[1].med_comp = "Ace pvt";
        m[1].exp_date = "4-4-15";
        m[1].med_cost = 500;
        m[1].count = 5;
        m[2].med_name = "Brufa";
        m[2].med_comp = "Reckitt";
        m[2].exp_date = "12-7-17";
        m[2].med_cost = 50;
        m[2].count = 56;
        m[3].med_name = "Pride";
        m[3].med_comp = "DDF pvt";
        m[3].exp_date = "12-4-12";
        m[3].med_cost = 1100;
        m[3].count = 100;

        Scanner input = new Scanner(System.in);
        int choice, j, c1, status = 1, s1 = 1, s2 = 1, s3 = 1, s4 = 1, s5 = 1, s6 = 1;
        while (status == 1) {
            System.out.println(
                    "\n                                                     MAIN MENU                                                                          ");
            System.out.println(
                    "_________________________________________________________________________________________________________________________________________");
            System.out.println("\n1.Patient   2.Doctor   3.Staff   4.Medical   5.Lab   6.Facilities ");
            System.out.println(
                    "_________________________________________________________________________________________________________________________________________");
            choice = input.nextInt();
            switch (choice) {
            case 1: {
                System.out.println(
                        "_____________________________________________________________________________________________________________________________________");
                System.out.println("        \n             **PATIENT SECTION**");
                System.out.println(
                        "_____________________________________________________________________________________________________________________________________");
                s1 = 1;
                while (s1 == 1) {
                    System.out.println("1. Add New Patient Entries\n2.Check Existing Patient List");
                    c1 = input.nextInt();
                    switch (c1) {
                    case 1: {
                        p[count1].new_patient();
                        count1++;
                        break;
                    }
                    case 2: {
                        System.out.println(
                                "_______________________________________________________________________________________");
                        System.out.println("\n Id \t Name \t Disease \t Gender \t Admit Status \t Age");
                        System.out.println(
                                "_______________________________________________________________________________________");
                        for (j = 0; j < count1; j++) {
                            p[j].patient_info();
                        }
                        break;
                    }
                    }
                    System.out.println("\nReturn to Back Press 1 and for Main Menu Press 0");
                    s1 = input.nextInt();
                }
                break;
            }

            case 2: {
                System.out.println(
                        "_______________________________________________________________________________________");
                System.out.println("        \n             **Doctor SECTION**");
                System.out.println(
                        "_______________________________________________________________________________________");
                s2 = 1;
                while (s2 == 1) {
                    System.out.println("1.Add New Entry\n2.Existing Doctors List");
                    c1 = input.nextInt();
                    switch (c1) {
                    case 1: {
                        d[count2].new_doctor();
                        count2++;
                        break;
                    }
                    case 2: {
                        System.out.println(
                                "_______________________________________________________________________________________________");
                        System.out.println("\nId \t Name\t\t Specilist \t Timing \t Qualification \t Room No.");
                        System.out.println(
                                "_______________________________________________________________________________________________");
                        for (j = 0; j < count2; j++) {
                            d[j].doctor_info();
                        }
                        break;
                    }
                    }
                    System.out.println("\nReturn to Back Press 1 and for Main Menu Press 0");
                    s2 = input.nextInt();
                }
                break;

            }

            case 3: {

                System.out.println(
                        "_________________________________________________________________________________________________________________________________");
                System.out.println("              \n       **STAFF SECTION**");
                System.out.println(
                        "_________________________________________________________________________________________________________________________________");

                s3 = 1;
                while (s3 == 1) {
                    System.out.println("1.Add New Entry\n2.Check Existing entries of the Staff");
                    c1 = input.nextInt();
                    switch (c1) {
                    case 1: {
                        s[count3].new_staff();
                        count3++;
                        break;
                    }
                    case 2: {
                        System.out.println(
                                "_______________________________________________________________________________________________");
                        System.out.println("\nId \t Name \t\t\t Gender \t\t Department \t Salary \t Duty Timing");
                        System.out.println(
                                "_______________________________________________________________________________________________");
                        for (j = 0; j < count3; j++) {
                            s[j].staff_info();
                        }
                        break;
                    }
                    }
                    System.out.println("\nReturn to Back Press 1 and for Main Menu Press 0");
                    s3 = input.nextInt();
                }
                break;
            }

            case 4: {
                System.out.println(
                        "_________________________________________________________________________________________________________________________________");
                System.out.println("              \n       **MEDICINE SECTION**");
                System.out.println(
                        "_________________________________________________________________________________________________________________________________");

                s4 = 1;
                while (s4 == 1) {
                    System.out.println("1.Add New Entry\n2. Existing Medicines List");
                    c1 = input.nextInt();
                    switch (c1) {
                    case 1: {
                        m[count3].new_medi();
                        count3++;
                        break;
                    }
                    case 2: {
                        System.out.println(
                                "_________________________________________________________________________________________________________________________________");
                        System.out.println("Name \t Company \t Expiry Date \t Cost");
                        System.out.println(
                                "_________________________________________________________________________________________________________________________________");
                        for (j = 0; j < count3; j++) {
                            m[j].find_medi();
                        }
                        break;
                    }
                    }
                    System.out.println("\nReturn to Back Press 1 and for Main Menu Press 0");
                    s3 = input.nextInt();
                }
                break;
            }

            case 6: {
                s6 = 1;
                System.out.println(
                        "_________________________________________________________________________________________________________________________________");
                System.out.println("          **HOSPITAL FACILITY SECTION**");
                System.out.println(
                        "_________________________________________________________________________________________________________________________________");
                while (s6 == 1) {
                    System.out.println("1.Add New Facility\n2.Existing Facilities List");
                    c1 = input.nextInt();
                    switch (c1) {
                    case 1: {
                        f[count5].add_faci();
                        count5++;
                        break;
                    }
                    case 2: {
                        System.out.println(
                                "_________________________________________________________________________________________________________________________________");
                        System.out.println("Hospital  Facility are:");
                        System.out.println(
                                "_________________________________________________________________________________________________________________________________");
                        for (j = 0; j < count5; j++) {
                            f[j].show_faci();
                        }
                        break;
                    }
                    }
                    System.out.println("\nReturn to Back Press 1 and for Main Menu Press 0");
                    s4 = input.nextInt();
                }
                break;
            }

            }
            System.out.println("\nReturn to MAIN MENU Press 1");
            status = input.nextInt();
        }
    }
}
