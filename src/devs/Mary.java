package devs;

public class Mary extends Developer implements QA{


    public Mary(String name, int id) {
        super(name, id);
    }

    @Override
    public void writeAutomationQA() {
        System.out.println("devs.Mary writes tests");
    }
}
