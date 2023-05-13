import java.util.*;
public class anagram {
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        System.out.println("Enetr two strings");
        String st1=in.nextLine();
        String st2=in.nextLine();
        st1=st1.trim();
        st1=st1.toLowerCase();
        st2=st2.trim();
        st2=st2.toLowerCase();
        int l1=st1.length();
        int l2=st2.length();
        char ar1[]=new char[l1];
        char ar2[]=new char[l1];
        int count=0;
        if(l1!=l2)
        {
            System.out.println("Not anagrams");
        }
        else{
            ar1=st1.toCharArray();
            ar2=st2.toCharArray();
            // for(int i=0;i<l2;i++)
            // {
            //     char ch;
            //     ch=st2.charAt(i);
            //     for(int j=0;j<l1;j++)
            //     {
            //         if(ch==ar1[j])
            //         {
                        
            //             count++;
            //             ar1[j]=' ';
            //             break;
            //         }

            //     }
            // }
            Arrays.sort(ar1);
            Arrays.sort(ar2);
                st1=new String(ar1);
                st2=new String(ar2);
                if(st1.equals(st2))
                System.out.println("yess anagrams");
                else
                System.out.println("not anagrams");
            
            
        }
    }
    
}
