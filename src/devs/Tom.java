package devs;

public class Tom extends Developer  implements Fullstack{
    public Tom(String name, int id) {
        super(name, id);
    }

    @Override
    public void writeFullStackCode() {
        System.out.println("devs.Tom codes in fullstack");
    }
}
