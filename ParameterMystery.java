
import java.io.*;

class ParameterMystery {
    public static void main(String[] args) {
	int x=0, y=1, z=2;
	x = mystery(z, y, x);
	System.out.println(x+" "+y+" "+z);
	z = mystery(z, z, x);
	System.out.println(x+" "+y+" "+z);
    }

    public static int mystery(int y, int x, int z) {
	++x;
	y = 3 * x + z;
	z = x - y;
	System.out.println(y+" "+z);
	return x+z;
    }
}
