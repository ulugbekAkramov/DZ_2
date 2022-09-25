public class Dog extends Animal implements Printable {
    private String paroda;

    public String getParoda() {
        return paroda;
    }

    public void setParoda(String paroda) {
        this.paroda = paroda;
    }

    public Dog(int age, String paroda) {
        super(age);
        this.paroda = paroda;
    }

    @Override
    public void print() {
        super.print();
        System.out.println( " dog age " + this.getAge() + " paroda  " + this.getParoda());
    }
}
