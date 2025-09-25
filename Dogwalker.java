public class Dogwalker {
    private int maxDogs;
    private DogwalkCompany company;
    public int dogWalkShift(int startHour, int endHour) {
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
        return pay;
    }
    public Dogwalker(int max, DogwalkCompany comp) 
    {
    maxDogs = max;
    company = comp;
    }
    public int Walkdogs(int hour)
    {
        int dogs = company.numAvailableDogs(hour);
        if (dogs < maxDogs)
        {
            company.updateDogs(hour, dogs);
            return dogs;
        }
        else
        {
            company.updateDogs(hour, maxDogs);
            return maxDogs;
        }
    }
     
}
