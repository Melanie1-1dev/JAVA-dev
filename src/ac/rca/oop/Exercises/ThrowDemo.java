package ac.rca.oop.Exercises;

class ThrowDemo {
    static void demoproc(String message) {
        try {
            if (message == null)
                throw new NullPointerException("demo");
            System.out.println("Message length: " + message.length());
        } catch (NullPointerException e) {
            System.out.println("Caught inside demoproc");
            throw e; // rethrow the exception
        }
    }

    public static void main(String[] args) {
        try {
            String name = null;
            demoproc(name);
        } catch (NullPointerException e) { // Un-commented to catch the rethrown exception
            System.out.println("Recaught: " + e);
        }
    }
}
