import java.util.*;
class Student{
    int rollNo;
    String name;
    
    //default contructor to initialize rollNo and name
    public Student(){
        rollNo=0;
        name=null;
    }
    
    //parameterized constructor to get rollNo and name
    public Student(int rollNo,String name){
        this.rollNo=rollNo;
        this.name=name;
    }
    
    //function to calculate total mark
    public int getTotalMarks(int arr[]){
        int total=0;
        for(int i=0;i<5;i++){
            total+=arr[i];
        }
        return total;
    }
    
    //function to calculate average marks
    public double getAverageMarks(int total){
        return total/5.0;
    }
    
    //function to calculate grade
    public String getGrade(int total){
        if(total>=450 && total<=500){
            return "O+";
        }
        else if(total>=400 && total<=450){
            return "A+";
        }
        else if(total>=350 && total<=400){
            return "A";
        }
        else if(total>=300 && total<=350){
            return "B";
        }
        else if(total>=250 && total<=300){
            return "C";
        }
        else if(total>=200 && total<=250){
            return "D";
        }
        else{
            return "F";
        }
    }
    
    //function to display result
    public void displayResult(int total,double average,String grade){
        System.out.println("Roll No.: "+rollNo+
        "\nName: "+name+"\nTotal: "+total+
        "\nAverage: "+average+"\nGrade: "+grade);
    }

    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("----------STUDENT GRADE CALCULATOR----------");
        System.out.print("How many student detail you want to enter: ");
        int n=sc.nextInt();
        
        for(int j=1;j<=n;j++){
            //to get student rollNo and name
            System.out.print("Enter Roll Number: ");
            int rollNo=sc.nextInt();
            sc.nextLine();
            System.out.print("Enter Name: ");
            String name=sc.nextLine();
            
            //to get 5 subject marks
            Student st=new Student(rollNo,name);
            int arr[]=new int[5];
            System.out.println("Enter 5 subjects marks: ");
            for(int i=0;i<5;i++){
                arr[i]=sc.nextInt();
            }
            
            //to perform grade calculation
            int total=st.getTotalMarks(arr);
            double average=st.getAverageMarks(total);
            String grade=st.getGrade(total);
            st.displayResult(total,average,grade);
        }
        sc.close();
    }
}

