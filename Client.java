import java.io.*;
import java.net.*;
public class Client
{
  public static void main(String[] args) throws Exception
  {
     Socket sock = new Socket("127.0.0.1", 3000);
	 // reading from keyboard (keyRead object)
