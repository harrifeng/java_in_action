package lang.tij4.exceptions;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.logging.Logger;

class LoggingException extends Exception {
    private static Logger logger =
            Logger.getLogger("LoggingException");

    public LoggingException() {
        StringWriter trace = new StringWriter();
        printStackTrace(new PrintWriter(trace));
        logger.severe(trace.toString());
    }
}

public class LoggingExceptions {
    public static void main(String[] args) {
        try {
            throw new LoggingException();
        } catch (LoggingException e) {
            System.err.println("Caught " + e);
        }
        try {
            throw new LoggingException();
        } catch (LoggingException e) {
            System.err.println("Caught " + e);
        }
    }
}

////////////////////////////////////////////////////////////////////////////////
// <===================OUTPUT===================>                             //
// 五月 01, 2014 8:43:43 下午 lang.tij4.exceptions.LoggingException <init>    //
// 严重: lang.tij4.exceptions.LoggingException                                //
// 	at lang.tij4.exceptions.LoggingExceptions.main(Unknown Source)            //
//                                                                            //
// Caught lang.tij4.exceptions.LoggingException                               //
// 五月 01, 2014 8:43:43 下午 lang.tij4.exceptions.LoggingException <init>    //
// 严重: lang.tij4.exceptions.LoggingException                                //
// 	at lang.tij4.exceptions.LoggingExceptions.main(Unknown Source)            //
//                                                                            //
// Caught lang.tij4.exceptions.LoggingException                               //
////////////////////////////////////////////////////////////////////////////////
