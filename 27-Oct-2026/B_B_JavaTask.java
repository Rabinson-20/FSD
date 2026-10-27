package Oct27;

public class B_B_JavaTask {

	public static void main(String[] args) {
		// =========================
        // STRING BUFFER
        // =========================

        StringBuffer sb = new StringBuffer("Sachin");

        // 1. Print
        System.out.println("StringBuffer: " + sb);

        // 2. Append
        sb.append(" Tendulkar");
        System.out.println("After append: " + sb);

        // 3. Insert
        sb.insert(7, "Kumar ");
        System.out.println("After insert: " + sb);

        // 4. Replace
        sb.replace(7, 13, "ABC");
        System.out.println("After replace: " + sb);

        // 5. Delete
        sb.delete(7, 10);
        System.out.println("After delete: " + sb);

        // 6. Reverse
        sb.reverse();
        System.out.println("After reverse: " + sb);

        // 7. Length
        System.out.println("Length: " + sb.length());

        // 8. Character
        System.out.println("Character at 0: " + sb.charAt(0));


        // =========================
        // STRING BUILDER
        // =========================

        StringBuilder builder = new StringBuilder("Sachin");

        // 1. Print
        System.out.println("\nStringBuilder: " + builder);

        // 2. Append
        builder.append(" Tendulkar");
        System.out.println("After append: " + builder);

        // 3. Insert
        builder.insert(7, "Kumar ");
        System.out.println("After insert: " + builder);

        // 4. Replace
        builder.replace(7, 13, "ABC");
        System.out.println("After replace: " + builder);

        // 5. Delete
        builder.delete(7, 10);
        System.out.println("After delete: " + builder);

        // 6. Reverse
        builder.reverse();
        System.out.println("After reverse: " + builder);

        // 7. Length
        System.out.println("Length: " + builder.length());

        // 8. Character
        System.out.println("Character at 0: " + builder.charAt(0));
    }
}