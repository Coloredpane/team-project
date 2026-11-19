package entity;

import java.util.ArrayList;
import java.util.List;

/**
 * An entity representing a user. Users have a username, list of documents they
 * created, and list of documents they have access to.
 */
public class User {

    private final String name;
    private List<Document> docsCreated = new ArrayList<>();
    private List<Document> docsAccessed = new ArrayList<>();

    /**
     * Creates a new user with the given non-empty name.
     * @param name the username
     * @throws IllegalArgumentException if the name is empty
     */
    public User(String name) {
        if ("".equals(name)) {
            throw new IllegalArgumentException("Username cannot be empty.");
        }
        this.name = name;
    }

    public User(String name, List<Document> docsCreated, List<Document> docsAccessed) {
        this(name);
        this.docsCreated = docsCreated;
        this.docsAccessed = docsAccessed;
    }

    public String getName() {
        return name;
    }

    public List<Document> getDocumentsCreated() { return docsCreated; }

    public List<Document> getDocumentsAccessed() { return docsAccessed; }

    public void addDocumentCreated(Document doc) { docsCreated.add(doc); }

    public void addDocumentAccessed(Document doc) { docsAccessed.add(doc); }

}