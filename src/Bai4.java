public class Bai4 {
    public static void main(String[] args) {
        String initialString = "abcdefghij".repeat(100000);

        long startTime, endTime;

        // Su dung StringBuilder
        StringBuilder sb = new StringBuilder(initialString);
        startTime = System.nanoTime();
        sb.reverse();
        endTime = System.nanoTime();
        System.out.println("StringBuilder dao nguoc: " + (endTime - startTime) + " ns");

        startTime = System.nanoTime();
        sb.insert(500000, "INSERT");
        endTime = System.nanoTime();
        System.out.println("StringBuilder chen: " + (endTime - startTime) + " ns");

        startTime = System.nanoTime();
        sb.delete(400000, 400010);
        endTime = System.nanoTime();
        System.out.println("StringBuilder xoa: " + (endTime - startTime) + " ns");

        startTime = System.nanoTime();
        sb.replace(600000, 600010, "REPLACE");
        endTime = System.nanoTime();
        System.out.println("StringBuilder thay the: " + (endTime - startTime) + " ns");

        // Su dung StringBuffer
        StringBuffer sbf = new StringBuffer(initialString);
        startTime = System.nanoTime();
        sbf.reverse();
        endTime = System.nanoTime();
        System.out.println("StringBuffer dao nguoc: " + (endTime - startTime) + " ns");

        startTime = System.nanoTime();
        sbf.insert(500000, "INSERT");
        endTime = System.nanoTime();
        System.out.println("StringBuffer chen: " + (endTime - startTime) + " ns");

        startTime = System.nanoTime();
        sbf.delete(400000, 400010);
        endTime = System.nanoTime();
        System.out.println("StringBuffer xoa: " + (endTime - startTime) + " ns");

        startTime = System.nanoTime();
        sbf.replace(600000, 600010, "REPLACE");
        endTime = System.nanoTime();
        System.out.println("StringBuffer thay the: " + (endTime - startTime) + " ns");
    }
}
