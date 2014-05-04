package lang.tij4.strings;

public class DatabaseException extends Exception {
    public DatabaseException(int transactionID, int queryID,
                             String message) {
        super(String.format("(t%d, q%d) %s", transactionID,
                            queryID, message));
    }

    public static void main(String[] args) {
        try {
            throw new DatabaseException(3, 7, "Write failed");
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}

////////////////////////////////////////////////////////////////
// <===================OUTPUT===================>             //
// lang.tij4.strings.DatabaseException: (t3, q7) Write failed //
////////////////////////////////////////////////////////////////
