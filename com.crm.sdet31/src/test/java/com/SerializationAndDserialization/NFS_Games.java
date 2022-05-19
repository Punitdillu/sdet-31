package com.SerializationAndDserialization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class NFS_Games implements Serializable {
	int score;
	int life;
	int level;
	String name;

	public NFS_Games(int score, int life, int level, String name) {
		
		this.score = score;
		this.life = life;
		this.level = level;
		this.name = name;
	}
	
	public static void serializedObject(NFS_Games obj) throws IOException {
		
		ObjectOutputStream objout=new ObjectOutputStream(new FileOutputStream("./backup.ser"));
		objout.writeObject(objout);
	}
	public static NFS_Games deserializeObject() throws Throwable, IOException {
		ObjectInputStream objIn= new ObjectInputStream(new FileInputStream("./backup.ser"));
		NFS_Games obj=(NFS_Games)objIn.readObject();
		return obj;
		
	}

}

