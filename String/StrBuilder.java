public class StrBuilder {
    public static void main(String[] args) {
        // StrBuilder Append() method use
        StringBuilder sb = new StringBuilder("hello");
        //sb.append("java");

        //StrBuilder insert() method use
        //sb.insert(1,"maha");

        //StrBuilder replace() method use
        //sb.replace(1,3,"java");

        //StrBuilder delete() method use
        //sb.delete(1,3);

        //StrBuilder reverse() method use
        //sb.reverse();
        //System.out.println(sb);

         //StrBuilder capacity() method use
        StringBuilder Sb = new StringBuilder("hello");
        System.out.println(Sb.capacity());
        Sb.append(" java is favorite language ");
        System.out.println(Sb.capacity());
        }
    }
