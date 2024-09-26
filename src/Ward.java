public class Ward{
    private  int kolvoMest;
    private String Name_doctor;
    private boolean free_seats;
    public Ward(){
        kolvoMest = 10;
        Name_doctor = "Трухан Михаил";
        free_seats = true;
    }
    public Ward(int kolvoMest, String name_doctor, boolean free_seats){
        kolvoMest = kolvoMest;
        Name_doctor = name_doctor;
        free_seats = free_seats;
    }
    public void Print_kolvoMest(){
        System.out.println(kolvoMest);
    }
    public void Print_Name_doctor(){
        System.out.println(Name_doctor);
    }
    public void Print_free_seats(){
        System.out.println(free_seats);
    }
}
