package HW1;

public class treadmill extends Barrier {
    private int length;

    public treadmill(String name, int length) {
        super(name);

        this.length = length;
    }

    public int getLength() {
        return length;
    }

    @Override
    protected boolean moving(Actions actions) {
        System.out.println("Беговая Дорожка " + super.getName() + " length: " + this.length);

        actions.run();

        if (getLength() <= actions.getRunDistance()) {
            System.out.println("Пробежал");

            return true;
        } else {
            System.out.println("Пробежать не смог");

            return false;
        }
    }
}