package com.fatinwind.jamel;

/**
 * Created by melman on 09/06/16.
 */
public class JamelServer {

	private JamelServerConfig config;


	public JamelServer(JamelServerConfig config){

	}

	public void ready(){

	}

	public void register(String path, String zkAddr){

	}


	public void register(String path, String zkAddr, String host, int port){

	}

	public static class JamelServerConfig{
		public String host = "0.0.0.0";
		public String port = "12250";
	}
}
