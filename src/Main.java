public class Main {
    public static final DogwalkCompany c = null;

    public static void main(String[] args) {
        DogwalkCompany c = new DogwalkCompany();
//        System.out.println(c);
//        int hour = c.addDogs();
//        System.out.println(c);
        Dogwalker w = new Dogwalker(4, c);
//        System.out.println(w.Walkdogs(hour) + " dogs walked.");
//        System.out.println(c.numAvailableDogs(hour) + " dogs remaining");
        w = new Dogwalker(3, c);
        for (int i = 7; i < 11; i++) {
            c.addDogs();
        }
        System.out.println(c);
        System.out.println("$" + w.dogWalkShift(7, 10) + ".00 earned");
    }
}

                                                                                  