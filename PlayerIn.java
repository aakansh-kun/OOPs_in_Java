class Player {
    String name;
    int age;
    String position;
    public Player(String name, int age, String position) {
        this.name = name;
        this.age = age;
        this.position = position;
    }
    public void play() {
        System.out.println(name + " is playing.");
    }
    public void train() {
        System.out.println(name + " is training.");
    }
}

class Cricket_Player extends Player {
    public Cricket_Player(String name, int age, String position) {
        super(name, age, position);
    }
}

class Football_Player extends Player {
    public Football_Player(String name, int age, String position) {
        super(name, age, position);
    }
}

class Hockey_Player extends Player {
    public Hockey_Player(String name, int age, String position) {
        super(name, age, position);
    }
}

public class PlayerIn {
    public static void main(String[] args) {
        Cricket_Player cricketer = new Cricket_Player("Virat Kohli", 35, "Batsman");
        Football_Player footballer = new Football_Player("Cristiano Ronaldo", 39, "Forward");
        Hockey_Player hockeyPlayer = new Hockey_Player("Dhyan Chand", 30, "Striker");
        cricketer.play();
        footballer.train();
        hockeyPlayer.play();
    }
}