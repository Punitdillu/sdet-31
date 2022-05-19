package com.Practice;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;

public class BrokenLink {

	public static void main(String[] args) throws IOException {

		
	}

	public int verifyLink(String link) throws IOException
	{
		URL url=new URL(link);
		 URLConnection conn = url.openConnection();
		HttpURLConnection http = (HttpURLConnection)conn;
		http.connect();
		int res = http.getResponseCode();
		
		return res;
	}
}
