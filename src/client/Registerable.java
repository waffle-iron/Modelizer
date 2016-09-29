package client;

/**
 * Created by erikrahtjen on 9/27/16.
 */
public interface Registerable<T> {
    public void register(T registrant);
    public void deregister();
}
