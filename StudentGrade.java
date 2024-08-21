import java.util.Scanner;
public class StudentGrade{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Subject Grade Calculator");
        System.out.println(" Enter number of subjects:");
        int nS=sc.nextInt();
        int total =0;
         for(int i=0; i< nS; i++){
             System.out.println(" Enter marks obtained in "+i+ ":");
             int marks = sc.nextInt();
             total+=marks;


         }
         double aver=(double)total/nS;
         char Grade;
         if(aver>=90){
            Grade='o';
         }
         else if(aver>=80){
            Grade='A';
         }
         else if(aver>=70){
            Grade='B';
         }
         else if(aver>=60){
            Grade='c';
         }
        else if(aver>=50){
            Grade='D';
         }
        else if(aver>=40){
            Grade='E';
         }
         else{
            Grade='F';
         }
         System.out.println(" Total marks "+total);
        System.out.println(" Average Percentage is " +aver);
        System.out.println("Garde"+ Grade);



    }
}