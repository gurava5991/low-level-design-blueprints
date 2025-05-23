package designpattern.creationalpattern.prototype;

import designpattern.creationalpattern.prototype.interfaces.Document;

import java.util.HashMap;
import java.util.Map;

public class DocumentManager {
    private Map<String, Document> documents = new HashMap<>();

    public void addDocument(String key,  Document document) {
        documents.put(key, document);
    }
    public Document getDocument(String key) {
        return documents.get(key);
    }

    public Document createDocument(String key) {
        return documents.get(key).clone();
    }
}
