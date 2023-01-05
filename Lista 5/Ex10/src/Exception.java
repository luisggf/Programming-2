public class Exception extends RuntimeException{
    private String message;
    public Exception(String msg){
        this.message = msg;
    }

    
    public void InvalidOperationException(){
        
    }

    /**
     * @return String return the message
     */
    public String getMessage() {
        return message;
    }


}
