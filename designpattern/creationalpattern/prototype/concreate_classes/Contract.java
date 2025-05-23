package designpattern.creationalpattern.prototype.concreate_classes;

import designpattern.creationalpattern.prototype.interfaces.Document;

public class Contract implements Document{
    private String clientName;
    private String projectName;

    public Contract(String clientName, String projectName) {
        this.clientName = clientName;
        this.projectName = projectName;
    }

    public String getClientName() {
        return clientName;
    }

    public void setClientName(String clientName) {
        this.clientName = clientName;
    }

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    @Override
    public void printContent() {
        System.out.println("contract with client "+clientName+" for project "+projectName);

    }
    @Override
    public Document clone() {
        // TODO Auto-generated method stub
        return  new Contract(this.clientName, this.projectName);
    }
}
