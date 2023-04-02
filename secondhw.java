abstract class Creature {
    protected String name;
    protected int maxRunDistance;
    protected int maxJumpHeight;

    public Creature(String name, int maxRunDistance, int maxJumpHeight) {
        this.name = name;
        this.maxRunDistance = maxRunDistance;
        this.maxJumpHeight = maxJumpHeight;
    }

    public void run(int distance) {
        if (distance <= maxRunDistance) {
            System.out.println(name + " успешно пробежал " + distance + " метров");
        } 
        else {
            System.out.println(name + " не смог пробежать " + distance + " метров");
            maxRunDistance = 0;
        }
    }

    public void jump(int height) {
        if (height <= maxJumpHeight) {
            System.out.println(name + " успешно перепрыгнул " + height + " метров");
        } 
        else {
            System.out.println(name + " не смог перепрыгнуть " + height + " метров");
            maxJumpHeight = 0;
        }
    }
}

class Human extends Creature {
    public Human(String name) {
        super(name, 500, 2);
    }
}

class Cat extends Creature {
    public Cat(String name) {
        super(name, 200, 1);
    }
}

class Robot extends Creature {
    public Robot(String name) {
        super(name, 1000, 5);
    }
}

class Track {
    private int length;

    public Track(int length) {
        this.length = length;
    }

    public void runOnTrack(Creature creature) {
        creature.run(length);
    }
}

class Wall {
    private int height;

    public Wall(int height) {
        this.height = height;
    }

    public void jumpOverWall(Creature creature) {
        creature.jump(height);
    }
}

public class secondhw {
    public static void main(String[] args) {
        Creature[] creatures = { new Human("Bob"), new Cat("Barsik"), new Robot("R2D2") };
        Object[] obstacles = { new Track(200), new Wall(1), new Track(500), new Wall(2) };
        for (Creature creature : creatures) {
            System.out.println(creature.name + " начинает проходить препятствия:");

            boolean isSuccessful = true;
            for (Object obstacle : obstacles) {
                if (obstacle instanceof Track) {
                    ((Track) obstacle).runOnTrack(creature);
                } 
                else if (obstacle instanceof Wall) {
                    ((Wall) obstacle).jumpOverWall(creature);
                }

                if (creature.maxJumpHeight == 0 || creature.maxRunDistance == 0) {
                    isSuccessful = false;
                    break;
                }
            }

            if (isSuccessful) {
                System.out.println(creature.name + " успешно прошел все препятствия!");
            } 
            else {
                System.out.println(creature.name + " не прошел все препятствия.");
            }
            System.out.println();
        }
    }
}