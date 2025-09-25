public class Main
{
    public static void main(String[] args)
    {
     DogwalkCompany c = new DogwalkCompany();
     System.out.println(c);
     int hour = c.addDogs();
     System.out.println(c);
     Dogwalker w = new Dogwalker(4, c);
     System.out.println(w.Walkdogs(hour)+" dogs walked.");
     System.out.println(c.numAvailableDogs(hour) + " dogs remaining");
     for (int i = 7; i < 11; i++)
     {
        c.addDogs();
     }
    System.out.println(c);
    }
    Dogwalker w = new Dogwalker(3, c);
    public int dogWalkShift(int startHour, int endHour)
    {
        int pay =0;
        while(startHour <= endHour)
        {
            int dogs = Walkdogs(startHour);
            pay += dogs * 5;
            if (dogs == maxDogs || startHour >= 9 && startHour <= 17)
            {
                pay += 3;
            }
            startHour++;
            return pay;
        }
        System.out.println("$" + w.dogWalkShift(7, 10) + ".00 earned");
    }
    
}

