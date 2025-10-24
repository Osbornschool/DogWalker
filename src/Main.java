import java.io.FileNotFoundException;
import java.io.File;
import java.util.Scanner;
class Main {
    public static final DogwalkCompany c = null;
    public static void main(String[] args) throws FileNotFoundException {
        System.out.println(read());
        // DogwalkCompany c = new DogwalkCompany();
//        System.out.println(c);
//        int hour = c.addDogs();
//        System.out.println(c);
//        Dogwalker w = new Dogwalker(4, c);
//        System.out.println(w.Walkdogs(hour) + " dogs walked.");
//        System.out.println(c.numAvailableDogs(hour) + " dogs remaining");
//        w = new Dogwalker(3, c);
//        for (int i = 7; i < 11; i++) {
//        c.addDogs();
//        }
//        System.out.println(c);
//        System.out.println("$" + w.dogWalkShift(7, 10) + ".00 earned");
    }
    public static int read() throws FileNotFoundException{
        int money = 0;
        DogwalkCompany[] companies = new DogwalkCompany[1000];
        File f = new File("Companies.txt");
        Scanner s = new Scanner(f);
        int index = 0;
        while (s.hasNextLine()){
            int[] dogs = new int[24];
            for (int i = 0; i < dogs.length; i++) {
                dogs[i] = s.nextInt();
            }
            companies[index] = new DogwalkCompany(dogs);
            index++;
        }
        Dogwalker[] walkers = new Dogwalker[(int)Math.pow(10,4)];
        f = new File("Walkers.txt");
        s = new Scanner(f);
        index = 0;
        while(s.hasNextLine()){
            int dogs = s.nextInt();
            DogwalkCompany company = companies[s.nextInt()];
            walkers[index] = new Dogwalker(dogs, company);
            money += walkers[index].dogWalkShift(s.nextInt(), s.nextInt());
            index++;
        }
        return money;
    }
}

                                                                                  