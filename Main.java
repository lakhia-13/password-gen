import java.lang.*;
import java.util.*;
//~`!@#$%^&*()_-+={[}]|\:;"'<,>.?/
class Gen{
    Random rand = new Random();
    int min,max;
    char Cap(){
        min = 65; max = 90;
        return (char)(rand.nextInt(max - min + 1) + min);
    }
    char Sml(){
        min = 97; max = 112;
        return (char)(rand.nextInt(max - min + 1) + min);
    }
    char Num() {
        min = 48; max = 57;
        return (char) (rand.nextInt(max - min + 1) + min);
    }
    char Spc(){
        min = 33; max = 47;
        return (char) (rand.nextInt(max - min + 1) + min);
    }
}
public class Main {
    public static void main(String args[]) {
        Random rand = new Random();
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter number of characters in the password : ");
        int n = sc.nextInt();
        Gen gen = new Gen();
        StringBuffer pass = new StringBuffer();
        pass.append(gen.Cap());
        pass.append(gen.Sml());
        pass.append(gen.Num());
        pass.append(gen.Spc());
        int i,x;
        for (i=0;i<n-4;i++){
            x = (rand.nextInt(4));
            if (x == 0) {
                pass.append(gen.Cap());
            } else if (x == 1) {
                pass.append(gen.Sml());;
            } else if (x == 2) {
                pass.append(gen.Num());
            } else {
                pass.append(gen.Spc());
            }
        }
        String passw = pass.toString();
        char[] carray = passw.toCharArray();
        for (i=n-1;i>0;i--) {
            int j = rand.nextInt(i);
            char temp = carray[i];
            carray[i] = carray[j];
            carray[j] = temp;
        }
        String password = new String(carray);
        System.out.println(password);
        System.out.println(password.length());
    }
}
