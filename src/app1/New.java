
package app1;

public class New {
    public void rev(String val)
    {
        String rev="";
        for(int i=val.length()-1;i>=0;i--)
        {
            rev+=val.charAt(i);
        }
        System.out.println(rev);
    }
}
