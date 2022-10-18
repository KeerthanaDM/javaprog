public class cn {
    private int real,img;

    public cn(){}

    public cn(int real, int img) {
        this.real = real;
        this.img = img;
    }

    public void display()
    {
        System.out.println(this.real+"+"+this.img+"i");
    }

    public cn add2(cn c1,cn c2)
        {
            int real=c1.real+ c2.real;
            int img=c1.img+c2.img;
            return new cn(real,img);
    }

    public cn add3(cn c1,cn c2,cn c3)
    {
        int real=c1.real+ c2.real+c3.real;
        int img=c1.img+c2.img+c3.img;
        return new cn(real,img);
    }

    public cn sub(cn c1,cn c2)
    {
        int real=c1.real- c2.real;
        int img=c1.img-c2.img;
        return new cn(real,img);
    }
}
