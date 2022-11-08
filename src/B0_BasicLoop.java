public class B0_BasicLoop extends World {

    //This is the method that your program looks for and executes when you 'run' it
    public void go() {
        plane.isTrail=true;
        plane.setPos(0,0);
        plane.pausetime=1/2;
        for(int col=0;col<15;col=col+1) {
            //int a = (int)Math.random()*255;
            //generating random integers from 0 to 10
            for (int row = 0; row < 20; row = row + 1) {

                System.out.println(row);
                plane.trailWidth = 3;
                plane.setColor(col * 22, 150, row*8);
                plane.teleport(row*50, col*50+100);
                house(20);
            }

        }

    }

    public void house(int size) {
        plane.startingAngle(90);
        square(size);
        plane.turn(150);
        plane.move(size);
        plane.turn(240);
        plane.move(size);
    }

    public void square(int a) {
        plane.move(a);
        plane.turn(90);
        plane.move(a);
        plane.turn(90);
        plane.move(a);
        plane.turn(90);
        plane.move(a);
        plane.turn(90);
    }
}
