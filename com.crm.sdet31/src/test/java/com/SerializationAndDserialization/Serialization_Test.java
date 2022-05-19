package com.SerializationAndDserialization;


public class Serialization_Test {

	public static void main(String[] args) throws Throwable {
		
		NFS_Games nfs=new NFS_Games(1000,3,14,"Punit Ranjan");
		
		NFS_Games.serializedObject(nfs);
		
		NFS_Games.deserializeObject();
		
		NFS_Games obj=NFS_Games.deserializeObject();
		
		System.out.println(obj.name);
		System.out.println(obj.level);
		System.out.println(obj.life);
		System.out.println(obj.score);

	}
}
