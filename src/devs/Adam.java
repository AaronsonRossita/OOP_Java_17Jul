package devs;

public class Adam extends Developer implements Fullstack,QA{

    public Adam(String name, int id) {
        super(name, id);
    }

    @Override
    public void writeFullStackCode() {
        System.out.println("devs.Adam codes in fullstack");
    }

    @Override
    public void writeAutomationQA() {
        System.out.println("devs.Adam writes tests");
    }
}
