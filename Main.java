public class Main {
    public static void main(String[] args) throws EventIsNotValidException {
        for (Event event : getMovies()) {
            validEvent(event);
        }
        for (Event event : getTheatres()) {
            validEvent(event);
        }
        System.out.println("Successful validation!");
    }

    public static Movie[] getMovies() {
        return new Movie[]{
                new Movie("Inception", 2010, 16),
                new Movie("Interstellar", 2017, 14),
                new Movie("Titanic", 1997, 16)
        };
    }

    public static Theatre[] getTheatres() {
        return new Theatre[]{
                new Theatre("Event 1", 2017, 14),
                new Theatre("Event 2", 2020, 12),
                new Theatre("Event 3", 2015, 18)
        };
    }

    public static void validEvent(Event event) throws EventIsNotValidException {
        if (event.getAge() == 0 || event.getReleaseYear() == 0 || event.getTitle().equals("")) {
            throw new EventIsNotValidException("Event is not valid");
        }
    }
}