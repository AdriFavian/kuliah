public class Dragon {
    int x, y; // koordinat posisi 
    int width, height; // dimensi area permainan

    // Constructor untuk inisialisasi dragon
    public Dragon(int x, int y, int gameWidth, int gameHeight) {
        this.x = x;
        this.y = y;
        width = gameWidth;
        height = gameHeight;
    }

    public void moveLeft() {
        if (x > 0) {
            x--;
            printPosition();
        } else {
            detectCollision(x, y);
        }
    }

    public void moveRight() {
        if (x < width) {
            x++;
            printPosition();
        } else {
            detectCollision(x, y);
        }
    }
    
    public void moveUp() {
        if (y > 0) {
            y--;
            printPosition();
        } else {
            detectCollision(x, y);
        }
    }
    
    public void moveDown() {
        if (y < height) {
            y++;
            printPosition();
        } else {
            detectCollision(x, y);
        }
    }

    public void printPosition() {
        System.out.println("Posisi dragon anda saat ini - X: " + x + ", Y: " + y);
    }

    public void detectCollision(int x, int y) {
        System.out.println("Game Over");
    }

    public static void main(String[] args) {
        Dragon dragon = new Dragon(5, 5, 10, 10);

        dragon.printPosition();
        dragon.moveUp();
        dragon.moveUp();
        dragon.moveUp();
        dragon.moveUp();
        dragon.moveUp();
        dragon.moveUp();
    }
}
