package HW1;

public class Human implements Actions{
    private String name;
    private double runDistance;
    private double jumpHeight;

    public Human(String name, double runDistance, double jumpHeight){
        this.name = name;
        this.runDistance = runDistance;
        this.jumpHeight = jumpHeight;



    }


    @Override
    public void run() {
        System.out.println("German: " + this.name + " /Растояние бега: " + this.runDistance + " meters/");
    }

    @Override
    public void jump() {
        System.out.println("German: " + this.name + " /Растояние прыжка: " + this.jumpHeight + " meters/");
    }

    @Override
    public double getRunDistance() {
        return this.runDistance;
    }

    @Override
    public double getJumpHeight() {
        return this.jumpHeight;




}}

