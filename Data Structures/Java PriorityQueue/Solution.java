
class Student {
   private int token;
   private String fname;
   private double cgpa;
   public Student(int id, String fname, double cgpa) {
      super();
      this.token = id;
      this.fname = fname;
      this.cgpa = cgpa;
   }
   public int getToken() {
      return token;
   }
   public String getFname() {
      return fname;
   }
   public double getCgpa() {
      return cgpa;
   }
    
   
}

class StudentComparator implements Comparator<Student> {
    @Override
    public int compare(Student s1, Student s2) {

        double cgpa1 = s1.getCgpa();
        double cgpa2 = s2.getCgpa();

        if(cgpa1 == cgpa2){
            int fnameCom = s1.getFname().compareTo(s2.getFname());
                if(fnameCom==0){
                  return s1.getToken()-s2.getToken(); 
                }
                return fnameCom;
        }

        return (cgpa1<cgpa2)?1:(cgpa1>cgpa2?-1:0);
    }
    

}

public class Solution {

    public static void main(String[] args) {
      Scanner in = new Scanner(System.in);
      int totalEvents = Integer.parseInt(in.nextLine());
      PriorityQueue<Student> queue = new PriorityQueue<Student>(10, new StudentComparator());
      while(totalEvents>0){
         String event = in.next();
         if(event.equals("SERVED")) {
             queue.poll();
         } else {
             String name = in.next();
             double cgpa = in.nextDouble();
             int id = in.nextInt();
             queue.offer(new Student(id, name, cgpa));
         }    
         totalEvents--;
      }
      in.close();  
      if(queue.size() == 0) {
          System.out.println("EMPTY");
      } else {
          for(;;) {
              Student st = queue.poll();
              if(st == null)
                  break;
              else
                  System.out.println(st.getFname());
          }
      }
    }
}
