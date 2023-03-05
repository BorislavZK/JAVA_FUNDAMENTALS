package ClassesAndObjects;

import java.util.Random;

public class AdvertisementMessage01 {
    public static void main(String[] args) {

        Random rnd = new Random();

        String[] phrases = {"Excellent product.", "Such a great product.", "I always use that product.",
        "Best product of its category.", "Exceptional product.", "I can’t live without this product."};

        int randomPhrases = rnd.nextInt(phrases.length);

        String[] events = {"Now I feel good.", "I have succeeded with this product.",
                "Makes miracles. I am happy of the results!", "I cannot believe but now I feel awesome.",
        "Try it yourself, I am very satisfied.", "I feel great!"};

        int randomEvents = rnd.nextInt(events.length);

        String[] authors = {"Diana", "Petya", "Stella", "Elena", "Katya", "Iva", "Annie", "Eva"};

        int randomAuthors = rnd.nextInt(authors.length);

        String[] cities = {"Burgas", "Sofia", "Plovdiv", "Varna", "Ruse"};

        int randomCities = rnd.nextInt(cities.length);


        //"{phrase} {event} {author} – {city}".

        System.out.printf("%s %s %s – %s", phrases[randomPhrases],
                events[randomEvents], authors[randomAuthors],
                cities[randomCities]);




    }



}
