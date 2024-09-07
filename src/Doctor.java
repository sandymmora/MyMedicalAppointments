public class Doctor {
    private static int id = 0;
    private String name;
    private String speciality;

    public Doctor(){}

    public Doctor(String name, String speciality){
        this.name = name;
        this.speciality = speciality;
        id++;
    }
    public void showName(){
        System.out.println(name);
    }
    
    public void showId(){
        System.out.println("ID Doctor: " + id);
    }

}
