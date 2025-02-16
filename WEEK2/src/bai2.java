public class bai2 {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Hello");

        sb.append(" World");
        System.out.println("After append: " + sb);

        sb.insert(6, "Beautiful ");
        System.out.println("After insert: " + sb);

        sb.delete(6, 17);
        System.out.println("After delete: " + sb);

        sb.deleteCharAt(5);
        System.out.println("After deleteCharAt: " + sb);

        sb.reverse();
        System.out.println("After reverse: " + sb);

        System.out.println("Capacity: " + sb.capacity());

        System.out.println("Length: " + sb.length());

        sb.setLength(5);
        System.out.println("After setLength: " + sb);

        sb.replace(0, 2, "Hi");
        System.out.println("After replace: " + sb);

        char ch = sb.charAt(2);
        System.out.println("Character at index 2: " + ch);
    }
}
