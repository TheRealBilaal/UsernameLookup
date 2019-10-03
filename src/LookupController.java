import java.net.URL;

/**
 * Manages the lookup of a person's full data
 */
class LookupController {

    /**
     * Gets the full data for a person
     * @param person The person to lookup
     * @return The updated person
     */
    public static Person lookupPerson(Person person) {
        URL url = person.getURL();

        if (url == null) {
            return null;
        }

        return person;
    }

}
