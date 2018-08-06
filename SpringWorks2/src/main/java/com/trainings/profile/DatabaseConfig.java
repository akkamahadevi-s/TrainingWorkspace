package com.trainings.profile;

import javax.sql.DataSource;

public interface DatabaseConfig {
	public DataSource createDataSource();

}
