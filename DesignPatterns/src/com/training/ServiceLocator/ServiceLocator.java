package com.training.ServiceLocator;

public class ServiceLocator {
	private static Cache cache;
	
	static {
		cache = new Cache();
	}
	
	public static Service getService(String jndiName) {
		Service service = cache.getService(jndiName);
		
		if(service!=null) {
			return service;
		}
		
		InitialContext context = new InitialContext();
		Service nService =(Service) context.lookup(jndiName);
		cache.addService(nService);
		return nService;
		
	}

}
