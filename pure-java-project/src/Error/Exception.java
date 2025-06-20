class Exception extends Throwable {
    public Exception() {
        super();
    }

    public Exception(String message) {
        super(message); // truyền message lên lớp Throwable
    }
}
