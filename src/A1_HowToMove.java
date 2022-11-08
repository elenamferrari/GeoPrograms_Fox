public class A1_HowToMove extends World {

    //This is the method that your program looks for and executes when you 'run' it
    public void go() {

        //plane.hello();
        plane.isTrail=true;
        plane.setPos(40,250);
        house(200);
        plane.teleport(350,250);
        plane.startingAngle(90);
        house(200);
        plane.teleport(600,250);
        triangle(250);



        //System.out.println("This message will be printed to the window below.");
        //System.out.println("That window is called the dos window");
        //plane.pausetime = 2;
        //plane.startingAngle(90);



       //plane.trailWidth=5;

        //plane.isTrail=true;
        //plane.setColor(0,0,255);
        //for(int w=0;w<400;w=w+100) {
            //plane.setColor(w/2,0,0);
            //plane.teleport(w,300);
            //house(100);
        }


    public void house(int size){
        sqr(size);
        plane.turn(150);
        plane.move(size);
        plane.turn(240);
        plane.move(size);
    }

    public void triangle(int size){
        plane.setColor(0,190,50);
        plane.move(size);
        plane.turn(120);
        plane.setColor(0,255,0);
        plane.move(size);
        plane.turn(120);
        plane.setColor(0,0,255);
        plane.move(size);
    }
    public void sqr(int size){

        for(int x=0;x<4;x=x+1){
            plane.move(size);
            plane.turn(90);
        }


        System.out.println("Hellow Mr Hales");

    }

        }




/*

Methods:
- move(int x)
   move() moves the plane forward by the number of pixels specified in the parameter.
   plane.move(10); moves the plane forward 10 pixels.

- startingAngle(int x)
   startingAngle() orients the plane at the angle specified in the parameter.
   plane.startingAngle(0); points the plane to the right.

Attributes:
- boolean isTrail
   isTrail controls whether or not the plane should leave a trail. It can be true or false.
   plane.isTrail = true; causes the plane to leave a trail.

*/