//package com.ays;
//
////import com.mchange.v2.c3p0.ComboPooledDataSource;
//import com.zaxxer.hikari.HikariDataSource;
//import lombok.extern.slf4j.Slf4j;
//import org.springframework.boot.CommandLineRunner;
//import org.springframework.boot.SpringApplication;
//import org.springframework.boot.autoconfigure.SpringBootApplication;
//import org.springframework.context.annotation.PropertySource;
//
//import javax.sql.DataSource;
//import java.sql.SQLException;
//
//@SpringBootApplication
//@Slf4j
//public class Application  implements CommandLineRunner {
//
//    private final DataSource dataSource;
//
//    public Application(DataSource dataSource) {
//        this.dataSource = dataSource;
//    }
//
//    public static void main(String[] args) {
//        SpringApplication.run(Application.class, args);
//    }
//
//    /**
//     * Just to print data source configuration
//     * @param args command line arg
//     */
//    @Override
//    public void run(String... args) throws SQLException {
//        HikariDataSource ds = (HikariDataSource) dataSource;
//        log.info("## Instance of Hikari basic data source: {}", ds.getConnection().getClientInfo());
//        log.info("## Driver class name: {}", ds.getDriverClassName());
//        log.info("## Connection Pool Max Idle size : {}", ds.getMinimumIdle());
////        log.info("## Connection Pool Min size : {}", ds.getPoo());
////        log.info("## Connection Pool Max size : {}", ds.getMinPoolSize());
//        log.info("## Url: {}", ds.getJdbcUrl());
//    }
//}
