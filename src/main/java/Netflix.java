import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

class Netflix extends OTT {
    private List<Film> list;

    Netflix() {
        list = new ArrayList<Film>();
    }

    @Override
    public void displayList() {
        Iterator<Film> i = getMovieList().iterator();
        while (i.hasNext())
            System.out.println(i.next().toString());
    }

    @Override
    public void playMovie(String movieName) {
        Iterator<Film> i = getMovieList().iterator();
        while (i.hasNext()) {
            if (i.next().getName().equalsIgnoreCase(movieName)) {
                System.out.println("Playing Movie " + movieName);
                return;
            }

        }
        System.out.println("No such movie " + movieName + " is available in the list");
    }

    //Dependency Inversion Principle (DIP)
    // lets say in future we are supporting Series and series is a Film   ==> addMovieToList(series) ??? because Series extends Film
    public void addMovieToList(Film film) {
        //bad example
        //Film film = new Film("",0);
        //list.add(film);
        getMovieList().add(film);


    }

    // The below methods are extenstion to exsisting code < Open/Closed Principle in SOLID>
    public List<Film> getMovieList() {

        return list;
    }
}