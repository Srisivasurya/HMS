class Box
{
    double width, height, depth;

    Box(Box ob)
    {
        width = ob.width;
        height = ob.height;
        depth = ob.depth;
    }

    Box(double w, double h, double d)
    {
        width = w;
        height = h;
        depth = d;
    }

    double volume()
    {
        return width * height * depth;
    }
}

class Main
{
    public static void main(String args[])
    {

        Box mybox = new Box(10, 20, 15);
        Box myclone = new Box(mybox);

        double vol;
        vol = mybox.volume();
        System.out.println("Volume of mybox is " + vol);
        vol = myclone.volume();
        System.out.println("Volume of myclone is " + vol);
    }
}

