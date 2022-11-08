public class C_FoxCS1Drawing extends World {

    public int red;
    public int blue;
    public int green;

    public void go()
    {
        for(int col=0;col<1000;col=col+1) {
            //int a = (int)Math.random()*255;
            //generating random integers from 0 to 10
            for (int row = 0; row < 1000; row = row + 1) {
                plane.teleport(row,col);
                plane.setPixelColor(210, 255, 240);
            }
            }
        gradient();
        fox();

        plane.pausetime=5;
        plane.loadBackGround("sun.jpg");
        plane.teleport(0, 0);
        plane.showBackGround();

        for (int row = 1; row < 130; row++)    //*** this is using new getBackground
        {
            for (int col = 1; col < 140; col++)    //*** this is using new getBackground
            {
                plane.teleport(col, row);

                red = plane.howMuchRed();
                green = plane.howMuchGreen();
                blue = plane.howMuchBlue();

                if (red >= 250 && green >= 250 && blue >= 250) {
                    plane.setPixelColor(210, 255, 240);
                }
            }
        }
    }

    public void gradient(){
        plane.isTrail=true;
        plane.setPos(0,0);
        plane.pausetime=1/2;
        for(int col=0;col<15;col=col+1) {
            //int a = (int)Math.random()*255;
            //generating random integers from 0 to 10
            for (int row = 0; row < 20; row = row + 1) {

                System.out.println(row);
                plane.trailWidth = 3;
                plane.setColor(20, col*15, row*8);
                plane.teleport(row*50, col*50+100);
                plane.square(20);
            }
        }
    }

    public void fox(){
        plane.setColor(255,170,50);
        plane.teleport(330,125);
        plane.isTrail=true;
        plane.startingAngle(90);
        plane.trailWidth=10;
        plane.move(80);
        plane.turn(90);
        plane.move(80);
        plane.turn(135);
        plane.move(113.137084989848);
        //370, 85
        plane.teleport(490 ,205);
        plane.startingAngle(315);
        plane.move(113.137084989848);
        plane.turn(225);
        plane.move(80);
        plane.turn(270);
        plane.move(160);
        plane.turn(105);
        plane.move(150);
        plane.turn(150);
        plane.move(150);
        plane.turn(285);
        plane.move(80);
        plane.turn(-60);
        plane.move(100);
        plane.turn(-90);
        plane.move(190);
        plane.startingAngle(180);
        plane.turn(-30);
        plane.move(190);
        plane.turn(-90);
        plane.move(100);
        plane.teleport(575,325);
        plane.startingAngle(60);
        plane.move(180);
        plane.turn(-30);
        plane.move(120);
        plane.startingAngle(170);
        plane.move(220);
        plane.turn(-50);
        plane.move(90);
        plane.turn(-100);
        plane.move(90);
        plane.turn(-50);
        plane.move(220);
        plane.teleport(350,340);
        plane.startingAngle(105);
        plane.move(250);
        plane.startingAngle(0);
        plane.move(100);
    }

}
