// To write a java program to design classes for an online movie streaming service
// with entities like User, Movie, Subscription, and RecommendationSystem.
// Implement methods to manage user accounts, stream movies, suggest recommendations, and handle subscriptions.

import java.util.*;

// Movie class
class Movie {
    String title;
    String genre;

    Movie(String title, String genre) {
        this.title = title;
        this.genre = genre;
    }

    void display() {
        System.out.println("Movie: " + title + " | Genre: " + genre);
    }
}

// Subscription class
class Subscription {
    String plan;
    double price;
    boolean active;

    Subscription(String plan, double price) {
        this.plan = plan;
        this.price = price;
        this.active = true;
    }

    void showDetails() {
        System.out.println("Plan: " + plan + " | Price: Rs " + price + " | Active: " + active);
    }
}

// User class
class User {
    String name;
    Subscription subscription;

    User(String name) {
        this.name = name;
    }

    void subscribe(Subscription sub) {
        this.subscription = sub;
        System.out.println(name + " subscribed to " + sub.plan);
    }

    void streamMovie(Movie movie) {
        if (subscription != null && subscription.active) {
            System.out.println(name + " is streaming " + movie.title);
        } else {
            System.out.println("No active subscription. Please subscribe.");
        }
    }

    void showAccount() {
        System.out.println("User: " + name);
        if (subscription != null) {
            subscription.showDetails();
        } else {
            System.out.println("No subscription");
        }
    }
}

// Recommendation System
class RecommendationSystem {

    void recommend(List<Movie> movies, String preferredGenre) {
        System.out.println("Recommended Movies (" + preferredGenre + "):");
        for (Movie m : movies) {
            if (m.genre.equalsIgnoreCase(preferredGenre)) {
                m.display();
            }
        }
    }
}

// Main class
public class Q20_movie {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Movies
        List<Movie> movies = new ArrayList<>();
        movies.add(new Movie("Inception", "Sci-Fi"));
        movies.add(new Movie("Avengers", "Action"));
        movies.add(new Movie("Titanic", "Romance"));

        // User
        System.out.print("Enter user name: ");
        String name = sc.nextLine();
        User user = new User(name);

        // Subscription
        System.out.println("Choose plan (1-Basic Rs199, 2-Premium Rs499): ");
        int choice = sc.nextInt();

        if (choice == 1) {
            user.subscribe(new Subscription("Basic", 199));
        } else {
            user.subscribe(new Subscription("Premium", 499));
        }

        // Stream movie
        System.out.println("\nAvailable Movies:");
        for (int i = 0; i < movies.size(); i++) {
            System.out.print((i + 1) + ". ");
            movies.get(i).display();
        }

        System.out.print("Select movie number to stream: ");
        int mChoice = sc.nextInt();
        user.streamMovie(movies.get(mChoice - 1));

        sc.nextLine(); // clear buffer

        // Recommendation
        System.out.print("\nEnter preferred genre: ");
        String genre = sc.nextLine();

        RecommendationSystem rs = new RecommendationSystem();
        rs.recommend(movies, genre);

        sc.close();
    }
}