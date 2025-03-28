package PracticePrograms;

public class Password_Masking {
    public static void main(String[] args) {
        String password="Shivani123";
        StringBuffer sb=new StringBuffer(password);
        for(int i=0;i<=sb.length()-2;i++)
        {
            sb.setCharAt(i,'*');
        }
        System.out.println("password="+sb);
    }
}
