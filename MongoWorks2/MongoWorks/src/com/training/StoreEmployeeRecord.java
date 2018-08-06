package com.training;

import java.util.HashMap;
import java.util.Map;

import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBObject;
import com.mongodb.MongoClient;
import com.mongodb.util.JSON;

public class StoreEmployeeRecord {
	public static void main(String[] args) {
MongoClient mongoClient = new MongoClient("localhost",27020);
		
		DB db = mongoClient.getDB("exdb");
		DBCollection dbc = db.getCollection("emps");
		
		//first way
		DBObject object = new BasicDBObject();
		object.put("empid",301);
		object.put("empname","kavita");
		object.put("empemail","kavita@gmail.com");
		
		dbc.save(object);
		
		System.out.println("Object Saved");
		
		//second way
		Map<String,Object> map= new HashMap<>();
		
		map.put("empid", 302);
		map.put("empname", "Rupa");
		map.put("empemail", "rupa@gmail.com");
		map.put("empsal",34000);
		dbc.save(new BasicDBObject(map));
		
		//third way - store the given Json
		String jsonString = "{empid:303,empname:'siddharth',empemail:'siddharth@gmail.com',empsal:32324}";
		dbc.save((DBObject)JSON.parse(jsonString));
		System.out.println("object saved...");
		
		//fourth way to save--store the bean directly
		Employee employee = new Employee();
		employee.setEmpId(304);
		employee.setEmpName("Anuj");
		employee.setEmpEmail("anuj@gmail.com");
		employee.setEmpSal(23233);
		
		dbc.save(employee);
		
		System.out.println("Object Saved...");
		
		
		
	}

}