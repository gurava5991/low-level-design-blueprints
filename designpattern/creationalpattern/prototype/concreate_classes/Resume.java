package designpattern.creationalpattern.prototype.concreate_classes;

import designpattern.creationalpattern.prototype.interfaces.Document;

import java.util.ArrayList;
import java.util.List;

public class Resume implements Document {
    private String candidateName;
    List<String> skills;

    public Resume(String candidateName, List<String> skills) {
        this.candidateName = candidateName;
        this.skills = skills;
    }

    public String getCandidateName() {
        return candidateName;
    }

    public void setCandidateName(String candidateName) {
        this.candidateName = candidateName;
    }

    public List<String> getSkills() {
        return skills;
    }

    public void setSkills(List<String> skills) {
        this.skills = skills;
    }

    @Override
    public Document clone() {
        // TODO Auto-generated method stub
        return new Resume(candidateName , new ArrayList<>(skills));
    }

    public void printContent() {
        System.out.println("Candidate Name: "+candidateName);
        System.out.println("Skills: "+skills);
    }
}
