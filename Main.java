import java.io.IOException;
import java.util.Scanner;
import java.util.List;

class Main {
  public static void main(String[] args) {
    try {
      Service1 s = new Service1();
       // s.addStudent(new Student("Krzysztof", 20));
       //s.addStudent(new Student("Janusz", 40));
      Scanner scan= new Scanner(System.in);

      while(true)
        {
          System.out.println("Podaj liczbe  : ");
          int x=scan.nextInt();
          if(x==1)
          {
              
                scan.nextLine();
                System.out.println("Podaj imie: ");
                String name= scan.nextLine();
                System.out.println("Podaj wiek: ");
                int age = scan.nextInt();
                scan.nextLine();
                System.out.println("Podaj date urodzenia: ");
                String birthday= scan.nextLine();
                s.addStudent(new Student(name, age, birthday));
          }
          else if(x==2)
          {
              List <Student> students = (List<Student>)s.getStudents();
                for(Student student:students)
                  {
                    System.out.println(student);
                  }
          }
          else
          {
            break;
          }  
        }
      var students = s.getStudents();
      for(Student current : students) {
        System.out.println(current.toString());
      }
    } catch (IOException e) {

    }
  }
}