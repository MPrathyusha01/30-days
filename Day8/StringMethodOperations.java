package Day8;

public class StringMethodOperations {

    public static void main(String[] args) {
        // Create a StringBuilder with an initial string
        StringBuilder sb = new StringBuilder("Hello");

        // Append methods
        sb.append(" World");
        sb.append('!');
        sb.append(123);

        System.out.println("After append: " + sb.toString());

        // Insert methods
        sb.insert(6, "Beautiful ");
        System.out.println("After insert: " + sb.toString());

        // Delete methods
        sb.delete(6, 16);
        System.out.println("After delete: " + sb.toString());

        sb.deleteCharAt(5);
        System.out.println("After deleteCharAt: " + sb.toString());

        // Replace method
        sb.replace(0, 5, "Hi");
        System.out.println("After replace: " + sb.toString());

        // Reverse method
        sb.reverse();
        System.out.println("After reverse: " + sb.toString());

        // Capacity and length methods
        int capacity = sb.capacity();
        int length = sb.length();
        System.out.println("Capacity: " + capacity);
        System.out.println("Length: " + length);

        sb.ensureCapacity(100);
        System.out.println("Capacity after ensureCapacity(100): " + sb.capacity());

        sb.setLength(50);
        System.out.println("Length after setLength(50): " + sb.length());

        // Substring method
        String sub = sb.substring(0, 5);
        System.out.println("Substring(0, 5): " + sub);

        // CharAt and setCharAt methods
        char ch = sb.charAt(2);
        System.out.println("Char at index 2: " + ch);

        sb.setCharAt(2, 'z');
        System.out.println("After setCharAt(2, 'z'): " + sb.toString());

        // Convert to string
        String str = sb.toString();
        System.out.println("Final string: " + str);
    }
}
