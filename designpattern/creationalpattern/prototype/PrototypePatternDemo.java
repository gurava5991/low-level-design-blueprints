package designpattern.creationalpattern.prototype;

import designpattern.creationalpattern.prototype.concreate_classes.Contract;
import designpattern.creationalpattern.prototype.concreate_classes.Resume;
import designpattern.creationalpattern.prototype.interfaces.Document;

import java.util.Arrays;
import java.util.List;

public class PrototypePatternDemo {
    public static void main(String[] args) {
        DocumentManager documentManager1 = new DocumentManager();
        documentManager1.addDocument("resume", new Resume("John Doe", Arrays.asList("Java", "Python")));
        documentManager1.addDocument("contract", new Contract("Google", "Ap Healthcare"));

        Document resume1 = documentManager1.getDocument("resume");
        Document contract1 = documentManager1.getDocument("contract");
        resume1.printContent();
        contract1.printContent();

        System.out.println("---");
        Document resume2 =  documentManager1.createDocument("resume");
        Contract contract2 = (Contract) documentManager1.createDocument("contract");
        contract2.setClientName("Amazon");
        contract2.printContent();
        resume2.printContent();





    }
}
