//package com.ays.config;
//
//import com.mchange.v2.c3p0.ComboPooledDataSource;
//import org.springframework.beans.factory.annotation.Value;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.ComponentScan;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.context.annotation.PropertySource;
//
//import javax.sql.DataSource;
//
///**
// * @author ayush created on 05/02/2021
// */
//@Configuration
//@ComponentScan("com.ays")
////@PropertySource("classpath:database.properties")
//public class DaoConfig {
//
//    @Value("${database.url}")
//    private String url;
//
//    @Value("${database.username}")
//    private String username;
//
//    @Value("${database.password}")
//    private String password;
//
//    @Value("${database.driver.class}")
//    private String driverClass;
//
//    @Value("${database.max.pool.size:50}")
//    private int maxPoolSize;
//
//    @Value("${database.min.pool.size:10}")
//    private int minPoolSize;
//
//    /**
//     * A connection can remained in pool but un-used before being discarded. Zero value means idle connection never
//     * expires.
//     * In second, after that time it will release the unused connections.
//     */
//    @Value("${database.max.idle.time.second:10}")
//    private int maxIdleTime;
//
//    @Bean
//    public DataSource dataSource() {
//        ComboPooledDataSource dataSource = new ComboPooledDataSource();
//        try {
//            dataSource.setDriverClass(driverClass);
//            dataSource.setJdbcUrl(url);
//            dataSource.setUser(username);
//            dataSource.setPassword(password);
//            dataSource.setMinPoolSize(minPoolSize);
//            dataSource.setMaxPoolSize(maxPoolSize);
//            dataSource.setMaxIdleTime(maxIdleTime);
//        } catch (Exception e) {
//            throw new RuntimeException("## Error has occurred while creation connection pool object, Error: ", e);
//        }
//        return dataSource;
//    }
//}
