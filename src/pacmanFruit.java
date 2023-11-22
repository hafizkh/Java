public class pacmanFruit {
    public static void main(String[] args) {
        PacMan pacMan1 = new PacMan();

        Ghost ghost = new Ghost();
        ghost.eatPacman(pacMan1);
        ghost.eatPacman(pacMan1);
        ghost.eatPacman(pacMan1);
        ghost.eatPacman(pacMan1);
        ghost.eatPacman(pacMan1);

        System.out.println(pacMan1.lives);

    }
}

/*
 1. Make class Pacman and add attribute lives to the Pacman class.

2. Create a method decreaseLives. In the method decrease lives and print “Pac-man eaten” to the console.

3. Create a Ghost class. It has one method eatPacman. When the ghost eats Pac-Man (when we call the eatPacman method), call the decreaseLives of the Pacman object.
 */

class PacMan {
    public int lives;

    public PacMan() {
        lives = 5;
    }

    public void decreaseLives() {
        lives--;
        System.out.println("PacMan eaten");
    }
}


class Ghost{


    public void eatPacman(PacMan pacmanEaten){
        pacmanEaten.decreaseLives();
    }
}
