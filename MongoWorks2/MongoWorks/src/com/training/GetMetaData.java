package com.training;

import com.mongodb.DB;
import com.mongodb.MongoClient;

public class GetMetaData {
	public static void main(String[] args) {
		//localhost port:27020
		MongoClient mongoClient = new MongoClient("localhost",27020);
		
		System.out.println("Connection got to "+mongoClient);
		
		System.out.println("List of DBS from Mongo:");
		
		for(String dbName: mongoClient.getDatabaseNames()) {
			System.out.println("\t"+dbName);
			
			DB db = mongoClient.getDB(dbName);
			
			for(String collectionName: db.getCollectionNames()) {
				System.out.println("\t\t" + collectionName);
			}
		}
	}

}
