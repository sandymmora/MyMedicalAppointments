public class App {
     public static void main(String[] args) throws Exception {
         Doctor doctor = new Doctor("Pablo", "Dermatología"); 
         doctor.showId();

         Doctor doctor2 = new Doctor("Luis","Pediatría");
         doctor2.showId();

         Doctor doctor3 = new Doctor("Araceli", "Ginecología");
         doctor3.showId();
     }

   
}
