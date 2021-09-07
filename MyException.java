package tasksa;

public class MyException extends Exception {
	 
    public MyException(String msg){
        super(msg);
    }
 


public static void main(String[] args) {

    try {
        checkAge(20);
        checkAge(18);
        checkAge(10);
    }
    catch( MyException e ) {
        System.out.println( e.getMessage() );
    }

}


public static void checkAge(int age) throws MyException {
    if(age < 13) {
        throw new MyException("you can't watch horror movies");
    }
    else {
        System.out.println( "you can watch the movie" );
    }
}

}