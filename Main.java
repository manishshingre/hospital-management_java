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
        System.out.println("Disease:-");
        disease = input.nextLine();
        System.out.println("Sex:-");
        gender = input.nextLine();
        System.out.print("Admission Status:-");
        admit_status = input.nextLine();

    }

    void patient_info() {
        System.out.println(pa_id + "\t" + name_p + " \t" + disease + "    \t" + gender + "     \t"
                + admit_status + "\t " + age_p);
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
    String id_s, name_s, gender_s, department_s, time_s;
    int salary_s;

    void new_staff() {
        Scanner input = new Scanner(System.in);
        System.out.print("id:-");
        id_s = input.nextLine();
        System.out.print("name:-");
        name_s = input.nextLine();
        System.out.print("Gender:-");
        gender_s = input.nextLine();
        System.out.print("Department: ");
        department_s = input.nextLine();
        System.out.print("salary:-");
        salary_s = input.nextInt();

    }

    void staff_info() {
        System.out.println(id_s + "\t" + name_s + "\t" + gender_s + "\t" + department_s + "\t" + salary_s);
    }
}

class nurse {
    String id_n, name_n, gender_n, department_n, shift_n;
    int salary_n;

    void new_nurse() {
        Scanner input = new Scanner(System.in);
        System.out.print("id:-");
        id_n = input.nextLine();
        System.out.print("name:-");
        name_n = input.nextLine();
        System.out.print("Gender:-");
        gender_n = input.nextLine();
        System.out.print("Department: ");
        department_n = input.nextLine();
        System.out.print("Shift:-");
        shift_n = input.nextLine();
        System.out.print("Salary");
        salary_n = input.nextInt();

    }

    void nurse_info() {
        System.out.println(id_n + "\t\t" + name_n + "\t\t" + gender_n + "\t\t" + department_n + "\t\t" + shift_n
                + "\t\t" + salary_n);
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

class lab {
    String test;
    int lab_cost;

    void new_lab() {
        Scanner input = new Scanner(System.in);
        System.out.print("Facility:-");
        test = input.nextLine();
        System.out.print("cost:-");
        lab_cost = input.nextInt();
    }

    void lab_list() {
        System.out.println(test + "\t\t" + lab_cost);
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
        int count1 = 0, count2 = 4, count3 = 4, count4 = 4, count5 = 4, count6 = 4, count7 = 5 ;
        System.out.println("--------------------------------------------------------------------------------------------------------------------------------------|");
        System.out.println("                                                           SemIII Java Mini Project                                                   |");
        System.out.println("--------------------------------------------------------------------------------------------------------------------------------------|");
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
        for (int i = 0; i < 20; i++)
            f[i] = new facility();
        nurse[] n = new nurse[100];
        for (int i = 0; i < 100; i++)
            n[i] = new nurse();
        lab[] l = new lab[20];
        for (int i = 0; i < 20; i++)
            l[i] = new lab();
	

        d[0].id_d = "D101";
        d[0].name_doc = "Dr.Rajendra";
        d[0].specialist = "Orthopedic";
        d[0].appoint_time = "7.00am to 1.00pm";
        d[0].doc_qual = "MBBS,MD";
        d[0].droom = 11;
        d[1].id_d = "D102";
        d[1].name_doc = "Dr.Suresh";
        d[1].specialist = "Physician";
        d[1].appoint_time = "10.00am to 3.00pm";
        d[1].doc_qual = "MBBS,MD";
        d[1].droom = 12;
        d[2].id_d = "D103";
        d[2].name_doc = "Dr.Sashikala";
        d[2].specialist = "Surgeon";
        d[2].appoint_time = "8pm to 2.00am";
        d[2].doc_qual = "BDM";
        d[2].droom = 13;
        d[3].id_d = "D104";
        d[3].name_doc = "Dr.Aashish";
        d[3].specialist = "Nerologist";
        d[3].appoint_time = "5.00pm to 9.00pm";
        d[3].doc_qual = "MBBS,DM";
        d[3].droom = 14;

        s[0].id_s = "S101";
        s[0].name_s = "Raju";
        s[0].department_s = "Security";
        s[0].gender_s = "Male";
        s[0].salary_s = 35000;
        s[1].id_s = "S102";
        s[1].name_s = "Raghu";
        s[1].department_s = "Security";
        s[1].gender_s = "Cleaning";
        s[1].salary_s = 20000;
        s[2].id_s = "S103";
        s[2].name_s = "Anjali";
        s[2].department_s = "Cleaning";
        s[2].gender_s = "Female";
        s[2].salary_s = 20000;
        s[3].id_s = "S104";
        s[3].name_s = "Rajiv";
        s[3].department_s = "Cleaning";
        s[3].gender_s = "Male";
        s[3].salary_s = 20000;

        n[0].id_n = "N101";
        n[0].name_n = "Jenny";
        n[0].gender_n = "Female";
        n[0].department_n = "OPD";
        n[0].shift_n = "Morning";
        n[0].salary_n = 45000;
        n[1].id_n = "N102";
        n[1].name_n = "Maya";
        n[1].gender_n = "Female";
        n[1].department_n = "ICU";
        n[1].shift_n = "Evening";
        n[1].salary_n = 45000;
        n[2].id_n = "N103";
        n[2].name_n = "Geroge";
        n[2].gender_n = "Male";
        n[2].department_n = "OT";
        n[2].shift_n = "Evening";
        n[2].salary_n = 50000;
        n[3].id_n = "N104";
        n[3].name_n = "Shewta";
        n[3].gender_n = "Female";
        n[3].department_n = "Emergency";
        n[3].shift_n = "Night";
        n[3].salary_n = 50000;

        m[0].med_name = "Corex";
        m[0].med_comp = "Cino pvt";
        m[0].exp_date = "9-5-24";
        m[0].med_cost = 78;
        m[0].count = 20;
        m[1].med_name = "Nytra";
        m[1].med_comp = "Ace pvt";
        m[1].exp_date = "4-4-25";
        m[1].med_cost = 512;
        m[1].count = 4;
        m[2].med_name = "Brufa";
        m[2].med_comp = "Reckitt";
        m[2].exp_date = "12-7-23";
        m[2].med_cost = 122;
        m[2].count = 16;
        m[3].med_name = "Pride";
        m[3].med_comp = "DDF pvt";
        m[3].exp_date = "12-4-24";
        m[3].med_cost = 1200;
        m[3].count = 40;

        l[0].test = "CBC";
        l[0].lab_cost = 500;
        l[1].test = "Thyroid";
        l[1].lab_cost = 700;
        l[2].test = "Lipid Panel";
        l[2].lab_cost = 800;
        l[3].test = "BP";
        l[3].lab_cost = 450;

	f[0].fac_name = "OPD";
	f[1].fac_name = "Nursing Home";
	f[2].fac_name = "24x7 emergency services";
	f[3].fac_name = "Birth Centers";
	f[4].fac_name = "24x7 Medical Store";
	

	

        Scanner input = new Scanner(System.in);
        int choice, j, c1, status = 1, s1 = 1, s2 = 1, s3 = 1, s4 = 1, s5 = 1, s6 = 1, s7 = 1;
        while (status == 1) {
	System.out.println("                                                                 MAIN MENU                                                            |");
        System.out.println("--------------------------------------------------------------------------------------------------------------------------------------|");
  	System.out.println(" 1.PATIENT  2.DOCTOR  3.NURSE  4.STAFF  5.MEDICAL  6.LAB  7.FACILITIES                                                                |");                                                                                         
        System.out.println("--------------------------------------------------------------------------------------------------------------------------------------|");
	System.out.println("Press 1 - Patients Information\nPress 2 - Doctors Information\nPress 3 - Nurse Information\nPress 4 - Staff Information\nPress 5 - Medical Information\nPress 6 - Lab Information\nPress 7 - Medical Facilities\n ");
        System.out.println("--------------------------------------------------------------------------------------------------------------------------------------|");
	    choice = input.nextInt();
	
            switch (choice) {
            case 1: {
                System.out.println("--------------------------------------------------------------------------------------------------------------------------------------|");
  		System.out.println("                                                PATIENT'S INFORMATION                                                                 |");                                                                                         
        	System.out.println("--------------------------------------------------------------------------------------------------------------------------------------|");
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
		System.out.println("--------------------------------------------------------------------------------------------------------------------------------------|");
  		System.out.println(" ID \t NAME\t\t DISEASE\t GENDER \tADMIT STATUS \t AGE                                                          |");                                                                                         
        	System.out.println("--------------------------------------------------------------------------------------------------------------------------------------|");
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
                System.out.println("--------------------------------------------------------------------------------------------------------------------------------------|");
  		System.out.println("                                                DOCTOR'S INFORMATION                                                                  |");                                                                                         
        	System.out.println("--------------------------------------------------------------------------------------------------------------------------------------|");
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
                        System.out.println("--------------------------------------------------------------------------------------------------------------------------------------|");
         		System.out.println("\nId \t Name\t\t Specilist \t Timing \t\tQualification \t Room No.                                        |");
                	System.out.println("--------------------------------------------------------------------------------------------------------------------------------------|");
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
		System.out.println("--------------------------------------------------------------------------------------------------------------------------------------|");
  		System.out.println("                                                NURSE INFORMATION                                                                  |");                                                                                         
        	System.out.println("--------------------------------------------------------------------------------------------------------------------------------------|");

                s3 = 1;
                while (s3 == 1) {
                    System.out.println("1.Add New Entry\n2.Check Existing entries of the Staff");
                    c1 = input.nextInt();
                    switch (c1) {
                    case 1: {
                        n[count3].new_nurse();
                        count3++;
                        break;
                    }
                    case 2: {
                       	System.out.println("--------------------------------------------------------------------------------------------------------------------------------------|");
           		System.out.println("\nId \t Name\t\t  Gender \t Department  \t\t Shift  \t Salary                                           |");
                       	System.out.println("--------------------------------------------------------------------------------------------------------------------------------------|");
                        for (j = 0; j < count3; j++) {
                            n[j].nurse_info();
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

              	System.out.println("--------------------------------------------------------------------------------------------------------------------------------------|");
                System.out.println("                                                 STAFF SECTION                                                                        |");
      		System.out.println("--------------------------------------------------------------------------------------------------------------------------------------|");
                s4 = 1;
                while (s4 == 1) {
                    System.out.println("1.Add New Entry\n2.Check Existing entries of the Staff");
                    c1 = input.nextInt();
                    switch (c1) {
                    case 1: {
                        s[count4].new_staff();
                        count4++;
                        break;
                    }
                    case 2: {
			System.out.println("--------------------------------------------------------------------------------------------------------------------------------------|");
                        System.out.println("\nId \t Name \t\t  Gender \t  Department \t Salary                                                      |");
      			System.out.println("--------------------------------------------------------------------------------------------------------------------------------------|");
                        for (j = 0; j < count4; j++) {
                            s[j].staff_info();
                        }
                        break;
                    }
                    }
                    System.out.println("\nReturn to Back Press 1 and for Main Menu Press 0");
                    s4 = input.nextInt();
                }
                break;
            }

            case 5: {	
		System.out.println("--------------------------------------------------------------------------------------------------------------------------------------|");
                System.out.println("                                                MEDICINE SECTION                                                                      |");
                System.out.println("--------------------------------------------------------------------------------------------------------------------------------------|");

                s5 = 1;
                while (s5 == 1) {
                    System.out.println("1.Add New Entry\n2. Existing Medicines List");
                    c1 = input.nextInt();
                    switch (c1) {
                    case 1: {
                        m[count5].new_medi();
                        count5++;
                        break;
                    }
                    case 2: {
                        System.out.println("--------------------------------------------------------------------------------------------------------------------------------------|");
                        System.out.println("Name \t Company \t Expiry Date \t Cost                                                                               |");
                   	System.out.println("--------------------------------------------------------------------------------------------------------------------------------------|");
                        for (j = 0; j < count5; j++) {
                            m[j].find_medi();
                        }
                    }
                    }
                    System.out.println("\nReturn to Back Press 1 and for Main Menu Press 0");
                    s4 = input.nextInt();
                }
                break;
            }

            case 6: {
                s6 = 1;
               	System.out.println("--------------------------------------------------------------------------------------------------------------------------------------|");
                System.out.println("                                             LABORATORY SECTION                                                                       |");
                System.out.println("--------------------------------------------------------------------------------------------------------------------------------------|");
                while (s6 == 1) {
                    System.out.println("1.Add New Entry \n2.Existing Laboratories List");
                    c1 = input.nextInt();
                    switch (c1) {
                    case 1: {
                        l[count6].new_lab();
                        count6++;
                        break;
                    }
                    case 2: {
                       	System.out.println("--------------------------------------------------------------------------------------------------------------------------------------|");
                        System.out.println("Fecilities\t\t Cost                                                                                                     |");
                       	System.out.println("--------------------------------------------------------------------------------------------------------------------------------------|");
                        for (j = 0; j < count6; j++) {
                            l[j].lab_list();
                        }
                        break;
                    }
                    }
                    System.out.println("\nReturn to Back Press 1 and for Main Menu Press 0");
                    s4 = input.nextInt();
                }
                break;
            }

            case 7: {
                s7 = 1;
             	System.out.println("--------------------------------------------------------------------------------------------------------------------------------------|");
                System.out.println("                                       HOSPITAL FACILITY SECTION                                                                      |");
                System.out.println("--------------------------------------------------------------------------------------------------------------------------------------|");
                while (s7 == 1) {
                    System.out.println("1.Add New Facility\n2.Existing Facilities List");
                    c1 = input.nextInt();
                    switch (c1) {
                    case 1: {
                        f[count7].add_faci();
                        count7++;
                        break;
                    }
                    case 2: {
			System.out.println("--------------------------------------------------------------------------------------------------------------------------------------|");
                        System.out.println("Hospital  Facility are:                                                                                                               |");
                       	System.out.println("--------------------------------------------------------------------------------------------------------------------------------------|");
                        for (j = 0; j < count7; j++) {
                            f[j].show_faci();
                        }
                        break;
                    }
                    }
                    System.out.println("\nReturn to Back Press 1 and for Main Menu Press 0");
                    s7 = input.nextInt();
                }
                break;

            }

            }
        }
        System.out.println("\nReturn to MAIN MENU Press 1");
        status = input.nextInt();
    }

}
