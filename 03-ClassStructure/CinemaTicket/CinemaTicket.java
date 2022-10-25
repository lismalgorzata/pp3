public class CinemaTicket
{
  static String cinemaName = "Stylowy";
  String filmTitle;
  String row;
  String seat;
  double price;
  
    public CinemaTicket(String t, String r, String s) {
        filmTitle= t;
        row = r;
        seat=s;
        
        if (Integer.parseInt(r)<=2) {
              price=10;
          }else {
              price=25;
          }
  }
  
  public void displayInfo() {
      System.out.println("CINEMA "+ cinemaName);
      System.out.println("FILM " + filmTitle);
      System.out.println("YOUR SEAT: "+row +" | "+seat);
      System.out.println("PRICE: "+price+ " PLN");
  }
  
  public static void main(String[] args) {
      CinemaTicket ct1 = new CinemaTicket("Gladiator", "2", "10");
      CinemaTicket ct2 = new CinemaTicket("Gladiator", "7", "21");

      ct1.displayInfo();
      ct2.displayInfo();
  }
  
}
