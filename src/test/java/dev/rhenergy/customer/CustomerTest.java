package dev.rhenergy.customer;

import org.flywaydb.core.Flyway;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.testcontainers.containers.JdbcDatabaseContainer;
import org.testcontainers.containers.PostgreSQLContainer;

import javax.sql.DataSource;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import static org.junit.Assert.assertEquals;

public class CustomerTest {

    @BeforeAll
	void beforeAll() throws SQLException {
		try (PostgreSQLContainer<?> postgres = new PostgreSQLContainer<>("postgres:9.6.12")) {
			postgres.start();
			Flyway flyway = Flyway.configure().dataSource(postgres.getJdbcUrl(), postgres.getUsername(), postgres.getPassword()).load();
			flyway.migrate();
		}
	}

}
