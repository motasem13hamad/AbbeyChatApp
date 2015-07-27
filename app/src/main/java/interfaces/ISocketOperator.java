package interfaces;

/**
 * Created by user on 7/26/2015.
 */

/**
 * Created by user on 7/20/2015.
 */


public interface ISocketOperator {

    public String sendHttpRequest(String params);
    public int startListening(int port);
    public void stopListening();
    public void exit();
    public int getListeningPort();

}
