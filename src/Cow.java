public class Cow extends Animal implements Printable{
    private boolean dayotMoloko;

    public boolean isDayotMoloko() {
        return dayotMoloko;
    }

    public void setDayotMoloko(boolean dayotMoloko) {
        this.dayotMoloko = dayotMoloko;
    }

    public Cow(int age, boolean dayotMoloko) {
        super(age);
        this.dayotMoloko = dayotMoloko;
    }

    @Override
    public void print() {
        super.print();
        System.out.println(" cow age " + this.getAge() + " cow daet moloko " + this.isDayotMoloko() );
    }
}
