public class Dogwalker {
    private int maxDogs;
    private DogwalkCompany company;

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
