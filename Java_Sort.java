import java.io.*;
import java.util.*;


class Student{
    int id;
    String firstname;
    double cgpa;
    
    public Student(int id,String firstname,double cgpa){
        this.id=id;
        this.firstname=firstname;
        this.cgpa=cgpa;
    }
        public String getFirstname(){
            return firstname;
        }
        
    }
public class Java_Sort {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=Integer.parseInt(sc.nextLine());
        List<Student> students=new ArrayList<>();
        for(int i=0;i<n;i++){
            int id=sc.nextInt();
            String firstname=sc.next();
            double cgpa=sc.nextDouble();
            students.add(new Student(id, firstname, cgpa));
        }
        // Sort using custom comparator
        students.sort(new Comparator<Student>() {
            public int compare(Student s1, Student s2) {
                if (s1.cgpa != s2.cgpa) {
                    return Double.compare(s2.cgpa, s1.cgpa); // Descending CGPA
                } else if (!s1.firstname.equals(s2.firstname)) {
                    return s1.firstname.compareTo(s2.firstname); // Ascending name
                } else {
                    return Integer.compare(s1.id, s2.id); // Ascending ID
                }
            }
        });

        // Print results
        for (Student s : students) {
            System.out.println(s.getFirstname());
        }

        sc.close();
    }
}
        
 
