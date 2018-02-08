package monday;

public class DisplayOverloading2 {
	public void disp2(char c)
    {
        System.out.println(c);
    }
	public void disp2(char c, int g)
    {
        System.out.println(c);
    }
    public void disp2(int c)
    {
       System.out.println(c);
    }
    public void disp2(String myparameter)
    {
       System.out.println(myparameter);
    }
    
	public static void main(String[] args) {
		DisplayOverloading2 var = new DisplayOverloading2();
        var.disp2('n');
        var.disp2(5);
        var.disp2("abc");
        var.disp2('c',5);

	}

}
