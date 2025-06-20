class MyException extends Exception {
    MyException(String message) {
        super(message); // truyền message lên lớp cha Exception
    }
}
