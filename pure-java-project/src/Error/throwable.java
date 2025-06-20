class Throwable {
    private String message;

    public Throwable() {
        this.message = null;
    }

    public Throwable(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public void printStackTrace() {
        // Mã in vết ngăn xếp (Stack trace) giả lập
        System.err.println("Stack trace: " + this.getMessage());
    }
}