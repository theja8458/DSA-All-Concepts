public class Construct {
    
        public static void main(String args[]) {
            Student s1 = new Student();
            // Student s2 = new Student("Theja");
            // Student s3 = new Student(5);
            s1.name="Theja";
            s1.rollno=5;
            s1.password="abc";
            s1.marks[0]=100;
            s1.marks[1]=90;
            s1.marks[2]=80;
            Student s2=new Student(s1);//copy
            s2.password="xyz";
            s1.marks[2]=100;
          
            for(int i=0 ; i<3 ; i++){
                System.out.println(s2.marks[i]);
            }
            

            
        }
    }
    
    class Student {
        String name;
        int rollno;
        String password;
        int marks[];
    
        //shallow copy constructor
        // Student(Student s1) {
        //  marks=new int[3];
        //     this.name=s1.name;
        //     this.rollno=s1.rollno;
        //     this.marks=s1.marks;   
        // }


        //deep copy constructor
           Student(Student s1){
            marks =new int[3];
            this.name=s1.name;
            this.rollno=s1.rollno;
            for(int i=0 ; i<3  ; i++){
                this.marks[i]=s1.marks[i];
            }
           }
        // non-Parameterized constructor
        Student(){
            marks=new int[3];
            System.out.println("Constructor is called..");
        }
        Student(String name){
            marks=new int[3];
            this.name=name;

        }
        Student(int rollno){
            marks=new int[3];
            this.rollno=rollno;
        }
    }
    
    

