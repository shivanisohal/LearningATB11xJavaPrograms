package PracticePrograms;

public class StringBuilderMethod {
    public static void main(String[] args) {

        StringBuilder sb=new StringBuilder("welcome");
        sb.append(" World");  // Append
        System.out.println("Append: " + sb);

        sb.insert(5, " Java");  // Insert
        System.out.println("Insert: " + sb);

        sb.replace(6, 10, "Python");  // Replace
        System.out.println("Replace: " + sb);

        sb.delete(6, 12);  // Delete
        System.out.println("Delete: " + sb);

        sb.reverse();  // Reverse
        System.out.println("Reverse: " + sb);

//        Method	Example	Description
//        append()	sb.append(" World")	Adds text at the end
//        insert()	sb.insert(5, " Java")	Inserts " Java" at index 5
//        replace()	sb.replace(6, 10, "Python")	Replaces characters from index 6 to 10 with "Python"
//        delete()	sb.delete(6, 12)	Deletes characters from index 6 to 12
//        reverse()	sb.reverse()	Reverses the string
    }
}
