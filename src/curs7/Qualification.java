package curs7;


public class Qualification extends Homework_Ex2_Teacher{


    public Qualification(String course, int years, String schedule) {
        setCourse(course);
        setExperienceYears(years);
        setSchedule(schedule);
  }
 
 
public void verify() {
            
             if (getCourse().equals("Java") && getExperienceYears() == 3 && getSchedule().equals("Afternoon")) { 
                  System.out.println("You qualify to teach at this  school !");
             }else {
                  System.out.println("You do not qualify!”");
                  }   
        }
}

		
		
		

 	
 	

